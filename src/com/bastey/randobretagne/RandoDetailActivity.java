package com.bastey.randobretagne;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Activité détail d'une randonnée.
 * 
 * @author bastey
 * 
 */
public class RandoDetailActivity extends Activity {

	private TextView date, departement, lieu, nom, organisateur, lieu_rdv,
			horaire, site_web, prix_public, prix_club, contact, description;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rando_detail);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}

		Bundle args = getIntent().getExtras();

		date = (TextView) this.findViewById(R.id.detail_date_valeur);
		date.setText(args.getString("date"));

		departement = (TextView) this
				.findViewById(R.id.detail_departement_valeur);
		departement.setText(String.valueOf(args.getInt("departement")));

		lieu = (TextView) this.findViewById(R.id.detail_lieu_valeur);
		lieu.setText(args.getString("lieu"));

		nom = (TextView) this.findViewById(R.id.detail_nom_valeur);
		nom.setText(args.getString("nom"));

		organisateur = (TextView) this.findViewById(R.id.detail_orga_valeur);
		organisateur.setText(args.getString("organisateur"));

		lieu_rdv = (TextView) this.findViewById(R.id.detail_lieu_rdv_valeur);
		lieu_rdv.setText(args.getString("lieu_rdv"));

		horaire = (TextView) this.findViewById(R.id.detail_horaire_valeur);
		horaire.setText(args.getString("horaire"));

		site_web = (TextView) this.findViewById(R.id.detail_site_web_valeur);
		site_web.setText(args.getString("site_web"));

		prix_public = (TextView) this
				.findViewById(R.id.detail_prix_public_valeur);
		prix_public.setText(args.getString("prix_public"));

		prix_club = (TextView) this.findViewById(R.id.detail_prix_club_valeur);
		prix_club.setText(args.getString("prix_club"));

		contact = (TextView) this.findViewById(R.id.detail_contact_valeur);
		contact.setText(args.getString("contact"));

		description = (TextView) this
				.findViewById(R.id.detail_description_valeur);
		description.setText(args.getString("description"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_rando_detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// Called when the Home (Up) button is pressed in the ActionBar.
			finish();
			// onBackPressed(); //pour simuler un retour simple
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
