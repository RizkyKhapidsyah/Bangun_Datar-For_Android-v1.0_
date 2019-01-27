package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_Segitiga_Sembarang extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_segitiga_sembarang);
        
        ImageView IV_SegitigaSembarang = (ImageView) findViewById(R.id.IV_SegitigaSembarang);
		Button Button_MC_Semua_S_Sembarang = (Button) findViewById(R.id.Button_MC_Semua_S_Sembarang);
		Button Button_MC_HanyaSisiA_S_Sembarang = (Button) findViewById(R.id.Button_MC_HanyaSisiA_S_Sembarang);
		Button Button_MC_HanyaSisiB_S_Sembarang = (Button) findViewById(R.id.Button_MC_HanyaSisiB_S_Sembarang);
		Button Button_MC_HanyaTinggi_S_Sembarang = (Button) findViewById(R.id.Button_MC_HanyaTinggi_S_Sembarang);
		
		IV_SegitigaSembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_Sembarang.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_S_Sembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_Sembarang.this, Form_Segitiga_Sembarang_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisiA_S_Sembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_Sembarang.this, Form_Segitiga_Sembarang_MC_HanyaSisi_A.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisiB_S_Sembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_Sembarang.this, Form_Segitiga_Sembarang_MC_HanyaSisi_B.class);
				startActivity(i);
			}
		});	
		Button_MC_HanyaTinggi_S_Sembarang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_Sembarang.this, Form_Segitiga_Sembarang_MC_HanyaTinggi.class);
				startActivity(i);
			}
		});		
		
    }
}