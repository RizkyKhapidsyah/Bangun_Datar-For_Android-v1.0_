package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
 
public class Form_ModeCari_Segitiga_SamaSisi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_segitiga_samasisi);
        
		Button Button_MC_Semua_S_SamaSisi = (Button) findViewById(R.id.Button_MC_Semua_S_SamaSisi);
		Button Button_MC_HanyaTinggi_S_SamaSisi = (Button) findViewById(R.id.Button_MC_HanyaTinggi_S_SamaSisi);

		Button_MC_Semua_S_SamaSisi.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaSisi.this, Form_Segitiga_SamaSisi_MC_Semua.class);
				startActivity(i); 
			}
		});	
		Button_MC_HanyaTinggi_S_SamaSisi.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SamaSisi.this, Form_Segitiga_SamaSisi_MC_HanyaTinggi.class);
				startActivity(i);
			}
		});			
    }
}