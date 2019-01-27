package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_Segitiga_SamaKaki_MC_Semua extends Activity {
	EditText ET_Input_S_SamaKaki_Alas_MC_Semua;
	EditText ET_Input_S_SamaKaki_Tinggi_MC_Semua;
	EditText ET_Input_S_SamaKaki_Sisi_MC_Semua;
	EditText ET_Output_S_SamaKaki_Luas_MC_Semua;
	EditText ET_Output_S_SamaKaki_Keliling_MC_Semua;
	EditText ET_Output_S_SamaKaki_SetengahAlas_MC_Semua;
	Button Button_Hitung_S_SamaKaki_MC_Semua;
	Button Button_Reset_S_SamaKaki_MC_Semua;
	Button Button_Kembali_S_SamaKaki_MC_Semua;
	Button Button_Detail_S_SamaKaki_MC_Semua;
	Button Button_Rumus_SSK_MC_Semua;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_samakaki_mc_semua);
		
		ET_Input_S_SamaKaki_Alas_MC_Semua = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Alas_MC_Semua);
		ET_Input_S_SamaKaki_Tinggi_MC_Semua = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Tinggi_MC_Semua);
		ET_Input_S_SamaKaki_Sisi_MC_Semua = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Sisi_MC_Semua);
		ET_Output_S_SamaKaki_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_Luas_MC_Semua);
		ET_Output_S_SamaKaki_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_Keliling_MC_Semua);
		ET_Output_S_SamaKaki_SetengahAlas_MC_Semua = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_SetengahAlas_MC_Semua);
		Button_Hitung_S_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Hitung_S_SamaKaki_MC_Semua);
		Button_Reset_S_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Reset_S_SamaKaki_MC_Semua);
		Button_Kembali_S_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Kembali_S_SamaKaki_MC_Semua);
		Button_Detail_S_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Detail_S_SamaKaki_MC_Semua);
		Button_Rumus_SSK_MC_Semua = (Button)findViewById(R.id.Button_Rumus_SSK_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SamaKaki_Alas_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_Semua.requestFocus();
					}
					else if(ET_Input_S_SamaKaki_Tinggi_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Tinggi_MC_Semua.requestFocus();
					}
					else if(ET_Input_S_SamaKaki_Sisi_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Sisi_MC_Semua.requestFocus();
					}					
					else if(Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_Semua.getText().toString()) > Double.parseDouble(ET_Input_S_SamaKaki_Sisi_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai Alas salah!. Nilai Alas tidak lebih Besar dari nilai Sisi", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_Semua.getText().toString()) > Double.parseDouble(ET_Input_S_SamaKaki_Tinggi_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai Alas salah!. Nilai Alas tidak lebih Besar dari nilai Tinggi", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_Semua.requestFocus();
					}					
					else if(Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_Semua.getText().toString()) == Double.parseDouble(ET_Input_S_SamaKaki_Sisi_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai Alas salah! Untuk Segitiga Sama Kaki, nilai Alas Tidak pernah sama dengan nilai Sisi ", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_Semua.requestFocus();
					}
					else{
						double Alas_S_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_Semua.getText().toString());
						double Tinggi_S_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_S_SamaKaki_Tinggi_MC_Semua.getText().toString());
						double Sisi_S_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_S_SamaKaki_Sisi_MC_Semua.getText().toString());
						double Luas_S_SamaKaki_MC_Semua = (Alas_S_SamaKaki_MC_Semua * Tinggi_S_SamaKaki_MC_Semua) / 2;
						double Keliling_S_SamaKaki_MC_Semua = Alas_S_SamaKaki_MC_Semua + Sisi_S_SamaKaki_MC_Semua + Sisi_S_SamaKaki_MC_Semua; 
						double SetengahAlas_S_SamaKaki_MC_Semua = Alas_S_SamaKaki_MC_Semua / 2;
						
						ET_Output_S_SamaKaki_Luas_MC_Semua.setText(String.valueOf(Luas_S_SamaKaki_MC_Semua));
						ET_Output_S_SamaKaki_Keliling_MC_Semua.setText(String.valueOf(Keliling_S_SamaKaki_MC_Semua));
						ET_Output_S_SamaKaki_SetengahAlas_MC_Semua.setText(String.valueOf(SetengahAlas_S_SamaKaki_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Alas_MC_Semua.setText("");
				ET_Input_S_SamaKaki_Tinggi_MC_Semua.setText("");
				ET_Input_S_SamaKaki_Sisi_MC_Semua.setText("");
				ET_Output_S_SamaKaki_Luas_MC_Semua.setText("");
				ET_Output_S_SamaKaki_Keliling_MC_Semua.setText("");
				ET_Output_S_SamaKaki_SetengahAlas_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});

		Button_Rumus_SSK_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Alas_MC_Semua.setText("Nilai Alas [a]");
				ET_Input_S_SamaKaki_Tinggi_MC_Semua.setText("Nilai Tinggi [t]");
				ET_Input_S_SamaKaki_Sisi_MC_Semua.setText("Nilai Sisi [s]");
				ET_Output_S_SamaKaki_Luas_MC_Semua.setText(" ½ x a x t");
				ET_Output_S_SamaKaki_Keliling_MC_Semua.setText(" s + s + s");
				ET_Output_S_SamaKaki_SetengahAlas_MC_Semua.setText(" a / 2");
				ET_Input_S_SamaKaki_Alas_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SamaKaki_MC_Semua.this, FormLihatGambarSegitigaSamaKaki.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
	}
}
