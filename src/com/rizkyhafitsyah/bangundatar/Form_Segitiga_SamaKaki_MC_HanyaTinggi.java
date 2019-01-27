package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_Segitiga_SamaKaki_MC_HanyaTinggi extends Activity {
	EditText ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi;
	EditText ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi;
	EditText ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi;
	Button Button_Hitung_S_SamaKaki_MC_HanyaTinggi;
	Button Button_Reset_S_SamaKaki_MC_HanyaTinggi;
	Button Button_Kembali_S_SamaKaki_MC_HanyaTinggi;
	Button Button_Detail_S_SamaKaki_MC_HanyaTinggi;
	Button Button_Rumus_SSK_MC_HT;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_samakaki_mc_hanyatinggi);
		
		ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi);
		ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi);
		ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi);
		Button_Hitung_S_SamaKaki_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Hitung_S_SamaKaki_MC_HanyaTinggi);
		Button_Reset_S_SamaKaki_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Reset_S_SamaKaki_MC_HanyaTinggi);
		Button_Kembali_S_SamaKaki_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Kembali_S_SamaKaki_MC_HanyaTinggi);
		Button_Detail_S_SamaKaki_MC_HanyaTinggi = (Button)findViewById(R.id.Button_Detail_S_SamaKaki_MC_HanyaTinggi);
		Button_Rumus_SSK_MC_HT = (Button)findViewById(R.id.Button_Rumus_SSK_MC_HT);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SamaKaki_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.requestFocus();
					}
					else if(ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi.requestFocus();
					}
					else{
						double I_Luas_S_SamaKaki_MC_HanyaTinggi = Double.parseDouble(ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.getText().toString());
						double I_Alas_S_SamaKaki_MC_HanyaTinggi = Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi.getText().toString());
						double O_Tinggi_S_SamaKaki_MC_HanyaSisi = (I_Luas_S_SamaKaki_MC_HanyaTinggi / I_Alas_S_SamaKaki_MC_HanyaTinggi) * 2;						
						ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi.setText(String.valueOf(O_Tinggi_S_SamaKaki_MC_HanyaSisi));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SamaKaki_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.setText("");
				ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi.setText("");
				ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});

		Button_Rumus_SSK_MC_HT.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.setText("Nilai Luas");
				ET_Input_S_SamaKaki_Alas_MC_HanyaTinggi.setText("Nilai Alas [a]");
				ET_Output_S_SamaKaki_Tinggi_MC_HanyaTinggi.setText(" L/a x 2");
				ET_Input_S_SamaKaki_Luas_MC_HanyaTinggi.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SamaKaki_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SamaKaki_MC_HanyaTinggi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SamaKaki_MC_HanyaTinggi.this, FormLihatGambarSegitigaSamaKaki.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
	}
}
