package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

 
public class Form_ModeCari_Trapesium_Sembarang extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_trapesium_sembarang);
        
        String CustomHuruf_TSm = "AGENCYR.TTF";
        Typeface TipeHuruf_TSm = Typeface.createFromAsset(getAssets(), CustomHuruf_TSm);
      
        TextView TV_Judul_TSm_MC_Semua = (TextView) findViewById(R.id.TV_Judul_TSm_MC_Semua);
        TextView TV_PilihModeCari_TSm = (TextView) findViewById(R.id.TV_PilihModeCari_TSm);
        ImageView IV_TrapesiumSembarang = (ImageView) findViewById(R.id.IV_TrapesiumSembarang);
		Button Button_MC_Semua_TSm = (Button) findViewById(R.id.Button_MC_Semua_TSm);
		Button Button_MC_HSA_TSm = (Button) findViewById(R.id.Button_MC_HSA_TSm);
		Button Button_MC_HSB_TSm = (Button) findViewById(R.id.Button_MC_HSB_TSm);
		Button Button_MC_HSKr_TSm = (Button) findViewById(R.id.Button_MC_HSKr_TSm);
		Button Button_MC_HT_TSm = (Button) findViewById(R.id.Button_MC_HT_TSm);
		Button Button_MC_HSBKr_TSm = (Button) findViewById(R.id.Button_MC_HSBKr_TSm);

        TV_Judul_TSm_MC_Semua.setTypeface(TipeHuruf_TSm);
        TV_PilihModeCari_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_Semua_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_HSA_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_HSB_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_HSKr_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_HT_TSm.setTypeface(TipeHuruf_TSm);
		Button_MC_HSBKr_TSm.setTypeface(TipeHuruf_TSm);
			
		IV_TrapesiumSembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, FormLihatGambarTrapesium.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HSA_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_HSA.class);
				startActivity(i);
			}
		});	
		Button_MC_HSB_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_HSB.class);
				startActivity(i);
			}
		});
		Button_MC_HSKr_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_HSKr.class);
				startActivity(i);
			}
		});	
		Button_MC_HT_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_HT.class);
				startActivity(i);
			}
		});	
		Button_MC_HSBKr_TSm.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_Sembarang.this, Form_Trapesium_Sembarang_MC_HSBKr.class);
				startActivity(i);
			}
		});			
	
    }
}