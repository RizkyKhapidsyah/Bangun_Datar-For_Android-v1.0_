package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarLingkaran extends Activity {

	TextView TV_PenjelasanLingkaran;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_lingkaran);

		TV_PenjelasanLingkaran = (TextView) findViewById(R.id.TV_PenjelasanLingkaran);
		Baca_Penjelasan_Lingkaran();
	}

	public void Baca_Penjelasan_Lingkaran() {
		try {
			InputStream is = getAssets().open("Penjelasan_Lingkaran");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			TV_PenjelasanLingkaran.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
