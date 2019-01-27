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

public class Form_SegiEnam_Beraturan extends Activity {
	TextView TV_Judul_SE;
	TextView TV_SubJudul_SE;
	ImageView IV_Gambar_SE;
	TextView TV_Input_SE_Sisi;
	TextView TV_Output_SE_Luas;
	TextView TV_Output_SE_Keliling;
	TextView TV_Output_SE_Diagonal;
	TextView TV_Output_SE_Tinggi;
	TextView TV_Output_SE_SetengahDiagonal;
	TextView TV_Output_SE_SetengahLuas;
	TextView TV_SatuanNilai_SE_Sisi;
	TextView TV_SatuanNilai_SE_Luas;
	TextView TV_SatuanNilai_SE_Keliling;
	TextView TV_SatuanNilai_SE_Diagonal;
	TextView TV_SatuanNilai_SE_Tinggi;
	TextView TV_SatuanNilai_SE_SetengahDiagonal;
	TextView TV_SatuanNilai_SE_SetengahLuas;
	EditText ET_Input_SE_Sisi;
	EditText ET_Output_SE_Luas;
	EditText ET_Output_SE_Keliling;
	EditText ET_Output_SE_Diagonal;
	EditText ET_Output_SE_Tinggi;
	EditText ET_Output_SE_SetengahDiagonal;
	EditText ET_Output_SE_SetengahLuas;
	Button Button_Hitung_SE;
	Button Button_Reset_SE;
	Button Button_Detail_SE;
	Button Button_Kembali_SE;
	Button Button_Rumus_SE;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segienam_beraturan);

        String CustomHuruf_SE = "AGENCYR.TTF";
        Typeface TipeHuruf_SE = Typeface.createFromAsset(getAssets(), CustomHuruf_SE);

    	TV_Judul_SE = (TextView)findViewById(R.id.TV_Judul_SE);
    	TV_SubJudul_SE = (TextView)findViewById(R.id.TV_SubJudul_SE);
    	IV_Gambar_SE = (ImageView)findViewById(R.id.IV_Gambar_SE);
    	TV_Input_SE_Sisi = (TextView)findViewById(R.id.TV_Input_SE_Sisi);
    	TV_Output_SE_Luas = (TextView)findViewById(R.id.TV_Output_SE_Luas);
    	TV_Output_SE_Keliling = (TextView)findViewById(R.id.TV_Output_SE_Keliling);
    	TV_Output_SE_Diagonal = (TextView)findViewById(R.id.TV_Output_SE_Diagonal);
    	TV_Output_SE_Tinggi = (TextView)findViewById(R.id.TV_Output_SE_Tinggi);
    	TV_Output_SE_SetengahDiagonal = (TextView)findViewById(R.id.TV_Output_SE_SetengahDiagonal);
    	TV_Output_SE_SetengahLuas = (TextView)findViewById(R.id.TV_Output_SE_SetengahLuas);
    	TV_SatuanNilai_SE_Sisi = (TextView)findViewById(R.id.TV_SatuanNilai_SE_Sisi);
    	TV_SatuanNilai_SE_Luas = (TextView)findViewById(R.id.TV_SatuanNilai_SE_Luas);
    	TV_SatuanNilai_SE_Keliling = (TextView)findViewById(R.id.TV_SatuanNilai_SE_Keliling);
    	TV_SatuanNilai_SE_Diagonal = (TextView)findViewById(R.id.TV_SatuanNilai_SE_Diagonal);
    	TV_SatuanNilai_SE_Tinggi = (TextView)findViewById(R.id.TV_SatuanNilai_SE_Tinggi);
    	TV_SatuanNilai_SE_SetengahDiagonal = (TextView)findViewById(R.id.TV_SatuanNilai_SE_SetengahDiagonal);
    	TV_SatuanNilai_SE_SetengahLuas = (TextView)findViewById(R.id.TV_SatuanNilai_SE_SetengahLuas);
    	ET_Input_SE_Sisi = (EditText)findViewById(R.id.ET_Input_SE_Sisi);
    	ET_Output_SE_Luas = (EditText)findViewById(R.id.ET_Output_SE_Luas);
    	ET_Output_SE_Keliling = (EditText)findViewById(R.id.ET_Output_SE_Keliling);
    	ET_Output_SE_Diagonal = (EditText)findViewById(R.id.ET_Output_SE_Diagonal);
    	ET_Output_SE_Tinggi = (EditText)findViewById(R.id.ET_Output_SE_Tinggi);
    	ET_Output_SE_SetengahDiagonal = (EditText)findViewById(R.id.ET_Output_SE_SetengahDiagonal);
    	ET_Output_SE_SetengahLuas = (EditText)findViewById(R.id.ET_Output_SE_SetengahLuas);
    	Button_Hitung_SE = (Button)findViewById(R.id.Button_Hitung_SE);
    	Button_Reset_SE = (Button)findViewById(R.id.Button_Reset_SE);
    	Button_Detail_SE = (Button)findViewById(R.id.Button_Detail_SE);
    	Button_Kembali_SE = (Button)findViewById(R.id.Button_Kembali_SE);
    	Button_Rumus_SE = (Button)findViewById(R.id.Button_Rumus_SE);
        
    	TV_Judul_SE.setTypeface(TipeHuruf_SE);
    	TV_SubJudul_SE.setTypeface(TipeHuruf_SE);
    	TV_Input_SE_Sisi.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_Luas.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_Keliling.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_Diagonal.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_Tinggi.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_SetengahDiagonal.setTypeface(TipeHuruf_SE);
    	TV_Output_SE_SetengahLuas.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_Sisi.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_Luas.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_Keliling.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_Diagonal.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_Tinggi.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_SetengahDiagonal.setTypeface(TipeHuruf_SE);
    	TV_SatuanNilai_SE_SetengahLuas.setTypeface(TipeHuruf_SE);
    	ET_Input_SE_Sisi.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_Luas.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_Keliling.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_Diagonal.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_Tinggi.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_SetengahDiagonal.setTypeface(TipeHuruf_SE);
    	ET_Output_SE_SetengahLuas.setTypeface(TipeHuruf_SE);
    	Button_Hitung_SE.setTypeface(TipeHuruf_SE);
    	Button_Reset_SE.setTypeface(TipeHuruf_SE);
    	Button_Detail_SE.setTypeface(TipeHuruf_SE);
    	Button_Kembali_SE.setTypeface(TipeHuruf_SE);
    	Button_Rumus_SE.setTypeface(TipeHuruf_SE);
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_SE_Sisi.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi [s]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_SE_Sisi.requestFocus();
					}		
					else{	
						double I_SISI_SE = Double.parseDouble(ET_Input_SE_Sisi.getText().toString());
						double O_LUAS_SE = (Math.sqrt(3) * 3 / 2) * Math.pow(I_SISI_SE, 2);
						double O_KELILING_SE = 6 * I_SISI_SE;
						double O_DIAGONAL_SE = 2 * I_SISI_SE;
						double O_TINGGI_SE = Math.sqrt(3) * I_SISI_SE;
						double O_SETENGAH_DIAGONAL_SE = O_DIAGONAL_SE / 2;
						double O_SETENGAH_LUAS_SE = O_LUAS_SE / 2;
						
						ET_Output_SE_Luas.setText(String.valueOf(O_LUAS_SE));
						ET_Output_SE_Keliling.setText(String.valueOf(O_KELILING_SE));
						ET_Output_SE_Diagonal.setText(String.valueOf(O_DIAGONAL_SE));
						ET_Output_SE_Tinggi.setText(String.valueOf(O_TINGGI_SE));
						ET_Output_SE_SetengahDiagonal.setText(String.valueOf(O_SETENGAH_DIAGONAL_SE));
						ET_Output_SE_SetengahLuas.setText(String.valueOf(O_SETENGAH_LUAS_SE));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_SE_Sisi.setText("");
				ET_Output_SE_Luas.setText("");
				ET_Output_SE_Keliling.setText("");
				ET_Output_SE_Diagonal.setText("");
				ET_Output_SE_Tinggi.setText("");
				ET_Output_SE_SetengahDiagonal.setText("");
				ET_Output_SE_SetengahLuas.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_SE_Sisi.requestFocus();
			}
		});
    	
    	Button_Rumus_SE.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				ET_Input_SE_Sisi.setText(" Sisi [s]");
    				ET_Output_SE_Luas.setText(" 2,598 x s^2   (atau)   (3√3)/2 x s^2   (atau)   1 x 5√3");
    				ET_Output_SE_Keliling.setText(" 6 x s");
    				ET_Output_SE_Diagonal.setText(" 2 x s");
    				ET_Output_SE_Tinggi.setText(" (√3) x s");
    				ET_Output_SE_SetengahDiagonal.setText(" (2 x S) / 2");
    				ET_Output_SE_SetengahLuas.setText(" (2,598 x s^2) / 2");
    				ET_Input_SE_Sisi.requestFocus();
    			}
    		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_SegiEnam_Beraturan.this, FormLihatGambarSegiEnam.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_SE.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_SegiEnam_Beraturan.this, FormLihatGambarSegiEnam.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
