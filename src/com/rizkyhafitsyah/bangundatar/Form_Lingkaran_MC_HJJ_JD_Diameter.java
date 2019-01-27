package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Lingkaran_MC_HJJ_JD_Diameter extends Activity {
	ImageView IV_Gambar_Lingkaran_MC_HJJ_JD_D;
	EditText ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D;
	EditText ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D;
	Button Button_Hitung_Lingkaran_MC_HJJ_JD_D;
	Button Button_Reset_Lingkaran_MC_HJJ_JD_D;
	Button Button_Kembali_Lingkaran_MC_HJJ_JD_D;
	Button Button_Detail_Lingkaran_MC_HJJ_JD_D;
	Button Button_Rumus_LL_MC_HJJ_JD_DIAMETER;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lingkaran_mc_hjj_jd_diameter);
		
		IV_Gambar_Lingkaran_MC_HJJ_JD_D = (ImageView)findViewById(R.id.IV_Gambar_Lingkaran_MC_HJJ_JD_D);
		ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D = (EditText)findViewById(R.id.ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D);
		ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D = (EditText)findViewById(R.id.ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D);
		Button_Hitung_Lingkaran_MC_HJJ_JD_D = (Button)findViewById(R.id.Button_Hitung_Lingkaran_MC_HJJ_JD_D);
		Button_Reset_Lingkaran_MC_HJJ_JD_D = (Button)findViewById(R.id.Button_Reset_Lingkaran_MC_HJJ_JD_D);
		Button_Kembali_Lingkaran_MC_HJJ_JD_D = (Button)findViewById(R.id.Button_Kembali_Lingkaran_MC_HJJ_JD_D);
		Button_Detail_Lingkaran_MC_HJJ_JD_D = (Button)findViewById(R.id.Button_Detail_Lingkaran_MC_HJJ_JD_D);
		Button_Rumus_LL_MC_HJJ_JD_DIAMETER = (Button)findViewById(R.id.Button_Rumus_LL_MC_HJJ_JD_DIAMETER);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_Lingkaran_MC_HJJ_JD_D.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diameter [d]!", Toast.LENGTH_LONG).show();
						ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.requestFocus();
					}					
					else{
						double I_Diameter_Lingkaran_MC_HJJ_JD_D = Double.parseDouble(ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.getText().toString());
						double O_JariJari_Lingkaran_MC_HJJ_JD_D = I_Diameter_Lingkaran_MC_HJJ_JD_D / 2;
						ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D.setText(String.valueOf(O_JariJari_Lingkaran_MC_HJJ_JD_D));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_Lingkaran_MC_HJJ_JD_D.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.setText("");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.requestFocus();
			}
		});
		
		Button_Rumus_LL_MC_HJJ_JD_DIAMETER.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.setText(" Diameter");
				ET_Output_Lingkaran_JariJari_MC_HJJ_JD_D.setText(" d/2");
				ET_Input_Lingkaran_JenisInput_MC_HJJ_JD_D.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_Lingkaran_MC_HJJ_JD_D.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_Lingkaran_MC_HJJ_JD_D.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Diameter.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Lingkaran_MC_HJJ_JD_D.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_HJJ_JD_Diameter.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
