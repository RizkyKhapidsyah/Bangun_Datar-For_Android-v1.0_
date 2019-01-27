package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class FormMulaiHitung extends Activity {
	Button ButtonBujurSangkar;
	Button ButtonPersegiPanjang;
	Button ButtonSegitiga;
	Button ButtonBelahKetupat;
	Button ButtonJajarGenjang;
	Button ButtonLayangLayang;
	Button ButtonLingkaran;
	Button ButtonTrapesium;
	Button ButtonSegilima;
	Button ButtonSegienam;
	Button ButtonElips;
	Button ButtonKembali;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_mulai_hitung);
		
        String CustomHuruf_FormMulaiHitung = "AGENCYR.TTF";
        Typeface TipeHuruf_FormMulaiHitung = Typeface.createFromAsset(getAssets(), CustomHuruf_FormMulaiHitung);		

		Button ButtonBujurSangkar = (Button) findViewById(R.id.ButtonBujurSangkar);
		Button ButtonPersegiPanjang = (Button) findViewById(R.id.ButtonPersegiPanjang);
		Button ButtonSegitiga = (Button) findViewById(R.id.ButtonSegitiga);
		Button ButtonBelahKetupat = (Button) findViewById(R.id.ButtonBelahKetupat);
		Button ButtonJajarGenjang = (Button) findViewById(R.id.ButtonJajarGenjang);
		Button ButtonLayangLayang = (Button) findViewById(R.id.ButtonLayangLayang);
		Button ButtonLingkaran = (Button) findViewById(R.id.ButtonLingkaran);
		Button ButtonTrapesium = (Button) findViewById(R.id.ButtonTrapesium);
		Button ButtonSegilima = (Button) findViewById(R.id.ButtonSegilima);
		Button ButtonSegienam = (Button) findViewById(R.id.ButtonSegienam);
		Button ButtonElips = (Button) findViewById(R.id.ButtonElips);
		Button ButtonKembali = (Button) findViewById(R.id.ButtonKembali);

		ButtonBujurSangkar.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonPersegiPanjang.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonSegitiga.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonBelahKetupat.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonJajarGenjang.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonLayangLayang.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonLingkaran.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonTrapesium.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonSegilima.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonSegienam.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonElips.setTypeface(TipeHuruf_FormMulaiHitung);
		ButtonKembali.setTypeface(TipeHuruf_FormMulaiHitung);
		
		ButtonBujurSangkar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_BujurSangkar.class);
				startActivity(i);
			}
		});
		ButtonPersegiPanjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_PersegiPanjang.class);
				startActivity(i);
			}
		});	
		ButtonSegitiga.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_PilihJenis_Segitiga.class);
				startActivity(i);
			}
		});	
		ButtonBelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_BelahKetupat.class);
				startActivity(i);
			}
		});
		ButtonJajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_JajarGenjang.class);
				startActivity(i);
			}
		});
		ButtonLayangLayang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_LayangLayang.class);
				startActivity(i);
			}
		});	
		ButtonLingkaran.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_Lingkaran.class);
				startActivity(i);
			}
		});	
		ButtonTrapesium.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_PilihJenis_Trapesium.class);
				startActivity(i);
			}
		});
		ButtonSegienam.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_SegiEnam_Beraturan.class);
				startActivity(i);
			}
		});	
		ButtonSegilima.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_ModeCari_SegiLima_Beraturan.class);
				startActivity(i);
			}
		});	
		ButtonElips.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(FormMulaiHitung.this, Form_Elips.class);
				startActivity(i);
			}
		});			
		ButtonKembali.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					finish();
				}
			});		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
