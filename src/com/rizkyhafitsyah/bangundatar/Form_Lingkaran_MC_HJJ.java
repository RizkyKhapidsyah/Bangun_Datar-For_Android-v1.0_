package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_Lingkaran_MC_HJJ extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_lingkaran_mc_hjj);
        
        ImageView IV_Lingkaran = (ImageView) findViewById(R.id.IV_Lingkaran);
		Button Button_MC_HJJ_Lingkaran_JD_Diameter = (Button) findViewById(R.id.Button_MC_HJJ_Lingkaran_JD_Diameter);
		Button Button_MC_HJJ_Lingkaran_JD_Keliling = (Button) findViewById(R.id.Button_MC_HJJ_Lingkaran_JD_Keliling);
		Button Button_MC_HJJ_Lingkaran_JD_Luas = (Button) findViewById(R.id.Button_MC_HJJ_Lingkaran_JD_Luas);
		
		IV_Lingkaran.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Lingkaran_MC_HJJ.this, FormLihatGambarLingkaran.class);
				startActivity(i);
			}
		});	
		Button_MC_HJJ_Lingkaran_JD_Diameter.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Lingkaran_MC_HJJ.this, Form_Lingkaran_MC_HJJ_JD_Diameter.class);
				startActivity(i);
			}
		});
		Button_MC_HJJ_Lingkaran_JD_Keliling.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Lingkaran_MC_HJJ.this, Form_Lingkaran_MC_HJJ_JD_Keliling.class);
				startActivity(i);
			}
		});
		Button_MC_HJJ_Lingkaran_JD_Luas.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_Lingkaran_MC_HJJ.this, Form_Lingkaran_MC_HJJ_JD_Luas.class);
				startActivity(i);
			}
		});		
			
    }
}