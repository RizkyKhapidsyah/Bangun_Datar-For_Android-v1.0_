package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;

public class Form_Rumus_S extends Activity {
	TextView TV_Judul_Rumus_S;
	TextView TV_LR_Judul_S_SikuSiku;
	TextView TV_SL_S_SIKUSIKU;
	TextView TV_SP_S_SIKUSIKU;
	TextView TV_SS_S_SIKUSIKU;
	TextView TV_TS_S_SIKUSIKU;
	TextView TV_JS_S_SIKUSIKU;
	TextView TV_SL_TD_S_SIKUSIKU;
	TextView TV_SP_TD_S_SIKUSIKU;
	TextView TV_SS_TD_S_SIKUSIKU;
	TextView TV_TS_TD_S_SIKUSIKU;
	TextView TV_JS_TD_S_SIKUSIKU;
	TextView TV_SL_JLH_S_SIKUSIKU;
	TextView TV_SP_JLH_S_SIKUSIKU;
	TextView TV_SS_JLH_S_SIKUSIKU;
	TextView TV_TS_JLH_S_SIKUSIKU;
	TextView TV_JS_JLH_S_SIKUSIKU;
	TextView TV_R_S_SIKUSIKU;
	TextView TV_KT_S_SIKUSIKU;
	TextView TV_SL_SegitigaSikuSiku_1;
	TextView TV_SP_SegitigaSikuSiku_1;
	TextView TV_Ket_SP_SegitigaSikuSiku_1;
	TextView TV_TS_SegitigaSikuSiku_1;
	TextView TV_JS_TS_SegitigaSikuSiku__1;
	Button LR_ButtonHitung_S_SIKUSIKU;
	Button LR_ButtonRingkasan_S_SIKUSIKU;
	TextView TV_LR_Judul_S_Sembarang;
	TextView TV_SL_S_SEMBARANG;
	TextView TV_SP_S_SEMBARANG;
	TextView TV_SS_S_SEMBARANG;
	TextView TV_TS_S_SEMBARANG;
	TextView TV_JS_S_SEMBARANG;
	TextView TV_SL_TD_S_SEMBARANG;
	TextView TV_SP_TD_S_SEMBARANG;
	TextView TV_SS_TD_S_SEMBARANG;
	TextView TV_TS_TD_S_SEMBARANG;
	TextView TV_JS_TD_S_SEMBARANG;
	TextView TV_SL_JLH_S_SEMBARANG;
	TextView TV_SP_JLH_S_SEMBARANG;
	TextView TV_SS_JLH_S_SEMBARANG;
	TextView TV_TD_JLH_S_SEMBARANG;
	TextView TV_JS_JLH_S_SEMBARANG;
	TextView TV_R_S_SEMBARANG;
	TextView TV_KT_S_SEMBARANG;
	TextView TV_SL_SegitigaSembarang_1;
	TextView TV_Ket_SP_SegitigaSembarang_1;
	TextView TV_SP_SegitigaSembarang_1;
	TextView TV_Ket_SP_SegitigaSembarang_2;
	TextView TV_TS_SegitigaSembarang_1;
	TextView TV_JS_TS_SegitigaSembarang__1;
	Button LR_ButtonHitung_S_SEMBARANG;
	Button LR_ButtonRingkasan_S_SEMBARANG;
	TextView TV_LR_Judul_S_SamaSisi;
	TextView TV_SL_S_SAMASISI;
	TextView TV_SP_S_SAMASISI;
	TextView TV_SS_S_SAMASISI;
	TextView TV_TS_S_SAMASISI;
	TextView TV_JS_S_SAMASISI;
	TextView TV_SL_TD_S_SAMASISI;
	TextView TV_SP_TD_S_SAMASISI;
	TextView TV_SS_TD_S_SAMASISI;
	TextView TV_TS_TD_S_SAMASISI;
	TextView TV_JS_TD_S_SAMASISI;
	TextView TV_SL_JLH_S_SAMASISI;
	TextView TV_SP_JLH_S_SAMASISI;
	TextView TV_Ss_JLH_S_SAMASISI;
	TextView TV_TS_JLH_S_SAMASISI;
	TextView TV_JS_JLH_S_SAMASISI;
	TextView TV_R_S_SAMASISI;
	TextView TV_KT_S_SAMASISI;
	TextView TV_SL_SegitigaSamasisi_1;
	TextView TV_SP_SegitigaSamasisi_1;
	TextView TV_TS_SegitigaSamasisi_1;
	TextView TV_JS_SegitigaSamasisi_1;
	Button LR_ButtonHitung_S_SAMASISI;
	Button LR_ButtonRingkasan_S_SAMASISI;
	TextView TV_LR_Judul_S_SamaKaki;
	TextView TV_SL_S_SAMAKAKI;
	TextView TV_SP_S_SAMAKAKI;
	TextView TV_SS_S_SAMAKAKI;
	TextView TV_TS_S_SAMAKAKI;
	TextView TV_JS_S_SAMAKAKI;
	TextView TV_SL_TD_S_SAMAKAKI;
	TextView TV_SP_TD_S_SAMAKAKI;
	TextView TV_SS_TD_S_SAMAKAKI;
	TextView TV_TS_TD_S_SAMAKAKI;
	TextView TV_JS_TD_S_SAMAKAKI;
	TextView TV_SL_JLH_S_SAMAKAKI;
	TextView TV_SP_JLH_S_SAMAKAKI;
	TextView TV_SS_JLH_S_SAMAKAKI;
	TextView TV_TS_JLH_S_SAMAKAKI;
	TextView TV_js_JLH_S_SAMAKAKI;
	TextView TV_R_S_SAMAKAKI;
	TextView TV_KT_S_SAMAKAKI;
	TextView TV_SL_S_SAMAKAKI1;
	TextView TV_SP_S_SAMAKAKI1;
	TextView TV_Ket_SP_SegitigaSamakaki_1;
	TextView TV_TS_S_SAMAKAKI1;
	TextView TV_JS_S_SAMAKAKI1;
	Button LR_ButtonHitung_S_SAMAKAKI;
	Button LR_ButtonRingkasan_S_SAMAKAKI;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_rumus_s);

        String CustomHuruf_FORM_LR_S = "AGENCYR.TTF";
        Typeface TipeHuruf_FORM_LR_S = Typeface.createFromAsset(getAssets(), CustomHuruf_FORM_LR_S);

		TV_Judul_Rumus_S = (TextView)findViewById(R.id.TV_Judul_Rumus_S);
    	TV_LR_Judul_S_SikuSiku = (TextView)findViewById(R.id.TV_LR_Judul_S_SikuSiku);
    	TV_SL_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_S_SIKUSIKU);
    	TV_SP_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_S_SIKUSIKU);
    	TV_SS_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SS_S_SIKUSIKU);
    	TV_TS_S_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_S_SIKUSIKU);
    	TV_JS_S_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_S_SIKUSIKU);
    	TV_SL_TD_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_TD_S_SIKUSIKU);
    	TV_SP_TD_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_TD_S_SIKUSIKU);
    	TV_SS_TD_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SS_TD_S_SIKUSIKU);
    	TV_TS_TD_S_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_TD_S_SIKUSIKU);
    	TV_JS_TD_S_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_TD_S_SIKUSIKU);
    	TV_SL_JLH_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SL_JLH_S_SIKUSIKU);
    	TV_SP_JLH_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SP_JLH_S_SIKUSIKU);
    	TV_SS_JLH_S_SIKUSIKU = (TextView)findViewById(R.id.TV_SS_JLH_S_SIKUSIKU);
    	TV_TS_JLH_S_SIKUSIKU = (TextView)findViewById(R.id.TV_TS_JLH_S_SIKUSIKU);
    	TV_JS_JLH_S_SIKUSIKU = (TextView)findViewById(R.id.TV_JS_JLH_S_SIKUSIKU);
    	TV_R_S_SIKUSIKU = (TextView)findViewById(R.id.TV_R_S_SIKUSIKU);
    	TV_KT_S_SIKUSIKU = (TextView)findViewById(R.id.TV_KT_S_SIKUSIKU);
    	TV_SL_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_SL_SegitigaSikuSiku_1);
    	TV_SP_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_SP_SegitigaSikuSiku_1);
    	TV_Ket_SP_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_Ket_SP_SegitigaSikuSiku_1);
    	TV_TS_SegitigaSikuSiku_1 = (TextView)findViewById(R.id.TV_TS_SegitigaSikuSiku_1);
    	TV_JS_TS_SegitigaSikuSiku__1 = (TextView)findViewById(R.id.TV_JS_TS_SegitigaSikuSiku__1);
    	LR_ButtonHitung_S_SIKUSIKU = (Button)findViewById(R.id.LR_ButtonHitung_S_SIKUSIKU);
    	LR_ButtonRingkasan_S_SIKUSIKU = (Button)findViewById(R.id.LR_ButtonRingkasan_S_SIKUSIKU);
    	TV_LR_Judul_S_Sembarang = (TextView)findViewById(R.id.TV_LR_Judul_S_Sembarang);
    	TV_SL_S_SEMBARANG = (TextView)findViewById(R.id.TV_SL_S_SEMBARANG);
    	TV_SP_S_SEMBARANG = (TextView)findViewById(R.id.TV_SP_S_SEMBARANG);
    	TV_SS_S_SEMBARANG = (TextView)findViewById(R.id.TV_SS_S_SEMBARANG);
    	TV_TS_S_SEMBARANG = (TextView)findViewById(R.id.TV_TS_S_SEMBARANG);
    	TV_JS_S_SEMBARANG = (TextView)findViewById(R.id.TV_JS_S_SEMBARANG);
    	TV_SL_TD_S_SEMBARANG = (TextView)findViewById(R.id.TV_SL_TD_S_SEMBARANG);
    	TV_SP_TD_S_SEMBARANG = (TextView)findViewById(R.id.TV_SP_TD_S_SEMBARANG);
    	TV_SS_TD_S_SEMBARANG = (TextView)findViewById(R.id.TV_SS_TD_S_SEMBARANG);
    	TV_TS_TD_S_SEMBARANG = (TextView)findViewById(R.id.TV_TS_TD_S_SEMBARANG);
    	TV_JS_TD_S_SEMBARANG = (TextView)findViewById(R.id.TV_JS_TD_S_SEMBARANG);
    	TV_SL_JLH_S_SEMBARANG = (TextView)findViewById(R.id.TV_SL_JLH_S_SEMBARANG);
    	TV_SP_JLH_S_SEMBARANG = (TextView)findViewById(R.id.TV_SP_JLH_S_SEMBARANG);
    	TV_SS_JLH_S_SEMBARANG = (TextView)findViewById(R.id.TV_SS_JLH_S_SEMBARANG);
    	TV_TD_JLH_S_SEMBARANG = (TextView)findViewById(R.id.TV_TD_JLH_S_SEMBARANG);
    	TV_JS_JLH_S_SEMBARANG = (TextView)findViewById(R.id.TV_JS_JLH_S_SEMBARANG);
    	TV_R_S_SEMBARANG = (TextView)findViewById(R.id.TV_R_S_SEMBARANG);
    	TV_KT_S_SEMBARANG = (TextView)findViewById(R.id.TV_KT_S_SEMBARANG);
    	TV_SL_SegitigaSembarang_1 = (TextView)findViewById(R.id.TV_SL_SegitigaSembarang_1);
    	TV_Ket_SP_SegitigaSembarang_1 = (TextView)findViewById(R.id.TV_Ket_SP_SegitigaSembarang_1);
    	TV_SP_SegitigaSembarang_1 = (TextView)findViewById(R.id.TV_SP_SegitigaSembarang_1);
    	TV_Ket_SP_SegitigaSembarang_2 = (TextView)findViewById(R.id.TV_Ket_SP_SegitigaSembarang_2);
    	TV_TS_SegitigaSembarang_1 = (TextView)findViewById(R.id.TV_TS_SegitigaSembarang_1);
    	TV_JS_TS_SegitigaSembarang__1 = (TextView)findViewById(R.id.TV_JS_TS_SegitigaSembarang__1);
    	LR_ButtonHitung_S_SEMBARANG = (Button)findViewById(R.id.LR_ButtonHitung_S_SEMBARANG);
    	LR_ButtonRingkasan_S_SEMBARANG = (Button)findViewById(R.id.LR_ButtonRingkasan_S_SEMBARANG);
    	TV_LR_Judul_S_SamaSisi = (TextView)findViewById(R.id.TV_LR_Judul_S_SamaSisi);
    	TV_SL_S_SAMASISI = (TextView)findViewById(R.id.TV_SL_S_SAMASISI);
    	TV_SP_S_SAMASISI = (TextView)findViewById(R.id.TV_SP_S_SAMASISI);
    	TV_SS_S_SAMASISI = (TextView)findViewById(R.id.TV_SS_S_SAMASISI);
    	TV_TS_S_SAMASISI = (TextView)findViewById(R.id.TV_TS_S_SAMASISI);
    	TV_JS_S_SAMASISI = (TextView)findViewById(R.id.TV_JS_S_SAMASISI);
    	TV_SL_TD_S_SAMASISI = (TextView)findViewById(R.id.TV_SL_TD_S_SAMASISI);
    	TV_SP_TD_S_SAMASISI = (TextView)findViewById(R.id.TV_SP_TD_S_SAMASISI);
    	TV_SS_TD_S_SAMASISI = (TextView)findViewById(R.id.TV_SS_TD_S_SAMASISI);
    	TV_TS_TD_S_SAMASISI = (TextView)findViewById(R.id.TV_TS_TD_S_SAMASISI);
    	TV_JS_TD_S_SAMASISI = (TextView)findViewById(R.id.TV_JS_TD_S_SAMASISI);
    	TV_SL_JLH_S_SAMASISI = (TextView)findViewById(R.id.TV_SL_JLH_S_SAMASISI);
    	TV_SP_JLH_S_SAMASISI = (TextView)findViewById(R.id.TV_SP_JLH_S_SAMASISI);
    	TV_Ss_JLH_S_SAMASISI = (TextView)findViewById(R.id.TV_Ss_JLH_S_SAMASISI);
    	TV_TS_JLH_S_SAMASISI = (TextView)findViewById(R.id.TV_TS_JLH_S_SAMASISI);
    	TV_JS_JLH_S_SAMASISI = (TextView)findViewById(R.id.TV_JS_JLH_S_SAMASISI);
    	TV_R_S_SAMASISI = (TextView)findViewById(R.id.TV_R_S_SAMASISI);
    	TV_KT_S_SAMASISI = (TextView)findViewById(R.id.TV_KT_S_SAMASISI);
    	TV_SL_SegitigaSamasisi_1 = (TextView)findViewById(R.id.TV_SL_SegitigaSamasisi_1);
    	TV_SP_SegitigaSamasisi_1 = (TextView)findViewById(R.id.TV_SP_SegitigaSamasisi_1);
    	TV_TS_SegitigaSamasisi_1 = (TextView)findViewById(R.id.TV_TS_SegitigaSamasisi_1);
    	TV_JS_SegitigaSamasisi_1 = (TextView)findViewById(R.id.TV_JS_SegitigaSamasisi_1);
    	LR_ButtonHitung_S_SAMASISI = (Button)findViewById(R.id.LR_ButtonHitung_S_SAMASISI);
    	LR_ButtonRingkasan_S_SAMASISI = (Button)findViewById(R.id.LR_ButtonRingkasan_S_SAMASISI);
    	TV_LR_Judul_S_SamaKaki = (TextView)findViewById(R.id.TV_LR_Judul_S_SamaKaki);
    	TV_SL_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_S_SAMAKAKI);
    	TV_SP_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_S_SAMAKAKI);
    	TV_SS_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_S_SAMAKAKI);
    	TV_TS_S_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_S_SAMAKAKI);
    	TV_JS_S_SAMAKAKI = (TextView)findViewById(R.id.TV_JS_S_SAMAKAKI);
    	TV_SL_TD_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_TD_S_SAMAKAKI);
    	TV_SP_TD_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_TD_S_SAMAKAKI);
    	TV_SS_TD_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_TD_S_SAMAKAKI);
    	TV_TS_TD_S_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_TD_S_SAMAKAKI);
    	TV_JS_TD_S_SAMAKAKI = (TextView)findViewById(R.id.TV_JS_TD_S_SAMAKAKI);
    	TV_SL_JLH_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SL_JLH_S_SAMAKAKI);
    	TV_SP_JLH_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SP_JLH_S_SAMAKAKI);
    	TV_SS_JLH_S_SAMAKAKI = (TextView)findViewById(R.id.TV_SS_JLH_S_SAMAKAKI);
    	TV_TS_JLH_S_SAMAKAKI = (TextView)findViewById(R.id.TV_TS_JLH_S_SAMAKAKI);
    	TV_js_JLH_S_SAMAKAKI = (TextView)findViewById(R.id.TV_js_JLH_S_SAMAKAKI);
    	TV_R_S_SAMAKAKI = (TextView)findViewById(R.id.TV_R_S_SAMAKAKI);
    	TV_KT_S_SAMAKAKI = (TextView)findViewById(R.id.TV_KT_S_SAMAKAKI);
    	TV_SL_S_SAMAKAKI1 = (TextView)findViewById(R.id.TV_SL_S_SAMAKAKI1);
    	TV_SP_S_SAMAKAKI1 = (TextView)findViewById(R.id.TV_SP_S_SAMAKAKI1);
    	TV_Ket_SP_SegitigaSamakaki_1 = (TextView)findViewById(R.id.TV_Ket_SP_SegitigaSamakaki_1);
    	TV_TS_S_SAMAKAKI1 = (TextView)findViewById(R.id.TV_TS_S_SAMAKAKI1);
    	TV_JS_S_SAMAKAKI1 = (TextView)findViewById(R.id.TV_JS_S_SAMAKAKI1);
    	LR_ButtonHitung_S_SAMAKAKI = (Button)findViewById(R.id.LR_ButtonHitung_S_SAMAKAKI);
    	LR_ButtonRingkasan_S_SAMAKAKI = (Button)findViewById(R.id.LR_ButtonRingkasan_S_SAMAKAKI);

		TV_Judul_Rumus_S.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_S_SikuSiku.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_JLH_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_JLH_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_SegitigaSikuSiku_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TS_SegitigaSikuSiku__1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_S_SIKUSIKU.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_S_Sembarang.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_JLH_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TD_JLH_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_SegitigaSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_SegitigaSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_SegitigaSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_SegitigaSembarang_2.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_SegitigaSembarang_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TS_SegitigaSembarang__1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_S_SEMBARANG.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_S_SamaSisi.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ss_JLH_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_JLH_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_JLH_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_SegitigaSamasisi_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_SegitigaSamasisi_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_SegitigaSamasisi_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_SegitigaSamasisi_1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_S_SAMASISI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_LR_Judul_S_SamaKaki.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_TD_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_TD_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_TD_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_TD_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_TD_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_JLH_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_JLH_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SS_JLH_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_JLH_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_js_JLH_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_R_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_KT_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SL_S_SAMAKAKI1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_SP_S_SAMAKAKI1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_Ket_SP_SegitigaSamakaki_1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_TS_S_SAMAKAKI1.setTypeface(TipeHuruf_FORM_LR_S);
    	TV_JS_S_SAMAKAKI1.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonHitung_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
    	LR_ButtonRingkasan_S_SAMAKAKI.setTypeface(TipeHuruf_FORM_LR_S);
            	
		 //menambahkan event klik untuk perintah di tombol hitung
    	LR_ButtonHitung_S_SIKUSIKU.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, Form_ModeCari_Segitiga_SikuSiku.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_S_SIKUSIKU.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonHitung_S_SEMBARANG.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, Form_ModeCari_Segitiga_Sembarang.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonRingkasan_S_SEMBARANG.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonHitung_S_SAMASISI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, Form_ModeCari_Segitiga_SamaSisi.class);
				startActivity(PanggilForm);
			}
		});

    	LR_ButtonRingkasan_S_SAMASISI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, FormLihatGambarSegitigaSamaSisi.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonHitung_S_SAMAKAKI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, Form_ModeCari_Segitiga_SamaKaki.class);
				startActivity(PanggilForm);
			}
		});
    	
    	LR_ButtonRingkasan_S_SAMAKAKI.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilForm = new Intent(Form_Rumus_S.this, FormLihatGambarSegitigaSamaKaki.class);
				startActivity(PanggilForm);
			}
		});
	}
}
