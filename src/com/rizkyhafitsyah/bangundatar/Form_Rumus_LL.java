package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_LL extends Activity {
	TextView TV_Judul_Rumus_LL;
	TextView TV_SL_LL;
	TextView TV_SL_TD_LL;
	TextView TV_SL_JLH_LL;
	TextView TV_SP_LL;
	TextView TV_SP_TD_LL;
	TextView TV_SP_JLH_LL;
	TextView TV_SS_LL;
	TextView TV_SS_TD_LL;
	TextView TV_SS_JLH_LL;
	TextView TV_TS_LL;
	TextView TV_TS_TD_LL;
	TextView TV_TS_JLH_LL;
	TextView TV_JS_LL;
	TextView TV_JS_TD_LL;
	TextView TV_JS_JLH_LL;
	TextView TV_R_LL;
	TextView TV_KT_LL;
	TextView TV_SL_LL1;
	TextView TV_SP_LL1;
	TextView TV_TS_LL1;
	TextView TV_JS_LL_1;
	Button LR_ButtonRingkasan_LL;
	Button LR_ButtonHitung_LL;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_ll);

        String CustomHuruf_FORM_LR_LL = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_LL = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_LL);

    	TV_Judul_Rumus_LL = (TextView)findViewById(R.id.TV_Judul_Rumus_LL);
    	TV_SL_LL = (TextView)findViewById(R.id.TV_SL_LL);
    	TV_SL_TD_LL = (TextView)findViewById(R.id.TV_SL_TD_LL);
    	TV_SL_JLH_LL = (TextView)findViewById(R.id.TV_SL_JLH_LL);
    	TV_SP_LL = (TextView)findViewById(R.id.TV_SP_LL);
    	TV_SP_TD_LL = (TextView)findViewById(R.id.TV_SP_TD_LL);
    	TV_SP_JLH_LL = (TextView)findViewById(R.id.TV_SP_JLH_LL);
    	TV_SS_LL = (TextView)findViewById(R.id.TV_SS_LL);
    	TV_SS_TD_LL = (TextView)findViewById(R.id.TV_SS_TD_LL);
    	TV_SS_JLH_LL = (TextView)findViewById(R.id.TV_SS_JLH_LL);
    	TV_TS_LL = (TextView)findViewById(R.id.TV_TS_LL);
    	TV_TS_TD_LL = (TextView)findViewById(R.id.TV_TS_TD_LL);
    	TV_TS_JLH_LL = (TextView)findViewById(R.id.TV_TS_JLH_LL);
    	TV_JS_LL = (TextView)findViewById(R.id.TV_JS_LL);
    	TV_JS_TD_LL = (TextView)findViewById(R.id.TV_JS_TD_LL);
    	TV_JS_JLH_LL = (TextView)findViewById(R.id.TV_JS_JLH_LL);
    	TV_R_LL = (TextView)findViewById(R.id.TV_R_LL);
    	TV_KT_LL = (TextView)findViewById(R.id.TV_KT_LL);
    	TV_SL_LL1 = (TextView)findViewById(R.id.TV_SL_LL1);
    	TV_SP_LL1 = (TextView)findViewById(R.id.TV_SP_LL1);
    	TV_TS_LL1 = (TextView)findViewById(R.id.TV_TS_LL1);
    	TV_JS_LL_1 = (TextView)findViewById(R.id.TV_JS_LL_1);
    	LR_ButtonRingkasan_LL = (Button)findViewById(R.id.LR_ButtonRingkasan_LL);
    	LR_ButtonHitung_LL = (Button)findViewById(R.id.LR_ButtonHitung_LL);       
 
    	TV_Judul_Rumus_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SL_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SL_TD_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SL_JLH_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SP_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SP_TD_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SP_JLH_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SS_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SS_TD_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SS_JLH_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_TS_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_TS_TD_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_TS_JLH_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_JS_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_JS_TD_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_JS_JLH_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_R_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_KT_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SL_LL1.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_SP_LL1.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_TS_LL1.setTypeface(TipeHuruf_FORM_LR_LL);
    	TV_JS_LL_1.setTypeface(TipeHuruf_FORM_LR_LL);
    	LR_ButtonRingkasan_LL.setTypeface(TipeHuruf_FORM_LR_LL);
    	LR_ButtonHitung_LL.setTypeface(TipeHuruf_FORM_LR_LL);       
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_LL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_LL.this, Form_ModeCari_LayangLayang.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_LL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_LL.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilForm);
			}
		});
	}
}
