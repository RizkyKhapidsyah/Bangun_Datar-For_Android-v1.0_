package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_JajarGenjang_MC_Semua extends Activity {
	ImageView IV_Gambar_JajarGenjang_MC_Semua;
	EditText ET_Input_JajarGenjang_Alas_MC_Semua;
	EditText ET_Input_JajarGenjang_Tinggi_MC_Semua;
	EditText ET_Input_JajarGenjang_SM_MC_Semua;
	EditText ET_Input_JajarGenjang_SDA_MC_Semua;
	EditText ET_Input_JajarGenjang_SDB_MC_Semua;
	EditText ET_Output_JajarGenjang_Luas_MC_Semua;
	EditText ET_Output_JajarGenjang_Keliling_MC_Semua;
	EditText ET_Output_JajarGenjang_SA_MC_Semua;
	EditText ET_Output_JajarGenjang_D1_MC_Semua;
	EditText ET_Output_JajarGenjang_D2_MC_Semua;
	Button Button_Hitung_JajarGenjang_MC_Semua;
	Button Button_Reset_JajarGenjang_MC_Semua;
	Button Button_Detail_JajarGenjang_MC_Semua;
	Button Button_Kembali_JajarGenjang_MC_Semua;
	Button Button_Rumus_JG_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_jajargenjang_mc_semua);
		
		IV_Gambar_JajarGenjang_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_JajarGenjang_MC_Semua);
		ET_Input_JajarGenjang_Alas_MC_Semua = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Alas_MC_Semua);
		ET_Input_JajarGenjang_Tinggi_MC_Semua = (EditText)findViewById(R.id.ET_Input_JajarGenjang_Tinggi_MC_Semua);
		ET_Input_JajarGenjang_SM_MC_Semua = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SM_MC_Semua);
		ET_Input_JajarGenjang_SDA_MC_Semua = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SDA_MC_Semua);
		ET_Input_JajarGenjang_SDB_MC_Semua = (EditText)findViewById(R.id.ET_Input_JajarGenjang_SDB_MC_Semua);
		ET_Output_JajarGenjang_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Luas_MC_Semua);
		ET_Output_JajarGenjang_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_JajarGenjang_Keliling_MC_Semua);
		ET_Output_JajarGenjang_SA_MC_Semua = (EditText)findViewById(R.id.ET_Output_JajarGenjang_SA_MC_Semua);
		ET_Output_JajarGenjang_D1_MC_Semua = (EditText)findViewById(R.id.ET_Output_JajarGenjang_D1_MC_Semua);
		ET_Output_JajarGenjang_D2_MC_Semua = (EditText)findViewById(R.id.ET_Output_JajarGenjang_D2_MC_Semua);
		Button_Hitung_JajarGenjang_MC_Semua = (Button)findViewById(R.id.Button_Hitung_JajarGenjang_MC_Semua);
		Button_Reset_JajarGenjang_MC_Semua = (Button)findViewById(R.id.Button_Reset_JajarGenjang_MC_Semua);
		Button_Detail_JajarGenjang_MC_Semua = (Button)findViewById(R.id.Button_Detail_JajarGenjang_MC_Semua);
		Button_Kembali_JajarGenjang_MC_Semua = (Button)findViewById(R.id.Button_Kembali_JajarGenjang_MC_Semua);
		Button_Rumus_JG_MC_Semua = (Button)findViewById(R.id.Button_Rumus_JG_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_JajarGenjang_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {							
				try{
					if(ET_Input_JajarGenjang_Alas_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Alas (a)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}
					else if(ET_Input_JajarGenjang_Tinggi_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Tinggi (t)!", Toast.LENGTH_LONG).show();
						ET_Input_JajarGenjang_Tinggi_MC_Semua.requestFocus();
					}
					else if(ET_Input_JajarGenjang_SM_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Miring (sm)!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SM_MC_Semua.requestFocus();
					}	
					else if(ET_Input_JajarGenjang_SDA_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Dalam bagian Atas (sda)!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SDA_MC_Semua.requestFocus();
					}
					else if(ET_Input_JajarGenjang_SDB_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi Dalam bagian Bawah (sdb)!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SDB_MC_Semua.requestFocus();
					}					
					else if(Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString()) < Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Alas tidak mungkin lebih kecil dari nilai Sisi Dalam bagian Atas!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString()) > Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Sisi Dalam Bagian Atas tidak mungkin lebih besar dari nilai Alas!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}					
					else if(Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString()) == Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Alas tidak mungkin sama dengan nilai Sisi Dalam bagian Atas!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString()) <= Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Alas tidak mungkin lebih kecil dari nilai Sisi Dalam bagian Bawah!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString()) >= Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Sisi Dalam Bagian Bawah tidak mungkin lebih besar dari nilai Alas!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}					
					else if(Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString()) == Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Alas tidak mungkin sama dengan nilai Sisi Dalam bagian Bawah!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString()) <= Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Sisi Dalam Bagian Atas tidak mungkin lebih kecil dari nilai Sisi Dalam Bagian Bawah!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SDA_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString()) >= Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Sisi Dalam Bagian Bawah tidak mungkin lebih besar dari nilai Sisi Dalam Bagian Atas!", Toast.LENGTH_LONG).show();				
						ET_Input_JajarGenjang_SDB_MC_Semua.requestFocus();
					}					
					else{	
						double I_Alas_JG_MC_Semua = Double.parseDouble(ET_Input_JajarGenjang_Alas_MC_Semua.getText().toString());
						double I_Tinggi_JG_MC_Semua = Double.parseDouble(ET_Input_JajarGenjang_Tinggi_MC_Semua.getText().toString());
						double I_SM_JG_MC_Semua = Double.parseDouble(ET_Input_JajarGenjang_SM_MC_Semua.getText().toString());
						double I_SDA_JG_MC_Semua = Double.parseDouble(ET_Input_JajarGenjang_SDA_MC_Semua.getText().toString());
						double I_SDB_JG_MC_Semua = Double.parseDouble(ET_Input_JajarGenjang_SDB_MC_Semua.getText().toString());
						double O_Luas_JG_MC_Semua = I_Alas_JG_MC_Semua * I_Tinggi_JG_MC_Semua;
						double O_Keliling_JG_MC_Semua = 2 * I_Alas_JG_MC_Semua + 2 * I_SM_JG_MC_Semua;
						double O_SetengahAlas_JG_MC_Semua = I_Alas_JG_MC_Semua / 2;
						double O_Diagonal1_JG_MC_Semua = Math.sqrt(Math.pow((I_SDA_JG_MC_Semua + I_SDB_JG_MC_Semua), 2) + Math.pow(I_Tinggi_JG_MC_Semua, 2));
						double O_Diagonal2_JG_MC_Semua = Math.sqrt(Math.pow((I_SDA_JG_MC_Semua - I_SDB_JG_MC_Semua - I_SDB_JG_MC_Semua), 2) + Math.pow(I_Tinggi_JG_MC_Semua, 2));
						
						ET_Output_JajarGenjang_Luas_MC_Semua.setText(String.valueOf(O_Luas_JG_MC_Semua));
						ET_Output_JajarGenjang_Keliling_MC_Semua.setText(String.valueOf(O_Keliling_JG_MC_Semua));
						ET_Output_JajarGenjang_SA_MC_Semua.setText(String.valueOf(O_SetengahAlas_JG_MC_Semua));
						ET_Output_JajarGenjang_D1_MC_Semua.setText(String.valueOf(O_Diagonal1_JG_MC_Semua));
						ET_Output_JajarGenjang_D2_MC_Semua.setText(String.valueOf(O_Diagonal2_JG_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_JajarGenjang_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Alas_MC_Semua.setText("");
				ET_Input_JajarGenjang_Tinggi_MC_Semua.setText("");
				ET_Input_JajarGenjang_SM_MC_Semua.setText("");
				ET_Input_JajarGenjang_SDA_MC_Semua.setText("");
				ET_Input_JajarGenjang_SDB_MC_Semua.setText("");
				ET_Output_JajarGenjang_Luas_MC_Semua.setText("");
				ET_Output_JajarGenjang_Keliling_MC_Semua.setText("");
				ET_Output_JajarGenjang_SA_MC_Semua.setText("");
				ET_Output_JajarGenjang_D1_MC_Semua.setText("");
				ET_Output_JajarGenjang_D2_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
			}
		});
		
		Button_Rumus_JG_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_JajarGenjang_Alas_MC_Semua.setText(" Nilai Alas [a]");
				ET_Input_JajarGenjang_Tinggi_MC_Semua.setText(" Nilai Tinggi [t]");
				ET_Input_JajarGenjang_SM_MC_Semua.setText("Nilai Sisi Miring [sm]");
				ET_Input_JajarGenjang_SDA_MC_Semua.setText("Sisi Dalam Bagian Atas [sda]");
				ET_Input_JajarGenjang_SDB_MC_Semua.setText("Sisi Dalam Bagian Bawah [sdb]");
				ET_Output_JajarGenjang_Luas_MC_Semua.setText(" a x t   (atau)   Alas x Tinggi");
				ET_Output_JajarGenjang_Keliling_MC_Semua.setText(" 2 x a + 2 x sm");
				ET_Output_JajarGenjang_SA_MC_Semua.setText(" ½ x a");
				ET_Output_JajarGenjang_D1_MC_Semua.setText(" √((sda+sdb)^2+t^2)");
				ET_Output_JajarGenjang_D2_MC_Semua.setText(" √(sda^2+t^2)");
				ET_Input_JajarGenjang_Alas_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_JajarGenjang_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_JajarGenjang_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_Semua.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_JajarGenjang_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_JajarGenjang_MC_Semua.this, FormLihatGambarJajarGenjang.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
