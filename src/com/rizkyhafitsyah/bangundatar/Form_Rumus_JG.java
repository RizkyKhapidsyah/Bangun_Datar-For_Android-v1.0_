package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_JG extends Activity {
	TextView TV_Judul_Rumus_JG;
	TextView TV_SL_JG;
	TextView TV_SL_TD_JG;
	TextView TV_SL_JLH_JG;
	TextView TV_SP_JG;
	TextView TV_SP_TD_JG;
	TextView TV_SP_JLH_JG;
	TextView TV_SS_JG;
	TextView TV_SS_TD_JG;
	TextView TV_SS_JLH_JG;
	TextView TV_TS_JG;
	TextView TV_TS_TD_JG;
	TextView TV_TS_JLH_JG;
	TextView TV_JS_JG;
	TextView TV_JS_TD_JG;
	TextView TV_JS_JLH_JG;
	TextView TV_R_JG;
	TextView TV_KT_JG;
	TextView TV_SL_JG1;
	TextView TV_SP_JG1;
	TextView TV_TS_JG1;
	TextView TV_JS_JG_1;
	TextView TV_Ket_TA1;
	Button LR_ButtonRingkasan_JG;
	Button LR_ButtonHitung_JG;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_jg);

        String CustomHuruf_FORM_LR_JG = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_JG = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_JG);

    	TV_Judul_Rumus_JG = (TextView)findViewById(R.id.TV_Judul_Rumus_JG);
    	TV_SL_JG = (TextView)findViewById(R.id.TV_SL_JG);
    	TV_SL_TD_JG = (TextView)findViewById(R.id.TV_SL_TD_JG);
    	TV_SL_JLH_JG = (TextView)findViewById(R.id.TV_SL_JLH_JG);
    	TV_SP_JG = (TextView)findViewById(R.id.TV_SP_JG);
    	TV_SP_TD_JG = (TextView)findViewById(R.id.TV_SP_TD_JG);
    	TV_SP_JLH_JG = (TextView)findViewById(R.id.TV_SP_JLH_JG);
    	TV_SS_JG = (TextView)findViewById(R.id.TV_SS_JG);
    	TV_SS_TD_JG = (TextView)findViewById(R.id.TV_SS_TD_JG);
    	TV_SS_JLH_JG = (TextView)findViewById(R.id.TV_SS_JLH_JG);
    	TV_TS_JG = (TextView)findViewById(R.id.TV_TS_JG);
    	TV_TS_TD_JG = (TextView)findViewById(R.id.TV_TS_TD_JG);
    	TV_TS_JLH_JG = (TextView)findViewById(R.id.TV_TS_JLH_JG);
    	TV_JS_JG = (TextView)findViewById(R.id.TV_JS_JG);
    	TV_JS_TD_JG = (TextView)findViewById(R.id.TV_JS_TD_JG);
    	TV_JS_JLH_JG = (TextView)findViewById(R.id.TV_JS_JLH_JG);
    	TV_R_JG = (TextView)findViewById(R.id.TV_R_JG);
    	TV_KT_JG = (TextView)findViewById(R.id.TV_KT_JG);
    	TV_SL_JG1 = (TextView)findViewById(R.id.TV_SL_JG1);
    	TV_SP_JG1 = (TextView)findViewById(R.id.TV_SP_JG1);
    	TV_TS_JG1 = (TextView)findViewById(R.id.TV_TS_JG1);
    	TV_JS_JG_1 = (TextView)findViewById(R.id.TV_JS_JG_1);
    	TV_Ket_TA1 = (TextView)findViewById(R.id.TV_Ket_TA1);
    	LR_ButtonRingkasan_JG = (Button)findViewById(R.id.LR_ButtonRingkasan_JG);
    	LR_ButtonHitung_JG = (Button)findViewById(R.id.LR_ButtonHitung_JG);       
 
    	TV_Judul_Rumus_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SL_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SL_TD_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SL_JLH_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SP_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SP_TD_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SP_JLH_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SS_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SS_TD_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SS_JLH_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_TS_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_TS_TD_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_TS_JLH_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_JS_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_JS_TD_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_JS_JLH_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_R_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_KT_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SL_JG1.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_SP_JG1.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_TS_JG1.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_JS_JG_1.setTypeface(TipeHuruf_FORM_LR_JG);
    	TV_Ket_TA1.setTypeface(TipeHuruf_FORM_LR_JG);
    	LR_ButtonRingkasan_JG.setTypeface(TipeHuruf_FORM_LR_JG);
    	LR_ButtonHitung_JG.setTypeface(TipeHuruf_FORM_LR_JG);       
     	
    	
    	
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_JG.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_JG.this, Form_ModeCari_JajarGenjang.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_JG.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_JG.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilForm);
			}
		});
	}
}
