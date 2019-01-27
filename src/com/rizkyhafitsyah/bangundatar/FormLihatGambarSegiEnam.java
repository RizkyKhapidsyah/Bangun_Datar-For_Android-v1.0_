package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegiEnam extends Activity {

	TextView TV_PenjelasanSegiEnam;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segienam);

		TV_PenjelasanSegiEnam = (TextView) findViewById(R.id.TV_PenjelasanSegiEnam);
		Baca_Penjelasan_SegiEnam();
	}

	public void Baca_Penjelasan_SegiEnam() {
		try {
			InputStream is = getAssets().open("Penjelasan_SegiEnam_Beraturan");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegiEnam.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
