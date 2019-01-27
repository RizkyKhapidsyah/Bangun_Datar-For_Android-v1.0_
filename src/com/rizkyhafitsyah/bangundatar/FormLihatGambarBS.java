package com.rizkyhafitsyah.bangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;

public class FormLihatGambarBS extends Activity {

	TextView BacaTextPenjelasanBS;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_gambar_bs);

		BacaTextPenjelasanBS = (TextView) findViewById(R.id.TV_PenjelasanBujurSangkar);
		Baca_Penjelasan_Bujur_Sangkar();
	}

	public void Baca_Penjelasan_Bujur_Sangkar() {
		try {
			InputStream is = getAssets().open("Penjelasan_Bujur_Sangkar");
			int size = is.available();
			byte[] buffer = new byte[size];
			is.read(buffer);
			is.close();
			BacaTextPenjelasanBS.setText(new String(buffer));
		} catch (IOException ex) {
			return;
		}
	}
}
