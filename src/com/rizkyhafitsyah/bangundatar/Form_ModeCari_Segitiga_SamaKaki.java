package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
 
public class Form_ModeCari_Segitiga_SamaKaki extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_segitiga_samakaki);
        
		Button Button_MC_Semua_S_SamaKaki = (Button) findViewById(R.id.Button_MC_Semua_S_SamaKaki);
		Button Button_MC_HanyaSisi_S_SamaKaki = (Button) findViewById(R.id.Button_MC_HanyaSisi_S_SamaKaki);
		Button Button_MC_HanyaAlas_S_SamaKaki = (Button) findViewById(R.id.Button_MC_HanyaAlas_S_SamaKaki);
		Button Button_MC_HanyaTinggi_S_SamaKaki = (Button) findViewById(R.id.Button_MC_HanyaTinggi_S_SamaKaki);

		Button_MC_Semua_S_SamaKaki.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaKaki.this, Form_Segitiga_SamaKaki_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisi_S_SamaKaki.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaKaki.this, Form_Segitiga_SamaKaki_MC_HanyaSisi.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaAlas_S_SamaKaki.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaKaki.this, Form_Segitiga_SamaKaki_MC_HanyaAlas.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaTinggi_S_SamaKaki.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaKaki.this, Form_Segitiga_SamaKaki_MC_HanyaTinggi.class);
				startActivity(i);
			}
		});		
    }
}