package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_PersegiPanjang_MC_HanyaDiagonal extends Activity {
	EditText ET_Input_PP_Panjang_MC_HanyaDiagonal;
	EditText ET_Input_PP_Lebar_MC_HanyaDiagonal;
	EditText ET_Output_PP_Diagonal_MC_HanyaDiagonal;
	Button Button_Hitung_PP_MC_HanyaDiagonal;
	Button Button_Reset_PP_MC_HanyaDiagonal;
	Button Button_Kembali_PP_MC_HanyaDiagonal;
	Button Button_Detail_PP_MC_HanyaDiagonal;
	Button Button_Rumus_PP_MC_HD;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_persegipanjang_mc_hanyadiagonal);
		
		ET_Input_PP_Panjang_MC_HanyaDiagonal = (EditText)findViewById(R.id.ET_Input_PP_Panjang_MC_HanyaDiagonal);
		ET_Input_PP_Lebar_MC_HanyaDiagonal = (EditText)findViewById(R.id.ET_Input_PP_Lebar_MC_HanyaDiagonal);
		ET_Output_PP_Diagonal_MC_HanyaDiagonal = (EditText)findViewById(R.id.ET_Output_PP_Diagonal_MC_HanyaDiagonal);
		Button_Hitung_PP_MC_HanyaDiagonal = (Button)findViewById(R.id.Button_Hitung_PP_MC_HanyaDiagonal);
		Button_Reset_PP_MC_HanyaDiagonal = (Button)findViewById(R.id.Button_Reset_PP_MC_HanyaDiagonal);
		Button_Kembali_PP_MC_HanyaDiagonal = (Button)findViewById(R.id.Button_Kembali_PP_MC_HanyaDiagonal);
		Button_Detail_PP_MC_HanyaDiagonal = (Button)findViewById(R.id.Button_Detail_PP_MC_HanyaDiagonal);
		Button_Rumus_PP_MC_HD = (Button)findViewById(R.id.Button_Rumus_PP_MC_HD);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_PP_MC_HanyaDiagonal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_PP_Panjang_MC_HanyaDiagonal.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Panjang!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Panjang_MC_HanyaDiagonal.requestFocus();
					}
					else if(ET_Input_PP_Lebar_MC_HanyaDiagonal.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Lebar!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Lebar_MC_HanyaDiagonal.requestFocus();
					}
					else{
						double Panjang_PP = Double.parseDouble(ET_Input_PP_Panjang_MC_HanyaDiagonal.getText().toString());
						double Lebar_PP = Double.parseDouble(ET_Input_PP_Lebar_MC_HanyaDiagonal.getText().toString());
						double Diagonal_PP = Math.sqrt(Math.pow(Panjang_PP,2) +  Math.pow(Lebar_PP,2));
						ET_Output_PP_Diagonal_MC_HanyaDiagonal.setText(String.valueOf(Diagonal_PP));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_PP_MC_HanyaDiagonal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Panjang_MC_HanyaDiagonal.setText("");
				ET_Input_PP_Lebar_MC_HanyaDiagonal.setText("");
				ET_Output_PP_Diagonal_MC_HanyaDiagonal.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_PP_MC_HanyaDiagonal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_PP_MC_HanyaDiagonal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_PersegiPanjang_MC_HanyaDiagonal.this, FormLihatGambarPP.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
		
		Button_Rumus_PP_MC_HD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Panjang_MC_HanyaDiagonal.setText("Nilai Panjang [p]");
				ET_Input_PP_Lebar_MC_HanyaDiagonal.setText("Nilai Lebar [l]");
				ET_Output_PP_Diagonal_MC_HanyaDiagonal.setText(" √(p^2+l^2 )");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
			}
		});		
	}
}
