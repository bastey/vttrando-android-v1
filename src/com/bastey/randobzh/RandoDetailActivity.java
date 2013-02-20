package com.bastey.randobzh;

import android.os.Bundle;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.bastey.randobzh.domain.EnumTypeSport;
import com.bastey.randobzh.domain.Rando;

/**
 * Détail d'une randonnee.
 * 
 * @author bastey
 */
public class RandoDetailActivity extends SherlockActivity {

	private TextView date, departement, lieu, nom, organisateur, lieu_rdv,
			horaire, site_web, prix_public, prix_club, contact, description;

	/** La rando à afficher. */
	private Rando selectedRando;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rando_detail);

		ActionBar ab = getSupportActionBar();
		ab.setDisplayHomeAsUpEnabled(true);

		// On recupere la rando
		Bundle args = getIntent().getExtras();
		selectedRando = args.getParcelable("rando");

		// Modification du titre en fct du sport selectionne
		if (EnumTypeSport.VTT.equals(selectedRando.getTypeSport())) {
			ab.setTitle("Détail de la rando VTT");
		} else if (EnumTypeSport.CYCLO.equals(selectedRando.getTypeSport())) {
			ab.setTitle("Détail de la rando Cyclo");
		} else if (EnumTypeSport.MARCHE.equals(selectedRando.getTypeSport())) {
			ab.setTitle("Détail de la rando Pédestres");
		}

		// On affiche les donnees de la rando
		date = (TextView) this.findViewById(R.id.detail_date_valeur);
		date.setText(selectedRando.getDateStrDetail());

		departement = (TextView) this
				.findViewById(R.id.detail_departement_valeur);
		departement.setText(String.valueOf(selectedRando.getDepartement()));

		lieu = (TextView) this.findViewById(R.id.detail_lieu_valeur);
		lieu.setText(selectedRando.getLieu());

		nom = (TextView) this.findViewById(R.id.detail_nom_valeur);
		nom.setText(selectedRando.getNom());

		organisateur = (TextView) this.findViewById(R.id.detail_orga_valeur);
		organisateur.setText(selectedRando.getOrganisateur());

		lieu_rdv = (TextView) this.findViewById(R.id.detail_lieu_rdv_valeur);
		lieu_rdv.setText(selectedRando.getLieuRdv());

		horaire = (TextView) this.findViewById(R.id.detail_horaire_valeur);
		horaire.setText(selectedRando.getHoraires());

		site_web = (TextView) this.findViewById(R.id.detail_site_web_valeur);
		site_web.setText(selectedRando.getSiteWeb());

		prix_public = (TextView) this
				.findViewById(R.id.detail_prix_public_valeur);
		prix_public.setText(selectedRando.getPrixPublic());

		prix_club = (TextView) this.findViewById(R.id.detail_prix_club_valeur);
		prix_club.setText(selectedRando.getPrixClub());

		contact = (TextView) this.findViewById(R.id.detail_contact_valeur);
		contact.setText(selectedRando.getContact());

		description = (TextView) this
				.findViewById(R.id.detail_description_valeur);
		description.setText(selectedRando.getDescription());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_rando_detail, menu);
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

}
