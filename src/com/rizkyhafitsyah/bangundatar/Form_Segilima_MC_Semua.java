package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;

public class Form_Segilima_MC_Semua extends Activity {
	TextView TV_Judul_SL_MC_Semua;
	TextView TV_SubJudul_SL_MC_Semua;
	ImageView IV_Gambar_SL_MC_Semua;
	TextView TV_Input_SL_Sisi_MC_Semua;
	TextView TV_Output_SL_Luas_MC_Semua;
	TextView TV_Output_SL_Keliling_MS_Semua;
	TextView TV_Output_SL_Diagonal_MC_Semua;
	TextView TV_Output_SL_Tinggi_MC_Semua;
	TextView TV_Output_SL_SL_MC_Semua;
	TextView TV_SatuanNilai_SL_Sisi_MC_Semua;
	TextView TV_SatuanNilai_SL_Luas_MC_Semua;
	TextView TV_SatuanNilai_SL_Keliling_MC_Semua;
	TextView TV_SatuanNilai_SL_Diagonal_MC_Semua;
	TextView TV_SatuanNilai_SL_Tinggi_MC_Semua;
	TextView TV_SatuanNilai_SL_SL_MC_Semua;
	EditText ET_Input_SL_Sisi_MC_Semua;
	EditText ET_Output_SL_Luas_MC_Semua;
	EditText ET_Output_SL_Keliling_MC_Semua;
	EditText ET_Output_SL_Diagonal_MC_Semua;
	EditText ET_Output_SL_Tinggi_MC_Semua;
	EditText ET_Output_SL_SL_MC_Semua;
	Button Button_Hitung_SL_MC_Semua;
	Button Button_Reset_SL_MC_Semua;
	Button Button_Detail_SL_MC_Semua;
	Button Button_Kembali_SL_MC_Semua;
	Button Button_Rumus_Segilima_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segilima_mc_semua);

        String CustomHuruf_SL_MC_Semua = "AGENCYR.TTF";
        Typeface TipeHuruf_SL_MC_Semua = Typeface.createFromAsset(getAssets(), CustomHuruf_SL_MC_Semua);

    	TV_Judul_SL_MC_Semua = (TextView)findViewById(R.id.TV_Judul_SL_MC_Semua);
    	TV_SubJudul_SL_MC_Semua = (TextView)findViewById(R.id.TV_SubJudul_SL_MC_Semua);
    	IV_Gambar_SL_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_SL_MC_Semua);
    	TV_Input_SL_Sisi_MC_Semua = (TextView)findViewById(R.id.TV_Input_SL_Sisi_MC_Semua);
    	TV_Output_SL_Luas_MC_Semua = (TextView)findViewById(R.id.TV_Output_SL_Luas_MC_Semua);
    	TV_Output_SL_Keliling_MS_Semua = (TextView)findViewById(R.id.TV_Output_SL_Keliling_MS_Semua);
    	TV_Output_SL_Diagonal_MC_Semua = (TextView)findViewById(R.id.TV_Output_SL_Diagonal_MC_Semua);
    	TV_Output_SL_Tinggi_MC_Semua = (TextView)findViewById(R.id.TV_Output_SL_Tinggi_MC_Semua);
    	TV_Output_SL_SL_MC_Semua = (TextView)findViewById(R.id.TV_Output_SL_SL_MC_Semua);
    	TV_SatuanNilai_SL_Sisi_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_Sisi_MC_Semua);
    	TV_SatuanNilai_SL_Luas_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_Luas_MC_Semua);
    	TV_SatuanNilai_SL_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_Keliling_MC_Semua);
    	TV_SatuanNilai_SL_Diagonal_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_Diagonal_MC_Semua);
    	TV_SatuanNilai_SL_Tinggi_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_Tinggi_MC_Semua);
    	TV_SatuanNilai_SL_SL_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_SL_SL_MC_Semua);
    	ET_Input_SL_Sisi_MC_Semua = (EditText)findViewById(R.id.ET_Input_SL_Sisi_MC_Semua);
    	ET_Output_SL_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_SL_Luas_MC_Semua);
    	ET_Output_SL_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_SL_Keliling_MC_Semua);
    	ET_Output_SL_Diagonal_MC_Semua = (EditText)findViewById(R.id.ET_Output_SL_Diagonal_MC_Semua);
    	ET_Output_SL_Tinggi_MC_Semua = (EditText)findViewById(R.id.ET_Output_SL_Tinggi_MC_Semua);
    	ET_Output_SL_SL_MC_Semua = (EditText)findViewById(R.id.ET_Output_SL_SL_MC_Semua);
    	Button_Hitung_SL_MC_Semua = (Button)findViewById(R.id.Button_Hitung_SL_MC_Semua);
    	Button_Reset_SL_MC_Semua = (Button)findViewById(R.id.Button_Reset_SL_MC_Semua);
    	Button_Detail_SL_MC_Semua = (Button)findViewById(R.id.Button_Detail_SL_MC_Semua);
    	Button_Kembali_SL_MC_Semua = (Button)findViewById(R.id.Button_Kembali_SL_MC_Semua);
    	Button_Rumus_Segilima_MC_Semua = (Button)findViewById(R.id.Button_Rumus_Segilima_MC_Semua);

       	TV_Judul_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SubJudul_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Input_SL_Sisi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Output_SL_Luas_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Output_SL_Keliling_MS_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Output_SL_Diagonal_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Output_SL_Tinggi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_Output_SL_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_Sisi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_Luas_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_Keliling_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_Diagonal_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_Tinggi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	TV_SatuanNilai_SL_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Input_SL_Sisi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Output_SL_Luas_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Output_SL_Keliling_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Output_SL_Diagonal_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Output_SL_Tinggi_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	ET_Output_SL_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	Button_Hitung_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	Button_Reset_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	Button_Detail_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	Button_Kembali_SL_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);
    	Button_Rumus_Segilima_MC_Semua.setTypeface(TipeHuruf_SL_MC_Semua);

    	//menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_SL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_SL_Sisi_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi [s]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_SL_Sisi_MC_Semua.requestFocus();
					}		
					else{	
						double I_SISI_SL_MC_Semua = Double.parseDouble(ET_Input_SL_Sisi_MC_Semua.getText().toString());
						double O_LUAS_SL_MC_Semua = 1.72 * Math.pow(I_SISI_SL_MC_Semua, 2);
						double O_KELILING_SL_MC_Semua = 5 * I_SISI_SL_MC_Semua;
						double O_DIAGONAL_SL_MC_Semua = 1 + Math.sqrt(5) / 2 * I_SISI_SL_MC_Semua;
						double O_TINGGI_SL_MC_Semua = Math.sqrt(Math.pow(O_DIAGONAL_SL_MC_Semua, 2) - Math.pow((I_SISI_SL_MC_Semua / 2), 2)); 
						double O_SETENGAH_LUAS_SL_MC_Semua = O_LUAS_SL_MC_Semua / 2;
						
						ET_Output_SL_Luas_MC_Semua.setText(String.valueOf(O_LUAS_SL_MC_Semua));
						ET_Output_SL_Keliling_MC_Semua.setText(String.valueOf(O_KELILING_SL_MC_Semua));
						ET_Output_SL_Diagonal_MC_Semua.setText(String.valueOf(O_DIAGONAL_SL_MC_Semua));
						ET_Output_SL_Tinggi_MC_Semua.setText(String.valueOf(O_TINGGI_SL_MC_Semua));
						ET_Output_SL_SL_MC_Semua.setText(String.valueOf(O_SETENGAH_LUAS_SL_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_SL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_SL_Sisi_MC_Semua.setText("");
				ET_Output_SL_Luas_MC_Semua.setText("");
				ET_Output_SL_Keliling_MC_Semua.setText("");
				ET_Output_SL_Diagonal_MC_Semua.setText("");
				ET_Output_SL_Tinggi_MC_Semua.setText("");
				ET_Output_SL_SL_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_SL_Sisi_MC_Semua.requestFocus();
			}
		});
    	
    	Button_Rumus_Segilima_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_SL_Sisi_MC_Semua.setText(" Sisi [s]");
				ET_Output_SL_Luas_MC_Semua.setText(" 1,72 x S^2   (atau)   S^2/4 x √(25 + 10 x √5)    (atau)   (5 x S^2)/4 cot phi/5   (atau)   1/4 x √(5(5 + 2√5)) x S^2   (atau)   5/4 x S^2 x cot⁡ 36 derajat");
				ET_Output_SL_Keliling_MC_Semua.setText(" 5 x S");
				ET_Output_SL_Diagonal_MC_Semua.setText(" (1 + √5)/2 x S");
				ET_Output_SL_Tinggi_MC_Semua.setText(" √(d^2 - (S/2)^2 )");
				ET_Output_SL_SL_MC_Semua.setText(" (1,72 x S^2) / 2");
				ET_Input_SL_Sisi_MC_Semua.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_SL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_SL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segilima_MC_Semua.this, FormLihatGambarSegiLima.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_SL_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Segilima_MC_Semua.this, FormLihatGambarSegiLima.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
