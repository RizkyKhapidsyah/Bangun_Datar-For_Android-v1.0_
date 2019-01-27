package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_LayangLayang_MC_Semua extends Activity {
	ImageView IV_Gambar_LL_MC_Semua;
	EditText ET_Input_LL_SMA_MC_Semua;
	EditText ET_Input_LL_SMB_MC_Semua;
	EditText ET_Input_LL_DV_MC_Semua;
	EditText ET_Input_LL_DH_MC_Semua;
	EditText ET_Output_LL_Luas_MC_Semua;
	EditText ET_Output_LL_Keliling_MC_Semua;
	EditText ET_Output_LL_S_DV_MC_Semua;
	EditText ET_Output_LL_S_DH_MC_Semua;
	EditText ET_Output_LL_DVA_MC_Semua;
	EditText ET_Output_LL_DVB_MC_Semua;
	Button Button_Hitung_LL_MC_Semua;
	Button Button_Reset_LL_MC_Semua;
	Button Button_Detail_LL_MC_Semua;
	Button Button_Kembali_LL_MC_Semua;	
	Button Button_Rumus_LL_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_layanglayang_mc_semua);
		
		IV_Gambar_LL_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_LL_MC_Semua);
		ET_Input_LL_SMA_MC_Semua = (EditText)findViewById(R.id.ET_Input_LL_SMA_MC_Semua);
		ET_Input_LL_SMB_MC_Semua = (EditText)findViewById(R.id.ET_Input_LL_SMB_MC_Semua);
		ET_Input_LL_DV_MC_Semua = (EditText)findViewById(R.id.ET_Input_LL_DV_MC_Semua);
		ET_Input_LL_DH_MC_Semua = (EditText)findViewById(R.id.ET_Input_LL_DH_MC_Semua);
		ET_Output_LL_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_Luas_MC_Semua);
		ET_Output_LL_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_Keliling_MC_Semua);
		ET_Output_LL_S_DV_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_S_DV_MC_Semua);
		ET_Output_LL_S_DH_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_S_DH_MC_Semua);
		ET_Output_LL_DVA_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_DVA_MC_Semua);
		ET_Output_LL_DVB_MC_Semua = (EditText)findViewById(R.id.ET_Output_LL_DVB_MC_Semua);
		Button_Hitung_LL_MC_Semua = (Button)findViewById(R.id.Button_Hitung_LL_MC_Semua);
		Button_Reset_LL_MC_Semua = (Button)findViewById(R.id.Button_Reset_LL_MC_Semua);
		Button_Detail_LL_MC_Semua = (Button)findViewById(R.id.Button_Detail_LL_MC_Semua);
		Button_Kembali_LL_MC_Semua = (Button)findViewById(R.id.Button_Kembali_LL_MC_Semua);
		Button_Rumus_LL_MC_Semua = (Button)findViewById(R.id.Button_Rumus_LL_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_LL_SMA_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Sisi Miring bagian Atas [sma]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_SMA_MC_Semua.requestFocus();
					}
					else if(ET_Input_LL_SMB_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Sisi Miring bagian Bawah [smb]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_LL_SMB_MC_Semua.requestFocus();
					}
					else if(ET_Input_LL_DV_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal Vertikal [dv]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_LL_DV_MC_Semua.requestFocus();
					}
					else if(ET_Input_LL_DH_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal Horizontal [dh]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_LL_DH_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_LL_SMB_MC_Semua.getText().toString()) <= Double.parseDouble(ET_Input_LL_SMA_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Nilai Sisi Miring Bawah [smb] Salah! Nilai Sisi Miring Bawah tidak pernah lebih kecil atau sama dengan nilai Sisi Miring Atas. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_LL_SMB_MC_Semua.requestFocus();
					}					
					else{	
						double I_SMA_LL_MC_Semua = Double.parseDouble(ET_Input_LL_SMA_MC_Semua.getText().toString());
						double I_SMB_LL_MC_Semua = Double.parseDouble(ET_Input_LL_SMB_MC_Semua.getText().toString());
						double I_DV_LL_MC_Semua = Double.parseDouble(ET_Input_LL_DV_MC_Semua.getText().toString());
						double I_DH_LL_MC_Semua = Double.parseDouble(ET_Input_LL_DH_MC_Semua.getText().toString());
						double O_Luas_LL_MC_Semua = 0.5 * I_DV_LL_MC_Semua * I_DH_LL_MC_Semua;
						double O_Keliling_LL_MC_Semua = 2 * I_SMA_LL_MC_Semua + 2 * I_SMB_LL_MC_Semua;
						double O_S_DV_LL_MC_Semua = I_DV_LL_MC_Semua / 2;
						double O_S_DH_LL_MC_Semua = I_DH_LL_MC_Semua / 2;
						double O_DVA_LL_MC_Semua = Math.sqrt(Math.pow(I_SMA_LL_MC_Semua, 2) - Math.pow(O_S_DH_LL_MC_Semua, 2));
						double O_DVB_LL_MC_Semua = Math.sqrt(Math.pow(I_SMB_LL_MC_Semua, 2) - Math.pow(O_S_DH_LL_MC_Semua, 2));
						
						ET_Output_LL_Luas_MC_Semua.setText(String.valueOf(O_Luas_LL_MC_Semua));
						ET_Output_LL_Keliling_MC_Semua.setText(String.valueOf(O_Keliling_LL_MC_Semua));
						ET_Output_LL_S_DV_MC_Semua.setText(String.valueOf(O_S_DV_LL_MC_Semua));
						ET_Output_LL_S_DH_MC_Semua.setText(String.valueOf(O_S_DH_LL_MC_Semua));
						ET_Output_LL_DVA_MC_Semua.setText(String.valueOf(O_DVA_LL_MC_Semua));
						ET_Output_LL_DVB_MC_Semua.setText(String.valueOf(O_DVB_LL_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_SMA_MC_Semua.setText("");
				ET_Input_LL_SMB_MC_Semua.setText("");
				ET_Input_LL_DV_MC_Semua.setText("");
				ET_Input_LL_DH_MC_Semua.setText("");
				ET_Output_LL_Luas_MC_Semua.setText("");
				ET_Output_LL_Keliling_MC_Semua.setText("");
				ET_Output_LL_S_DV_MC_Semua.setText("");
				ET_Output_LL_S_DH_MC_Semua.setText("");
				ET_Output_LL_DVA_MC_Semua.setText("");
				ET_Output_LL_DVB_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_LL_SMA_MC_Semua.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_LL_SMA_MC_Semua.setText("Sisi Miring Atas [sma]");
				ET_Input_LL_SMB_MC_Semua.setText("Sisi Miring Bawah [smb]");
				ET_Input_LL_DV_MC_Semua.setText("Diagonal Vertikal [dv]");
				ET_Input_LL_DH_MC_Semua.setText("Diagonal Horizontal [dh]");
				ET_Output_LL_Luas_MC_Semua.setText(" ½ x dh x dv   (atau)   ½ x d1 x d2");
				ET_Output_LL_Keliling_MC_Semua.setText(" 2 x sma + 2 x smb   (atau)    2 x s1 + 2 x s2");
				ET_Output_LL_S_DV_MC_Semua.setText(" ½ x dv   (atau)   ½ x √(dh^2 - smb^2)");
				ET_Output_LL_S_DH_MC_Semua.setText(" ½ x dh   (atau)    ½ x √(sma^2 - dva^2)");
				ET_Output_LL_DVA_MC_Semua.setText(" √(sma^2 - (1/2  x dh)^2)");
				ET_Output_LL_DVB_MC_Semua.setText(" √(smb^2 - (1/2  x dh)^2)");
				ET_Input_LL_SMA_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_Semua.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_LL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_LayangLayang_MC_Semua.this, FormLihatGambarLayangLayang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
