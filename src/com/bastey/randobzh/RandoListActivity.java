package com.bastey.randobzh;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.bastey.randobzh.adapter.RandoListAdapter;
import com.bastey.randobzh.domain.EnumTypeSport;
import com.bastey.randobzh.domain.GestionnaireRandos;
import com.bastey.randobzh.domain.Rando;

/**
 * Liste des randonnées.
 * 
 * @author bastey
 */
public class RandoListActivity extends SherlockFragmentActivity implements
		ActionBar.TabListener {

	/** Sport selectionne dans la menu. */
	private EnumTypeSport selectedSport;

	/** Liste des departements selectionnes. */
	private int[] selectedDepartements;

	/** Mois courant (variable globale car passee dans le fragment) */
	private int currentMonth = 1;

	/** Fragment contenant la liste des randos. */
	private ListFragment listFragment = null;

	/** Adapter d'une Rando dans un Liste. */
	private RandoListAdapter adapter;

	/** Map des randos en fonction du sport selectionne. */
	private Map<Integer, List<Rando>> mapRandos = null;

	/** Liste des randos a afficher en fct des criteres selectionnes. */
	private List<Rando> randosFilteredForTab = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rando_list);

		ActionBar ab = getSupportActionBar();
		ab.setDisplayHomeAsUpEnabled(true);

		// Recuperation du sport selectionne dans l'ecran precedent
		int sport = (Integer) this.getIntent().getExtras().get("typeSport");
		selectedSport = EnumTypeSport.getTypeSport(sport);

		// Modification du titre en fct du sport selectionne
		if (EnumTypeSport.VTT.equals(selectedSport)) {
			ab.setTitle("Randonnées VTT");
		} else if (EnumTypeSport.CYCLO.equals(selectedSport)) {
			ab.setTitle("Randonnées Cyclo");
		} else if (EnumTypeSport.MARCHE.equals(selectedSport)) {
			ab.setTitle("Randonnées Pédestres");
		}

		// Recuperation des departements selectionnes dans l'ecran precedent
		selectedDepartements = this.getIntent().getExtras()
				.getIntArray("departements");

		// On recupere la bonne liste des randos
		switch (selectedSport) {
		case VTT:
			mapRandos = GestionnaireRandos.randosVTT;
			break;
		case CYCLO:
			mapRandos = GestionnaireRandos.randosCyclo;
			break;
		case MARCHE:
			mapRandos = GestionnaireRandos.randosMarche;
			break;
		default:
			break;
		}

		// Generation des onglets
		GregorianCalendar calendar = new GregorianCalendar();
		currentMonth = calendar.get(Calendar.MONTH) + 1;
		// int month = 6;
		for (int i = currentMonth; i < 13; i++) {
			ab.addTab(ab.newTab().setText(getStringResourceByName("tab" + i))
					.setTabListener(this));
		}
		ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_rando_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {

		// On recupere le mois correspondant a l'onget selectionne
		int selectedmonth = tab.getPosition() + currentMonth - 1;

		// On filtre les randos sur le mois selectionne
		randosFilteredForTab = new ArrayList<Rando>();
		Calendar cal = Calendar.getInstance();

		if (mapRandos != null) {

			List<Rando> randosForDptsSelected = new ArrayList<Rando>();
			for (int dpt : selectedDepartements) {
				if (dpt != 0) {
					randosForDptsSelected.addAll(mapRandos.get(dpt));
				}
			}

			for (Rando rando : randosForDptsSelected) {
				cal.setTime(rando.getDate());
				if (cal.get(Calendar.MONTH) == selectedmonth) {
					randosFilteredForTab.add(rando);
				}
			}
		}
		// Tri des randos
		Collections.sort(randosFilteredForTab);
		adapter = new RandoListAdapter(this, R.layout.layout_rando_list,
				randosFilteredForTab);

		// Initialisation du Fragment
		listFragment = new ListFragment();
		ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.root, listFragment);
		ft.commit();
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	/**
	 * Recuperation dynamique d'une String dans "strings.xml".
	 * 
	 * @param aString
	 *            Libelle de la chaine recuperer
	 * @return Valeur
	 */
	private String getStringResourceByName(String aString) {
		String packageName = "com.bastey.randobzh";
		// FIXME : est possible de rendre la recup du package dynamique ?
		int resId = getResources()
				.getIdentifier(aString, "string", packageName);
		return getString(resId);
	}

	/**
	 * Fragment permettant d'afficher la liste des randos en fonction de
	 * l'onglet selectionne.
	 * 
	 */
	public static class ListFragment extends SherlockFragment {

		/** La liste des randos. */
		private ListView listView;

		/** Constructeur par defaut. */
		public ListFragment() {

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			final RandoListActivity activiteListeRando = (RandoListActivity) getActivity();
			listView = new ListView(activiteListeRando);
			listView.setAdapter(activiteListeRando.getAdapter());

			listView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> adapter, View view,
						int position, long id) {

					// On recupere la Rando selectionnee et on affiche son
					// détail
					Rando selectedRando = (Rando) adapter
							.getItemAtPosition(position);
					Intent iDetail = new Intent(activiteListeRando
							.getApplicationContext(), RandoDetailActivity.class);

					iDetail.putExtra("rando", selectedRando);
					startActivity(iDetail);
				}
			});

			return listView;
		}
	}

	public RandoListAdapter getAdapter() {
		return adapter;
	}

}
