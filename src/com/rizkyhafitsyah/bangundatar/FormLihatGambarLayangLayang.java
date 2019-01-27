package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarLayangLayang extends Activity {
	
	TextView TV_PenjelasanLayangLayang;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_layanglayang);

		TV_PenjelasanLayangLayang = (TextView) findViewById(R.id.TV_PenjelasanLayangLayang);
		Baca_Penjelasan_Layang_Layang();

	}
	
	public void Baca_Penjelasan_Layang_Layang() {
		try {
			InputStream is = getAssets().open("Penjelasan_Layang_Layang");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanLayangLayang.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
