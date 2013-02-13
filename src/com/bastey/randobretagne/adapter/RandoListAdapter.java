package com.bastey.randobretagne.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bastey.randobretagne.R;
import com.bastey.randobretagne.domain.Rando;

/**
 * Adapter de Rando pour vue Liste.
 * 
 * @author bastey
 * 
 */
public class RandoListAdapter extends ArrayAdapter<Rando> {

	List<Rando> randos;
	int viewRes;
	final int backgroundLineColor = Color.rgb(211, 247, 163);

	public RandoListAdapter(Context context, int textViewResourceId,
			List<Rando> pRandos) {
		super(context, textViewResourceId, pRandos);
		this.randos = pRandos;
		// FIXME ? this.context = context;
		this.viewRes = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
					Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(viewRes, parent, false);
		}

		Rando o = randos.get(position);
		if (o != null) {
			TextView tvDate = (TextView) v.findViewById(R.id.tvDate);
			tvDate.setText(o.getDateStr());

			TextView tvNom = (TextView) v.findViewById(R.id.tvNom);
			tvNom.setText(o.getNom());

			TextView tvLieu = (TextView) v.findViewById(R.id.tvDptLieu);
			String lieu = o.getDepartement() + " - " + o.getLieu();
			tvLieu.setText(lieu);

		}
		if (position % 2 != 0) {
			v.setBackgroundColor(backgroundLineColor);
		}

		return v;
	}
}
