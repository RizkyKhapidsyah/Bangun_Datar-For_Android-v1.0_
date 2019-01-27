package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_Lingkaran_MC_Semua extends Activity {
	ImageView IV_Gambar_Lingkaran_MC_Semua;
	EditText ET_Input_Lingkaran_R_MC_Semua;
	EditText ET_Output_Lingkaran_Luas_MC_Semua;
	EditText ET_Output_Lingkaran_Keliling_MC_Semua;
	EditText ET_Output_Lingkaran_Diameter_MC_Semua;
	EditText ET_Output_Lingkaran_lstgh_MC_Semua;
	EditText ET_Output_Lingkaran_lsprmt_MC_Semua;
	EditText ET_Output_Lingkaran_ltprmt_MC_Semua;
	EditText ET_Output_Lingkaran_kstgh_MC_Semua;
	EditText ET_Output_Lingkaran_ksprmt_MC_Semua;
	EditText ET_Output_Lingkaran_ktprmt_MC_Semua;
	Button Button_Hitung_Lingkaran_MC_Semua;
	Button Button_Reset_Lingkaran_MC_Semua;
	Button Button_Detail_Lingkaran_MC_Semua;
	Button Button_Kembali_Lingkaran_MC_Semua;
	Button Button_Rumus_L_MC_Semua;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_lingkaran_mc_semua);
		
		IV_Gambar_Lingkaran_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_Lingkaran_MC_Semua);
		ET_Input_Lingkaran_R_MC_Semua = (EditText)findViewById(R.id.ET_Input_Lingkaran_R_MC_Semua);
		ET_Output_Lingkaran_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_Luas_MC_Semua);
		ET_Output_Lingkaran_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_Keliling_MC_Semua);
		ET_Output_Lingkaran_Diameter_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_Diameter_MC_Semua);
		ET_Output_Lingkaran_lstgh_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_lstgh_MC_Semua);
		ET_Output_Lingkaran_lsprmt_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_lsprmt_MC_Semua);
		ET_Output_Lingkaran_ltprmt_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_ltprmt_MC_Semua);
		ET_Output_Lingkaran_kstgh_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_kstgh_MC_Semua);
		ET_Output_Lingkaran_ksprmt_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_ksprmt_MC_Semua);
		ET_Output_Lingkaran_ktprmt_MC_Semua = (EditText)findViewById(R.id.ET_Output_Lingkaran_ktprmt_MC_Semua);
		Button_Hitung_Lingkaran_MC_Semua = (Button)findViewById(R.id.Button_Hitung_Lingkaran_MC_Semua);
		Button_Reset_Lingkaran_MC_Semua = (Button)findViewById(R.id.Button_Reset_Lingkaran_MC_Semua);
		Button_Detail_Lingkaran_MC_Semua = (Button)findViewById(R.id.Button_Detail_Lingkaran_MC_Semua);
		Button_Kembali_Lingkaran_MC_Semua = (Button)findViewById(R.id.Button_Kembali_Lingkaran_MC_Semua);
		Button_Rumus_L_MC_Semua = (Button)findViewById(R.id.Button_Rumus_L_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_Lingkaran_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_Lingkaran_R_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Jari-Jari [r] Lingkaran. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_Lingkaran_R_MC_Semua.requestFocus();
					}				
					else{	
						double I_R_L_MC_Semua = Double.parseDouble(ET_Input_Lingkaran_R_MC_Semua.getText().toString());
						double O_LUAS_L_MC_Semua = 3.14 * I_R_L_MC_Semua * I_R_L_MC_Semua;
						double O_KELILING_L_MC_Semua = 2 * 3.14 * I_R_L_MC_Semua;
						double O_DIAMETER_L_MC_Semua = I_R_L_MC_Semua * 2;
						double O_LUAS_SETENGAH_L_MC_Semua = 0.5 * 3.14 * Math.pow(I_R_L_MC_Semua, 2);
						double O_LUAS_SEPEREMPAT_L_MC_Semua = 0.25 * 3.14 * Math.pow(I_R_L_MC_Semua, 2);
						double O_LUAS_TIGAPEREMPAT_L_MC_Semua = 0.75 * 3.14 * Math.pow(I_R_L_MC_Semua, 2);
						double O_KELILING_SETENGAH_L_MC_Semua = 0.5 * 2 * 3.14 * I_R_L_MC_Semua;
						double O_KELILING_SEPEREMPAT_L_MC_Semua = 0.25 * 2 * 3.14 * I_R_L_MC_Semua;
						double O_KELILING_TIGAPEREMPAT_L_MC_Semua = 0.75 * 2 * 3.14 * I_R_L_MC_Semua;
						
						ET_Output_Lingkaran_Luas_MC_Semua.setText(String.valueOf(O_LUAS_L_MC_Semua));
						ET_Output_Lingkaran_Keliling_MC_Semua.setText(String.valueOf(O_KELILING_L_MC_Semua));
						ET_Output_Lingkaran_Diameter_MC_Semua.setText(String.valueOf(O_DIAMETER_L_MC_Semua));
						ET_Output_Lingkaran_lstgh_MC_Semua.setText(String.valueOf(O_LUAS_SETENGAH_L_MC_Semua));
						ET_Output_Lingkaran_lsprmt_MC_Semua.setText(String.valueOf(O_LUAS_SEPEREMPAT_L_MC_Semua));
						ET_Output_Lingkaran_ltprmt_MC_Semua.setText(String.valueOf(O_LUAS_TIGAPEREMPAT_L_MC_Semua));
						ET_Output_Lingkaran_kstgh_MC_Semua.setText(String.valueOf(O_KELILING_SETENGAH_L_MC_Semua));
						ET_Output_Lingkaran_ksprmt_MC_Semua.setText(String.valueOf(O_KELILING_SEPEREMPAT_L_MC_Semua));
						ET_Output_Lingkaran_ktprmt_MC_Semua.setText(String.valueOf(O_KELILING_TIGAPEREMPAT_L_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_Lingkaran_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_R_MC_Semua.setText("");
				ET_Output_Lingkaran_Luas_MC_Semua.setText("");
				ET_Output_Lingkaran_Keliling_MC_Semua.setText("");
				ET_Output_Lingkaran_Diameter_MC_Semua.setText("");
				ET_Output_Lingkaran_lstgh_MC_Semua.setText("");
				ET_Output_Lingkaran_lsprmt_MC_Semua.setText("");
				ET_Output_Lingkaran_ltprmt_MC_Semua.setText("");
				ET_Output_Lingkaran_kstgh_MC_Semua.setText("");
				ET_Output_Lingkaran_ksprmt_MC_Semua.setText("");
				ET_Output_Lingkaran_ktprmt_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_Lingkaran_R_MC_Semua.requestFocus();
			}
		});
		
		Button_Rumus_L_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Lingkaran_R_MC_Semua.setText(" Jari-Jari [r]");
				ET_Output_Lingkaran_Luas_MC_Semua.setText(" phi x r x r   (atau)   (22/7) x r x r   (atau)   3,14 x r^2");
				ET_Output_Lingkaran_Keliling_MC_Semua.setText(" 2 x phi x r   (atau)   2 x (22/7) x r   (atau)   2 x 3,14 x r");
				ET_Output_Lingkaran_Diameter_MC_Semua.setText(" r x 2   (atau)   r + r");
				ET_Output_Lingkaran_lstgh_MC_Semua.setText(" ½ x phi x r^2   (atau)   ½ x 22/7 x r^2   (atau)   0,5 x 3,14 x r x r");
				ET_Output_Lingkaran_lsprmt_MC_Semua.setText(" ¼ x phi x r^2   (atau)   ¼ x 22/7 x r^2   (atau)   0,25 x 3,14 x r x r");
				ET_Output_Lingkaran_ltprmt_MC_Semua.setText(" ¾ x phi x r^2   (atau)   ¾ x 22/7 x r^2   (atau)   0,75 x 3,14 x r x r");
				ET_Output_Lingkaran_kstgh_MC_Semua.setText(" ½ x phi x d   (atau)   (2 x phi x r)/2   (atau)   phi x r + 2 x r");
				ET_Output_Lingkaran_ksprmt_MC_Semua.setText(" ¼ x 2 x phi x r");
				ET_Output_Lingkaran_ktprmt_MC_Semua.setText(" ¾ x 2 x phi x r");
				ET_Input_Lingkaran_R_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_Lingkaran_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_Lingkaran_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_Semua.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_Lingkaran_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Lingkaran_MC_Semua.this, FormLihatGambarLingkaran.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
