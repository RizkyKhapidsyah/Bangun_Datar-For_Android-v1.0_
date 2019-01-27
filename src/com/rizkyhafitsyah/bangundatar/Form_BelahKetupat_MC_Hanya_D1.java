package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_BelahKetupat_MC_Hanya_D1 extends Activity {
	ImageView IV_Gambar_BelahKetupat_MC_HanyaD1;
	EditText ET_Input_BelahKetupat_Luas_MC_HanyaD1;
	EditText ET_Input_BelahKetupat_D2_MC_HanyaD1;
	EditText ET_Output_BelahKetupat_D1_MC_HanyaD1;
	Button Button_Hitung_BelahKetupat_MC_HanyaD1;
	Button Button_Reset_BelahKetupat_MC_HanyaD1;
	Button Button_Kembali_BelahKetupat_MC_HanyaD1;
	Button Button_Detail_BelahKetupat_MC_HanyaD1;
	Button Button_Rumus_BK_MC_HD1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_belahketupat_mc_hanya_d1);
		
		IV_Gambar_BelahKetupat_MC_HanyaD1 = (ImageView)findViewById(R.id.IV_Gambar_BelahKetupat_MC_HanyaD1);
		ET_Input_BelahKetupat_Luas_MC_HanyaD1 = (EditText)findViewById(R.id.ET_Input_BelahKetupat_Luas_MC_HanyaD1);
		ET_Input_BelahKetupat_D2_MC_HanyaD1 = (EditText)findViewById(R.id.ET_Input_BelahKetupat_D2_MC_HanyaD1);
		ET_Output_BelahKetupat_D1_MC_HanyaD1 = (EditText)findViewById(R.id.ET_Output_BelahKetupat_D1_MC_HanyaD1);
		Button_Hitung_BelahKetupat_MC_HanyaD1 = (Button)findViewById(R.id.Button_Hitung_BelahKetupat_MC_HanyaD1);
		Button_Reset_BelahKetupat_MC_HanyaD1 = (Button)findViewById(R.id.Button_Reset_BelahKetupat_MC_HanyaD1);
		Button_Kembali_BelahKetupat_MC_HanyaD1 = (Button)findViewById(R.id.Button_Kembali_BelahKetupat_MC_HanyaD1);
		Button_Detail_BelahKetupat_MC_HanyaD1 = (Button)findViewById(R.id.Button_Detail_BelahKetupat_MC_HanyaD1);
		Button_Rumus_BK_MC_HD1 = (Button)findViewById(R.id.Button_Rumus_BK_MC_HD1);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_BelahKetupat_MC_HanyaD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_BelahKetupat_Luas_MC_HanyaD1.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Luas Dari Belah Ketupat!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_Luas_MC_HanyaD1.requestFocus();
					}
					else if(ET_Input_BelahKetupat_D2_MC_HanyaD1.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Diagonal 2 (d2) Dari Belah Ketupat!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_D2_MC_HanyaD1.requestFocus();
					}				
					else{	
						double I_Luas_BelahKetupat_MC_HanyaD1 = Double.parseDouble(ET_Input_BelahKetupat_Luas_MC_HanyaD1.getText().toString());
						double I_D2_BelahKetupat_MC_HanyaD1 = Double.parseDouble(ET_Input_BelahKetupat_D2_MC_HanyaD1.getText().toString());
						double O_D1_BelahKetupat_MC_HanyaD1 = (2 * I_Luas_BelahKetupat_MC_HanyaD1) / I_D2_BelahKetupat_MC_HanyaD1;						
						ET_Output_BelahKetupat_D1_MC_HanyaD1.setText(String.valueOf(O_D1_BelahKetupat_MC_HanyaD1));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_BelahKetupat_MC_HanyaD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_Luas_MC_HanyaD1.setText("");
				ET_Input_BelahKetupat_D2_MC_HanyaD1.setText("");
				ET_Output_BelahKetupat_D1_MC_HanyaD1.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_BelahKetupat_Luas_MC_HanyaD1.requestFocus();
			}
		});
		
		Button_Rumus_BK_MC_HD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_Luas_MC_HanyaD1.setText("Nilai Luas");
				ET_Input_BelahKetupat_D2_MC_HanyaD1.setText("Nilai Diagonal 2 [d2]");
				ET_Output_BelahKetupat_D1_MC_HanyaD1.setText(" (2 x L)/(diagonal 1)");				
				ET_Input_BelahKetupat_Luas_MC_HanyaD1.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_BelahKetupat_MC_HanyaD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_BelahKetupat_MC_HanyaD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_Hanya_D1.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_BelahKetupat_MC_HanyaD1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_Hanya_D1.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
