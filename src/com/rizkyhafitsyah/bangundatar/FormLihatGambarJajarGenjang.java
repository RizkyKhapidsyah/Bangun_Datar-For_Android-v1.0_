package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarJajarGenjang extends Activity {
	
	TextView TV_PenjelasanJajarGenjang;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_jajargenjang);

		TV_PenjelasanJajarGenjang = (TextView) findViewById(R.id.TV_PenjelasanJajarGenjang);
		Baca_Penjelasan_Jajar_Genjang();

	}
	
	public void Baca_Penjelasan_Jajar_Genjang() {
		try {
			InputStream is = getAssets().open("Penjelasan_Jajar_Genjang");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanJajarGenjang.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
