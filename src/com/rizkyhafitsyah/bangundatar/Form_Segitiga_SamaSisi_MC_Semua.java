package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_Segitiga_SamaSisi_MC_Semua extends Activity {
	EditText ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua;
	EditText ET_Input_S_SamaSisi_Tinggi_MC_Semua;
	EditText ET_Output_S_SamaSisi_Luas_MC_Semua;
	EditText ET_Output_S_SamaSisi_Keliling_MC_Semua;
	EditText ET_Output_S_SamaSisi_SetengahAlas_MC_Semua;
	Button Button_Hitung_S_SamaSisi_MC_Semua;
	Button Button_Reset_S_SamaSisi_MC_Semua;
	Button Button_Kembali_S_SamaSisi_MC_Semua;
	Button Button_Detail_S_SamaSisi_MC_Semua;
	Button Button_Rumus_SSSsi_MC_Semua;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_samasisi_mc_semua);
		
		ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua = (EditText)findViewById(R.id.ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua);
		ET_Input_S_SamaSisi_Tinggi_MC_Semua = (EditText)findViewById(R.id.ET_Input_S_SamaSisi_Tinggi_MC_Semua);
		ET_Output_S_SamaSisi_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaSisi_Luas_MC_Semua);
		ET_Output_S_SamaSisi_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaSisi_Keliling_MC_Semua);
		ET_Output_S_SamaSisi_SetengahAlas_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaSisi_SetengahAlas_MC_Semua);
		Button_Hitung_S_SamaSisi_MC_Semua = (Button)findViewById(R.id.Button_Hitung_S_SamaSisi_MC_Semua);
		Button_Reset_S_SamaSisi_MC_Semua = (Button)findViewById(R.id.Button_Reset_S_SamaSisi_MC_Semua);
		Button_Kembali_S_SamaSisi_MC_Semua = (Button)findViewById(R.id.Button_Kembali_S_SamaSisi_MC_Semua);
		Button_Detail_S_SamaSisi_MC_Semua = (Button)findViewById(R.id.Button_Detail_S_SamaSisi_MC_Semua);
		Button_Rumus_SSSsi_MC_Semua = (Button)findViewById(R.id.Button_Rumus_SSSsi_MC_Semua);
		
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SamaSisi_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi atau Nilai Alas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.requestFocus();
					}
					else if(ET_Input_S_SamaSisi_Tinggi_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaSisi_Tinggi_MC_Semua.requestFocus();
					}
					else{
						double I_SisiAtauAlas_S_SamaSisi_MC_Semua = Double.parseDouble(ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.getText().toString());
						double I_Tinggi_S_SamaSisi_MC_Semua = Double.parseDouble(ET_Input_S_SamaSisi_Tinggi_MC_Semua.getText().toString());
						double O_Luas_S_SamaSisi_MC_Semua = I_SisiAtauAlas_S_SamaSisi_MC_Semua * I_Tinggi_S_SamaSisi_MC_Semua / 2;
						double O_Keliling_S_SamaSisi_MC_Semua = I_SisiAtauAlas_S_SamaSisi_MC_Semua + I_SisiAtauAlas_S_SamaSisi_MC_Semua + I_SisiAtauAlas_S_SamaSisi_MC_Semua; 
						double O_SetengahAlas_S_SamaSisi_MC_Semua = I_SisiAtauAlas_S_SamaSisi_MC_Semua / 2;
						ET_Output_S_SamaSisi_Luas_MC_Semua.setText(String.valueOf(O_Luas_S_SamaSisi_MC_Semua));
						ET_Output_S_SamaSisi_Keliling_MC_Semua.setText(String.valueOf(O_Keliling_S_SamaSisi_MC_Semua));
						ET_Output_S_SamaSisi_SetengahAlas_MC_Semua.setText(String.valueOf(O_SetengahAlas_S_SamaSisi_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SamaSisi_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.setText("");
				ET_Input_S_SamaSisi_Tinggi_MC_Semua.setText("");
				ET_Output_S_SamaSisi_Luas_MC_Semua.setText("");
				ET_Output_S_SamaSisi_Keliling_MC_Semua.setText("");
				ET_Output_S_SamaSisi_SetengahAlas_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
		
		Button_Rumus_SSSsi_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.setText("Sisi atau Alas");
				ET_Input_S_SamaSisi_Tinggi_MC_Semua.setText("Tinggi [t]");
				ET_Output_S_SamaSisi_Luas_MC_Semua.setText(" ½ x a x t");
				ET_Output_S_SamaSisi_Keliling_MC_Semua.setText(" 3 x s");
				ET_Output_S_SamaSisi_SetengahAlas_MC_Semua.setText(" a / 2 ");	
				ET_Input_S_SamaSisi_SisiAtauAlas_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SamaSisi_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SamaSisi_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SamaSisi_MC_Semua.this, FormLihatGambarSegitigaSamaSisi.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
	}
}
