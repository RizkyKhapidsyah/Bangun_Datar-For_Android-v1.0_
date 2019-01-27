package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_PP extends Activity {
	TextView TV_Judul_Rumus_PP;
	TextView TV_SL_PP;
	TextView TV_SL_TD_PP;
	TextView TV_SL_JLH_PP;
	TextView TV_SP_PP;
	TextView TV_SP_TD_PP;
	TextView TV_SP_JLH_PP;
	TextView TV_SS_PP;
	TextView TV_SS_TD_PP;
	TextView TV_SS_JLH_PP;
	TextView TV_TS_PP;
	TextView TV_TS_TD_PP;
	TextView TV_TS_JLH_PP;
	TextView TV_JS_PP;
	TextView TV_JS_TD_PP;
	TextView TV_JS_JLH_PP;
	TextView TV_R_PP;
	TextView TV_KT_PP;
	TextView TV_SL_PP1;
	TextView TV_SP_PP1;
	TextView TV_TS_PP1;
	TextView TV_JS_PP_1;
	Button LR_ButtonRingkasan_PP;
	Button LR_ButtonHitung_PP;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_pp);

        String CustomHuruf_FORM_LR_PP = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_PP = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_PP);

    	TV_Judul_Rumus_PP = (TextView)findViewById(R.id.TV_Judul_Rumus_PP);
    	TV_SL_PP = (TextView)findViewById(R.id.TV_SL_PP);
    	TV_SL_TD_PP = (TextView)findViewById(R.id.TV_SL_TD_PP);
    	TV_SL_JLH_PP = (TextView)findViewById(R.id.TV_SL_JLH_PP);
    	TV_SP_PP = (TextView)findViewById(R.id.TV_SP_PP);
    	TV_SP_TD_PP = (TextView)findViewById(R.id.TV_SP_TD_PP);
    	TV_SP_JLH_PP = (TextView)findViewById(R.id.TV_SP_JLH_PP);
    	TV_SS_PP = (TextView)findViewById(R.id.TV_SS_PP);
    	TV_SS_TD_PP = (TextView)findViewById(R.id.TV_SS_TD_PP);
    	TV_SS_JLH_PP = (TextView)findViewById(R.id.TV_SS_JLH_PP);
    	TV_TS_PP = (TextView)findViewById(R.id.TV_TS_PP);
    	TV_TS_TD_PP = (TextView)findViewById(R.id.TV_TS_TD_PP);
    	TV_TS_JLH_PP = (TextView)findViewById(R.id.TV_TS_JLH_PP);
    	TV_JS_PP = (TextView)findViewById(R.id.TV_JS_PP);
    	TV_JS_TD_PP = (TextView)findViewById(R.id.TV_JS_TD_PP);
    	TV_JS_JLH_PP = (TextView)findViewById(R.id.TV_JS_JLH_PP);
    	TV_R_PP = (TextView)findViewById(R.id.TV_R_PP);
    	TV_KT_PP = (TextView)findViewById(R.id.TV_KT_PP);
    	TV_SL_PP1 = (TextView)findViewById(R.id.TV_SL_PP1);
    	TV_SP_PP1 = (TextView)findViewById(R.id.TV_SP_PP1);
    	TV_TS_PP1 = (TextView)findViewById(R.id.TV_TS_PP1);
    	TV_JS_PP_1 = (TextView)findViewById(R.id.TV_JS_PP_1);
    	LR_ButtonRingkasan_PP = (Button)findViewById(R.id.LR_ButtonRingkasan_PP);
    	LR_ButtonHitung_PP = (Button)findViewById(R.id.LR_ButtonHitung_PP);       
 
    	TV_Judul_Rumus_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SL_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SL_TD_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SL_JLH_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SP_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SP_TD_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SP_JLH_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SS_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SS_TD_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SS_JLH_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_TS_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_TS_TD_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_TS_JLH_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_JS_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_JS_TD_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_JS_JLH_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_R_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_KT_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SL_PP1.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_SP_PP1.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_TS_PP1.setTypeface(TipeHuruf_FORM_LR_PP);
    	TV_JS_PP_1.setTypeface(TipeHuruf_FORM_LR_PP);
    	LR_ButtonRingkasan_PP.setTypeface(TipeHuruf_FORM_LR_PP);
    	LR_ButtonHitung_PP.setTypeface(TipeHuruf_FORM_LR_PP);       
     	
    	
    	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_PP.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_PP.this, Form_ModeCari_PersegiPanjang.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_PP.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_PP.this, FormLihatGambarPP.class);
				startActivity(PanggilForm);
			}
		});
	}
}
