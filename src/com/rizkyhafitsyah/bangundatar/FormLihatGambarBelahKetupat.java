package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarBelahKetupat extends Activity {
	
	TextView TV_PenjelasanBelahKetupat;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_belahketupat);

		TV_PenjelasanBelahKetupat = (TextView) findViewById(R.id.TV_PenjelasanBelahKetupat);
		Baca_Penjelasan_Belah_Ketupat();

	}
	
	public void Baca_Penjelasan_Belah_Ketupat() {
		try {
			InputStream is = getAssets().open("Penjelasan_Belah_Ketupat");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanBelahKetupat.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
