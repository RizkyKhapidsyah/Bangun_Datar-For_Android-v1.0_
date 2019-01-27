package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;

 
public class Form_ModeCari_SegiLima_Beraturan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_segilima_beraturan);
        
        String CustomHuruf_SL = "AGENCYR.TTF";
        Typeface TipeHuruf_SL = Typeface.createFromAsset(getAssets(), CustomHuruf_SL);
      
        TextView TV_Judul_SL_MC = (TextView) findViewById(R.id.TV_Judul_SL_MC);
        TextView TV_PilihModeCari_SL = (TextView) findViewById(R.id.TV_PilihModeCari_SL);
        ImageView IV_SL = (ImageView) findViewById(R.id.IV_SL);
		Button Button_MC_Semua_SL = (Button) findViewById(R.id.Button_MC_Semua_SL);
		Button Button_MC_HS_SL = (Button) findViewById(R.id.Button_MC_HS_SL);
		TextView TV_Keterangan_SL_0 = (TextView) findViewById(R.id.TV_Keterangan_SL_0);
		TextView TV_Keterangan_SL_1 = (TextView) findViewById(R.id.TV_Keterangan_SL_1);
		TextView TV_Keterangan_SL_2 = (TextView) findViewById(R.id.TV_Keterangan_SL_2);
		TextView TV_Keterangan_SL_3 = (TextView) findViewById(R.id.TV_Keterangan_SL_3);
		
		TV_Judul_SL_MC.setTypeface(TipeHuruf_SL);
		TV_PilihModeCari_SL.setTypeface(TipeHuruf_SL);
		Button_MC_Semua_SL.setTypeface(TipeHuruf_SL);
		Button_MC_HS_SL.setTypeface(TipeHuruf_SL);
		TV_Keterangan_SL_0.setTypeface(TipeHuruf_SL);
		TV_Keterangan_SL_1.setTypeface(TipeHuruf_SL);
		TV_Keterangan_SL_2.setTypeface(TipeHuruf_SL);
		TV_Keterangan_SL_3.setTypeface(TipeHuruf_SL);
			
		IV_SL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_SegiLima_Beraturan.this, FormLihatGambarSegiLima.class);
				startActivity(i);
			}
		});
		Button_MC_Semua_SL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_SegiLima_Beraturan.this, Form_Segilima_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HS_SL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_SegiLima_Beraturan.this, Form_SegiLima_MC_HS.class);
				startActivity(i);
			}
		});			
	
    }
}