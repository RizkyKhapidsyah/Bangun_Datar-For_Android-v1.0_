package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarSegitigaSembarang extends Activity {
	
	TextView TV_PenjelasanSegitigaSembarang;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_segitiga_sembarang);

		TV_PenjelasanSegitigaSembarang = (TextView) findViewById(R.id.TV_PenjelasanSegitigaSembarang);
		Baca_Penjelasan_Segitiga_Sembarang();

	}
	
	public void Baca_Penjelasan_Segitiga_Sembarang() {
		try {
			InputStream is = getAssets().open("Penjelasan_Segitiga_Sembarang");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanSegitigaSembarang.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
