package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_JajarGenjang_MC_HLK extends Activity {
	ImageView IV_Gambar_JajarGenjang_MC_HLK;
	EditText ET_Input_JajarGenjang_Alas_MC_HLK;
	EditText ET_Input_JajarGenjang_Tinggi_MC_HLK;
	EditText ET_Input_JajarGenjang_SM_MC_HLK;
	EditText ET_Output_JajarGenjang_Luas_MC_HLK;
	EditText ET_Output_JajarGenjang_Keliling_MC_HLK;
	Button Button_Hitung_JajarGenjang_MC_HLK;
	Button Button_Reset_JajarGenjang_MC_HLK;
	Button Button_Detail_JajarGenjang_MC_HLK;
	Button Button_Kembali_JajarGenjang_MC_HLK;
	Button Button_Rumus_JG_MC_HLK;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_jajargenjang_mc_hlk);
		
		IV_Gambar_JajarGenjang_MC_HLK = (ImageView)findViewById(R.id.IV_Gambar_JajarGenjang_MC_HLK);
		ET_Input_JajarGenjang_Alas_MC_HLK = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Alas_MC_HLK);
		ET_Input_JajarGenjang_Tinggi_MC_HLK = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Tinggi_MC_HLK);
		ET_Input_JajarGenjang_SM_MC_HLK = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SM_MC_HLK);
		ET_Output_JajarGenjang_Luas_MC_HLK = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Luas_MC_HLK);
		ET_Output_JajarGenjang_Keliling_MC_HLK = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Keliling_MC_HLK);
		Button_Hitung_JajarGenjang_MC_HLK = (Button)findViewById(R.id.Button_Hitung_JajarGenjang_MC_HLK);
		Button_Reset_JajarGenjang_MC_HLK = (Button)findViewById(R.id.Button_Reset_JajarGenjang_MC_HLK);
		Button_Detail_JajarGenjang_MC_HLK = (Button)findViewById(R.id.Button_Detail_JajarGenjang_MC_HLK);
		Button_Kembali_JajarGenjang_MC_HLK = (Button)findViewById(R.id.Button_Kembali_JajarGenjang_MC_HLK);
		Button_Rumus_JG_MC_HLK = (Button)findViewById(R.id.Button_Rumus_JG_MC_HLK);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_JajarGenjang_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {							
				try{
					if(ET_Input_JajarGenjang_Alas_MC_HLK.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas (a)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Alas_MC_HLK.requestFocus();
					}
					else if(ET_Input_JajarGenjang_Tinggi_MC_HLK.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Tinggi_MC_HLK.requestFocus();
					}
					else if(ET_Input_JajarGenjang_SM_MC_HLK.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Miring (sm)!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SM_MC_HLK.requestFocus();
					}					
					else{	
						double I_Alas_JG_MC_HLK = Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_HLK.getText().toString());
						double I_Tinggi_JG_MC_HLK = Double.parseDouble(ET_Input_JajarGenjang_Tinggi_MC_HLK.getText().toString());
						double I_SM_JG_MC_HLK = Double.parseDouble(ET_Input_JajarGenjang_SM_MC_HLK.getText().toString());
						double O_Luas_JG_MC_HLK = I_Alas_JG_MC_HLK * I_Tinggi_JG_MC_HLK;
						double O_Keliling_JG_MC_HLK = 2 * I_Alas_JG_MC_HLK + 2 * I_SM_JG_MC_HLK;
						
						ET_Output_JajarGenjang_Luas_MC_HLK.setText(String.valueOf(O_Luas_JG_MC_HLK));
						ET_Output_JajarGenjang_Keliling_MC_HLK.setText(String.valueOf(O_Keliling_JG_MC_HLK));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_JajarGenjang_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Alas_MC_HLK.setText("");
				ET_Input_JajarGenjang_Tinggi_MC_HLK.setText("");
				ET_Input_JajarGenjang_SM_MC_HLK.setText("");
				ET_Output_JajarGenjang_Luas_MC_HLK.setText("");
				ET_Output_JajarGenjang_Keliling_MC_HLK.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_JajarGenjang_Alas_MC_HLK.requestFocus();
			}
		});

		Button_Rumus_JG_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Alas_MC_HLK.setText(" Alas [a]");
				ET_Input_JajarGenjang_Tinggi_MC_HLK.setText(" Tinggi [t]");
				ET_Input_JajarGenjang_SM_MC_HLK.setText(" Sisi Miring [sm]");
				ET_Output_JajarGenjang_Luas_MC_HLK.setText(" a x t   (atau)   Alas x Tinggi");
				ET_Output_JajarGenjang_Keliling_MC_HLK.setText(" 2 x a + 2 x sm");
				ET_Input_JajarGenjang_Alas_MC_HLK.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_JajarGenjang_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_JajarGenjang_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HLK.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_JajarGenjang_MC_HLK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HLK.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
