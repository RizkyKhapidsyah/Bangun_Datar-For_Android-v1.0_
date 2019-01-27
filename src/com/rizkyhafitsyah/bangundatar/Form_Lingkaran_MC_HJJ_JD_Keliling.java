package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Lingkaran_MC_HJJ_JD_Keliling extends Activity {
	ImageView IV_Gambar_Lingkaran_MC_HJJ_JD_K;
	EditText ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K;
	EditText ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K;
	Button Button_Hitung_Lingkaran_MC_HJJ_JD_K;
	Button Button_Reset_Lingkaran_MC_HJJ_JD_K;
	Button Button_Kembali_Lingkaran_MC_HJJ_JD_K;
	Button Button_Detail_Lingkaran_MC_HJJ_JD_K;
	Button Button_Rumus_LL_MC_HJJ_JD_KELILING;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lingkaran_mc_hjj_jd_keliling);
		
		IV_Gambar_Lingkaran_MC_HJJ_JD_K = (ImageView)findViewById(R.id.IV_Gambar_Lingkaran_MC_HJJ_JD_K);
		ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K = (EditText)findViewById(R.id.ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K);
		ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K = (EditText)findViewById(R.id.ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K);
		Button_Hitung_Lingkaran_MC_HJJ_JD_K = (Button)findViewById(R.id.Button_Hitung_Lingkaran_MC_HJJ_JD_K);
		Button_Reset_Lingkaran_MC_HJJ_JD_K = (Button)findViewById(R.id.Button_Reset_Lingkaran_MC_HJJ_JD_K);
		Button_Kembali_Lingkaran_MC_HJJ_JD_K = (Button)findViewById(R.id.Button_Kembali_Lingkaran_MC_HJJ_JD_K);
		Button_Detail_Lingkaran_MC_HJJ_JD_K = (Button)findViewById(R.id.Button_Detail_Lingkaran_MC_HJJ_JD_K);
		Button_Rumus_LL_MC_HJJ_JD_KELILING = (Button)findViewById(R.id.Button_Rumus_LL_MC_HJJ_JD_KELILING);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_Lingkaran_MC_HJJ_JD_K.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Keliling!", Toast.LENGTH_LONG).show();
						ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.requestFocus();
					}					
					else{
						double I_Keliling_Lingkaran_MC_HJJ_JD_K = Double.parseDouble(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.getText().toString());
						double O_JariJari_Lingkaran_MC_HJJ_JD_K = I_Keliling_Lingkaran_MC_HJJ_JD_K / 2 * 3.14;
						ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K.setText(String.valueOf(O_JariJari_Lingkaran_MC_HJJ_JD_K));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_Lingkaran_MC_HJJ_JD_K.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.setText("");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HJJ_JD_KELILING.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.setText(" Keliling");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_K.setText(" K/2 x phi");				
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_K.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_Lingkaran_MC_HJJ_JD_K.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_Lingkaran_MC_HJJ_JD_K.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Keliling.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Lingkaran_MC_HJJ_JD_K.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Keliling.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
