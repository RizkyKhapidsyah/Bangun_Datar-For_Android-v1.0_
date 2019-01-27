package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_SikuSiku_MC_HanyaSisi_Miring extends Activity {
	ImageView IV_Gambar_Segitiga_SikuSiku_MC_HS_SM;
	EditText ET_Input_S_SikuSiku_SisiA_MC_HS_SM;
	EditText ET_Input_S_SikuSiku_SisiB_MC_HS_SM;
	EditText ET_Output_S_SikuSiku_SM_MC_HS_SM;
	Button Button_Hitung_S_SikuSiku_MC_HS_SM;
	Button Button_Reset_S_SikuSiku_MC_HS_SM;
	Button Button_Kembali_S_SikuSiku_MC_HS_SM;
	Button Button_Detail_S_SikuSiku_MC_HS_SM;
	Button Button_Rumus_SSS_MC_SM;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sikusiku_mc_hanyasisi_miring);
		
		IV_Gambar_Segitiga_SikuSiku_MC_HS_SM = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_SikuSiku_MC_HS_SM);
		ET_Input_S_SikuSiku_SisiA_MC_HS_SM = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiA_MC_HS_SM);
		ET_Input_S_SikuSiku_SisiB_MC_HS_SM = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiB_MC_HS_SM);
		ET_Output_S_SikuSiku_SM_MC_HS_SM = (EditText)findViewById(R.id.ET_Output_S_SikuSiku_SM_MC_HS_SM);
		Button_Hitung_S_SikuSiku_MC_HS_SM = (Button)findViewById(R.id.Button_Hitung_S_SikuSiku_MC_HS_SM);
		Button_Reset_S_SikuSiku_MC_HS_SM = (Button)findViewById(R.id.Button_Reset_S_SikuSiku_MC_HS_SM);
		Button_Kembali_S_SikuSiku_MC_HS_SM = (Button)findViewById(R.id.Button_Kembali_S_SikuSiku_MC_HS_SM);
		Button_Detail_S_SikuSiku_MC_HS_SM = (Button)findViewById(R.id.Button_Detail_S_SikuSiku_MC_HS_SM);
		Button_Rumus_SSS_MC_SM = (Button)findViewById(R.id.Button_Rumus_SSS_MC_SM);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SikuSiku_MC_HS_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SikuSiku_SisiA_MC_HS_SM.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi A (a) Segitiga! Lihat Gambar.", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiA_MC_HS_SM.requestFocus();
					}
					else if(ET_Input_S_SikuSiku_SisiB_MC_HS_SM.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi B (b) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiB_MC_HS_SM.requestFocus();
					}					
					else{
						double I_SisiA_S_SikuSiku_MC_HS_SM = Double.parseDouble(ET_Input_S_SikuSiku_SisiA_MC_HS_SM.getText().toString());
						double I_SisiB_S_SikuSiku_MC_HS_SM = Double.parseDouble(ET_Input_S_SikuSiku_SisiB_MC_HS_SM.getText().toString());
						double O_SisiMiring_S_SikuSiku_MC_HS_SM = Math.sqrt(Math.pow(I_SisiA_S_SikuSiku_MC_HS_SM, 2) + Math.pow(I_SisiB_S_SikuSiku_MC_HS_SM, 2)); 
						ET_Output_S_SikuSiku_SM_MC_HS_SM.setText(String.valueOf(O_SisiMiring_S_SikuSiku_MC_HS_SM));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SikuSiku_MC_HS_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiA_MC_HS_SM.setText("");
				ET_Input_S_SikuSiku_SisiB_MC_HS_SM.setText("");
				ET_Output_S_SikuSiku_SM_MC_HS_SM.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_S_SikuSiku_SisiA_MC_HS_SM.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SikuSiku_MC_HS_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SikuSiku_MC_HS_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_Miring.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_SikuSiku_MC_HS_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_Miring.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});	

		Button_Rumus_SSS_MC_SM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiA_MC_HS_SM.setText("Sisi A");
				ET_Input_S_SikuSiku_SisiB_MC_HS_SM.setText("Sisi B");
				ET_Output_S_SikuSiku_SM_MC_HS_SM.setText(" √(a^2+b^2)");
				ET_Input_S_SikuSiku_SisiA_MC_HS_SM.requestFocus();
			}
		});		
	}
}
