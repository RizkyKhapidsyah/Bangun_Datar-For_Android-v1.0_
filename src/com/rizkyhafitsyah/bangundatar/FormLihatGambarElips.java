package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarElips extends Activity {

	TextView TV_PenjelasanElips;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_elips);

		TV_PenjelasanElips = (TextView) findViewById(R.id.TV_PenjelasanElips);
		Baca_Penjelasan_Elips();
	}

	public void Baca_Penjelasan_Elips() {
		try {
			InputStream is = getAssets().open("Penjelasan_Elips");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanElips.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
