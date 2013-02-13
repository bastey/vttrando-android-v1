package com.bastey.randobretagne;


//public class RandoListActivity extends FragmentActivity implements
//		ActionBar.TabListener {
public class RandoListActivitySave{
//public class RandoListActivity extends FragmentActivity {
//
//	/** Sport selectionne dans la menu. */
//	private EnumTypeSport selectedSport;
//
//	/** Liste des departements selectionnes. */
//	private int[] selectedDepartements;
//
//	/** Mois courant. */
//	private int currentMonth;
//
//	private RandoListAdapter adapter;
//
//	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
//
//	private Randos randos;
//
//	private List<Rando> randoFiltered;
//
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_rando_list);
//
//		// if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//		// getActionBar().setDisplayHomeAsUpEnabled(true);
//		// }
//
//		/** Activite est-elle appelee depuis bouton Home (Up) de l'ActionBar ? */
//		boolean isCalledFromUpButton = Boolean.valueOf((Boolean) this
//				.getIntent().getExtras().getBoolean("upButton"));
//
//		if (!isCalledFromUpButton) {
//			// Recuperation du sport selectionne dans l'ecran precedent
//			int sport = (Integer) this.getIntent().getExtras().get("typeSport");
//			selectedSport = EnumTypeSport.getTypeSport(sport);
//
//			// Recuperation des departements selectionnes dans l'ecran precedent
//			selectedDepartements = this.getIntent().getExtras()
//					.getIntArray("departements");
//
//			// Initialisation des randos de test (CACHE)
//			if (randos == null) {
//				randos = new Randos();
//				RandosGenerator.initData(randos);
//			}
//		}
//
//		// Set up the action bar.
//		// ActionBar actionBar = getActionBar();
//		// actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//		// Filtrage des randos en fonction des donnees saisies dans l'ecran
//		// precedent
//		randoFiltered = randos.getRandosFromSportAndDpts(selectedSport,
//				selectedDepartements);
//
//		// Construction des onglets mois
//		// GregorianCalendar calendar = new GregorianCalendar();
//		// int month = calendar.get(Calendar.MONTH) + 1;
//		// TODO HACK : Mai en dur
//		currentMonth = 6;
//		int month = currentMonth;
//		// while (month < 13) {
//		// actionBar.addTab(actionBar.newTab()
//		// .setText(getStringResourceByName("tab" + month))
//		// .setTabListener(this));
//		// month++;
//		// }
//
//	}
//
//	/**
//	 * R�cup�ration dynamique d'une String dans "strings.xml".
//	 * 
//	 * @param aString
//	 *            Libelle de la chaine � r�cuperer
//	 * @return Valeur
//	 */
//	private String getStringResourceByName(String aString) {
//		String packageName = "com.bastey.randobretagne";
//		int resId = getResources()
//				.getIdentifier(aString, "string", packageName);
//		return getString(resId);
//	}
//
//	@Override
//	public void onRestoreInstanceState(Bundle savedInstanceState) {
//		if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
////			getActionBar().setSelectedNavigationItem(
////					savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM));
//		}
//	}
//
//	@Override
//	public void onSaveInstanceState(Bundle outState) {
////		outState.putInt(STATE_SELECTED_NAVIGATION_ITEM, getActionBar()
////				.getSelectedNavigationIndex());
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.activity_rando_list, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		switch (item.getItemId()) {
////		case android.R.id.home:
////			// Called when the Home (Up) button is pressed in the ActionBar.
////			// NavUtils.navigateUpFromSameTask(this);
////			finish();
////			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
//
////	@Override
////	public void onTabUnselected(ActionBar.Tab tab,
////			FragmentTransaction fragmentTransaction) {
////	}
////
////	@Override
////	public void onTabSelected(ActionBar.Tab tab,
////			FragmentTransaction fragmentTransaction) {
////		// When the given tab is selected, show the tab contents in the
////		// container
////		Fragment fragment = new DummySectionFragment();
////		int selectedmonth = tab.getPosition() + currentMonth;
////
////		// Bundle args = new Bundle();
////		// args.putInt("month", tab.getPosition() + currentMonth);
////		// fragment.setArguments(args);
////
////		List<Rando> randosFilteredForTab = new ArrayList<Rando>();
////		Calendar cal = Calendar.getInstance();
////		if (randoFiltered != null) {
////			for (Rando rando : randoFiltered) {
////				cal.setTime(rando.getDate());
////				if (cal.get(Calendar.MONTH) == selectedmonth - 1) {
////					randosFilteredForTab.add(rando);
////				}
////			}
////		}
////
////		adapter = new RandoListAdapter(this, R.layout.layout_rando_list,
////				randosFilteredForTab);
////
////		getSupportFragmentManager().beginTransaction()
////				.replace(R.id.container, fragment).commit();
////	}
////
////	@Override
////	public void onTabReselected(ActionBar.Tab tab,
////			FragmentTransaction fragmentTransaction) {
////	}
//
//	/**
//	 * A dummy fragment representing a section of the app, but that simply
//	 * displays dummy text.
//	 */
//	public static class DummySectionFragment extends Fragment {
//
//		private ListView listView;
//		private RandoListActivity activiteListeRando;
//
//		public DummySectionFragment() {
//		}
//
//		@Override
//		public View onCreateView(LayoutInflater inflater, ViewGroup container,
//				Bundle savedInstanceState) {
//
//			activiteListeRando = (RandoListActivity) getActivity();
//			listView = new ListView(activiteListeRando);
//			listView.setAdapter(activiteListeRando.getAdapter());
//
//			listView.setOnItemClickListener(new OnItemClickListener() {
//
//				@Override
//				public void onItemClick(AdapterView<?> adapter, View view,
//						int position, long id) {
//
//					Rando selectedRando = (Rando) adapter
//							.getItemAtPosition(position);
//					// Log.v("Clic selectedItem", selectedRando.getNom());
//
//					Intent iDetail = new Intent(activiteListeRando
//							.getApplicationContext(), RandoDetailActivity.class);
//
//					iDetail.putExtra("rando", selectedRando);
//					startActivity(iDetail);
//				}
//			});
//
//			return listView;
//		}
//
//		public ListView getListView() {
//			return listView;
//		}
//
//		public void setListView(ListView listView) {
//			this.listView = listView;
//		}
//	}
//
//	public EnumTypeSport getSelectedSport() {
//		return selectedSport;
//	}
//
//	public void setSelectedSport(EnumTypeSport selectedSport) {
//		this.selectedSport = selectedSport;
//	}
//
//	public int getCurrentMonth() {
//		return currentMonth;
//	}
//
//	public void setCurrentMonth(int currentMonth) {
//		this.currentMonth = currentMonth;
//	}
//
//	public RandoListAdapter getAdapter() {
//		return adapter;
//	}
//
//	public void setAdapter(RandoListAdapter adapter) {
//		this.adapter = adapter;
//	}

}
