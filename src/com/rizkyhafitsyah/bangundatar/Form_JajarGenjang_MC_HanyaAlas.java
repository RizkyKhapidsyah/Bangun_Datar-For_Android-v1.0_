package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_JajarGenjang_MC_HanyaAlas extends Activity {
	ImageView IV_Gambar_JajarGenjang_MC_HA;
	EditText ET_Input_JajarGenjang_Luas_MC_HA;
	EditText ET_Input_JajarGenjang_Tinggi_MC_HA;
	EditText ET_Output_JajarGenjang_Alas_MC_HA;
	Button Button_Hitung_JajarGenjang_MC_HA;
	Button Button_Reset_JajarGenjang_MC_HA;
	Button Button_Kembali_JajarGenjang_MC_HA;
	Button Button_Detail_JajarGenjang_MC_HA;
	Button Button_Rumus_JG_MC_HA;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_jajargenjang_mc_hanyaalas);
		
		IV_Gambar_JajarGenjang_MC_HA = (ImageView)findViewById(R.id.IV_Gambar_JajarGenjang_MC_HA);
		ET_Input_JajarGenjang_Luas_MC_HA = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Luas_MC_HA);
		ET_Input_JajarGenjang_Tinggi_MC_HA = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Tinggi_MC_HA);
		ET_Output_JajarGenjang_Alas_MC_HA = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Alas_MC_HA);
		Button_Hitung_JajarGenjang_MC_HA = (Button)findViewById(R.id.Button_Hitung_JajarGenjang_MC_HA);
		Button_Reset_JajarGenjang_MC_HA = (Button)findViewById(R.id.Button_Reset_JajarGenjang_MC_HA);
		Button_Kembali_JajarGenjang_MC_HA = (Button)findViewById(R.id.Button_Kembali_JajarGenjang_MC_HA);
		Button_Detail_JajarGenjang_MC_HA = (Button)findViewById(R.id.Button_Detail_JajarGenjang_MC_HA);
		Button_Rumus_JG_MC_HA = (Button)findViewById(R.id.Button_Rumus_JG_MC_HA);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_JajarGenjang_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {							
				try{
					if(ET_Input_JajarGenjang_Luas_MC_HA.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas (L)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Luas_MC_HA.requestFocus();
					}
					else if(ET_Input_JajarGenjang_Tinggi_MC_HA.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Tinggi_MC_HA.requestFocus();
					}
					else{	
						double I_Luas_JG_MC_HA = Double.parseDouble(ET_Input_JajarGenjang_Luas_MC_HA.getText().toString());
						double I_Tinggi_JG_MC_HA = Double.parseDouble(ET_Input_JajarGenjang_Tinggi_MC_HA.getText().toString());
						double O_Alas_JG_MC_HA = I_Luas_JG_MC_HA / I_Tinggi_JG_MC_HA;
						ET_Output_JajarGenjang_Alas_MC_HA.setText(String.valueOf(O_Alas_JG_MC_HA));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_JajarGenjang_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Luas_MC_HA.setText("");
				ET_Input_JajarGenjang_Tinggi_MC_HA.setText("");
				ET_Output_JajarGenjang_Alas_MC_HA.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_JajarGenjang_Luas_MC_HA.requestFocus();
			}
		});
		
		Button_Rumus_JG_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Luas_MC_HA.setText(" Nilai Luas");
				ET_Input_JajarGenjang_Tinggi_MC_HA.setText(" Nilai Tinggi");
				ET_Output_JajarGenjang_Alas_MC_HA.setText(" Luas / Tinggi");				
				ET_Input_JajarGenjang_Luas_MC_HA.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_JajarGenjang_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_JajarGenjang_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HanyaAlas.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_JajarGenjang_MC_HA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HanyaAlas.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
