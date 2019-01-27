package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegitigaSamaKaki extends Activity {
	
	TextView TV_PenjelasanSegitigaSamaKaki;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segitiga_samakaki);

		TV_PenjelasanSegitigaSamaKaki = (TextView) findViewById(R.id.TV_PenjelasanSegitigaSamaKaki);
		Baca_Penjelasan_Segitiga_SamaKaki();

	}
	
	public void Baca_Penjelasan_Segitiga_SamaKaki() {
		try {
			InputStream is = getAssets().open("Penjelasan_Segitiga_SamaKaki");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegitigaSamaKaki.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
