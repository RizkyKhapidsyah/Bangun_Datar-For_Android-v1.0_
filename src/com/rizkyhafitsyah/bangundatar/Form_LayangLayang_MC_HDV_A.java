package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_HDV_A extends Activity {
	ImageView IV_Gambar_LL_MC_HDV_A;
	EditText ET_Input_LL_DH_MC_HDV_A;
	EditText ET_Input_LL_SMA_MC_HDV_A;
	EditText ET_Output_LL_DVA_MC_HDV_A;	
	Button Button_Hitung_LL_MC_HDV_A;
	Button Button_Reset_LL_MC_HDV_A;
	Button Button_Kembali_LL_MC_HDV_A;
	Button Button_Detail_LL_MC_HDV_A;
	Button Button_Rumus_LL_MC_HDV_A;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_hdv_a);
		
		IV_Gambar_LL_MC_HDV_A = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_HDV_A);
		ET_Input_LL_DH_MC_HDV_A = (EditText)findViewById(R.id.ET_Input_LL_DH_MC_HDV_A);
		ET_Input_LL_SMA_MC_HDV_A = (EditText)findViewById(R.id.ET_Input_LL_SMA_MC_HDV_A);
		ET_Output_LL_DVA_MC_HDV_A = (EditText)findViewById(R.id.ET_Output_LL_DVA_MC_HDV_A);
		Button_Hitung_LL_MC_HDV_A = (Button)findViewById(R.id.Button_Hitung_LL_MC_HDV_A);
		Button_Reset_LL_MC_HDV_A = (Button)findViewById(R.id.Button_Reset_LL_MC_HDV_A);
		Button_Kembali_LL_MC_HDV_A = (Button)findViewById(R.id.Button_Kembali_LL_MC_HDV_A);
		Button_Detail_LL_MC_HDV_A = (Button)findViewById(R.id.Button_Detail_LL_MC_HDV_A);
		Button_Rumus_LL_MC_HDV_A = (Button)findViewById(R.id.Button_Rumus_LL_MC_HDV_A);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_DH_MC_HDV_A.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Horizontal [dh]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HDV_A.requestFocus();
					}
					else if(ET_Input_LL_SMA_MC_HDV_A.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Sisi Miring bagian Atas layang layang [sma]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_SMA_MC_HDV_A.requestFocus();
					}
					else{	
						double I_DH_LL_MC_HDV_A = Double.parseDouble(ET_Input_LL_DH_MC_HDV_A.getText().toString());
						double I_SMA_LL_MC_HDV_A = Double.parseDouble(ET_Input_LL_SMA_MC_HDV_A.getText().toString());
						double Setengah_DH_LL_MC_HDV_A = I_DH_LL_MC_HDV_A / 2;
						double O_DVA_LL_MC_HDV_A = Math.sqrt(Math.pow(I_SMA_LL_MC_HDV_A, 2) - Math.pow(Setengah_DH_LL_MC_HDV_A, 2));
						ET_Output_LL_DVA_MC_HDV_A.setText(String.valueOf(O_DVA_LL_MC_HDV_A));
						}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HDV_A.setText("");
				ET_Input_LL_SMA_MC_HDV_A.setText("");
				ET_Output_LL_DVA_MC_HDV_A.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_DH_MC_HDV_A.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HDV_A.setText(" Diagonal Horizontal [dh]");
				ET_Input_LL_SMA_MC_HDV_A.setText(" Sisi Miring Atas [sma]");
				ET_Output_LL_DVA_MC_HDV_A.setText(" √(sma^2 - (1/2  x dh)^2)");
				ET_Input_LL_DH_MC_HDV_A.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV_A.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_HDV_A.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HDV_A.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
