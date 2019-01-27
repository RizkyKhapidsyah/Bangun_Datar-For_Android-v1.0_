package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_HDV extends Activity {
	ImageView IV_Gambar_LL_MC_HDV;
	EditText ET_Input_LL_Luas_MC_HDV;
	EditText ET_Input_LL_DH_MC_HDV;
	EditText ET_Output_LL_DV_MC_HDV;	
	Button Button_Hitung_LL_MC_HDV;
	Button Button_Reset_LL_MC_HDV;
	Button Button_Kembali_LL_MC_HDV;
	Button Button_Detail_LL_MC_HDV;
	Button Button_Rumus_LL_MC_HDV;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_hdv);
		
		IV_Gambar_LL_MC_HDV = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_HDV);
		ET_Input_LL_Luas_MC_HDV = (EditText)findViewById(R.id.ET_Input_LL_Luas_MC_HDV);
		ET_Input_LL_DH_MC_HDV = (EditText)findViewById(R.id.ET_Input_LL_DH_MC_HDV);
		ET_Output_LL_DV_MC_HDV = (EditText)findViewById(R.id.ET_Output_LL_DV_MC_HDV);
		Button_Hitung_LL_MC_HDV = (Button)findViewById(R.id.Button_Hitung_LL_MC_HDV);
		Button_Reset_LL_MC_HDV = (Button)findViewById(R.id.Button_Reset_LL_MC_HDV);
		Button_Kembali_LL_MC_HDV = (Button)findViewById(R.id.Button_Kembali_LL_MC_HDV);
		Button_Detail_LL_MC_HDV = (Button)findViewById(R.id.Button_Detail_LL_MC_HDV);
		Button_Rumus_LL_MC_HDV = (Button)findViewById(R.id.Button_Rumus_LL_MC_HDV);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_Luas_MC_HDV.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Luas", Toast.LENGTH_LONG).show();
						ET_Input_LL_Luas_MC_HDV.requestFocus();
					}
					else if(ET_Input_LL_DH_MC_HDV.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Horizontal [dh]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HDV.requestFocus();
					}
					else{	
						double I_Luas_LL_MC_HDV = Double.parseDouble(ET_Input_LL_Luas_MC_HDV.getText().toString());
						double I_DH_LL_MC_HDV = Double.parseDouble(ET_Input_LL_DH_MC_HDV.getText().toString());
						double O_DV_LL_MC_HDV = 2 * I_Luas_LL_MC_HDV / I_DH_LL_MC_HDV;
						ET_Output_LL_DV_MC_HDV.setText(String.valueOf(O_DV_LL_MC_HDV));
						}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_Luas_MC_HDV.setText("");
				ET_Input_LL_DH_MC_HDV.setText("");
				ET_Output_LL_DV_MC_HDV.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_Luas_MC_HDV.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_Luas_MC_HDV.setText(" Luas");
				ET_Input_LL_DH_MC_HDV.setText(" Diagonal Horizontal [dh]");
				ET_Output_LL_DV_MC_HDV.setText(" 2 x Luas/dh   (atau)   (√(smb^2-(1/2 x dh^2))) + dva");
				ET_Input_LL_Luas_MC_HDV.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_HDV.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
