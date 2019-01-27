package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_SL extends Activity {
	TextView TV_Judul_Rumus_SL;
	TextView TV_SL_SL;
	TextView TV_SL_TD_SL;
	TextView TV_SL_JLH_SL;
	TextView TV_SP_SL;
	TextView TV_SP_TD_SL;
	TextView TV_SP_JLH_SL;
	TextView TV_SS_SL;
	TextView TV_SS_TD_SL;
	TextView TV_SS_JLH_SL;
	TextView TV_TS_SL;
	TextView TV_TS_TD_SL;
	TextView TV_TS_JLH_SL;
	TextView TV_JS_SL;
	TextView TV_JS_TD_SL;
	TextView TV_JS_JLH_SL;
	TextView TV_R_SL;
	TextView TV_KT_SL;
	TextView TV_SL_SL1;
	TextView TV_SP_SL1;
	TextView TV_TS_SL1;
	TextView TV_JS_SL_1;
	Button LR_ButtonRingkasan_SL;
	Button LR_ButtonHitung_SL;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_sl);

        String CustomHuruf_FORM_LR_SL = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_SL = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_SL);

    	TV_Judul_Rumus_SL = (TextView)findViewById(R.id.TV_Judul_Rumus_SL);
    	TV_SL_SL = (TextView)findViewById(R.id.TV_SL_SL);
    	TV_SL_TD_SL = (TextView)findViewById(R.id.TV_SL_TD_SL);
    	TV_SL_JLH_SL = (TextView)findViewById(R.id.TV_SL_JLH_SL);
    	TV_SP_SL = (TextView)findViewById(R.id.TV_SP_SL);
    	TV_SP_TD_SL = (TextView)findViewById(R.id.TV_SP_TD_SL);
    	TV_SP_JLH_SL = (TextView)findViewById(R.id.TV_SP_JLH_SL);
    	TV_SS_SL = (TextView)findViewById(R.id.TV_SS_SL);
    	TV_SS_TD_SL = (TextView)findViewById(R.id.TV_SS_TD_SL);
    	TV_SS_JLH_SL = (TextView)findViewById(R.id.TV_SS_JLH_SL);
    	TV_TS_SL = (TextView)findViewById(R.id.TV_TS_SL);
    	TV_TS_TD_SL = (TextView)findViewById(R.id.TV_TS_TD_SL);
    	TV_TS_JLH_SL = (TextView)findViewById(R.id.TV_TS_JLH_SL);
    	TV_JS_SL = (TextView)findViewById(R.id.TV_JS_SL);
    	TV_JS_TD_SL = (TextView)findViewById(R.id.TV_JS_TD_SL);
    	TV_JS_JLH_SL = (TextView)findViewById(R.id.TV_JS_JLH_SL);
    	TV_R_SL = (TextView)findViewById(R.id.TV_R_SL);
    	TV_KT_SL = (TextView)findViewById(R.id.TV_KT_SL);
    	TV_SL_SL1 = (TextView)findViewById(R.id.TV_SL_SL1);
    	TV_SP_SL1 = (TextView)findViewById(R.id.TV_SP_SL1);
    	TV_TS_SL1 = (TextView)findViewById(R.id.TV_TS_SL1);
    	TV_JS_SL_1 = (TextView)findViewById(R.id.TV_JS_SL_1);
    	LR_ButtonRingkasan_SL = (Button)findViewById(R.id.LR_ButtonRingkasan_SL);
    	LR_ButtonHitung_SL = (Button)findViewById(R.id.LR_ButtonHitung_SL);       
 
    	TV_Judul_Rumus_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SL_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SL_TD_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SL_JLH_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SP_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SP_TD_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SP_JLH_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SS_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SS_TD_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SS_JLH_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_TS_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_TS_TD_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_TS_JLH_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_JS_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_JS_TD_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_JS_JLH_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_R_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_KT_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SL_SL1.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_SP_SL1.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_TS_SL1.setTypeface(TipeHuruf_FORM_LR_SL);
    	TV_JS_SL_1.setTypeface(TipeHuruf_FORM_LR_SL);
    	LR_ButtonRingkasan_SL.setTypeface(TipeHuruf_FORM_LR_SL);
    	LR_ButtonHitung_SL.setTypeface(TipeHuruf_FORM_LR_SL);       
     	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_SL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_SL.this, Form_ModeCari_SegiLima_Beraturan.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_SL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_SL.this, FormLihatGambarSegiLima.class);
				startActivity(PanggilForm);
			}
		});
	}
}
