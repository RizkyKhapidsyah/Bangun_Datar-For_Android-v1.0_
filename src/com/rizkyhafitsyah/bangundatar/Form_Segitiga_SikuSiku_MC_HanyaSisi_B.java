package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Segitiga_SikuSiku_MC_HanyaSisi_B extends Activity {
	ImageView IV_Gambar_Segitiga_SikuSiku_MC_HS_B;
	EditText ET_Input_S_SikuSiku_SisiMiring_MC_HS_B;
	EditText ET_Input_S_SikuSiku_SisiA_MC_HS_B;
	EditText ET_Output_S_SikuSiku_SisiB_MC_HS_B;
	Button Button_Hitung_S_SikuSiku_MC_HS_B;
	Button Button_Reset_S_SikuSiku_MC_HS_B;
	Button Button_Kembali_S_SikuSiku_MC_HS_B;
	Button Button_Detail_S_SikuSiku_MC_HS_B;
	Button Button_Rumus_SSS_MC_SB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segitiga_sikusiku_mc_hanyasisi_b);
		
		IV_Gambar_Segitiga_SikuSiku_MC_HS_B = (ImageView)findViewById(R.id.IV_Gambar_Segitiga_SikuSiku_MC_HS_B);
		ET_Input_S_SikuSiku_SisiMiring_MC_HS_B = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiMiring_MC_HS_B);
		ET_Input_S_SikuSiku_SisiA_MC_HS_B = (EditText)findViewById(R.id.ET_Input_S_SikuSiku_SisiA_MC_HS_B);
		ET_Output_S_SikuSiku_SisiB_MC_HS_B = (EditText)findViewById(R.id.ET_Output_S_SikuSiku_SisiB_MC_HS_B);
		Button_Hitung_S_SikuSiku_MC_HS_B = (Button)findViewById(R.id.Button_Hitung_S_SikuSiku_MC_HS_B);
		Button_Reset_S_SikuSiku_MC_HS_B = (Button)findViewById(R.id.Button_Reset_S_SikuSiku_MC_HS_B);
		Button_Kembali_S_SikuSiku_MC_HS_B = (Button)findViewById(R.id.Button_Kembali_S_SikuSiku_MC_HS_B);
		Button_Detail_S_SikuSiku_MC_HS_B = (Button)findViewById(R.id.Button_Detail_S_SikuSiku_MC_HS_B);
		Button_Rumus_SSS_MC_SB = (Button)findViewById(R.id.Button_Rumus_SSS_MC_SB);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_S_SikuSiku_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Miring (sm) Segitiga! Lihat Gambar.", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.requestFocus();
					}
					else if(ET_Input_S_SikuSiku_SisiA_MC_HS_B.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi A (a) Segitiga!", Toast.LENGTH_LONG).show();
						ET_Input_S_SikuSiku_SisiA_MC_HS_B.requestFocus();
					}					
					else{
						double I_SisiMiring_S_SikuSiku_MC_HS_B = Double.parseDouble(ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.getText().toString());
						double I_AlasAtauSisiB_S_SikuSiku_MC_HS_B = Double.parseDouble(ET_Input_S_SikuSiku_SisiA_MC_HS_B.getText().toString());
						double O_SisiB_S_SikuSiku_MC_HS_B = Math.sqrt(Math.pow(I_SisiMiring_S_SikuSiku_MC_HS_B, 2) - Math.pow(I_AlasAtauSisiB_S_SikuSiku_MC_HS_B, 2)); 
						ET_Output_S_SikuSiku_SisiB_MC_HS_B.setText(String.valueOf(O_SisiB_S_SikuSiku_MC_HS_B));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_S_SikuSiku_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.setText("");
				ET_Input_S_SikuSiku_SisiA_MC_HS_B.setText("");
				ET_Output_S_SikuSiku_SisiB_MC_HS_B.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.requestFocus();
			}
		});

		Button_Rumus_SSS_MC_SB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.setText("Sisi Miring [sm]");
				ET_Input_S_SikuSiku_SisiA_MC_HS_B.setText("Sisi A");
				ET_Output_S_SikuSiku_SisiB_MC_HS_B.setText(" √(sm^2 - a^2)");
				ET_Input_S_SikuSiku_SisiMiring_MC_HS_B.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_S_SikuSiku_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_S_SikuSiku_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_B.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Segitiga_SikuSiku_MC_HS_B.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segitiga_SikuSiku_MC_HanyaSisi_B.this, FormLihatGambarSegitigaSikuSiku.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
