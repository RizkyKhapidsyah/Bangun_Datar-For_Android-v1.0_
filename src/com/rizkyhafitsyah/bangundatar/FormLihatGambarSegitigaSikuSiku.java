package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegitigaSikuSiku extends Activity {
	
	TextView TV_PenjelasanSegitigaSikuSiku;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segitiga_sikusiku);

		TV_PenjelasanSegitigaSikuSiku = (TextView) findViewById(R.id.TV_PenjelasanSegitigaSikuSiku);
		Baca_Penjelasan_Segitiga_SikuSiku();

	}
	
	public void Baca_Penjelasan_Segitiga_SikuSiku() {
		try {
			InputStream is = getAssets().open("Penjelasan_Segitiga_SikuSiku");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegitigaSikuSiku.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
