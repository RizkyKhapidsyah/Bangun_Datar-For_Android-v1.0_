package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_Segitiga_SamaKaki_MC_HanyaAlas extends Activity {
	EditText ET_Input_S_SamaKaki_Luas_MC_HanyaAlas;
	EditText ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas;
	EditText ET_Output_S_SamaKaki_Alas_MC_HanyaAlas;
	EditText ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas;	
	Button Button_Hitung_S_SamaKaki_MC_HanyaAlas;
	Button Button_Reset_S_SamaKaki_MC_HanyaAlas;
	Button Button_Kembali_S_SamaKaki_MC_HanyaAlas;
	Button Button_Detail_S_SamaKaki_MC_HanyaAlas;
	Button Button_Rumus_SSK_MC_HA;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_samakaki_mc_hanyaalas);
		
		ET_Input_S_SamaKaki_Luas_MC_HanyaAlas = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Luas_MC_HanyaAlas);
		ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas);
		ET_Output_S_SamaKaki_Alas_MC_HanyaAlas = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_Alas_MC_HanyaAlas);
		ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas);
		Button_Hitung_S_SamaKaki_MC_HanyaAlas = (Button)findViewById(R.id.Button_Hitung_S_SamaKaki_MC_HanyaAlas);
		Button_Reset_S_SamaKaki_MC_HanyaAlas = (Button)findViewById(R.id.Button_Reset_S_SamaKaki_MC_HanyaAlas);
		Button_Kembali_S_SamaKaki_MC_HanyaAlas = (Button)findViewById(R.id.Button_Kembali_S_SamaKaki_MC_HanyaAlas);
		Button_Detail_S_SamaKaki_MC_HanyaAlas = (Button)findViewById(R.id.Button_Detail_S_SamaKaki_MC_HanyaAlas);
		Button_Rumus_SSK_MC_HA = (Button)findViewById(R.id.Button_Rumus_SSK_MC_HA);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SamaKaki_MC_HanyaAlas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari salah satu Sisi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.requestFocus();
					}
					else if(ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas.requestFocus();
					}
					else{
						double I_Luas_S_SamaKaki_MC_HanyaAlas = Double.parseDouble(ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.getText().toString());
						double I_Tinggi_S_SamaKaki_MC_HanyaAlas = Double.parseDouble(ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas.getText().toString());
						double O_Alas_S_SamaKaki_MC_HanyaAlas = (I_Luas_S_SamaKaki_MC_HanyaAlas / I_Tinggi_S_SamaKaki_MC_HanyaAlas) * 2;
						double O_SetengahAlas_S_SamaKaki_MC_HanyaAlas = O_Alas_S_SamaKaki_MC_HanyaAlas / 2;						
						ET_Output_S_SamaKaki_Alas_MC_HanyaAlas.setText(String.valueOf(O_Alas_S_SamaKaki_MC_HanyaAlas));
						ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas.setText(String.valueOf(O_SetengahAlas_S_SamaKaki_MC_HanyaAlas));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SamaKaki_MC_HanyaAlas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.setText("");
				ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas.setText("");
				ET_Output_S_SamaKaki_Alas_MC_HanyaAlas.setText("");
				ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});

		Button_Rumus_SSK_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.setText("Nilai Luas");
				ET_Input_S_SamaKaki_Tinggi_MC_HanyaAlas.setText("Nilai Tinggi [t]");
				ET_Output_S_SamaKaki_Alas_MC_HanyaAlas.setText(" L/t x 2");
				ET_Output_S_SamaKaki_SetengahAlas_MC_HanyaAlas.setText(" ½ x (L/t x 2)");
				ET_Input_S_SamaKaki_Luas_MC_HanyaAlas.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SamaKaki_MC_HanyaAlas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SamaKaki_MC_HanyaAlas.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SamaKaki_MC_HanyaAlas.this, FormLihatGambarSegitigaSamaKaki.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
	}
}
