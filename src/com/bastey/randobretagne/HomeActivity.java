package com.bastey.randobretagne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.bastey.randobretagne.domain.EnumTypeSport;

public class HomeActivity extends Activity {

	private RadioButton radioVTT, radioCyclo, radioMarche;
	private CheckBox dpt22, dpt29, dpt35, dpt56, dpt44;

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
		getMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}

	/**
	 * Methode appelee lors du clic du bouton "Randonnees".
	 * 
	 * @param view
	 */
	public void openRandoListView(View view) {

		EnumTypeSport selectedSport = null;
		if (radioVTT.isChecked()) {
			selectedSport = EnumTypeSport.VTT;
		} else if (radioCyclo.isChecked()) {
			selectedSport = EnumTypeSport.CYCLO;
		} else if (radioMarche.isChecked()) {
			selectedSport = EnumTypeSport.MARCHE;
		}

		int[] departements = new int[5];
		boolean minOneCheched = false;
		int i = 0;
		if (dpt22.isChecked()) {
			departements[i] = 22;
			i++;
			minOneCheched = true;
		}
		if (dpt29.isChecked()) {
			departements[i] = 29;
			i++;
			minOneCheched = true;
		}
		if (dpt35.isChecked()) {
			departements[i] = 35;
			i++;
			minOneCheched = true;
		}
		if (dpt56.isChecked()) {
			departements[i] = 56;
			i++;
			minOneCheched = true;
		}
		if (dpt44.isChecked()) {
			departements[i] = 44;
			i++;
			minOneCheched = true;
		}

		if (minOneCheched) {
			Intent intent = new Intent(getApplicationContext(),
					RandoListActivity.class);
			intent.putExtra("typeSport", selectedSport.getValeur());
			intent.putExtra("departements", departements);
			startActivity(intent);
		} else {
			Toast msg = Toast.makeText(this, R.string.msg_choisir_dpt,
					Toast.LENGTH_SHORT);
			msg.setGravity(Gravity.CENTER, 15, 15);
			msg.show();

		}
	}
}
