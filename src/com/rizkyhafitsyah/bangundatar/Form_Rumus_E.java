package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_E extends Activity {
	TextView TV_Judul_Rumus_E;
	TextView TV_SL_E;
	TextView TV_SL_TD_E;
	TextView TV_SL_JLH_E;
	TextView TV_SP_E;
	TextView TV_SP_TD_E;
	TextView TV_SP_JLH_E;
	TextView TV_SS_E;
	TextView TV_SS_TD_E;
	TextView TV_SS_JLH_E;
	TextView TV_TS_E;
	TextView TV_TS_TD_E;
	TextView TV_TS_JLH_E;
	TextView TV_JS_E;
	TextView TV_JS_TD_E;
	TextView TV_JS_JLH_E;
	TextView TV_R_E;
	TextView TV_KT_E;
	TextView TV_SL_E1;
	TextView TV_SP_E1;
	TextView TV_TS_E1;
	TextView TV_JS_E_1;
	Button LR_ButtonRingkasan_E;
	Button LR_ButtonHitung_E;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_e);

        String CustomHuruf_FORM_LR_E = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_E = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_E);

    	TV_Judul_Rumus_E = (TextView)findViewById(R.id.TV_Judul_Rumus_E);
    	TV_SL_E = (TextView)findViewById(R.id.TV_SL_E);
    	TV_SL_TD_E = (TextView)findViewById(R.id.TV_SL_TD_E);
    	TV_SL_JLH_E = (TextView)findViewById(R.id.TV_SL_JLH_E);
    	TV_SP_E = (TextView)findViewById(R.id.TV_SP_E);
    	TV_SP_TD_E = (TextView)findViewById(R.id.TV_SP_TD_E);
    	TV_SP_JLH_E = (TextView)findViewById(R.id.TV_SP_JLH_E);
    	TV_SS_E = (TextView)findViewById(R.id.TV_SS_E);
    	TV_SS_TD_E = (TextView)findViewById(R.id.TV_SS_TD_E);
    	TV_SS_JLH_E = (TextView)findViewById(R.id.TV_SS_JLH_E);
    	TV_TS_E = (TextView)findViewById(R.id.TV_TS_E);
    	TV_TS_TD_E = (TextView)findViewById(R.id.TV_TS_TD_E);
    	TV_TS_JLH_E = (TextView)findViewById(R.id.TV_TS_JLH_E);
    	TV_JS_E = (TextView)findViewById(R.id.TV_JS_E);
    	TV_JS_TD_E = (TextView)findViewById(R.id.TV_JS_TD_E);
    	TV_JS_JLH_E = (TextView)findViewById(R.id.TV_JS_JLH_E);
    	TV_R_E = (TextView)findViewById(R.id.TV_R_E);
    	TV_KT_E = (TextView)findViewById(R.id.TV_KT_E);
    	TV_SL_E1 = (TextView)findViewById(R.id.TV_SL_E1);
    	TV_SP_E1 = (TextView)findViewById(R.id.TV_SP_E1);
    	TV_TS_E1 = (TextView)findViewById(R.id.TV_TS_E1);
    	TV_JS_E_1 = (TextView)findViewById(R.id.TV_JS_E_1);
    	LR_ButtonRingkasan_E = (Button)findViewById(R.id.LR_ButtonRingkasan_E);
    	LR_ButtonHitung_E = (Button)findViewById(R.id.LR_ButtonHitung_E);       
 
    	TV_Judul_Rumus_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SL_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SL_TD_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SL_JLH_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SP_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SP_TD_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SP_JLH_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SS_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SS_TD_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SS_JLH_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_TS_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_TS_TD_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_TS_JLH_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_JS_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_JS_TD_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_JS_JLH_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_R_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_KT_E.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SL_E1.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_SP_E1.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_TS_E1.setTypeface(TipeHuruf_FORM_LR_E);
    	TV_JS_E_1.setTypeface(TipeHuruf_FORM_LR_E);
    	LR_ButtonRingkasan_E.setTypeface(TipeHuruf_FORM_LR_E);
    	LR_ButtonHitung_E.setTypeface(TipeHuruf_FORM_LR_E);       
     	
    	
    	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_E.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_E.this, Form_Elips.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_E.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_E.this, FormLihatGambarElips.class);
				startActivity(PanggilForm);
			}
		});
	}
}
