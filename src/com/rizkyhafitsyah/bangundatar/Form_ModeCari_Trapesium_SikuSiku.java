package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

 
public class Form_ModeCari_Trapesium_SikuSiku extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_trapesium_siku_siku);
        
        String CustomHuruf_TSKu = "AGENCYR.TTF";
        Typeface TipeHuruf_TSKu = Typeface.createFromAsset(getAssets(), CustomHuruf_TSKu);
      
        TextView TV_Judul_TSKu_MC_Semua = (TextView) findViewById(R.id.TV_Judul_TSKu_MC_Semua);
        TextView TV_PilihModeCari_TSKu = (TextView) findViewById(R.id.TV_PilihModeCari_TSKu);
        ImageView IV_TrapesiumSikuSiku = (ImageView) findViewById(R.id.IV_TrapesiumSikuSiku);
		Button Button_MC_Semua_TSKu = (Button) findViewById(R.id.Button_MC_Semua_TSKu);
		Button Button_MC_HSA_TSKu = (Button) findViewById(R.id.Button_MC_HSA_TSKu);
		Button Button_MC_HSB_TSKu = (Button) findViewById(R.id.Button_MC_HSB_TSKu);
		Button Button_MC_HT_TSKu = (Button) findViewById(R.id.Button_MC_HT_TSKu);

		TV_Judul_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu);
		TV_PilihModeCari_TSKu.setTypeface(TipeHuruf_TSKu);
		Button_MC_Semua_TSKu.setTypeface(TipeHuruf_TSKu);
		Button_MC_HSA_TSKu.setTypeface(TipeHuruf_TSKu);
		Button_MC_HSB_TSKu.setTypeface(TipeHuruf_TSKu);
		Button_MC_HT_TSKu.setTypeface(TipeHuruf_TSKu);
			
		IV_TrapesiumSikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SikuSiku.this, FormLihatGambarTrapesium.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_TSKu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SikuSiku.this, Form_Trapesium_SikuSiku_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HSA_TSKu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SikuSiku.this, Form_Trapesium_SikuSiku_MC_HSA.class);
				startActivity(i);
			}
		});	
		Button_MC_HSB_TSKu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SikuSiku.this, Form_Trapesium_SikuSiku_MC_HSB.class);
				startActivity(i);
			}
		});
		Button_MC_HT_TSKu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SikuSiku.this, Form_Trapesium_SikuSiku_MC_HT.class);
				startActivity(i);
			}
		});		
	
    }
}