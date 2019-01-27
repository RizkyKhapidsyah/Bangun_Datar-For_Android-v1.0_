package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_Lingkaran extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_lingkaran);
        
        ImageView IV_Lingkaran = (ImageView) findViewById(R.id.IV_Lingkaran);
		Button Button_MC_Semua_Lingkaran = (Button) findViewById(R.id.Button_MC_Semua_Lingkaran);
		Button Button_MC_HanyaJariJari_Lingkaran = (Button) findViewById(R.id.Button_MC_HanyaJariJari_Lingkaran);
		
		IV_Lingkaran.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Lingkaran.this, FormLihatGambarLingkaran.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_Lingkaran.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Lingkaran.this, Form_Lingkaran_MC_Semua.class);
				startActivity(i);
			}
		});	
		Button_MC_HanyaJariJari_Lingkaran.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_Lingkaran.this, Form_Lingkaran_MC_HJJ.class);
				startActivity(i);
			}
		});			
    }
}