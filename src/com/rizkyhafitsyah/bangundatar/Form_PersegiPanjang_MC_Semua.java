package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Form_PersegiPanjang_MC_Semua extends Activity {
	EditText ET_Input_PP_Panjang_MC_Semua;
	EditText ET_Input_PP_Lebar_MC_Semua;
	EditText ET_Output_PP_Luas_MC_Semua;
	EditText ET_Output_PP_Keliling_MC_Semua;
	EditText ET_Output_PP_Diagonal_MC_Semua;
	Button Button_Hitung_PP_MC_Semua;
	Button Button_Reset_PP_MC_Semua;
	Button Button_Kembali_PP_MC_Semua;
	Button Button_Detail_PP_MC_Semua;
	Button Button_Rumus_PP_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_persegipanjang_mc_semua);
		
		ET_Input_PP_Panjang_MC_Semua = (EditText)findViewById(R.id.ET_Input_PP_Panjang_MC_Semua);
		ET_Input_PP_Lebar_MC_Semua = (EditText)findViewById(R.id.ET_Input_PP_Lebar_MC_Semua);
		ET_Output_PP_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_PP_Luas_MC_Semua);
		ET_Output_PP_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_PP_Keliling_MC_Semua);
		ET_Output_PP_Diagonal_MC_Semua = (EditText)findViewById(R.id.ET_Output_PP_Diagonal_MC_Semua);
		Button_Hitung_PP_MC_Semua = (Button)findViewById(R.id.Button_Hitung_PP_MC_Semua);
		Button_Reset_PP_MC_Semua = (Button)findViewById(R.id.Button_Reset_PP_MC_Semua);
		Button_Kembali_PP_MC_Semua = (Button)findViewById(R.id.Button_Kembali_PP_MC_Semua);
		Button_Detail_PP_MC_Semua = (Button)findViewById(R.id.Button_Detail_PP_MC_Semua);
		Button_Rumus_PP_MC_Semua = (Button)findViewById(R.id.Button_Rumus_PP_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_PP_MC_Semua.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {				
				try{
					if(ET_Input_PP_Panjang_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Panjang!", Toast.LENGTH_LONG).show();
						ET_Input_PP_Panjang_MC_Semua.requestFocus();
					}
					else if(ET_Input_PP_Lebar_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Lebar!", Toast.LENGTH_LONG).show();				
						ET_Input_PP_Lebar_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_PP_Panjang_MC_Semua.getText().toString()) < Double.parseDouble(ET_Input_PP_Lebar_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai Panjang salah!. Nilai Panjang tidak lebih Kecil dari nilai Lebar", Toast.LENGTH_LONG).show();				
						ET_Input_PP_Panjang_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_PP_Panjang_MC_Semua.getText().toString()) == Double.parseDouble(ET_Input_PP_Lebar_MC_Semua.getText().toString())){
						Toast.makeText(getApplication(), "Maaf, nilai nilai input salah! Nilai Panjang tidak pernah Sama dengan nilai Lebar", Toast.LENGTH_LONG).show();				
						ET_Input_PP_Panjang_MC_Semua.requestFocus();
					}
					else{
						double Panjang_PP_MC_Semua = Double.parseDouble(ET_Input_PP_Panjang_MC_Semua.getText().toString());
						double Lebar_PP_MC_Semua = Double.parseDouble(ET_Input_PP_Lebar_MC_Semua.getText().toString());
						double Luas_PP_MC_Semua = Panjang_PP_MC_Semua * Lebar_PP_MC_Semua;
						double Keliling_PP_MC_Semua = 2 * (Panjang_PP_MC_Semua + Lebar_PP_MC_Semua);
						double Diagonal_PP_MC_Semua = Math.sqrt(Math.pow(Panjang_PP_MC_Semua,2) +  Math.pow(Lebar_PP_MC_Semua,2));
						
						ET_Output_PP_Luas_MC_Semua.setText(String.valueOf(Luas_PP_MC_Semua));
						ET_Output_PP_Keliling_MC_Semua.setText(String.valueOf(Keliling_PP_MC_Semua));
						ET_Output_PP_Diagonal_MC_Semua.setText(String.valueOf(Diagonal_PP_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_PP_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Panjang_MC_Semua.setText("");
				ET_Input_PP_Lebar_MC_Semua.setText("");
				ET_Output_PP_Luas_MC_Semua.setText("");
				ET_Output_PP_Keliling_MC_Semua.setText("");
				ET_Output_PP_Diagonal_MC_Semua.setText("");

				ET_Input_PP_Panjang_MC_Semua.setTextSize(15);
				ET_Input_PP_Lebar_MC_Semua.setTextSize(15);
				ET_Output_PP_Luas_MC_Semua.setTextSize(15);
				ET_Output_PP_Keliling_MC_Semua.setTextSize(15);
				ET_Output_PP_Diagonal_MC_Semua.setTextSize(15);
				
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_PP_Panjang_MC_Semua.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_PP_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_PP_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_PersegiPanjang_MC_Semua.this, FormLihatGambarPP.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
		
		Button_Rumus_PP_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_PP_Panjang_MC_Semua.setText("Nilai Panjang [p]");
				ET_Input_PP_Lebar_MC_Semua.setText("Nilai Lebar [l]");
				ET_Output_PP_Luas_MC_Semua.setText(" p x l");
				ET_Output_PP_Keliling_MC_Semua.setText(" 2 x (p + l)");
				ET_Output_PP_Diagonal_MC_Semua.setText(" √(p^2+l^2)");

				ET_Input_PP_Panjang_MC_Semua.setTextSize(17);
				ET_Input_PP_Lebar_MC_Semua.setTextSize(17);
				ET_Output_PP_Luas_MC_Semua.setTextSize(17);
				ET_Output_PP_Keliling_MC_Semua.setTextSize(17);
				ET_Output_PP_Diagonal_MC_Semua.setTextSize(17);
				
				ET_Input_PP_Panjang_MC_Semua.requestFocus();				
			}
		});		
	}
}
