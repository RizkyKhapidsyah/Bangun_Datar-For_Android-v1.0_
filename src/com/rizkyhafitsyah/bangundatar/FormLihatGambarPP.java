package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarPP extends Activity {
	
	TextView TV_PenjelasanPersegiPanjang;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_pp);

		TV_PenjelasanPersegiPanjang = (TextView) findViewById(R.id.TV_PenjelasanPersegiPanjang);
		Baca_Penjelasan_Persegi_Panjang();

	}
	
	public void Baca_Penjelasan_Persegi_Panjang() {
		try {
			InputStream is = getAssets().open("Penjelasan_Persegi_Panjang");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanPersegiPanjang.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
