package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Form_BelahKetupat_MC_Semua extends Activity {
	ImageView IV_Gambar_BelahKetupat_MC_Semua;
	EditText ET_Input_BelahKetupat_D1_MC_Semua;
	EditText ET_Input_BelahKetupat_D2_MC_Semua;
	EditText ET_Input_BelahKetupat_Sisi_MC_Semua;
	EditText ET_Output_BelahKetupat_Luas_MC_Semua;
	EditText ET_Output_BelahKetupat_Keliling_MC_Semua;
	EditText ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua;
	Button Button_Hitung_BelahKetupat_MC_Semua;
	Button Button_Reset_BelahKetupat_MC_Semua;
	Button Button_Kembali_BelahKetupat_MC_Semua;
	Button Button_Detail_BelahKetupat_MC_Semua;
	Button Button_Rumus_BK_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_belahketupat_mc_semua);
		
		IV_Gambar_BelahKetupat_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_BelahKetupat_MC_Semua);
		ET_Input_BelahKetupat_D1_MC_Semua = (EditText)findViewById(R.id.ET_Input_BelahKetupat_D1_MC_Semua);
		ET_Input_BelahKetupat_D2_MC_Semua = (EditText)findViewById(R.id.ET_Input_BelahKetupat_D2_MC_Semua);
		ET_Input_BelahKetupat_Sisi_MC_Semua = (EditText)findViewById(R.id.ET_Input_BelahKetupat_Sisi_MC_Semua);
		ET_Output_BelahKetupat_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_BelahKetupat_Luas_MC_Semua);
		ET_Output_BelahKetupat_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_BelahKetupat_Keliling_MC_Semua);
		ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua = (EditText)findViewById(R.id.ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua);
		Button_Hitung_BelahKetupat_MC_Semua = (Button)findViewById(R.id.Button_Hitung_BelahKetupat_MC_Semua);
		Button_Reset_BelahKetupat_MC_Semua = (Button)findViewById(R.id.Button_Reset_BelahKetupat_MC_Semua);
		Button_Kembali_BelahKetupat_MC_Semua = (Button)findViewById(R.id.Button_Kembali_BelahKetupat_MC_Semua);
		Button_Detail_BelahKetupat_MC_Semua = (Button)findViewById(R.id.Button_Detail_BelahKetupat_MC_Semua);
		Button_Rumus_BK_MC_Semua = (Button)findViewById(R.id.Button_Rumus_BK_MC_Semua);
		
		//menambahkan event klik untuk perintah di tombol hitung
		Button_Hitung_BelahKetupat_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_BelahKetupat_D1_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal 1 (d1)!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_D1_MC_Semua.requestFocus();
					}
					else if(ET_Input_BelahKetupat_D2_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Diagonal 2 (d2)!", Toast.LENGTH_LONG).show();
						ET_Input_BelahKetupat_D2_MC_Semua.requestFocus();
					}
					else if(ET_Input_BelahKetupat_Sisi_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai Dari Sisi!", Toast.LENGTH_LONG).show();				
						ET_Input_BelahKetupat_Sisi_MC_Semua.requestFocus();
					}	
					else if(Double.parseDouble(ET_Input_BelahKetupat_D2_MC_Semua.getText().toString()) != Double.parseDouble(ET_Input_BelahKetupat_D1_MC_Semua.getText().toString())) {
						Toast.makeText(getApplication(), "Nilai Diagonal 1 harus sama dengan Nilai Diagonal 2!", Toast.LENGTH_LONG).show();				
						ET_Input_BelahKetupat_D1_MC_Semua.requestFocus();
					}							
					else{	
						double I_D1_BelahKetupat_MC_Semua = Double.parseDouble(ET_Input_BelahKetupat_D1_MC_Semua.getText().toString());
						double I_D2_BelahKetupat_MC_Semua = Double.parseDouble(ET_Input_BelahKetupat_D2_MC_Semua.getText().toString());
						double I_Sisi_BelahKetupat_MC_Semua = Double.parseDouble(ET_Input_BelahKetupat_Sisi_MC_Semua.getText().toString());
						double O_Luas_belahKetupat_MC_Semua = 0.5 * I_D1_BelahKetupat_MC_Semua * I_D2_BelahKetupat_MC_Semua;
						double O_Keliling_BelahKetupat_MC_Semua = 4 * I_Sisi_BelahKetupat_MC_Semua;
						double O_SetengahDiagonal_BelahKetupat_MC_Semua = I_Sisi_BelahKetupat_MC_Semua / 2;
						
						ET_Output_BelahKetupat_Luas_MC_Semua.setText(String.valueOf(O_Luas_belahKetupat_MC_Semua));
						ET_Output_BelahKetupat_Keliling_MC_Semua.setText(String.valueOf(O_Keliling_BelahKetupat_MC_Semua));
						ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua.setText(String.valueOf(O_SetengahDiagonal_BelahKetupat_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		Button_Reset_BelahKetupat_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_D1_MC_Semua.setText("");
				ET_Input_BelahKetupat_D2_MC_Semua.setText("");
				ET_Input_BelahKetupat_Sisi_MC_Semua.setText("");
				ET_Output_BelahKetupat_Luas_MC_Semua.setText("");
				ET_Output_BelahKetupat_Keliling_MC_Semua.setText("");
				ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_BelahKetupat_D1_MC_Semua.requestFocus();
			}
		});
		
		Button_Rumus_BK_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BelahKetupat_D1_MC_Semua.setText("Nilai Diagonal 1 [d1]");
				ET_Input_BelahKetupat_D2_MC_Semua.setText("NIlai Diagonal 2 [d2]");
				ET_Input_BelahKetupat_Sisi_MC_Semua.setText("Nilai Sisi [s]");
				ET_Output_BelahKetupat_Luas_MC_Semua.setText(" ½ x d1 x d2");
				ET_Output_BelahKetupat_Keliling_MC_Semua.setText(" s + s + s + s");
				ET_Output_BelahKetupat_SetengahDiagonal_MC_Semua.setText(" ½ x d1   (atau)   ½ x d2");
				ET_Input_BelahKetupat_D1_MC_Semua.requestFocus();
			}
		});		
	
		//menambahkan event klik untuk perintah di tombol kembali
		Button_Kembali_BelahKetupat_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		Button_Detail_BelahKetupat_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_Semua.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		IV_Gambar_BelahKetupat_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BelahKetupat_MC_Semua.this, FormLihatGambarBelahKetupat.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});	


	}
}
