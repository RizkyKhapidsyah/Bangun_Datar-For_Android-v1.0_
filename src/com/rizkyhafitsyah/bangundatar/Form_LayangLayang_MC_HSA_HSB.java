package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_HSA_HSB extends Activity {
	ImageView IV_Gambar_LL_MC_HSA_HSB;
	EditText ET_Input_LL_DH_MC_HSA_HSB;
	EditText ET_Input_LL_DVA_MC_HSA_HSB;
	EditText ET_Input_LL_DVB_MC_HSA_HSB;	
	EditText ET_Output_LL_SMA_MC_HSA_HSB;
	EditText ET_Output_LL_SMB_MC_HSA_HSB;
	Button Button_Hitung_LL_MC_HSA_HSB;
	Button Button_Reset_LL_MC_HSA_HSB;
	Button Button_Kembali_LL_MC_HSA_HSB;
	Button Button_Detail_LL_MC_HSA_HSB;
	Button Button_Rumus_LL_MC_HSA_HSB;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_hsa_hsb);
		
		IV_Gambar_LL_MC_HSA_HSB = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_HSA_HSB);
		ET_Input_LL_DH_MC_HSA_HSB = (EditText)findViewById(R.id.ET_Input_LL_DH_MC_HSA_HSB);
		ET_Input_LL_DVA_MC_HSA_HSB = (EditText)findViewById(R.id.ET_Input_LL_DVA_MC_HSA_HSB);
		ET_Input_LL_DVB_MC_HSA_HSB = (EditText)findViewById(R.id.ET_Input_LL_DVB_MC_HSA_HSB);
		ET_Output_LL_SMA_MC_HSA_HSB = (EditText)findViewById(R.id.ET_Output_LL_SMA_MC_HSA_HSB);
		ET_Output_LL_SMB_MC_HSA_HSB = (EditText)findViewById(R.id.ET_Output_LL_SMB_MC_HSA_HSB);
		Button_Hitung_LL_MC_HSA_HSB = (Button)findViewById(R.id.Button_Hitung_LL_MC_HSA_HSB);
		Button_Reset_LL_MC_HSA_HSB = (Button)findViewById(R.id.Button_Reset_LL_MC_HSA_HSB);
		Button_Kembali_LL_MC_HSA_HSB = (Button)findViewById(R.id.Button_Kembali_LL_MC_HSA_HSB);
		Button_Detail_LL_MC_HSA_HSB = (Button)findViewById(R.id.Button_Detail_LL_MC_HSA_HSB);
		Button_Rumus_LL_MC_HSA_HSB = (Button)findViewById(R.id.Button_Rumus_LL_MC_HSA_HSB);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_DH_MC_HSA_HSB.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Horizontal [dh]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HSA_HSB.requestFocus();
					}
					else if(ET_Input_LL_DVA_MC_HSA_HSB.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Vertikal Atas [dva]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DVA_MC_HSA_HSB.requestFocus();
					}
					else if(ET_Input_LL_DVB_MC_HSA_HSB.length()==0){
						Toast.makeText(getApplication(), "Silahkan isi nilai Diagonal Vertikal Bawah [dvb]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DVB_MC_HSA_HSB.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_LL_DVA_MC_HSA_HSB.getText().toString()) == Double.parseDouble(ET_Input_LL_DVB_MC_HSA_HSB.getText().toString())){
						Toast.makeText(getApplication(), "Input Salah!. Nilai Diagonal Vertikal Atas [dva] tidak pernah sama dengan nilai Diagonal Vertikal Bawah [dvb] untuk bangun datar Layang-Layang. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DVA_MC_HSA_HSB.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_LL_DH_MC_HSA_HSB.getText().toString()) == Double.parseDouble(ET_Input_LL_DVA_MC_HSA_HSB.getText().toString())){
						Toast.makeText(getApplication(), "Input Salah!. Nilai Diagonal Horizontal [dh] TIDAK PERNAH SAMA dengan nilai Diagonal Vertikal Atas [dva] untuk bangun datar Layang-Layang. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HSA_HSB.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_LL_DH_MC_HSA_HSB.getText().toString()) == Double.parseDouble(ET_Input_LL_DVB_MC_HSA_HSB.getText().toString())){
						Toast.makeText(getApplication(), "Input Salah!. Nilai Diagonal Horizontal [dh] TIDAK PERNAH SAMA dengan nilai Diagonal Vertikal Bawah [dvb] untuk bangun datar Layang-Layang. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DVB_MC_HSA_HSB.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_LL_DH_MC_HSA_HSB.getText().toString()) < Double.parseDouble(ET_Input_LL_DVA_MC_HSA_HSB.getText().toString())){
						Toast.makeText(getApplication(), "Input Salah!. Nilai Diagonal Horizontal [dh] tidak pernah LEBIH KECIL dari nilai Diagonal Vertikal Atas [dva] untuk bangun datar Layang-Layang. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_DH_MC_HSA_HSB.requestFocus();
					}
					else{	
						double I_DH_LL_MC_HSA_HSB = Double.parseDouble(ET_Input_LL_DH_MC_HSA_HSB.getText().toString());
						double I_DVA_LL_MC_HSA_HSB = Double.parseDouble(ET_Input_LL_DVA_MC_HSA_HSB.getText().toString());
						double I_DVB_LL_MC_HSA_HSB = Double.parseDouble(ET_Input_LL_DVB_MC_HSA_HSB.getText().toString());
						double Setengah_DH_LL_MC_HSA_HSB = I_DH_LL_MC_HSA_HSB / 2;
						double O_SMA_LL_MC_HSA_HSB = Math.sqrt(Math.pow(I_DVA_LL_MC_HSA_HSB, 2) + Math.pow(Setengah_DH_LL_MC_HSA_HSB, 2));
						double O_SMB_LL_MC_HSA_HSB = Math.sqrt(Math.pow(I_DVB_LL_MC_HSA_HSB, 2) + Math.pow(Setengah_DH_LL_MC_HSA_HSB, 2));
						ET_Output_LL_SMA_MC_HSA_HSB.setText(String.valueOf(O_SMA_LL_MC_HSA_HSB));
						ET_Output_LL_SMB_MC_HSA_HSB.setText(String.valueOf(O_SMB_LL_MC_HSA_HSB));
						}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HSA_HSB.setText("");
				ET_Input_LL_DVA_MC_HSA_HSB.setText("");
				ET_Input_LL_DVB_MC_HSA_HSB.setText("");
				ET_Output_LL_SMA_MC_HSA_HSB.setText("");
				ET_Output_LL_SMB_MC_HSA_HSB.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_DH_MC_HSA_HSB.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_DH_MC_HSA_HSB.setText(" Diagonal Horizontal [dh]");
				ET_Input_LL_DVA_MC_HSA_HSB.setText(" Diagonal Vertikal Atas [dva]");
				ET_Input_LL_DVB_MC_HSA_HSB.setText(" Diagonal Vertikal Bawah [dvb]");
				ET_Output_LL_SMA_MC_HSA_HSB.setText(" √((1/2 x dh)^2+sma^2)");
				ET_Output_LL_SMB_MC_HSA_HSB.setText(" √((1/2 x dh)^2+smb^2)");
				ET_Input_LL_DH_MC_HSA_HSB.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HSA_HSB.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_HSA_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_HSA_HSB.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
