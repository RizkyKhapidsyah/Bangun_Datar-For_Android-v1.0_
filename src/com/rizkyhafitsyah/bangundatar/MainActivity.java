package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView TextView_TampilanUtama;
	TextView TextView_ButtonMulaiHitung;
	TextView TextViewButtonRingkasan;
	TextView TextViewButtonLihatRumus;
	TextView TextViewButtonTentang;
	TextView TextViewButtonKeluar;
	TextView TextViewButtonPengaturan;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        String CustomHuruf_Main_Activity  = "AGENCYR.TTF";
        Typeface TipeHuruf_Main_Activity = Typeface.createFromAsset(getAssets(), CustomHuruf_Main_Activity);

		Button ButtonMulaiHitung = (Button) findViewById(R.id.ButtonMulaiHitung);
		Button ButtonLihatRumus = (Button) findViewById(R.id.ButtonLihatRumus);
		Button ButtonRingkasan = (Button) findViewById(R.id.ButtonRingkasan);
		Button ButtonKeluar = (Button) findViewById(R.id.ButtonKeluar);
		Button ButtonTentang = (Button) findViewById(R.id.ButtonTentang);
		TextView TextView_TampilanUtama = (TextView) findViewById(R.id.TextView_TampilanUtama);
		TextView TextView_ButtonMulaiHitung = (TextView) findViewById(R.id.TextView_ButtonMulaiHitung);
		TextView TextViewButtonRingkasan = (TextView) findViewById(R.id.TextViewButtonRingkasan);
		TextView TextViewButtonLihatRumus = (TextView) findViewById(R.id.TextViewButtonLihatRumus);
		TextView TextViewButtonTentang = (TextView) findViewById(R.id.TextViewButtonTentang);
		TextView TextViewButtonKeluar = (TextView) findViewById(R.id.TextViewButtonKeluar);
		
		
		ButtonMulaiHitung.setTypeface(TipeHuruf_Main_Activity);
		ButtonLihatRumus.setTypeface(TipeHuruf_Main_Activity);
		ButtonRingkasan.setTypeface(TipeHuruf_Main_Activity);
		ButtonKeluar.setTypeface(TipeHuruf_Main_Activity);
		ButtonTentang.setTypeface(TipeHuruf_Main_Activity);
		TextView_TampilanUtama.setTypeface(TipeHuruf_Main_Activity);
		TextView_ButtonMulaiHitung.setTypeface(TipeHuruf_Main_Activity);
		TextViewButtonRingkasan.setTypeface(TipeHuruf_Main_Activity);
		TextViewButtonLihatRumus.setTypeface(TipeHuruf_Main_Activity);
		TextViewButtonTentang.setTypeface(TipeHuruf_Main_Activity);
		TextViewButtonKeluar.setTypeface(TipeHuruf_Main_Activity);
		
		ButtonMulaiHitung.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});
		ButtonLihatRumus.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});
		ButtonRingkasan.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});
		ButtonKeluar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});
		ButtonTentang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});
		ButtonKeluar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				PanggilFormMulaiHitung(v);
			}
		});		
	}

	public void PanggilFormMulaiHitung(View view) {
		Intent i = null;
		switch (view.getId()) {
		case R.id.ButtonMulaiHitung:
			i = new Intent(MainActivity.this, FormMulaiHitung.class);
			startActivity(i);
			break;
		case R.id.ButtonLihatRumus:
			i = new Intent(MainActivity.this, Form_Lihat_Rumus.class);
			startActivity(i);
			break;
		case R.id.ButtonRingkasan:
			i = new Intent(MainActivity.this, Form_Ringkasan.class);
			startActivity(i);
			break;
		case R.id.ButtonKeluar:
			finish();
			break;
		case R.id.ButtonTentang:
			i = new Intent(MainActivity.this, Form_Tentang.class);
			startActivity(i);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
