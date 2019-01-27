package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_BelahKetupat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_belahketupat);
        
        ImageView IV_BelahKetupat = (ImageView) findViewById(R.id.IV_BelahKetupat);
		Button Button_MC_Semua_BelahKetupat = (Button) findViewById(R.id.Button_MC_Semua_BelahKetupat);
		Button Button_MC_HanyaSisi_BelahKetupat = (Button) findViewById(R.id.Button_MC_HanyaSisi_BelahKetupat);
		Button Button_MC_HanyaDiagonal1_BelahKetupat = (Button) findViewById(R.id.Button_MC_HanyaDiagonal1_BelahKetupat);
		Button Button_MC_HanyaDiagonal2_BelahKetupat = (Button) findViewById(R.id.Button_MC_HanyaDiagonal2_BelahKetupat);
		
		IV_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BelahKetupat.this, FormLihatGambarBelahKetupat.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BelahKetupat.this, Form_BelahKetupat_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HanyaSisi_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BelahKetupat.this, Form_BelahKetupat_MC_HanyaSisi.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaDiagonal1_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BelahKetupat.this, Form_BelahKetupat_MC_Hanya_D1.class);
				startActivity(i);
			}
		});
		 Button_MC_HanyaDiagonal2_BelahKetupat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_BelahKetupat.this, Form_BelahKetupat_MC_Hanya_D2.class);
				startActivity(i);
			}
		});			
    }
}