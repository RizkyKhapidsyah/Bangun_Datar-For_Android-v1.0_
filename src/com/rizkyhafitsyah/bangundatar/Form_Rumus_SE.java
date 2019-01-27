package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_SE extends Activity {
	TextView TV_Judul_Rumus_SE;
	TextView TV_SL_SE;
	TextView TV_SL_TD_SE;
	TextView TV_SL_JLH_SE;
	TextView TV_SP_SE;
	TextView TV_SP_TD_SE;
	TextView TV_SP_JLH_SE;
	TextView TV_SS_SE;
	TextView TV_SS_TD_SE;
	TextView TV_SS_JLH_SE;
	TextView TV_TS_SE;
	TextView TV_TS_TD_SE;
	TextView TV_TS_JLH_SE;
	TextView TV_JS_SE;
	TextView TV_JS_TD_SE;
	TextView TV_JS_JLH_SE;
	TextView TV_R_SE;
	TextView TV_KT_SE;
	TextView TV_SL_SE1;
	TextView TV_SP_SE1;
	TextView TV_TS_SE1;
	TextView TV_JS_SE_1;
	Button LR_ButtonRingkasan_SE;
	Button LR_ButtonHitung_SE;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_se);

        String CustomHuruf_FORM_LR_SE = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_SE = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_SE);

    	TV_Judul_Rumus_SE = (TextView)findViewById(R.id.TV_Judul_Rumus_SE);
    	TV_SL_SE = (TextView)findViewById(R.id.TV_SL_SE);
    	TV_SL_TD_SE = (TextView)findViewById(R.id.TV_SL_TD_SE);
    	TV_SL_JLH_SE = (TextView)findViewById(R.id.TV_SL_JLH_SE);
    	TV_SP_SE = (TextView)findViewById(R.id.TV_SP_SE);
    	TV_SP_TD_SE = (TextView)findViewById(R.id.TV_SP_TD_SE);
    	TV_SP_JLH_SE = (TextView)findViewById(R.id.TV_SP_JLH_SE);
    	TV_SS_SE = (TextView)findViewById(R.id.TV_SS_SE);
    	TV_SS_TD_SE = (TextView)findViewById(R.id.TV_SS_TD_SE);
    	TV_SS_JLH_SE = (TextView)findViewById(R.id.TV_SS_JLH_SE);
    	TV_TS_SE = (TextView)findViewById(R.id.TV_TS_SE);
    	TV_TS_TD_SE = (TextView)findViewById(R.id.TV_TS_TD_SE);
    	TV_TS_JLH_SE = (TextView)findViewById(R.id.TV_TS_JLH_SE);
    	TV_JS_SE = (TextView)findViewById(R.id.TV_JS_SE);
    	TV_JS_TD_SE = (TextView)findViewById(R.id.TV_JS_TD_SE);
    	TV_JS_JLH_SE = (TextView)findViewById(R.id.TV_JS_JLH_SE);
    	TV_R_SE = (TextView)findViewById(R.id.TV_R_SE);
    	TV_KT_SE = (TextView)findViewById(R.id.TV_KT_SE);
    	TV_SL_SE1 = (TextView)findViewById(R.id.TV_SL_SE1);
    	TV_SP_SE1 = (TextView)findViewById(R.id.TV_SP_SE1);
    	TV_TS_SE1 = (TextView)findViewById(R.id.TV_TS_SE1);
    	TV_JS_SE_1 = (TextView)findViewById(R.id.TV_JS_SE_1);
    	LR_ButtonRingkasan_SE = (Button)findViewById(R.id.LR_ButtonRingkasan_SE);
    	LR_ButtonHitung_SE = (Button)findViewById(R.id.LR_ButtonHitung_SE);       
 
    	TV_Judul_Rumus_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SL_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SL_TD_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SL_JLH_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SP_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SP_TD_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SP_JLH_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SS_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SS_TD_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SS_JLH_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_TS_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_TS_TD_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_TS_JLH_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_JS_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_JS_TD_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_JS_JLH_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_R_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_KT_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SL_SE1.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_SP_SE1.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_TS_SE1.setTypeface(TipeHuruf_FORM_LR_SE);
    	TV_JS_SE_1.setTypeface(TipeHuruf_FORM_LR_SE);
    	LR_ButtonRingkasan_SE.setTypeface(TipeHuruf_FORM_LR_SE);
    	LR_ButtonHitung_SE.setTypeface(TipeHuruf_FORM_LR_SE);       
     	
    	
    	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_SE.this, Form_SegiEnam_Beraturan.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_SE.this, FormLihatGambarPP.class);
				startActivity(PanggilForm);
			}
		});
	}
}
