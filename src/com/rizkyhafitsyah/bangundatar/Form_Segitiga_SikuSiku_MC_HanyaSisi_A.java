package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_SikuSiku_MC_HanyaSisi_A extends Activity {
	ImageView IV_Gambar_Segitiga_SikuSiku_MC_HS_A;
	EditText ET_Input_S_SikuSiku_SisiMiring_MC_HS_A;
	EditText ET_Input_S_SikuSiku_SisiB_MC_HS_A;
	EditText ET_Output_S_SikuSiku_SisiA_MC_HS_A;
	Button Button_Hitung_S_SikuSiku_MC_HS_A;
	Button Button_Reset_S_SikuSiku_MC_HS_A;
	Button Button_Kembali_S_SikuSiku_MC_HS_A;
	Button Button_Detail_S_SikuSiku_MC_HS_A;
	Button Button_Rumus_SSS_MC_SA;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sikusiku_mc_hanyasisi_a);
		
		IV_Gambar_Segitiga_SikuSiku_MC_HS_A = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_SikuSiku_MC_HS_A);
		ET_Input_S_SikuSiku_SisiMiring_MC_HS_A = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiMiring_MC_HS_A);
		ET_Input_S_SikuSiku_SisiB_MC_HS_A = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiB_MC_HS_A);
		ET_Output_S_SikuSiku_SisiA_MC_HS_A = (EditText)findViewById(R.id.ET_Output_S_SikuSiku_SisiA_MC_HS_A);
		Button_Hitung_S_SikuSiku_MC_HS_A = (Button)findViewById(R.id.Button_Hitung_S_SikuSiku_MC_HS_A);
		Button_Reset_S_SikuSiku_MC_HS_A = (Button)findViewById(R.id.Button_Reset_S_SikuSiku_MC_HS_A);
		Button_Kembali_S_SikuSiku_MC_HS_A = (Button)findViewById(R.id.Button_Kembali_S_SikuSiku_MC_HS_A);
		Button_Detail_S_SikuSiku_MC_HS_A = (Button)findViewById(R.id.Button_Detail_S_SikuSiku_MC_HS_A);
		Button_Rumus_SSS_MC_SA = (Button)findViewById(R.id.Button_Rumus_SSS_MC_SA);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SikuSiku_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Miring (sm) Segitiga! Lihat Gambar.", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.requestFocus();
					}
					else if(ET_Input_S_SikuSiku_SisiB_MC_HS_A.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas atau Sisi B (b) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiB_MC_HS_A.requestFocus();
					}					
					else{
						double I_SisiMiring_S_SikuSiku_MC_HS_A = Double.parseDouble(ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.getText().toString());
						double I_AlasAtauSisiB_S_SikuSiku_MC_HS_A = Double.parseDouble(ET_Input_S_SikuSiku_SisiB_MC_HS_A.getText().toString());
						double O_SisiA_S_SikuSiku_MC_HS_A = Math.sqrt(Math.pow(I_SisiMiring_S_SikuSiku_MC_HS_A, 2) - Math.pow(I_AlasAtauSisiB_S_SikuSiku_MC_HS_A, 2)); 
						ET_Output_S_SikuSiku_SisiA_MC_HS_A.setText(String.valueOf(O_SisiA_S_SikuSiku_MC_HS_A));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SikuSiku_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.setText("");
				ET_Input_S_SikuSiku_SisiB_MC_HS_A.setText("");
				ET_Output_S_SikuSiku_SisiA_MC_HS_A.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.requestFocus();
			}
		});

		Button_Rumus_SSS_MC_SA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.setText("Sisi Miring [sm]");
				ET_Input_S_SikuSiku_SisiB_MC_HS_A.setText("Sisi b ");
				ET_Output_S_SikuSiku_SisiA_MC_HS_A.setText(" √(sm^2 - b^2)");
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_A.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SikuSiku_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SikuSiku_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_A.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_SikuSiku_MC_HS_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_A.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
