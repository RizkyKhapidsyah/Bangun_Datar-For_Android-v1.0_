package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_L extends Activity {
	TextView TV_Judul_Rumus_L;
	TextView TV_SL_L;
	TextView TV_SL_TD_L;
	TextView TV_SL_JLH_L;
	TextView TV_SP_L;
	TextView TV_SP_TD_L;
	TextView TV_SP_JLH_L;
	TextView TV_SS_L;
	TextView TV_SS_TD_L;
	TextView TV_SS_JLH_L;
	TextView TV_TS_L;
	TextView TV_TS_TD_L;
	TextView TV_TS_JLH_L;
	TextView TV_JS_L;
	TextView TV_JS_TD_L;
	TextView TV_JS_JLH_L;
	TextView TV_R_L;
	TextView TV_KT_L;
	TextView TV_SL_L1;
	TextView TV_SP_L1;
	TextView TV_TS_L1;
	TextView TV_JS_L_1;
	Button LR_ButtonRingkasan_L;
	Button LR_ButtonHitung_L;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_l);

        String CustomHuruf_FORM_LR_L = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_L = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_L);

    	TV_Judul_Rumus_L = (TextView)findViewById(R.id.TV_Judul_Rumus_L);
    	TV_SL_L = (TextView)findViewById(R.id.TV_SL_L);
    	TV_SL_TD_L = (TextView)findViewById(R.id.TV_SL_TD_L);
    	TV_SL_JLH_L = (TextView)findViewById(R.id.TV_SL_JLH_L);
    	TV_SP_L = (TextView)findViewById(R.id.TV_SP_L);
    	TV_SP_TD_L = (TextView)findViewById(R.id.TV_SP_TD_L);
    	TV_SP_JLH_L = (TextView)findViewById(R.id.TV_SP_JLH_L);
    	TV_SS_L = (TextView)findViewById(R.id.TV_SS_L);
    	TV_SS_TD_L = (TextView)findViewById(R.id.TV_SS_TD_L);
    	TV_SS_JLH_L = (TextView)findViewById(R.id.TV_SS_JLH_L);
    	TV_TS_L = (TextView)findViewById(R.id.TV_TS_L);
    	TV_TS_TD_L = (TextView)findViewById(R.id.TV_TS_TD_L);
    	TV_TS_JLH_L = (TextView)findViewById(R.id.TV_TS_JLH_L);
    	TV_JS_L = (TextView)findViewById(R.id.TV_JS_L);
    	TV_JS_TD_L = (TextView)findViewById(R.id.TV_JS_TD_L);
    	TV_JS_JLH_L = (TextView)findViewById(R.id.TV_JS_JLH_L);
    	TV_R_L = (TextView)findViewById(R.id.TV_R_L);
    	TV_KT_L = (TextView)findViewById(R.id.TV_KT_L);
    	TV_SL_L1 = (TextView)findViewById(R.id.TV_SL_L1);
    	TV_SP_L1 = (TextView)findViewById(R.id.TV_SP_L1);
    	TV_TS_L1 = (TextView)findViewById(R.id.TV_TS_L1);
    	TV_JS_L_1 = (TextView)findViewById(R.id.TV_JS_L_1);
    	LR_ButtonRingkasan_L = (Button)findViewById(R.id.LR_ButtonRingkasan_L);
    	LR_ButtonHitung_L = (Button)findViewById(R.id.LR_ButtonHitung_L);       
 
    	TV_Judul_Rumus_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SL_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SL_TD_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SL_JLH_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SP_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SP_TD_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SP_JLH_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SS_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SS_TD_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SS_JLH_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_TS_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_TS_TD_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_TS_JLH_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_JS_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_JS_TD_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_JS_JLH_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_R_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_KT_L.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SL_L1.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_SP_L1.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_TS_L1.setTypeface(TipeHuruf_FORM_LR_L);
    	TV_JS_L_1.setTypeface(TipeHuruf_FORM_LR_L);
    	LR_ButtonRingkasan_L.setTypeface(TipeHuruf_FORM_LR_L);
    	LR_ButtonHitung_L.setTypeface(TipeHuruf_FORM_LR_L);       
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_L.this, Form_ModeCari_Lingkaran.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_L.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilForm);
			}
		});
	}
}
