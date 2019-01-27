package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

 
public class Form_ModeCari_Trapesium_SamaKaki extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_trapesium_samakaki);
        
        String CustomHuruf = "AGENCYR.TTF";
        Typeface TipeHuruf = Typeface.createFromAsset(getAssets(), CustomHuruf);
      
        TextView TV_Judul_TSK_MC_Semua = (TextView) findViewById(R.id.TV_Judul_TSK_MC_Semua);
        TextView TV_PilihModeCari_T = (TextView) findViewById(R.id.TV_PilihModeCari_T);
        ImageView IV_Trapesium = (ImageView) findViewById(R.id.IV_Trapesium);
		Button Button_MC_Semua_TSK = (Button) findViewById(R.id.Button_MC_Semua_TSK);
		Button Button_MC_HSA_TSK = (Button) findViewById(R.id.Button_MC_HSA_TSK);
		Button Button_MC_HSB_TSK = (Button) findViewById(R.id.Button_MC_HSB_TSK);
		Button Button_MC_HSM_TSK = (Button) findViewById(R.id.Button_MC_HSM_TSK);
		Button Button_MC_HT_TSK = (Button) findViewById(R.id.Button_MC_HT_TSK);
		Button Button_MC_HSMD_TSK = (Button) findViewById(R.id.Button_MC_HSMD_TSK);
		Button Button_MC_HSBKR_TSK = (Button) findViewById(R.id.Button_MC_HSBKR_TSK);
		Button Button_MC_HSBKN_TSK = (Button) findViewById(R.id.Button_MC_HSBKN_TSK);
		
		TV_Judul_TSK_MC_Semua.setTypeface(TipeHuruf);
		TV_PilihModeCari_T.setTypeface(TipeHuruf);
		Button_MC_Semua_TSK.setTypeface(TipeHuruf);
		Button_MC_HSA_TSK.setTypeface(TipeHuruf);
		Button_MC_HSB_TSK.setTypeface(TipeHuruf);
		Button_MC_HSM_TSK.setTypeface(TipeHuruf);
		Button_MC_HT_TSK.setTypeface(TipeHuruf);
		Button_MC_HSMD_TSK.setTypeface(TipeHuruf);
		Button_MC_HSBKR_TSK.setTypeface(TipeHuruf);
		Button_MC_HSBKN_TSK.setTypeface(TipeHuruf);

		IV_Trapesium.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, FormLihatGambarTrapesium.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HSA_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSA.class);
				startActivity(i);
			}
		});
		Button_MC_HSB_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSB.class);
				startActivity(i);
			}
		});	
		Button_MC_HSM_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSM.class);
				startActivity(i);
			}
		});	
		Button_MC_HT_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HanyaTinggi.class);
				startActivity(i);
			}
		});	
		Button_MC_HSMD_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSMD.class);
				startActivity(i);
			}
		});	
		Button_MC_HSBKR_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSBKr.class);
				startActivity(i);
			}
		});
		Button_MC_HSBKN_TSK.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Trapesium_SamaKaki.this, Form_Trapesium_SamaKaki_MC_HSBKn.class);
				startActivity(i);
			}
		});		
    }
}