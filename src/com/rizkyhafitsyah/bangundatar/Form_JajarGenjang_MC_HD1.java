package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_JajarGenjang_MC_HD1 extends Activity {
	ImageView IV_Gambar_JajarGenjang_MC_HD1;
	EditText ET_Input_JajarGenjang_Tinggi_MC_HD1;
	EditText ET_Input_JajarGenjang_SDA_MC_HD1;
	EditText ET_Input_JajarGenjang_SDB_MC_HD1;
	EditText ET_Output_JajarGenjang_D1_MC_HD1;
	Button Button_Hitung_JajarGenjang_MC_HD1;
	Button Button_Reset_JajarGenjang_MC_HD1;
	Button Button_Kembali_JajarGenjang_MC_HD1;
	Button Button_Detail_JajarGenjang_MC_HD1;
	Button Button_Rumus_JG_MC_HD1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_jajargenjang_mc_hd1);
		
		IV_Gambar_JajarGenjang_MC_HD1 = (ImageView)findViewById(R.id.IV_Gambar_JajarGenjang_MC_HD1);
		ET_Input_JajarGenjang_Tinggi_MC_HD1 = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Tinggi_MC_HD1);
		ET_Input_JajarGenjang_SDA_MC_HD1 = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SDA_MC_HD1);
		ET_Input_JajarGenjang_SDB_MC_HD1 = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SDB_MC_HD1);
		ET_Output_JajarGenjang_D1_MC_HD1 = (EditText)findViewById(R.id.ET_Output_JajarGenjang_D1_MC_HD1);
		Button_Hitung_JajarGenjang_MC_HD1 = (Button)findViewById(R.id.Button_Hitung_JajarGenjang_MC_HD1);
		Button_Reset_JajarGenjang_MC_HD1 = (Button)findViewById(R.id.Button_Reset_JajarGenjang_MC_HD1);
		Button_Kembali_JajarGenjang_MC_HD1 = (Button)findViewById(R.id.Button_Kembali_JajarGenjang_MC_HD1);
		Button_Detail_JajarGenjang_MC_HD1 = (Button)findViewById(R.id.Button_Detail_JajarGenjang_MC_HD1);
		Button_Rumus_JG_MC_HD1 = (Button)findViewById(R.id.Button_Rumus_JG_MC_HD1);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_JajarGenjang_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {							
				try{
					if(ET_Input_JajarGenjang_Tinggi_MC_HD1.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Tinggi_MC_HD1.requestFocus();
					}
					else if(ET_Input_JajarGenjang_SDA_MC_HD1.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Dalam Bagian Atas (sda). Lihat Gambar", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_SDA_MC_HD1.requestFocus();
					}
					else if(ET_Input_JajarGenjang_SDB_MC_HD1.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Dalam Bagian Bawah (sdb). Lihat Gambar", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SDB_MC_HD1.requestFocus();
					}					
					else{	
						double I_Tinggi_JG_MC_HD1 = Double.parseDouble(ET_Input_JajarGenjang_Tinggi_MC_HD1.getText().toString());
						double I_SDA_JG_MC_HD1 = Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_HD1.getText().toString());
						double I_SDB_JG_MC_HD1 = Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_HD1.getText().toString());
						double O_Diagonal1_JG_MC_HD1 = Math.sqrt(Math.pow((I_SDA_JG_MC_HD1 + I_SDB_JG_MC_HD1), 2) + Math.pow(I_Tinggi_JG_MC_HD1, 2));
						ET_Output_JajarGenjang_D1_MC_HD1.setText(String.valueOf(O_Diagonal1_JG_MC_HD1));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_JajarGenjang_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Tinggi_MC_HD1.setText("");
				ET_Input_JajarGenjang_SDA_MC_HD1.setText("");
				ET_Input_JajarGenjang_SDB_MC_HD1.setText("");
				ET_Output_JajarGenjang_D1_MC_HD1.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_JajarGenjang_Tinggi_MC_HD1.requestFocus();
			}
		});
		
		Button_Rumus_JG_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Tinggi_MC_HD1.setText(" Nilai Tinggi [t]");
				ET_Input_JajarGenjang_SDA_MC_HD1.setText(" Sisi Dalam Bagian Atas [sda]");
				ET_Input_JajarGenjang_SDB_MC_HD1.setText(" Sisi Dalam Bagian Bawah [sdb]");
				ET_Output_JajarGenjang_D1_MC_HD1.setText(" √((sda+sdb)^2+t^2 )");
				ET_Input_JajarGenjang_Tinggi_MC_HD1.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_JajarGenjang_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_JajarGenjang_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HD1.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_JajarGenjang_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_HD1.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
