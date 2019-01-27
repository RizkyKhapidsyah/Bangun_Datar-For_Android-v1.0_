package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_JajarGenjang extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_jajargenjang);
        
        ImageView IV_JajarGenjang = (ImageView) findViewById(R.id.IV_JajarGenjang);
		Button Button_MC_Semua_JajarGenjang = (Button) findViewById(R.id.Button_MC_Semua_JajarGenjang);
		Button Button_MC_HanyaLuasKeliling_JajarGenjang = (Button) findViewById(R.id.Button_MC_HanyaLuasKeliling_JajarGenjang);
		Button Button_MC_HanyaTinggi_JajarGenjang = (Button) findViewById(R.id.Button_MC_HanyaTinggi_JajarGenjang);
		Button Button_MC_HanyaAlas_JajarGenjang = (Button) findViewById(R.id.Button_MC_HanyaAlas_JajarGenjang);
		Button Button_MC_HanyaD1_JajarGenjang = (Button) findViewById(R.id.Button_MC_HanyaD1_JajarGenjang);
		Button Button_MC_HanyaD2_JajarGenjang = (Button) findViewById(R.id.Button_MC_HanyaD2_JajarGenjang);
		
		IV_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, FormLihatGambarJajarGenjang.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HanyaLuasKeliling_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_HLK.class);
				startActivity(i);
			}
		});	
		Button_MC_HanyaTinggi_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_HanyaTinggi.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaAlas_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_HanyaAlas.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaD1_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_HD1.class);
				startActivity(i);
			}
		});		
		Button_MC_HanyaD2_JajarGenjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_JajarGenjang.this, Form_JajarGenjang_MC_HD2.class);
				startActivity(i);
			}
		});		
    }
}