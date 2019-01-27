package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;


public class Form_ModeCari_BujurSangkar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_bujursangkar);
        
        String CustomHuruf_MC_BS = "AGENCYR.TTF";
        Typeface TipeHuruf_MC_BS = Typeface.createFromAsset(getAssets(), CustomHuruf_MC_BS);
        
        
        TextView TV_Judul_BS = (TextView) findViewById(R.id.TV_Judul_BS);
        TextView TV_PilihModeCari_BS = (TextView) findViewById(R.id.TV_PilihModeCari_BS);
        ImageView IV_BS = (ImageView) findViewById(R.id.IV_BS);
		Button Button_MC_Semua_BS = (Button) findViewById(R.id.Button_MC_Semua_BS);
		Button Button_MC_HS_BS = (Button) findViewById(R.id.Button_MC_HS_BS);
	
        TV_Judul_BS.setTypeface(TipeHuruf_MC_BS);
        TV_PilihModeCari_BS.setTypeface(TipeHuruf_MC_BS);
		Button_MC_Semua_BS.setTypeface(TipeHuruf_MC_BS);
		Button_MC_HS_BS.setTypeface(TipeHuruf_MC_BS);
		
		IV_BS.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BujurSangkar.this, FormLihatGambarBS.class);
				startActivity(i);
			}
		});
		Button_MC_Semua_BS.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BujurSangkar.this, Form_BujurSangkar_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HS_BS.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BujurSangkar.this, Form_BujurSangkar_MC_HS.class);
				startActivity(i);
			}
		});		
    }
}