package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_PersegiPanjang_MC_HanyaPanjang extends Activity {
	EditText ET_Input_PP_Luas_MC_HanyaPanjang;
	EditText ET_Input_PP_Lebar_MC_HanyaPanjang;
	EditText ET_Output_PP_Panjang_MC_HanyaPanjang;
	Button Button_Hitung_PP_MC_HanyaPanjang;
	Button Button_Reset_PP_MC_HanyaPanjang;
	Button Button_Kembali_PP_MC_HanyaPanjang;
	Button Button_Detail_PP_MC_Panjang;
	Button Button_Rumus_PP_MC_HP;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_persegipanjang_mc_hanyapanjang);
		
		ET_Input_PP_Luas_MC_HanyaPanjang = (EditText)findViewById(R.id.ET_Input_PP_Luas_MC_HanyaPanjang);
		ET_Input_PP_Lebar_MC_HanyaPanjang = (EditText)findViewById(R.id.ET_Input_PP_Lebar_MC_HanyaPanjang);
		ET_Output_PP_Panjang_MC_HanyaPanjang = (EditText)findViewById(R.id.ET_Output_PP_Panjang_MC_HanyaPanjang);
		Button_Hitung_PP_MC_HanyaPanjang = (Button)findViewById(R.id.Button_Hitung_PP_MC_HanyaPanjang);
		Button_Reset_PP_MC_HanyaPanjang = (Button)findViewById(R.id.Button_Reset_PP_MC_HanyaPanjang);
		Button_Kembali_PP_MC_HanyaPanjang = (Button)findViewById(R.id.Button_Kembali_PP_MC_HanyaPanjang);
		Button_Detail_PP_MC_Panjang = (Button)findViewById(R.id.Button_Detail_PP_MC_Panjang);
		Button_Rumus_PP_MC_HP = (Button)findViewById(R.id.Button_Rumus_PP_MC_HP);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_PP_MC_HanyaPanjang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_PP_Luas_MC_HanyaPanjang.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Luas_MC_HanyaPanjang.requestFocus();
					}
					else if(ET_Input_PP_Lebar_MC_HanyaPanjang.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Lebar!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Lebar_MC_HanyaPanjang.requestFocus();
					}
					else{
						double Luas_PP_MC_HanyaPanjang = Double.parseDouble(ET_Input_PP_Luas_MC_HanyaPanjang.getText().toString());
						double Lebar_PP_MC_HanyaPanjang= Double.parseDouble(ET_Input_PP_Lebar_MC_HanyaPanjang.getText().toString());
						double Panjang_PP_MC_HanyaPanjang = Luas_PP_MC_HanyaPanjang / Lebar_PP_MC_HanyaPanjang;
						ET_Output_PP_Panjang_MC_HanyaPanjang.setText(String.valueOf(Panjang_PP_MC_HanyaPanjang));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_PP_MC_HanyaPanjang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Luas_MC_HanyaPanjang.setText("");
				ET_Input_PP_Lebar_MC_HanyaPanjang.setText("");
				ET_Output_PP_Panjang_MC_HanyaPanjang.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_PP_MC_HanyaPanjang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_PP_MC_Panjang.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_PersegiPanjang_MC_HanyaPanjang.this, FormLihatGambarPP.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		Button_Rumus_PP_MC_HP.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Luas_MC_HanyaPanjang.setText("Nilai Luas :");
				ET_Input_PP_Lebar_MC_HanyaPanjang.setText("Nilai Lebar");
				ET_Output_PP_Panjang_MC_HanyaPanjang.setText(" Luas / lebar");
				
			}
		});		
	}
}
