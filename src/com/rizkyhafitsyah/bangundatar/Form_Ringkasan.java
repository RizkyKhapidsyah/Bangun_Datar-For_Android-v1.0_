package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class Form_Ringkasan extends Activity {
	Button ButtonBujurSangkar_R;
	Button ButtonPersegiPanjang_R;
	Button ButtonSegitiga_R;
	Button ButtonBelahKetupat_R;
	Button ButtonJajarGenjang_R;
	Button ButtonLayangLayang_R;
	Button ButtonLingkaran_R;
	Button ButtonTrapesium_R;
	Button ButtonSegilima_R;
	Button ButtonSegienam_R;
	Button ButtonElips_R;
	Button ButtonKembali_R;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_ringkasan);
		
        String CustomHuruf_FormRingkasan = "AGENCYR.TTF";
        Typeface TipeHuruf_FormRingkasan = Typeface.createFromAsset(getAssets(), CustomHuruf_FormRingkasan);		

		Button ButtonBujurSangkar_R = (Button) findViewById(R.id.ButtonBujurSangkar_R);
		Button ButtonPersegiPanjang_R = (Button) findViewById(R.id.ButtonPersegiPanjang_R);
		Button ButtonSegitiga_R = (Button) findViewById(R.id.ButtonSegitiga_R);
		Button ButtonBelahKetupat_R = (Button) findViewById(R.id.ButtonBelahKetupat_R);
		Button ButtonJajarGenjang_R = (Button) findViewById(R.id.ButtonJajarGenjang_R);
		Button ButtonLayangLayang_R = (Button) findViewById(R.id.ButtonLayangLayang_R);
		Button ButtonLingkaran_R = (Button) findViewById(R.id.ButtonLingkaran_R);
		Button ButtonTrapesium_R = (Button) findViewById(R.id.ButtonTrapesium_R);
		Button ButtonSegilima_R = (Button) findViewById(R.id.ButtonSegilima_R);
		Button ButtonSegienam_R = (Button) findViewById(R.id.ButtonSegienam_R);
		Button ButtonElips_R = (Button) findViewById(R.id.ButtonElips_R);
		Button ButtonKembali_R = (Button) findViewById(R.id.ButtonKembali_R);

		ButtonBujurSangkar_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonPersegiPanjang_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonSegitiga_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonBelahKetupat_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonJajarGenjang_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonLayangLayang_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonLingkaran_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonTrapesium_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonSegilima_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonSegienam_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonElips_R.setTypeface(TipeHuruf_FormRingkasan);
		ButtonKembali_R.setTypeface(TipeHuruf_FormRingkasan);
		
		ButtonBujurSangkar_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarBS.class);
				startActivity(i);
			}
		});
		ButtonPersegiPanjang_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarPP.class);
				startActivity(i);
			}
		});	
		ButtonSegitiga_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, Form_PilihJenis_Ringkasan_Segitiga.class);
				startActivity(i);
			}
		});	
		ButtonBelahKetupat_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarBelahKetupat.class);
				startActivity(i);
			}
		});
		ButtonJajarGenjang_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarJajarGenjang.class);
				startActivity(i);
			}
		});
		ButtonLayangLayang_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarLayangLayang.class);
				startActivity(i);
			}
		});	
		ButtonLingkaran_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarLingkaran.class);
				startActivity(i);
			}
		});	
		ButtonTrapesium_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarTrapesium.class);
				startActivity(i);
			}
		});
		ButtonSegienam_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarSegiEnam.class);
				startActivity(i);
			}
		});	
		ButtonSegilima_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarSegiLima.class);
				startActivity(i);
			}
		});	
		ButtonElips_R.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Ringkasan.this, FormLihatGambarElips.class);
				startActivity(i);
			}
		});			
		ButtonKembali_R.setOnClickListener(new View.OnClickListener() {
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
