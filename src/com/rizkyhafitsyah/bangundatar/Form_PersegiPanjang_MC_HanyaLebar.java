package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_PersegiPanjang_MC_HanyaLebar extends Activity {
	EditText ET_Input_PP_Luas_MC_HanyaLebar;
	EditText ET_Input_PP_Panjang_MC_HanyaLebar;
	EditText ET_Output_PP_Lebar_MC_HanyaLebar;
	Button Button_Hitung_PP_MC_HanyaLebar;
	Button Button_Reset_PP_MC_HanyaLebar;
	Button Button_Kembali_PP_MC_HanyaLebar;
	Button Button_Detail_PP_MC_HanyaLebar;
	Button Button_Rumus_PP_MC_HL;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_persegipanjang_mc_hanyalebar);
		
		ET_Input_PP_Luas_MC_HanyaLebar = (EditText)findViewById(R.id.ET_Input_PP_Luas_MC_HanyaLebar);
		ET_Input_PP_Panjang_MC_HanyaLebar = (EditText)findViewById(R.id.ET_Input_PP_Panjang_MC_HanyaLebar);
		ET_Output_PP_Lebar_MC_HanyaLebar = (EditText)findViewById(R.id.ET_Output_PP_Lebar_MC_HanyaLebar);
		Button_Hitung_PP_MC_HanyaLebar = (Button)findViewById(R.id.Button_Hitung_PP_MC_HanyaLebar);
		Button_Reset_PP_MC_HanyaLebar = (Button)findViewById(R.id.Button_Reset_PP_MC_HanyaLebar);
		Button_Kembali_PP_MC_HanyaLebar = (Button)findViewById(R.id.Button_Kembali_PP_MC_HanyaLebar);
		Button_Detail_PP_MC_HanyaLebar = (Button)findViewById(R.id.Button_Detail_PP_MC_HanyaLebar);
		Button_Rumus_PP_MC_HL = (Button)findViewById(R.id.Button_Rumus_PP_MC_HL);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_PP_MC_HanyaLebar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_PP_Luas_MC_HanyaLebar.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Luas!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Luas_MC_HanyaLebar.requestFocus();
					}
					else if(ET_Input_PP_Panjang_MC_HanyaLebar.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Panjang!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Panjang_MC_HanyaLebar.requestFocus();
					}
					else{
						double Luas_PP_MC_HanyaLebar = Double.parseDouble(ET_Input_PP_Luas_MC_HanyaLebar.getText().toString());
						double Panjang_PP_MC_HanyaLebar= Double.parseDouble(ET_Input_PP_Panjang_MC_HanyaLebar.getText().toString());
						double Lebar_PP_MC_HanyaLebar = Luas_PP_MC_HanyaLebar / Panjang_PP_MC_HanyaLebar;
						ET_Output_PP_Lebar_MC_HanyaLebar.setText(String.valueOf(Lebar_PP_MC_HanyaLebar));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_PP_MC_HanyaLebar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Luas_MC_HanyaLebar.setText("");
				ET_Input_PP_Panjang_MC_HanyaLebar.setText("");
				ET_Output_PP_Lebar_MC_HanyaLebar.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_PP_MC_HanyaLebar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_PP_MC_HanyaLebar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_PersegiPanjang_MC_HanyaLebar.this, FormLihatGambarPP.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		Button_Rumus_PP_MC_HL.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Luas_MC_HanyaLebar.setText("Nilai Luas");
				ET_Input_PP_Panjang_MC_HanyaLebar.setText("Nilai Panjang");
				ET_Output_PP_Lebar_MC_HanyaLebar.setText(" Luas / panjang");
			}
		});
		
	}
}
