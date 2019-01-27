package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_JajarGenjang_MC_HanyaTinggi extends Activity {
	ImageView IV_Gambar_JajarGenjang_MC_HT;
	EditText ET_Input_JajarGenjang_Luas_MC_HT;
	EditText ET_Input_JajarGenjang_Alas_MC_HT;
	EditText ET_Output_JajarGenjang_Tinggi_MC_HT;
	Button Button_Hitung_JajarGenjang_MC_HT;
	Button Button_Reset_JajarGenjang_MC_HT;
	Button Button_Kembali_JajarGenjang_MC_HT;
	Button Button_Detail_JajarGenjang_MC_HT;
	Button Button_Rumus_JG_MC_HT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_jajargenjang_mc_hanyatinggi);
		
		IV_Gambar_JajarGenjang_MC_HT = (ImageView)findViewById(R.id.IV_Gambar_JajarGenjang_MC_HT);
		ET_Input_JajarGenjang_Luas_MC_HT = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Luas_MC_HT);
		ET_Input_JajarGenjang_Alas_MC_HT = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Alas_MC_HT);
		ET_Output_JajarGenjang_Tinggi_MC_HT = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Tinggi_MC_HT);
		Button_Hitung_JajarGenjang_MC_HT = (Button)findViewById(R.id.Button_Hitung_JajarGenjang_MC_HT);
		Button_Reset_JajarGenjang_MC_HT = (Button)findViewById(R.id.Button_Reset_JajarGenjang_MC_HT);
		Button_Kembali_JajarGenjang_MC_HT = (Button)findViewById(R.id.Button_Kembali_JajarGenjang_MC_HT);
		Button_Detail_JajarGenjang_MC_HT = (Button)findViewById(R.id.Button_Detail_JajarGenjang_MC_HT);
		Button_Rumus_JG_MC_HT = (Button)findViewById(R.id.Button_Rumus_JG_MC_HT);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_JajarGenjang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {							
				try{
					if(ET_Input_JajarGenjang_Luas_MC_HT.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas (L)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Luas_MC_HT.requestFocus();
					}
					else if(ET_Input_JajarGenjang_Alas_MC_HT.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas (a)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Alas_MC_HT.requestFocus();
					}
					else{	
						double I_Luas_JG_MC_HT = Double.parseDouble(ET_Input_JajarGenjang_Luas_MC_HT.getText().toString());
						double I_Alas_JG_MC_HT = Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_HT.getText().toString());
						double O_Tinggi_JG_MC_HT = I_Luas_JG_MC_HT / I_Alas_JG_MC_HT;
						ET_Output_JajarGenjang_Tinggi_MC_HT.setText(String.valueOf(O_Tinggi_JG_MC_HT));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_JajarGenjang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Luas_MC_HT.setText("");
				ET_Input_JajarGenjang_Alas_MC_HT.setText("");
				ET_Output_JajarGenjang_Tinggi_MC_HT.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_JajarGenjang_Luas_MC_HT.requestFocus();
			}
		});
		
		Button_Rumus_JG_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Luas_MC_HT.setText(" Nilai Luas");
				ET_Input_JajarGenjang_Alas_MC_HT.setText(" Nilai Alas [a]");
				ET_Output_JajarGenjang_Tinggi_MC_HT.setText(" Luas / Alas");
				ET_Input_JajarGenjang_Luas_MC_HT.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_JajarGenjang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_JajarGenjang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HanyaTinggi.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_JajarGenjang_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HanyaTinggi.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
