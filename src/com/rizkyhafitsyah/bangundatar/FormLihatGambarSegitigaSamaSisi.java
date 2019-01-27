package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegitigaSamaSisi extends Activity {
	
	TextView TV_PenjelasanSegitigaSamaSisi;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segitiga_samasisi);

		TV_PenjelasanSegitigaSamaSisi = (TextView) findViewById(R.id.TV_PenjelasanSegitigaSamaSisi);
		Baca_Penjelasan_Segitiga_SamaSisi();

	}
	
	public void Baca_Penjelasan_Segitiga_SamaSisi() {
		try {
			InputStream is = getAssets().open("Penjelasan_Segitiga_SamaSisi");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegitigaSamaSisi.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
