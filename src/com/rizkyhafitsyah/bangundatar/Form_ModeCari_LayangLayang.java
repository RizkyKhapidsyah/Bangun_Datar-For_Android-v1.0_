package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
 
public class Form_ModeCari_LayangLayang extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_modecari_layanglayang);
        
        ImageView IV_LL = (ImageView) findViewById(R.id.IV_LL);
		Button Button_MC_Semua_LL = (Button) findViewById(R.id.Button_MC_Semua_LL);
		Button Button_MC_HSA_HSB_LL = (Button) findViewById(R.id.Button_MC_HSA_HSB_LL);
		Button Button_MC_HDV_LL = (Button) findViewById(R.id.Button_MC_HDV_LL);
		Button Button_MC_HDVA_LL = (Button) findViewById(R.id.Button_MC_HDVA_LL);
		Button Button_MC_HDVB_LL = (Button) findViewById(R.id.Button_MC_HDVB_LL);
		Button Button_MC_HDH_LL = (Button) findViewById(R.id.Button_MC_HDH_LL);
		
		IV_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, FormLihatGambarLayangLayang.class);
				startActivity(i);
			}
		});	
		Button_MC_Semua_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_Semua.class);
				startActivity(i);
			}
		});
		Button_MC_HSA_HSB_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_HSA_HSB.class);
				startActivity(i);
			}
		});	
		Button_MC_HDV_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_HDV.class);
				startActivity(i);
			}
		});
		Button_MC_HDVA_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_HDV_A.class);
				startActivity(i);
			}
		});
		Button_MC_HDVB_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_HDV_B.class);
				startActivity(i);
			}
		});	
		Button_MC_HDH_LL.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(Form_ModeCari_LayangLayang.this, Form_LayangLayang_MC_HDH.class);
				startActivity(i);
			}
		});		
		
    }
}