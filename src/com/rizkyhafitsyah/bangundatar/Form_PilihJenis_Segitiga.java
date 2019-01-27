package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Form_PilihJenis_Segitiga extends Activity {

	Button Button_SegitigaSamaKaki_Pilihan;
	Button Button_SegitigaSamaSisi_Pilihan;
	Button Button_SegitigaSembarang_Pilihan;
	Button Button_SegitigaSikuSiku_Pilihan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_pilih_jenis_segitiga);

		Button_SegitigaSamaKaki_Pilihan = (Button) findViewById(R.id.Button_SegitigaSamaKaki_Pilihan);
		Button_SegitigaSamaSisi_Pilihan = (Button) findViewById(R.id.Button_SegitigaSamaSisi_Pilihan);
		Button_SegitigaSembarang_Pilihan = (Button) findViewById(R.id.Button_SegitigaSembarang_Pilihan);
		Button_SegitigaSikuSiku_Pilihan = (Button) findViewById(R.id.Button_SegitigaSikuSiku_Pilihan);

		Button_SegitigaSamaKaki_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Segitiga.this, Form_ModeCari_Segitiga_SamaKaki.class);
			startActivity(i);
		}
	});
		Button_SegitigaSamaSisi_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Segitiga.this, Form_ModeCari_Segitiga_SamaSisi.class);
			startActivity(i);
		}
	});
		Button_SegitigaSembarang_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Segitiga.this, Form_ModeCari_Segitiga_Sembarang.class);
			startActivity(i);
		}
	});
		Button_SegitigaSikuSiku_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Segitiga.this, Form_ModeCari_Segitiga_SikuSiku.class);
			startActivity(i);
		}
	});		
	}
}