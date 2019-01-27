package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarTrapesium extends Activity {

	TextView TV_PenjelasanTrapesium;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_trapesium);

		TV_PenjelasanTrapesium = (TextView) findViewById(R.id.TV_PenjelasanTrapesium);
		Baca_Penjelasan_Trapesium();
	}

	public void Baca_Penjelasan_Trapesium() {
		try {
			InputStream is = getAssets().open("Penjelasan_Trapesium");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanTrapesium.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
