package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

 
public class Form_ModeCari_PersegiPanjang extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_persegipanjang);
        
		Button Button_MC_Semua = (Button) findViewById(R.id.Button_MC_Semua);
		Button Button_MC_HanyaDiagonal = (Button) findViewById(R.id.Button_MC_HanyaDiagonal);
		Button Button_MC_HanyaPanjang = (Button) findViewById(R.id.Button_MC_HanyaPanjang);
		Button Button_MC_HanyaLebar = (Button) findViewById(R.id.Button_MC_HanyaLebar);

		Button_MC_Semua.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_PersegiPanjang.this, Form_PersegiPanjang_MC_Semua.class);
				startActivity(i);
			}
		});
		
		Button_MC_HanyaDiagonal.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_PersegiPanjang.this, Form_PersegiPanjang_MC_HanyaDiagonal.class);
				startActivity(i);
			}
		});		
		
		Button_MC_HanyaPanjang.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_PersegiPanjang.this, Form_PersegiPanjang_MC_HanyaPanjang.class);
				startActivity(i);
			}
		});

		Button_MC_HanyaLebar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_PersegiPanjang.this, Form_PersegiPanjang_MC_HanyaLebar.class);
				startActivity(i);
			}
		});
    
    }
 

     
}