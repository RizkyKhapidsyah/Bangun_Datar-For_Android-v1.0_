package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class Form_Lihat_Rumus extends Activity {
	Button Button_LR_BujurSangkar;
	Button Button_LR_PersegiPanjang;
	Button Button_LR_Segitiga;
	Button Button_LR_BelahKetupat;
	Button Button_LR_JajarGenjang;
	Button Button_LR_LayangLayang;
	Button Button_LR_Lingkaran;
	Button Button_LR_Trapesium;
	Button Button_LR_Segilima;
	Button Button_LR_Segienam;
	Button Button_LR_Elips;
	Button Button_LR_Kembali;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lihat_rumus);
		
        String CustomHuruf_FormLihatRumus = "AGENCYR.TTF";
        Typeface TipeHuruf_FormLihatRumus = Typeface.createFromAsset(getAssets(), CustomHuruf_FormLihatRumus);		

		Button Button_LR_BujurSangkar = (Button) findViewById(R.id.Button_LR_BujurSangkar);
		Button Button_LR_PersegiPanjang = (Button) findViewById(R.id.Button_LR_PersegiPanjang);
		Button Button_LR_Segitiga = (Button) findViewById(R.id.Button_LR_Segitiga);
		Button Button_LR_BelahKetupat = (Button) findViewById(R.id.Button_LR_BelahKetupat);
		Button Button_LR_JajarGenjang = (Button) findViewById(R.id.Button_LR_JajarGenjang);
		Button Button_LR_LayangLayang = (Button) findViewById(R.id.Button_LR_LayangLayang);
		Button Button_LR_Lingkaran = (Button) findViewById(R.id.Button_LR_Lingkaran);
		Button Button_LR_Trapesium = (Button) findViewById(R.id.Button_LR_Trapesium);
		Button Button_LR_Segilima = (Button) findViewById(R.id.Button_LR_Segilima);
		Button Button_LR_Segienam = (Button) findViewById(R.id.Button_LR_Segienam);
		Button Button_LR_Elips = (Button) findViewById(R.id.Button_LR_Elips);
		Button Button_LR_Kembali = (Button) findViewById(R.id.Button_LR_Kembali);

		Button_LR_BujurSangkar.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_PersegiPanjang.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Segitiga.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_BelahKetupat.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_JajarGenjang.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_LayangLayang.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Lingkaran.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Trapesium.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Segilima.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Segienam.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Elips.setTypeface(TipeHuruf_FormLihatRumus);
		Button_LR_Kembali.setTypeface(TipeHuruf_FormLihatRumus);
		
	
		Button_LR_Kembali.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					finish();
				}
			});		
		Button_LR_BujurSangkar.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_BS.class);
					startActivity(PanggilForm);
				}
	});
		
		Button_LR_PersegiPanjang.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_PP.class);
					startActivity(PanggilForm);
				}
	});	
		
		Button_LR_Segitiga.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_S.class);
					startActivity(PanggilForm);
				}
	});	
		
		Button_LR_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_BK.class);
					startActivity(PanggilForm);
				}
	});
		
		Button_LR_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_JG.class);
					startActivity(PanggilForm);
				}
	});	
		
		Button_LR_LayangLayang.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_LL.class);
					startActivity(PanggilForm);
				}
	});
		
		Button_LR_Lingkaran.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_L.class);
					startActivity(PanggilForm);
				}
	});
		
		Button_LR_Segienam.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_SE.class);
					startActivity(PanggilForm);
				}
	});	
		
		Button_LR_Segilima.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_SL.class);
					startActivity(PanggilForm);
				}
	});	
		
		Button_LR_Elips.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_E.class);
					startActivity(PanggilForm);
				}
	});
		
		Button_LR_Trapesium.setOnClickListener(new View.OnClickListener() {
			@Override		
				public void onClick(View v) {
					Intent PanggilForm = new Intent(Form_Lihat_Rumus.this, Form_Rumus_T.class);
					startActivity(PanggilForm);
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
