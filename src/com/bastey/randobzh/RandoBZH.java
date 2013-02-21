package com.bastey.randobzh;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.bastey.randobzh.domain.EnumTypeSport;
import com.bastey.randobzh.domain.EnumUrlRando;
import com.bastey.randobzh.domain.GestionnaireRandos;
import com.bastey.randobzh.domain.Rando;

/**
 * Page d'accueil de l'application Rando BZH.
 * 
 * @author bastey
 */
public class RandoBZH extends SherlockActivity {

	/** Composants définis dans la vue. */
	private RadioButton radioVTT, radioCyclo, radioMarche;
	private CheckBox dpt22, dpt29, dpt35, dpt56, dpt44;
	private Button randoButton;
	private LinearLayout layoutProgressBar;

	/** Composants sélectionnés. */
	private EnumTypeSport selectedSport = null;
	private int[] selectedDepartements = null;

	/** Map des randos en fonction du sport selectionne. */
	private Map<Integer, List<Rando>> mapRandos = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		ActionBar ab = getSupportActionBar();
		ab.setHomeButtonEnabled(false);

		radioVTT = (RadioButton) this.findViewById(R.id.radio_vtt);
		radioCyclo = (RadioButton) this.findViewById(R.id.radio_cyclo);
		radioMarche = (RadioButton) this.findViewById(R.id.radio_marche);

		dpt22 = (CheckBox) this.findViewById(R.id.checkBox_dpt22);
		dpt29 = (CheckBox) this.findViewById(R.id.checkBox_dpt29);
		dpt35 = (CheckBox) this.findViewById(R.id.checkBox_dpt35);
		dpt56 = (CheckBox) this.findViewById(R.id.checkBox_dpt56);
		dpt44 = (CheckBox) this.findViewById(R.id.checkBox_dpt44);

		randoButton = (Button) this.findViewById(R.id.buttonRandoList);
		layoutProgressBar = (LinearLayout) this
				.findViewById(R.id.linearLayout_progressBar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}

	/**
	 * Methode appelee lors du clic du bouton "Randonnees".
	 * 
	 * @param view
	 */
	public void openRandoListView(View view) {

		// On lance la tâche de fond de téléchargement
		DownloadTask task = new DownloadTask();
		task.execute();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_exit:
			showExitDialog();
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	/**
	 * Affiche la popup de demande de confirmation pour quitter l'application
	 */
	private void showExitDialog() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.dialog_msg_exit);
		builder.setCancelable(false);
		builder.setPositiveButton("Oui", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
				finish();
			}
		});
		builder.setNegativeButton("Non", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		});
		builder.create().show();
	}

	/**
	 * Traitement asychrone de téléchargement des randos.
	 * 
	 */
	private class DownloadTask extends AsyncTask<Void, Void, Void> {

		/** Temoin indiquant qu'au moins 1 departement est coche. */
		private boolean oneDepChecked = false;

		/** Temoin indiquant si le telechargement est complet. */
		private boolean downloadComplete = false;

		/** Temoin indiquant l'état de la connexion réseau. */
		private boolean isInternetOn = false;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();

			// On recupere le sport selectionne
			if (radioVTT.isChecked()) {
				selectedSport = EnumTypeSport.VTT;
			} else if (radioCyclo.isChecked()) {
				selectedSport = EnumTypeSport.CYCLO;
			} else if (radioMarche.isChecked()) {
				selectedSport = EnumTypeSport.MARCHE;
			}

			// On recupere les departements selectionnes
			selectedDepartements = new int[5];
			int i = 0;
			oneDepChecked = false;
			if (dpt22.isChecked()) {
				selectedDepartements[i] = 22;
				i++;
				oneDepChecked = true;
			}
			if (dpt29.isChecked()) {
				selectedDepartements[i] = 29;
				i++;
				oneDepChecked = true;
			}
			if (dpt35.isChecked()) {
				selectedDepartements[i] = 35;
				i++;
				oneDepChecked = true;
			}
			if (dpt56.isChecked()) {
				selectedDepartements[i] = 56;
				i++;
				oneDepChecked = true;
			}
			if (dpt44.isChecked()) {
				selectedDepartements[i] = 44;
				i++;
				oneDepChecked = true;
			}

			// Si au moins 1 dpt est coché
			if (oneDepChecked) {
				// On verifie l'état de la connexion Internet
				isInternetOn = isInternetOn();

				if (isInternetOn) {
					randoButton.setVisibility(View.GONE);
					layoutProgressBar.setVisibility(View.VISIBLE);
				}

			} else {
				Toast msg = Toast.makeText(getApplicationContext(),
						R.string.msg_choisir_dpt, Toast.LENGTH_SHORT);
				msg.setGravity(Gravity.CENTER, 15, 15);
				msg.show();
			}

		}

		@Override
		protected Void doInBackground(Void... params) {

			if (oneDepChecked && isInternetOn) {
				downloadRandos();
				downloadComplete = true;
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);

			if (downloadComplete) {
				Intent intent = new Intent(getApplicationContext(),
						RandoListActivity.class);
				intent.putExtra("typeSport", selectedSport.getValeur());
				intent.putExtra("departements", selectedDepartements);
				startActivity(intent);

				randoButton.setVisibility(View.VISIBLE);
				layoutProgressBar.setVisibility(View.GONE);
			}
		}

		/**
		 * Telechargement des randos.
		 * 
		 */
		private void downloadRandos() {
			// Initialisation du Parser XML de la liste des randonnees.
			// ParserListeRandos parserListe = new ParserListeRandos(
			// selectedSport, selectedDepartements);
			// List<Rando> randosTemp = parserListe.recupererListRandos();

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

			// Utilisé pour les tests afin de limiter le nb de telechargements
			// par departement
			// boolean noLimit = true;
			// int limitMax = 10;
			// int count = 0;
			//
			// for (int i = 0; i < selectedDepartements.length; i++) {
			// Integer departement = selectedDepartements[i];
			//
			// if (departement != 0 && !mapRandos.containsKey(departement)) {
			// // 1ere fois qu'on affiche les randos pour ce sport et ce
			// // departement
			//
			// // On recupere les randos du departement
			// List<Rando> randosTempDept = new ArrayList<Rando>();
			// for (Rando r : randosTemp) {
			// if (r.getDepartement() == departement.intValue()) {
			//
			// if (noLimit || count < limitMax) {
			// // On recupere les details de la rando avec
			// // parser HTML
			// r = ParserDetailRando.parserDetailRando(r);
			// if (r != null) {
			// randosTempDept.add(r);
			// }
			// count++;
			// }
			// }
			// }
			// // On ajoute dans la bonne Map la liste des randos avec
			// // detail pour le departement et le sport selectionne
			// mapRandos.put(departement, randosTempDept);
			// }
			// }

			ObjectMapper mapper = new ObjectMapper();

			File file = new File(EnumUrlRando.VTT_A_VENIR2.getUrl());

			List<Rando> randos;
			try {
				randos = (List<Rando>) mapper.readValue(file, Rando.class);
				mapRandos.put(35, randos);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		/**
		 * Méthode permettant de connaitre si le device est connecté a internet
		 * via GPRS ou Wifi.
		 * 
		 * @return True si connecté, false sinon.
		 */
		private boolean isInternetOn() {
			boolean result = false;
			ConnectivityManager connec = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
			if (connec.getNetworkInfo(0).getState() == State.CONNECTED
					|| connec.getNetworkInfo(0).getState() == State.CONNECTING
					|| connec.getNetworkInfo(1).getState() == State.CONNECTED
					|| connec.getNetworkInfo(1).getState() == State.CONNECTING) {
				result = true;
			} else if (connec.getNetworkInfo(0).getState() == State.DISCONNECTED
					|| connec.getNetworkInfo(1).getState() == State.DISCONNECTED) {
				Toast msg = Toast.makeText(getApplicationContext(),
						R.string.msg_no_connection, Toast.LENGTH_SHORT);
				msg.setGravity(Gravity.CENTER, 15, 15);
				msg.show();
				result = false;
			}
			return result;
		}

	}

}
