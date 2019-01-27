package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_Segitiga_SikuSiku extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_segitiga_sikusiku);
        
        ImageView IV_SegitigaSikuSiku = (ImageView) findViewById(R.id.IV_SegitigaSikuSiku);
		Button Button_MC_Semua_S_SikuSiku = (Button) findViewById(R.id.Button_MC_Semua_S_SikuSiku);
		Button Button_MC_HanyaSisiA_S_SikuSiku = (Button) findViewById(R.id.Button_MC_HanyaSisiA_S_SikuSiku);
		Button Button_MC_HanyaSisiB_S_SikuSiku = (Button) findViewById(R.id.Button_MC_HanyaSisiB_S_SikuSiku);
		Button Button_MC_HanyaSisiMiring_S_SikuSiku = (Button) findViewById(R.id.Button_MC_HanyaSisiMiring_S_SikuSiku);
		
		IV_SegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SikuSiku.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_S_SikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SikuSiku.this, Form_Segitiga_SikuSiku_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisiA_S_SikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SikuSiku.this, Form_Segitiga_SikuSiku_MC_HanyaSisi_A.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisiB_S_SikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SikuSiku.this, Form_Segitiga_SikuSiku_MC_HanyaSisi_B.class);
				startActivity(i);
			}
		});
		Button_MC_HanyaSisiMiring_S_SikuSiku.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Segitiga_SikuSiku.this, Form_Segitiga_SikuSiku_MC_HanyaSisi_Miring.class);
				startActivity(i);
			}
		});		

		
    }
}