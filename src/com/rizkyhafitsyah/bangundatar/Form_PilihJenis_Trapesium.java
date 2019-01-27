package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Form_PilihJenis_Trapesium extends Activity {

	Button Button_TrapesiumSamaKaki_Pilihan;
	Button Button_TrapesiumSembarang_Pilihan;
	Button Button_TrapesiumSikuSiku_Pilihan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_pilih_jenis_trapesium);

		Button_TrapesiumSamaKaki_Pilihan = (Button) findViewById(R.id.Button_TrapesiumSamaKaki_Pilihan);
		Button_TrapesiumSembarang_Pilihan = (Button) findViewById(R.id.Button_TrapesiumSembarang_Pilihan);
		Button_TrapesiumSikuSiku_Pilihan = (Button) findViewById(R.id.Button_TrapesiumSikuSiku_Pilihan);

		Button_TrapesiumSamaKaki_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Trapesium.this, Form_ModeCari_Trapesium_SamaKaki.class);
			startActivity(i);
		}
	});
		Button_TrapesiumSembarang_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Trapesium.this, Form_ModeCari_Trapesium_Sembarang.class);
			startActivity(i);
		}
	});	
		Button_TrapesiumSikuSiku_Pilihan.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(Form_PilihJenis_Trapesium.this, Form_ModeCari_Trapesium_SikuSiku.class);
			startActivity(i);
		}
	});			
	
	}
}