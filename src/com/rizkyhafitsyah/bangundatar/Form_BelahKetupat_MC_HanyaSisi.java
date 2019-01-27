package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_BelahKetupat_MC_HanyaSisi extends Activity {
	ImageView IV_Gambar_BelahKetupat_MC_HanyaSisi;
	EditText ET_Input_BelahKetupat_D1_MC_HanyaSisi;
	EditText ET_Input_BelahKetupat_D2_MC_HanyaSisi;
	EditText ET_Output_BelahKetupat_Sisi_MC_HanyaSisi;
	Button Button_Hitung_BelahKetupat_MC_HanyaSisi;
	Button Button_Reset_BelahKetupat_MC_HanyaSisi;
	Button Button_Kembali_BelahKetupat_MC_HanyaSisi;
	Button Button_Detail_BelahKetupat_MC_HanyaSisi;
	Button Button_Rumus_BK_MC_HS;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_belahketupat_mc_hanyasisi);
		
		IV_Gambar_BelahKetupat_MC_HanyaSisi = (ImageView)findViewById(R.id.IV_Gambar_BelahKetupat_MC_HanyaSisi);
		ET_Input_BelahKetupat_D1_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Input_BelahKetupat_D1_MC_HanyaSisi);
		ET_Input_BelahKetupat_D2_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Input_BelahKetupat_D2_MC_HanyaSisi);
		ET_Output_BelahKetupat_Sisi_MC_HanyaSisi = (EditText)findViewById(R.id.ET_Output_BelahKetupat_Sisi_MC_HanyaSisi);
		Button_Hitung_BelahKetupat_MC_HanyaSisi = (Button)findViewById(R.id.Button_Hitung_BelahKetupat_MC_HanyaSisi);
		Button_Reset_BelahKetupat_MC_HanyaSisi = (Button)findViewById(R.id.Button_Reset_BelahKetupat_MC_HanyaSisi);
		Button_Kembali_BelahKetupat_MC_HanyaSisi = (Button)findViewById(R.id.Button_Kembali_BelahKetupat_MC_HanyaSisi);
		Button_Detail_BelahKetupat_MC_HanyaSisi = (Button)findViewById(R.id.Button_Detail_BelahKetupat_MC_HanyaSisi);
		Button_Rumus_BK_MC_HS = (Button)findViewById(R.id.Button_Rumus_BK_MC_HS);
		
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_BelahKetupat_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_BelahKetupat_D1_MC_HanyaSisi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal 1 (d1)!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_D1_MC_HanyaSisi.requestFocus();
					}
					else if(ET_Input_BelahKetupat_D2_MC_HanyaSisi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal 2 (d2)!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_D2_MC_HanyaSisi.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_BelahKetupat_D2_MC_HanyaSisi.getText().toString()) != Double.parseDouble(ET_Input_BelahKetupat_D1_MC_HanyaSisi.getText().toString())) { //Jika nilai dari diagonal 2 tidak sama dengan nilai diagonal 1
						Toast.makeText(getApplication(), "Nilai Diagonal 1 harus sama dengan Nilai Diagonal 2!", Toast.LENGTH_LONG).show();				
						ET_Input_BelahKetupat_D1_MC_HanyaSisi.requestFocus();
					}					
					else{
						double I_D1_BelahKetupat_MC_HanyaSisi = Double.parseDouble(ET_Input_BelahKetupat_D1_MC_HanyaSisi.getText().toString());
						double I_D2_BelahKetupat_MC_HanyaSisi = Double.parseDouble(ET_Input_BelahKetupat_D2_MC_HanyaSisi.getText().toString());
						double O_Sisi_BelahKetupat_MC_HanyaSisi = Math.sqrt(Math.pow(0.5 * I_D1_BelahKetupat_MC_HanyaSisi, 2) + Math.pow(0.5 * I_D2_BelahKetupat_MC_HanyaSisi, 2));
						
						ET_Output_BelahKetupat_Sisi_MC_HanyaSisi.setText(String.valueOf(O_Sisi_BelahKetupat_MC_HanyaSisi));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_BelahKetupat_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_D1_MC_HanyaSisi.setText("");
				ET_Input_BelahKetupat_D2_MC_HanyaSisi.setText("");
				ET_Output_BelahKetupat_Sisi_MC_HanyaSisi.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_BelahKetupat_D1_MC_HanyaSisi.requestFocus();
			}
		});
		
		Button_Rumus_BK_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_D1_MC_HanyaSisi.setText("Nilai Diagonal 1 [d1]");
				ET_Input_BelahKetupat_D2_MC_HanyaSisi.setText("Nilai Diagonal 2 [d2]");
				ET_Output_BelahKetupat_Sisi_MC_HanyaSisi.setText(" ½√(d1² + d2²)");
				ET_Input_BelahKetupat_D1_MC_HanyaSisi.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_BelahKetupat_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_BelahKetupat_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_HanyaSisi.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_BelahKetupat_MC_HanyaSisi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_HanyaSisi.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		
	}
}
