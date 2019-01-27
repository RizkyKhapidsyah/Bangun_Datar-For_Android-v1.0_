package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_Sembarang_MC_HanyaSisi_A extends Activity {
	ImageView IV_Gambar_Segitiga_Sembarang_MC_HS_A;
	EditText ET_Input_S_Sembarang_SisiB_MC_HS_A;
	EditText ET_Input_S_Sembarang_Tinggi_MC_HS_A;
	EditText ET_Output_S_Sembarang_SisiA_MC_HS_A;
	Button Button_Hitung_S_Sembarang_MC_HS_A;
	Button Button_Reset_S_Sembarang_MC_HS_A;
	Button Button_Kembali_S_Sembarang_MC_HS_A;
	Button Button_Detail_S_Sembarang_MC_HS_A;
	Button Button_Rumus_SSMb_MC_HSA;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sembarang_mc_hanyasisi_a);
		
		IV_Gambar_Segitiga_Sembarang_MC_HS_A = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_Sembarang_MC_HS_A);
		ET_Input_S_Sembarang_SisiB_MC_HS_A = (EditText)findViewById(R.id.ET_Input_S_Sembarang_SisiB_MC_HS_A);
		ET_Input_S_Sembarang_Tinggi_MC_HS_A = (EditText)findViewById(R.id.ET_Input_S_Sembarang_Tinggi_MC_HS_A);
		ET_Output_S_Sembarang_SisiA_MC_HS_A = (EditText)findViewById(R.id.ET_Output_S_Sembarang_SisiA_MC_HS_A);
		Button_Hitung_S_Sembarang_MC_HS_A = (Button)findViewById(R.id.Button_Hitung_S_Sembarang_MC_HS_A);
		Button_Reset_S_Sembarang_MC_HS_A = (Button)findViewById(R.id.Button_Reset_S_Sembarang_MC_HS_A);
		Button_Kembali_S_Sembarang_MC_HS_A = (Button)findViewById(R.id.Button_Kembali_S_Sembarang_MC_HS_A);
		Button_Detail_S_Sembarang_MC_HS_A = (Button)findViewById(R.id.Button_Detail_S_Sembarang_MC_HS_A);
		Button_Rumus_SSMb_MC_HSA = (Button)findViewById(R.id.Button_Rumus_SSMb_MC_HSA);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_Sembarang_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_Sembarang_SisiB_MC_HS_A.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi B (b) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_SisiB_MC_HS_A.requestFocus();
					}
					else if(ET_Input_S_Sembarang_Tinggi_MC_HS_A.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_Tinggi_MC_HS_A.requestFocus();
					}
					else{
						double I_SisiB_S_Sembarang_MC_HS_A = Double.parseDouble(ET_Input_S_Sembarang_SisiB_MC_HS_A.getText().toString());
						double I_Tinggi_S_Sembarang_MC_HS_A = Double.parseDouble(ET_Input_S_Sembarang_Tinggi_MC_HS_A.getText().toString());
						double O_SisiA_S_Sembarang_MC_HS_A = Math.sqrt(Math.pow(I_SisiB_S_Sembarang_MC_HS_A, 2) + Math.pow(I_Tinggi_S_Sembarang_MC_HS_A, 2));
						ET_Output_S_Sembarang_SisiA_MC_HS_A.setText(String.valueOf(O_SisiA_S_Sembarang_MC_HS_A));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_Sembarang_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_SisiB_MC_HS_A.setText("");
				ET_Input_S_Sembarang_Tinggi_MC_HS_A.setText("");
				ET_Output_S_Sembarang_SisiA_MC_HS_A.setText("");
				ET_Input_S_Sembarang_SisiB_MC_HS_A.requestFocus();
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});

		Button_Rumus_SSMb_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_SisiB_MC_HS_A.setText("Sisi B [b]");
				ET_Input_S_Sembarang_Tinggi_MC_HS_A.setText("Tinggi [t]");
				ET_Output_S_Sembarang_SisiA_MC_HS_A.setText(" √(b^2-t^2)");
				ET_Input_S_Sembarang_SisiB_MC_HS_A.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_Sembarang_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_Sembarang_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaSisi_A.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_Sembarang_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaSisi_A.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
