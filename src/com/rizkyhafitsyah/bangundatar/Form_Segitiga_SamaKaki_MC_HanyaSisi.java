package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_Segitiga_SamaKaki_MC_HanyaSisi extends Activity {
	EditText ET_Input_S_SamaKaki_Alas_MC_HanyaSisi;
	EditText ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi;
	EditText ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi;
	Button Button_Hitung_S_SamaKaki_MC_HanyaSisi;
	Button Button_Reset_S_SamaKaki_MC_HanyaSisi;
	Button Button_Kembali_S_SamaKaki_MC_HanyaSisi;
	Button Button_Detail_S_SamaKaki_MC_HanyaSisi;
	Button Button_Rumus_SSK_MC_HS;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_samakaki_mc_hanyasisi);
		
		ET_Input_S_SamaKaki_Alas_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Alas_MC_HanyaSisi);
		ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi);
		ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi);
		Button_Hitung_S_SamaKaki_MC_HanyaSisi = (Button)findViewById(R.id.Button_Hitung_S_SamaKaki_MC_HanyaSisi);
		Button_Reset_S_SamaKaki_MC_HanyaSisi = (Button)findViewById(R.id.Button_Reset_S_SamaKaki_MC_HanyaSisi);
		Button_Kembali_S_SamaKaki_MC_HanyaSisi = (Button)findViewById(R.id.Button_Kembali_S_SamaKaki_MC_HanyaSisi);
		Button_Detail_S_SamaKaki_MC_HanyaSisi = (Button)findViewById(R.id.Button_Detail_S_SamaKaki_MC_HanyaSisi);
		Button_Rumus_SSK_MC_HS = (Button)findViewById(R.id.Button_Rumus_SSK_MC_HS);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SamaKaki_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SamaKaki_Alas_MC_HanyaSisi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Alas_MC_HanyaSisi.requestFocus();
					}
					else if(ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi.requestFocus();
					}
					else{
						double Alas_S_SamaKaki_MC_HanyaSisi = Double.parseDouble(ET_Input_S_SamaKaki_Alas_MC_HanyaSisi.getText().toString());
						double Tinggi_S_SamaKaki_MC_HanyaSisi = Double.parseDouble(ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi.getText().toString());
						double Sisi_S_SamaKaki_MC_HanyaSisi = Math.sqrt(Math.pow((0.5 * Alas_S_SamaKaki_MC_HanyaSisi), 2) + Math.pow(Tinggi_S_SamaKaki_MC_HanyaSisi, 2));						
						ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi.setText(String.valueOf(Sisi_S_SamaKaki_MC_HanyaSisi));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SamaKaki_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Alas_MC_HanyaSisi.setText("");
				ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi.setText("");
				ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
		
		Button_Rumus_SSK_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SamaKaki_Alas_MC_HanyaSisi.setText("Nilai Alas [a]");
				ET_Input_S_SamaKaki_Tinggi_MC_HanyaSisi.setText("Nilai Tinggi [t]");
				ET_Output_S_SamaKaki_Sisi_MC_HanyaSisi.setText(" √((½ x a)^2 + t^2)");				
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SamaKaki_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SamaKaki_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SamaKaki_MC_HanyaSisi.this, FormLihatGambarSegitigaSamaKaki.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
	}
}
