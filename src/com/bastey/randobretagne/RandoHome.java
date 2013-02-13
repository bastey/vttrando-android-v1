package com.bastey.randobretagne;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.bastey.randobretagne.domain.EnumTypeSport;

/**
 * Page d'accueil de l'application Rando Bretagne.
 */
public class RandoHome extends SherlockActivity {

	/** Composants définis dans la vue. */
	private RadioButton radioVTT, radioCyclo, radioMarche;
	private CheckBox dpt22, dpt29, dpt35, dpt56, dpt44;

	/** Composants sélectionnés. */
	private EnumTypeSport selectedSport = null;
	private int[] selectedDepartements = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		radioVTT = (RadioButton) this.findViewById(R.id.radio_vtt);
		radioCyclo = (RadioButton) this.findViewById(R.id.radio_cyclo);
		radioMarche = (RadioButton) this.findViewById(R.id.radio_marche);

		dpt22 = (CheckBox) this.findViewById(R.id.checkBox_dpt22);
		dpt29 = (CheckBox) this.findViewById(R.id.checkBox_dpt29);
		dpt35 = (CheckBox) this.findViewById(R.id.checkBox_dpt35);
		dpt56 = (CheckBox) this.findViewById(R.id.checkBox_dpt56);
		dpt44 = (CheckBox) this.findViewById(R.id.checkBox_dpt44);
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

		if (radioVTT.isChecked()) {
			selectedSport = EnumTypeSport.VTT;
		} else if (radioCyclo.isChecked()) {
			selectedSport = EnumTypeSport.CYCLO;
		} else if (radioMarche.isChecked()) {
			selectedSport = EnumTypeSport.MARCHE;
		}

		selectedDepartements = new int[5];
		int i = 0;
		boolean oneDepChecked = false;
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

		if (oneDepChecked) {
			Intent intent = new Intent(getApplicationContext(),
					RandoListActivity.class);
			intent.putExtra("typeSport", selectedSport.getValeur());
			intent.putExtra("departements", selectedDepartements);
			startActivity(intent);
		} else {
			Toast msg = Toast.makeText(this, R.string.msg_choisir_dpt,
					Toast.LENGTH_SHORT);
			msg.setGravity(Gravity.CENTER, 15, 15);
			msg.show();
		}
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
	private void showExitDialog(){
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
	
}
