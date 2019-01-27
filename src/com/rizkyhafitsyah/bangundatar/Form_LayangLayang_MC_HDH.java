package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_HDH extends Activity {
	ImageView IV_Gambar_LL_MC_HDH;
	EditText ET_Input_LL_Luas_MC_HDH;
	EditText ET_Input_LL_DV_MC_HDH;
	EditText ET_Output_LL_DH_MC_HDH;	
	Button Button_Hitung_LL_MC_HDH;
	Button Button_Reset_LL_MC_HDH;
	Button Button_Kembali_LL_MC_HDH;
	Button Button_Detail_LL_MC_HDH;
	Button Button_Rumus_LL_MC_HDH;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_hdh);
		
		IV_Gambar_LL_MC_HDH = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_HDH);
		ET_Input_LL_Luas_MC_HDH = (EditText)findViewById(R.id.ET_Input_LL_Luas_MC_HDH);
		ET_Input_LL_DV_MC_HDH = (EditText)findViewById(R.id.ET_Input_LL_DV_MC_HDH);
		ET_Output_LL_DH_MC_HDH = (EditText)findViewById(R.id.ET_Output_LL_DH_MC_HDH);
		Button_Hitung_LL_MC_HDH = (Button)findViewById(R.id.Button_Hitung_LL_MC_HDH);
		Button_Reset_LL_MC_HDH = (Button)findViewById(R.id.Button_Reset_LL_MC_HDH);
		Button_Kembali_LL_MC_HDH = (Button)findViewById(R.id.Button_Kembali_LL_MC_HDH);
		Button_Detail_LL_MC_HDH = (Button)findViewById(R.id.Button_Detail_LL_MC_HDH);
		Button_Rumus_LL_MC_HDH = (Button)findViewById(R.id.Button_Rumus_LL_MC_HDH);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_Luas_MC_HDH.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Luas", Toast.LENGTH_LONG).show();
						ET_Input_LL_Luas_MC_HDH.requestFocus();
					}
					else if(ET_Input_LL_DV_MC_HDH.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Vertikal [dvb]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DV_MC_HDH.requestFocus();
					}
					else{	
						double I_Luas_LL_MC_HDH = Double.parseDouble(ET_Input_LL_Luas_MC_HDH.getText().toString());
						double I_DV_LL_MC_HDH = Double.parseDouble(ET_Input_LL_DV_MC_HDH.getText().toString());
						double O_DH_LL_MC_HDH = I_Luas_LL_MC_HDH * 2 / I_DV_LL_MC_HDH;
						ET_Output_LL_DH_MC_HDH.setText(String.valueOf(O_DH_LL_MC_HDH));
						}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_Luas_MC_HDH.setText("");
				ET_Input_LL_DV_MC_HDH.setText("");
				ET_Output_LL_DH_MC_HDH.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_Luas_MC_HDH.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_Luas_MC_HDH.setText(" Luas");
				ET_Input_LL_DV_MC_HDH.setText(" Diagonal Vertikal");
				ET_Output_LL_DH_MC_HDH.setText(" (2 x L)/dv");
				ET_Input_LL_Luas_MC_HDH.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDH.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_HDH.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDH.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
