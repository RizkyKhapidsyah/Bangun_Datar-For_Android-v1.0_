package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Lingkaran_MC_HJJ_JD_Luas extends Activity {
	ImageView IV_Gambar_Lingkaran_MC_HJJ_JD_L;
	EditText ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L;
	EditText ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L;
	Button Button_Hitung_Lingkaran_MC_HJJ_JD_L;
	Button Button_Reset_Lingkaran_MC_HJJ_JD_L;
	Button Button_Kembali_Lingkaran_MC_HJJ_JD_L;
	Button Button_Detail_Lingkaran_MC_HJJ_JD_L;
	Button Button_Rumus_LL_MC_HJJ_JD_LUAS;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lingkaran_mc_hjj_jd_luas);
		
		IV_Gambar_Lingkaran_MC_HJJ_JD_L = (ImageView)findViewById(R.id.IV_Gambar_Lingkaran_MC_HJJ_JD_L);
		ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L = (EditText)findViewById(R.id.ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L);
		ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L = (EditText)findViewById(R.id.ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L);
		Button_Hitung_Lingkaran_MC_HJJ_JD_L = (Button)findViewById(R.id.Button_Hitung_Lingkaran_MC_HJJ_JD_L);
		Button_Reset_Lingkaran_MC_HJJ_JD_L = (Button)findViewById(R.id.Button_Reset_Lingkaran_MC_HJJ_JD_L);
		Button_Kembali_Lingkaran_MC_HJJ_JD_L = (Button)findViewById(R.id.Button_Kembali_Lingkaran_MC_HJJ_JD_L);
		Button_Detail_Lingkaran_MC_HJJ_JD_L = (Button)findViewById(R.id.Button_Detail_Lingkaran_MC_HJJ_JD_L);
		Button_Rumus_LL_MC_HJJ_JD_LUAS = (Button)findViewById(R.id.Button_Rumus_LL_MC_HJJ_JD_LUAS);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_Lingkaran_MC_HJJ_JD_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas!", Toast.LENGTH_LONG).show();
						ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.requestFocus();
					}					
					else{
						double I_Luas_Lingkaran_MC_HJJ_JD_L = Double.parseDouble(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.getText().toString());
						double O_JariJari_Lingkaran_MC_HJJ_JD_L = Math.sqrt(I_Luas_Lingkaran_MC_HJJ_JD_L / 3.14); 
						ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L.setText(String.valueOf(O_JariJari_Lingkaran_MC_HJJ_JD_L));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_Lingkaran_MC_HJJ_JD_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.setText("");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HJJ_JD_LUAS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.setText(" Luas");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_L.setText(" √((L/phi))");
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_L.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_Lingkaran_MC_HJJ_JD_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_Lingkaran_MC_HJJ_JD_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Luas.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Lingkaran_MC_HJJ_JD_L.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Luas.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
