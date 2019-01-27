package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_Sembarang_MC_HanyaSisi_B extends Activity {
	ImageView IV_Gambar_Segitiga_Sembarang_MC_HS_B;
	EditText ET_Input_S_Sembarang_SisiA_MC_HS_B;
	EditText ET_Input_S_Sembarang_Tinggi_MC_HS_B;
	EditText ET_Output_S_Sembarang_SisiB_MC_HS_B;
	Button Button_Hitung_S_Sembarang_MC_HS_B;
	Button Button_Reset_S_Sembarang_MC_HS_B;
	Button Button_Kembali_S_Sembarang_MC_HS_B;
	Button Button_Detail_S_Sembarang_MC_HS_B;
	Button Button_Rumus_SSMb_MC_HSB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sembarang_mc_hanyasisi_b);
		
		IV_Gambar_Segitiga_Sembarang_MC_HS_B = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_Sembarang_MC_HS_B);
		ET_Input_S_Sembarang_SisiA_MC_HS_B = (EditText)findViewById(R.id.ET_Input_S_Sembarang_SisiA_MC_HS_B);
		ET_Input_S_Sembarang_Tinggi_MC_HS_B = (EditText)findViewById(R.id.ET_Input_S_Sembarang_Tinggi_MC_HS_B);
		ET_Output_S_Sembarang_SisiB_MC_HS_B = (EditText)findViewById(R.id.ET_Output_S_Sembarang_SisiB_MC_HS_B);
		Button_Hitung_S_Sembarang_MC_HS_B = (Button)findViewById(R.id.Button_Hitung_S_Sembarang_MC_HS_B);
		Button_Reset_S_Sembarang_MC_HS_B = (Button)findViewById(R.id.Button_Reset_S_Sembarang_MC_HS_B);
		Button_Kembali_S_Sembarang_MC_HS_B = (Button)findViewById(R.id.Button_Kembali_S_Sembarang_MC_HS_B);
		Button_Detail_S_Sembarang_MC_HS_B = (Button)findViewById(R.id.Button_Detail_S_Sembarang_MC_HS_B);
		Button_Rumus_SSMb_MC_HSB = (Button)findViewById(R.id.Button_Rumus_SSMb_MC_HSB);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_Sembarang_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_Sembarang_SisiA_MC_HS_B.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi A (a) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_SisiA_MC_HS_B.requestFocus();
					}
					else if(ET_Input_S_Sembarang_Tinggi_MC_HS_B.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_Sembarang_Tinggi_MC_HS_B.requestFocus();
					}
					else{
						double I_SisiA_S_Sembarang_MC_HS_B = Double.parseDouble(ET_Input_S_Sembarang_SisiA_MC_HS_B.getText().toString());
						double I_Tinggi_S_Sembarang_MC_HS_B = Double.parseDouble(ET_Input_S_Sembarang_Tinggi_MC_HS_B.getText().toString());
						double O_SisiB_S_Sembarang_MC_HS_B = Math.sqrt(Math.pow(I_SisiA_S_Sembarang_MC_HS_B, 2) - Math.pow(I_Tinggi_S_Sembarang_MC_HS_B, 2));
						ET_Output_S_Sembarang_SisiB_MC_HS_B.setText(String.valueOf(O_SisiB_S_Sembarang_MC_HS_B));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_Sembarang_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_SisiA_MC_HS_B.setText("");
				ET_Input_S_Sembarang_Tinggi_MC_HS_B.setText("");
				ET_Output_S_Sembarang_SisiB_MC_HS_B.setText("");
				ET_Input_S_Sembarang_SisiA_MC_HS_B.requestFocus();
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});

		Button_Rumus_SSMb_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_Sembarang_SisiA_MC_HS_B.setText("Sisi A [a]");
				ET_Input_S_Sembarang_Tinggi_MC_HS_B.setText("Tinggi [t]");
				ET_Output_S_Sembarang_SisiB_MC_HS_B.setText(" √(a^2-b^2)  (atau)  L/t x 2");
				ET_Input_S_Sembarang_SisiA_MC_HS_B.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_Sembarang_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_Sembarang_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaSisi_B.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_Sembarang_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_Sembarang_MC_HanyaSisi_B.this, FormLihatGambarSegitigaSembarang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
