package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_T extends Activity {
	TextView TV_Judul_Rumus_T;
	TextView TV_LR_Judul_T_SAMAKAKI;
	TextView TV_SL_T_SAMAKAKI;
	TextView TV_SP_T_SAMAKAKI;
	TextView TV_SS_T_SAMAKAKI;
	TextView TV_TS_T_SAMAKAKI;
	TextView TV_JS_T_SAMAKAKI;
	TextView TV_SL_TD_T_SAMAKAKI;
	TextView TV_SP_TD_T_SAMAKAKI;
	TextView TV_SS_TD_T_SAMAKAKI;
	TextView TV_TS_TD_T_SAMAKAKI;
	TextView TV_JS_TD_T_SAMAKAKI;
	TextView TV_SL_JLH_T_SAMAKAKI;
	TextView TV_SP_JLH_T_SAMAKAKI;
	TextView TV_SS_JLH_T_SAMAKAKI;
	TextView TV_TS_JLH_T_SAMAKAKI;
	TextView TV_JS_JLH_T_SAMAKAKI;
	TextView TV_R_T_SAMAKAKI;
	TextView TV_KT_T_SAMAKAKI;
	TextView TV_SL_SegitigaSikuSiku_1;
	TextView TV_SP_SegitigaSikuSiku_1;
	TextView TV_Ket_SP_SegitigaSikuSiku_1;
	TextView TV_TS_SegitigaSikuSiku_1;
	TextView TV_JS_TS_SegitigaSikuSiku__1;
	Button LR_ButtonHitung_T_SAMAKAKI;
	Button LR_ButtonRingkasan_T_SAMAKAKI;
	TextView TV_LR_Judul_T_Sembarang;
	TextView TV_SL_T_Sembarang;
	TextView TV_SP_T_Sembarang;
	TextView TV_SS_T_Sembarang;
	TextView TV_TS_T_Sembarang;
	TextView TV_JS_T_Sembarang;
	TextView TV_SL_TD_T_Sembarang;
	TextView TV_SP_TD_T_Sembarang;
	TextView TV_SS_TD_T_Sembarang;
	TextView TV_TS_TD_T_Sembarang;
	TextView TV_JS_TD_T_Sembarang;
	TextView TV_SL_JLH_T_Sembarang;
	TextView TV_SP_JLH_T_Sembarang;
	TextView TV_SS_JLH_T_Sembarang;
	TextView TV_TD_JLH_T_Sembarang;
	TextView TV_JS_JLH_T_Sembarang;
	TextView TV_R_T_Sembarang;
	TextView TV_KT_T_Sembarang;
	TextView TV_SL_TSembarang_1;
	TextView TV_Ket_SP_TSembarang_1;
	TextView TV_SP_TSembarang_1;
	TextView TV_Ket_SP_TSembarang_2;
	TextView TV_TS_TSembarang_1;
	TextView TV_JS_TS_TSembarang__1;
	Button LR_ButtonHitung_T_Sembarang;
	Button LR_ButtonRingkasan_T_Sembarang;
	TextView TV_LR_Judul_T_SIKUSIKU;
	TextView TV_SL_T_SIKUSIKU;
	TextView TV_SP_T_SIKUSIKU;
	TextView TV_SS_T_SIKUSIKU;
	TextView TV_TS_T_SIKUSIKU;
	TextView TV_JS_T_SIKUSIKU;
	TextView TV_SL_TD_T_SIKUSIKU;
	TextView TV_SP_TD_T_SIKUSIKU;
	TextView TV_SS_TD_T_SIKUSIKU;
	TextView TV_TS_TD_T_SIKUSIKU;
	TextView TV_JS_TD_T_SIKUSIKU;
	TextView TV_SL_JLH_T_SIKUSIKU;
	TextView TV_SP_JLH_T_SIKUSIKU;
	TextView TV_Ss_JLH_T_SIKUSIKU;
	TextView TV_TS_JLH_T_SIKUSIKU;
	TextView TV_JS_JLH_T_SIKUSIKU;
	TextView TV_R_T_SIKUSIKU;
	TextView TV_KT_T_SIKUSIKU;
	TextView TV_SL_TSikuSiku_1;
	TextView TV_SP_TSikuSiku_1;
	TextView TV_TS_TSikuSiku_1;
	TextView TV_JS_TSikuSiku_1;
	Button LR_ButtonHitung_T_SIKUSIKU;
	Button LR_ButtonRingkasan_T_SIKUSIKU;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_t);

        String CustomHuruf_FORM_LR_S = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_S = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_S);

		TV_Judul_Rumus_T = (TextView)findViewById(R.id.TV_Judul_Rumus_T);
    	TV_LR_Judul_T_SAMAKAKI = (TextView)findViewById(R.id.TV_LR_Judul_T_SAMAKAKI);
    	TV_SL_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_T_SAMAKAKI);
    	TV_SP_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_T_SAMAKAKI);
    	TV_SS_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_T_SAMAKAKI);
    	TV_TS_T_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_T_SAMAKAKI);
    	TV_JS_T_SAMAKAKI = (TextView)findViewById(R.id.TV_JS_T_SAMAKAKI);
    	TV_SL_TD_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_TD_T_SAMAKAKI);
    	TV_SP_TD_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_TD_T_SAMAKAKI);
    	TV_SS_TD_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_TD_T_SAMAKAKI);
    	TV_TS_TD_T_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_TD_T_SAMAKAKI);
    	TV_JS_TD_T_SAMAKAKI = (TextView)findViewById(R.id.TV_JS_TD_T_SAMAKAKI);
    	TV_SL_JLH_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_JLH_T_SAMAKAKI);
    	TV_SP_JLH_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_JLH_T_SAMAKAKI);
    	TV_SS_JLH_T_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_JLH_T_SAMAKAKI);
    	TV_TS_JLH_T_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_JLH_T_SAMAKAKI);
    	TV_JS_JLH_T_SAMAKAKI = (TextView)findViewById(R.id.TV_JS_JLH_T_SAMAKAKI);
    	TV_R_T_SAMAKAKI = (TextView)findViewById(R.id.TV_R_T_SAMAKAKI);
    	TV_KT_T_SAMAKAKI = (TextView)findViewById(R.id.TV_KT_T_SAMAKAKI);
    	TV_SL_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_SL_SegitigaSikuSiku_1);
    	TV_SP_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_SP_SegitigaSikuSiku_1);
    	TV_Ket_SP_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_Ket_SP_SegitigaSikuSiku_1);
    	TV_TS_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_TS_SegitigaSikuSiku_1);
    	TV_JS_TS_SegitigaSikuSiku__1 = (TextView)findViewById(R.id.TV_JS_TS_SegitigaSikuSiku__1);
    	LR_ButtonHitung_T_SAMAKAKI = (Button)findViewById(R.id.LR_ButtonHitung_T_SAMAKAKI);
    	LR_ButtonRingkasan_T_SAMAKAKI = (Button)findViewById(R.id.LR_ButtonRingkasan_T_SAMAKAKI);
    	TV_LR_Judul_T_Sembarang = (TextView)findViewById(R.id.TV_LR_Judul_T_Sembarang);
    	TV_SL_T_Sembarang = (TextView)findViewById(R.id.TV_SL_T_Sembarang);
    	TV_SP_T_Sembarang = (TextView)findViewById(R.id.TV_SP_T_Sembarang);
    	TV_SS_T_Sembarang = (TextView)findViewById(R.id.TV_SS_T_Sembarang);
    	TV_TS_T_Sembarang = (TextView)findViewById(R.id.TV_TS_T_Sembarang);
    	TV_JS_T_Sembarang = (TextView)findViewById(R.id.TV_JS_T_Sembarang);
    	TV_SL_TD_T_Sembarang = (TextView)findViewById(R.id.TV_SL_TD_T_Sembarang);
    	TV_SP_TD_T_Sembarang = (TextView)findViewById(R.id.TV_SP_TD_T_Sembarang);
    	TV_SS_TD_T_Sembarang = (TextView)findViewById(R.id.TV_SS_TD_T_Sembarang);
    	TV_TS_TD_T_Sembarang = (TextView)findViewById(R.id.TV_TS_TD_T_Sembarang);
    	TV_JS_TD_T_Sembarang = (TextView)findViewById(R.id.TV_JS_TD_T_Sembarang);
    	TV_SL_JLH_T_Sembarang = (TextView)findViewById(R.id.TV_SL_JLH_T_Sembarang);
    	TV_SP_JLH_T_Sembarang = (TextView)findViewById(R.id.TV_SP_JLH_T_Sembarang);
    	TV_SS_JLH_T_Sembarang = (TextView)findViewById(R.id.TV_SS_JLH_T_Sembarang);
    	TV_TD_JLH_T_Sembarang = (TextView)findViewById(R.id.TV_TD_JLH_T_Sembarang);
    	TV_JS_JLH_T_Sembarang = (TextView)findViewById(R.id.TV_JS_JLH_T_Sembarang);
    	TV_R_T_Sembarang = (TextView)findViewById(R.id.TV_R_T_Sembarang);
    	TV_KT_T_Sembarang = (TextView)findViewById(R.id.TV_KT_T_Sembarang);
    	TV_SL_TSembarang_1 = (TextView)findViewById(R.id.TV_SL_TSembarang_1);
    	TV_Ket_SP_TSembarang_1 = (TextView)findViewById(R.id.TV_Ket_SP_TSembarang_1);
    	TV_SP_TSembarang_1 = (TextView)findViewById(R.id.TV_SP_TSembarang_1);
    	TV_Ket_SP_TSembarang_2 = (TextView)findViewById(R.id.TV_Ket_SP_TSembarang_2);
    	TV_TS_TSembarang_1 = (TextView)findViewById(R.id.TV_TS_TSembarang_1);
    	TV_JS_TS_TSembarang__1 = (TextView)findViewById(R.id.TV_JS_TS_TSembarang__1);
    	LR_ButtonHitung_T_Sembarang = (Button)findViewById(R.id.LR_ButtonHitung_T_Sembarang);
    	LR_ButtonRingkasan_T_Sembarang = (Button)findViewById(R.id.LR_ButtonRingkasan_T_Sembarang);
    	TV_LR_Judul_T_SIKUSIKU = (TextView)findViewById(R.id.TV_LR_Judul_T_SIKUSIKU);
    	TV_SL_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_T_SIKUSIKU);
    	TV_SP_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_T_SIKUSIKU);
    	TV_SS_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SS_T_SIKUSIKU);
    	TV_TS_T_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_T_SIKUSIKU);
    	TV_JS_T_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_T_SIKUSIKU);
    	TV_SL_TD_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_TD_T_SIKUSIKU);
    	TV_SP_TD_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_TD_T_SIKUSIKU);
    	TV_SS_TD_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SS_TD_T_SIKUSIKU);
    	TV_TS_TD_T_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_TD_T_SIKUSIKU);
    	TV_JS_TD_T_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_TD_T_SIKUSIKU);
    	TV_SL_JLH_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_JLH_T_SIKUSIKU);
    	TV_SP_JLH_T_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_JLH_T_SIKUSIKU);
    	TV_Ss_JLH_T_SIKUSIKU = (TextView)findViewById(R.id.TV_Ss_JLH_T_SIKUSIKU);
    	TV_TS_JLH_T_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_JLH_T_SIKUSIKU);
    	TV_JS_JLH_T_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_JLH_T_SIKUSIKU);
    	TV_R_T_SIKUSIKU = (TextView)findViewById(R.id.TV_R_T_SIKUSIKU);
    	TV_KT_T_SIKUSIKU = (TextView)findViewById(R.id.TV_KT_T_SIKUSIKU);
    	TV_SL_TSikuSiku_1 = (TextView)findViewById(R.id.TV_SL_TSikuSiku_1);
    	TV_SP_TSikuSiku_1 = (TextView)findViewById(R.id.TV_SP_TSikuSiku_1);
    	TV_TS_TSikuSiku_1 = (TextView)findViewById(R.id.TV_TS_TSikuSiku_1);
    	TV_JS_TSikuSiku_1 = (TextView)findViewById(R.id.TV_JS_TSikuSiku_1);
    	LR_ButtonHitung_T_SIKUSIKU = (Button)findViewById(R.id.LR_ButtonHitung_T_SIKUSIKU);
    	LR_ButtonRingkasan_T_SIKUSIKU = (Button)findViewById(R.id.LR_ButtonRingkasan_T_SIKUSIKU);
 
		TV_Judul_Rumus_T.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_JLH_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_JLH_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TS_SegitigaSikuSiku__1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_T_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_JLH_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TD_JLH_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_TSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_TSembarang_2.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TS_TSembarang__1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_T_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ss_JLH_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_JLH_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_T_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
 	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_T_SAMAKAKI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, Form_ModeCari_Trapesium_SamaKaki.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_T_SAMAKAKI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonHitung_T_Sembarang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, Form_ModeCari_Trapesium_Sembarang.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonRingkasan_T_Sembarang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonHitung_T_SIKUSIKU.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, Form_ModeCari_Trapesium_SikuSiku.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_T_SIKUSIKU.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_T.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilForm);
			}
		});
    	
 
	}
}
