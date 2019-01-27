package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_BK extends Activity {
	TextView TV_Judul_Rumus_BK;
	TextView TV_SL_BK;
	TextView TV_SL_TD_BK;
	TextView TV_SL_JLH_BK;
	TextView TV_SP_BK;
	TextView TV_SP_TD_BK;
	TextView TV_SP_JLH_BK;
	TextView TV_SS_BK;
	TextView TV_SS_TD_BK;
	TextView TV_SS_JLH_BK;
	TextView TV_TS_BK;
	TextView TV_TS_TD_BK;
	TextView TV_TS_JLH_BK;
	TextView TV_JS_BK;
	TextView TV_JS_TD_BK;
	TextView TV_JS_JLH_BK;
	TextView TV_R_BK;
	TextView TV_KT_BK;
	TextView TV_SL_BK1;
	TextView TV_SP_BK1;
	TextView TV_TS_BK1;
	TextView TV_JS_BK_1;
	Button LR_ButtonRingkasan_BK;
	Button LR_ButtonHitung_BK;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_bk);

        String CustomHuruf_FORM_LR_BK = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_BK = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_BK);

    	TV_Judul_Rumus_BK = (TextView)findViewById(R.id.TV_Judul_Rumus_BK);
    	TV_SL_BK = (TextView)findViewById(R.id.TV_SL_BK);
    	TV_SL_TD_BK = (TextView)findViewById(R.id.TV_SL_TD_BK);
    	TV_SL_JLH_BK = (TextView)findViewById(R.id.TV_SL_JLH_BK);
    	TV_SP_BK = (TextView)findViewById(R.id.TV_SP_BK);
    	TV_SP_TD_BK = (TextView)findViewById(R.id.TV_SP_TD_BK);
    	TV_SP_JLH_BK = (TextView)findViewById(R.id.TV_SP_JLH_BK);
    	TV_SS_BK = (TextView)findViewById(R.id.TV_SS_BK);
    	TV_SS_TD_BK = (TextView)findViewById(R.id.TV_SS_TD_BK);
    	TV_SS_JLH_BK = (TextView)findViewById(R.id.TV_SS_JLH_BK);
    	TV_TS_BK = (TextView)findViewById(R.id.TV_TS_BK);
    	TV_TS_TD_BK = (TextView)findViewById(R.id.TV_TS_TD_BK);
    	TV_TS_JLH_BK = (TextView)findViewById(R.id.TV_TS_JLH_BK);
    	TV_JS_BK = (TextView)findViewById(R.id.TV_JS_BK);
    	TV_JS_TD_BK = (TextView)findViewById(R.id.TV_JS_TD_BK);
    	TV_JS_JLH_BK = (TextView)findViewById(R.id.TV_JS_JLH_BK);
    	TV_R_BK = (TextView)findViewById(R.id.TV_R_BK);
    	TV_KT_BK = (TextView)findViewById(R.id.TV_KT_BK);
    	TV_SL_BK1 = (TextView)findViewById(R.id.TV_SL_BK1);
    	TV_SP_BK1 = (TextView)findViewById(R.id.TV_SP_BK1);
    	TV_TS_BK1 = (TextView)findViewById(R.id.TV_TS_BK1);
    	TV_JS_BK_1 = (TextView)findViewById(R.id.TV_JS_BK_1);
    	LR_ButtonRingkasan_BK = (Button)findViewById(R.id.LR_ButtonRingkasan_BK);
    	LR_ButtonHitung_BK = (Button)findViewById(R.id.LR_ButtonHitung_BK);       
 
    	TV_Judul_Rumus_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SL_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SL_TD_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SL_JLH_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SP_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SP_TD_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SP_JLH_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SS_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SS_TD_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SS_JLH_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_TS_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_TS_TD_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_TS_JLH_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_JS_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_JS_TD_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_JS_JLH_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_R_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_KT_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SL_BK1.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_SP_BK1.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_TS_BK1.setTypeface(TipeHuruf_FORM_LR_BK);
    	TV_JS_BK_1.setTypeface(TipeHuruf_FORM_LR_BK);
    	LR_ButtonRingkasan_BK.setTypeface(TipeHuruf_FORM_LR_BK);
    	LR_ButtonHitung_BK.setTypeface(TipeHuruf_FORM_LR_BK);       
     	
    	
    	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_BK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_BK.this, Form_ModeCari_BelahKetupat.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_BK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_BK.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilForm);
			}
		});
	}
}
