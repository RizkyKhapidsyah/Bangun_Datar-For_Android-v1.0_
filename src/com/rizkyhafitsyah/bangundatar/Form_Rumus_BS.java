package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_BS extends Activity {
	TextView TV_Judul_Rumus_BS;
	TextView TV_SL_BS;
	TextView TV_SL_TD_BS;
	TextView TV_SL_JLH_BS;
	TextView TV_SP_BS;
	TextView TV_SP_TD_BS;
	TextView TV_SP_JLH_BS;
	TextView TV_SS_BS;
	TextView TV_SS_TD_BS;
	TextView TV_SS_JLH_BS;
	TextView TV_TS_BS;
	TextView TV_TS_TD_BS;
	TextView TV_TS_JLH_BS;
	TextView TV_JS_BS;
	TextView TV_JS_TD_BS;
	TextView TV_JS_JLH_BS;
	TextView TV_R_BS;
	TextView TV_KT_BS;
	TextView TV_SL_BS1;
	TextView TV_SP_BS1;
	TextView TV_TS_BS1;
	TextView TV_JS_BS_1;
	Button LR_ButtonRingkasan;
	Button LR_ButtonHitung;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_bs);

        String CustomHuruf_FORM_LR_BS = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_BS = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_BS);

    	TV_Judul_Rumus_BS = (TextView)findViewById(R.id.TV_Judul_Rumus_BS);
    	TV_SL_BS = (TextView)findViewById(R.id.TV_SL_BS);
    	TV_SL_TD_BS = (TextView)findViewById(R.id.TV_SL_TD_BS);
    	TV_SL_JLH_BS = (TextView)findViewById(R.id.TV_SL_JLH_BS);
    	TV_SP_BS = (TextView)findViewById(R.id.TV_SP_BS);
    	TV_SP_TD_BS = (TextView)findViewById(R.id.TV_SP_TD_BS);
    	TV_SP_JLH_BS = (TextView)findViewById(R.id.TV_SP_JLH_BS);
    	TV_SS_BS = (TextView)findViewById(R.id.TV_SS_BS);
    	TV_SS_TD_BS = (TextView)findViewById(R.id.TV_SS_TD_BS);
    	TV_SS_JLH_BS = (TextView)findViewById(R.id.TV_SS_JLH_BS);
    	TV_TS_BS = (TextView)findViewById(R.id.TV_TS_BS);
    	TV_TS_TD_BS = (TextView)findViewById(R.id.TV_TS_TD_BS);
    	TV_TS_JLH_BS = (TextView)findViewById(R.id.TV_TS_JLH_BS);
    	TV_JS_BS = (TextView)findViewById(R.id.TV_JS_BS);
    	TV_JS_TD_BS = (TextView)findViewById(R.id.TV_JS_TD_BS);
    	TV_JS_JLH_BS = (TextView)findViewById(R.id.TV_JS_JLH_BS);
    	TV_R_BS = (TextView)findViewById(R.id.TV_R_BS);
    	TV_KT_BS = (TextView)findViewById(R.id.TV_KT_BS);
    	TV_SL_BS1 = (TextView)findViewById(R.id.TV_SL_BS1);
    	TV_SP_BS1 = (TextView)findViewById(R.id.TV_SP_BS1);
    	TV_TS_BS1 = (TextView)findViewById(R.id.TV_TS_BS1);
    	TV_JS_BS_1 = (TextView)findViewById(R.id.TV_JS_BS_1);
    	LR_ButtonRingkasan = (Button)findViewById(R.id.LR_ButtonRingkasan);
    	LR_ButtonHitung = (Button)findViewById(R.id.LR_ButtonHitung);
        
       	TV_Judul_Rumus_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SL_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SL_TD_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SL_JLH_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SP_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SP_TD_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SP_JLH_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SS_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SS_TD_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SS_JLH_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_TS_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_TS_TD_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_TS_JLH_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_JS_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_JS_TD_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_JS_JLH_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_R_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_KT_BS.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SL_BS1.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_SP_BS1.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_TS_BS1.setTypeface(TipeHuruf_FORM_LR_BS);
    	TV_JS_BS_1.setTypeface(TipeHuruf_FORM_LR_BS);
    	LR_ButtonRingkasan.setTypeface(TipeHuruf_FORM_LR_BS);
    	LR_ButtonHitung.setTypeface(TipeHuruf_FORM_LR_BS);
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_BS.this, Form_ModeCari_BujurSangkar.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_BS.this, FormLihatGambarBS.class);
				startActivity(PanggilForm);
			}
		});
	}
}
