package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegiLima extends Activity {

	TextView TV_PenjelasanSegiLima;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segilima);

		TV_PenjelasanSegiLima = (TextView) findViewById(R.id.TV_PenjelasanSegiLima);
		Baca_Penjelasan_SegiLima();
	}

	public void Baca_Penjelasan_SegiLima() {
		try {
			InputStream is = getAssets().open("Penjelasan_SegiLima_Beraturan");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegiLima.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
