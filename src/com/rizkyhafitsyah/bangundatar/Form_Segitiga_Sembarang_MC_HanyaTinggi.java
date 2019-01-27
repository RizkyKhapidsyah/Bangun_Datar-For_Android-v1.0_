package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_Sembarang_MC_HanyaTinggi extends Activity {
	ImageView IV_Gambar_Segitiga_Sembarang_MC_HanyaTinggi;
	EditText ET_Input_S_Sembarang_Luas_MC_HanyaTinggi;
	EditText ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi;
	EditText ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi;
	Button Button_Hitung_S_Sembarang_MC_HanyaTinggi;
	Button Button_Reset_S_Sembarang_MC_HanyaTinggi;
	Button Button_Kembali_S_Sembarang_MC_HanyaTinggi;
	Button Button_Detail_S_Sembarang_MC_HanyaTinggi;
	Button Button_Rumus_SSMb_MC_HT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sembarang_mc_hanyatinggi);
		
		IV_Gambar_Segitiga_Sembarang_MC_HanyaTinggi = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_Sembarang_MC_HanyaTinggi);
		ET_Input_S_Sembarang_Luas_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Input_S_Sembarang_Luas_MC_HanyaTinggi);
		ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi);
		ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi);
		Button_Hitung_S_Sembarang_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Hitung_S_Sembarang_MC_HanyaTinggi);
		Button_Reset_S_Sembarang_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Reset_S_Sembarang_MC_HanyaTinggi);
		Button_Kembali_S_Sembarang_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Kembali_S_Sembarang_MC_HanyaTinggi);
		Button_Detail_S_Sembarang_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Detail_S_Sembarang_MC_HanyaTinggi);
		Button_Rumus_SSMb_MC_HT = (Button)findViewById(R.id.Button_Rumus_SSMb_MC_HT);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_Sembarang_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.requestFocus();
					}
					else if(ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Alas atau Sisi B Segitiga! (Lihat Gambar)", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi.requestFocus();
					}
					else{
						double I_Luas_S_Sembarang_MC_HanyaTinggi = Double.parseDouble(ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.getText().toString());
						double I_AlasAtauSisiB_S_Sembarang_MC_HanyaTinggi = Double.parseDouble(ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi.getText().toString());
						double O_Tinggi_S_Sembarang_MC_HanyaTinggi = (I_Luas_S_Sembarang_MC_HanyaTinggi / I_AlasAtauSisiB_S_Sembarang_MC_HanyaTinggi) * 2;
						ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi.setText(String.valueOf(O_Tinggi_S_Sembarang_MC_HanyaTinggi));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_Sembarang_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.setText("");
				ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi.setText("");
				ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi.setText("");
				ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.requestFocus();
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
		
		Button_Rumus_SSMb_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.setText("Luas");
				ET_Input_S_Sembarang_SisiB_MC_HanyaTinggi.setText("Sisi b (b)");
				ET_Output_S_Sembarang_Tinggi_MC_HanyaTinggi.setText(" L/a x 2  (atau) L/b x 2");
				ET_Input_S_Sembarang_Luas_MC_HanyaTinggi.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_Sembarang_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_Sembarang_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaTinggi.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_Sembarang_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaTinggi.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}

