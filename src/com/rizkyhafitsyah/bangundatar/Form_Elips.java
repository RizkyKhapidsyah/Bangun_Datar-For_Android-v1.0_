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

public class Form_Elips extends Activity {
	TextView TV_Judul_Elips;
	TextView TV_SubJudul_Elips;
	ImageView IV_Gambar_Elips;
	TextView TV_Input_Elips_SMy;
	TextView TV_Input_Elips_SMn;
	TextView TV_Output_Elips_Luas;
	TextView TV_Output_Elips_Keliling;
	TextView TV_Output_Elips_Panjang;
	TextView TV_Output_Elips_Lebar;
	TextView TV_Output_Elips_S_Luas;
	TextView TV_Output_Elips_S_Keliling;
	TextView TV_SatuanNilai_Elips_SMy;
	TextView TV_SatuanNilai_Elips_SMn;
	TextView TV_SatuanNilai_Elips_Luas;
	TextView TV_SatuanNilai_Elips_Keliling;
	TextView TV_SatuanNilai_Elips_Panjang;
	TextView TV_SatuanNilai_Elips_Lebar;
	TextView TV_SatuanNilai_Elips_S_Luas;
	TextView TV_SatuanNilai_Elips_S_Keliling;
	EditText ET_Input_Elips_SMy;
	EditText ET_Input_Elips_SMn;
	EditText ET_Output_Elips_Luas;
	EditText ET_Output_Elips_Keliling;
	EditText ET_Output_Elips_Panjang;
	EditText ET_Output_Elips_Lebar;
	EditText ET_Output_Elips_S_Luas;
	EditText ET_Output_Elips_S_Keliling;
	Button Button_Hitung_Elips;
	Button Button_Reset_Elips;
	Button Button_Detail_Elips;
	Button Button_Kembali_Elips;
	Button Button_Rumus_Elips;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_elips);

        String CustomHuruf_Elips = "AGENCYR.TTF";
        Typeface TipeHuruf_Elips = Typeface.createFromAsset(getAssets(), CustomHuruf_Elips);

    	 TV_Judul_Elips = (TextView)findViewById(R.id.TV_Judul_Elips);
    	 TV_SubJudul_Elips = (TextView)findViewById(R.id.TV_SubJudul_Elips);
    	 IV_Gambar_Elips = (ImageView)findViewById(R.id.IV_Gambar_Elips);
    	 TV_Input_Elips_SMy = (TextView)findViewById(R.id.TV_Input_Elips_SMy);
    	 TV_Input_Elips_SMn = (TextView)findViewById(R.id.TV_Input_Elips_SMn);
    	 TV_Output_Elips_Luas = (TextView)findViewById(R.id.TV_Output_Elips_Luas);
    	 TV_Output_Elips_Keliling = (TextView)findViewById(R.id.TV_Output_Elips_Keliling);
    	 TV_Output_Elips_Panjang = (TextView)findViewById(R.id.TV_Output_Elips_Panjang);
    	 TV_Output_Elips_Lebar = (TextView)findViewById(R.id.TV_Output_Elips_Lebar);
    	 TV_Output_Elips_S_Luas = (TextView)findViewById(R.id.TV_Output_Elips_S_Luas);
    	 TV_Output_Elips_S_Keliling = (TextView)findViewById(R.id.TV_Output_Elips_S_Keliling);
    	 TV_SatuanNilai_Elips_SMy = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_SMy);
    	 TV_SatuanNilai_Elips_SMn = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_SMn);
    	 TV_SatuanNilai_Elips_Luas = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_Luas);
    	 TV_SatuanNilai_Elips_Keliling = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_Keliling);
    	 TV_SatuanNilai_Elips_Panjang = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_Panjang);
    	 TV_SatuanNilai_Elips_Lebar = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_Lebar);
    	 TV_SatuanNilai_Elips_S_Luas = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_S_Luas);
    	 TV_SatuanNilai_Elips_S_Keliling = (TextView)findViewById(R.id.TV_SatuanNilai_Elips_S_Keliling);
    	 ET_Input_Elips_SMy = (EditText)findViewById(R.id.ET_Input_Elips_SMy);
    	 ET_Input_Elips_SMn = (EditText)findViewById(R.id.ET_Input_Elips_SMn);
    	 ET_Output_Elips_Luas = (EditText)findViewById(R.id.ET_Output_Elips_Luas);
    	 ET_Output_Elips_Keliling = (EditText)findViewById(R.id.ET_Output_Elips_Keliling);
    	 ET_Output_Elips_Panjang = (EditText)findViewById(R.id.ET_Output_Elips_Panjang);
    	 ET_Output_Elips_Lebar = (EditText)findViewById(R.id.ET_Output_Elips_Lebar);
    	 ET_Output_Elips_S_Luas = (EditText)findViewById(R.id.ET_Output_Elips_S_Luas);
    	 ET_Output_Elips_S_Keliling = (EditText)findViewById(R.id.ET_Output_Elips_S_Keliling);
    	 Button_Hitung_Elips = (Button)findViewById(R.id.Button_Hitung_Elips);
    	 Button_Reset_Elips = (Button)findViewById(R.id.Button_Reset_Elips);
    	 Button_Detail_Elips = (Button)findViewById(R.id.Button_Detail_Elips);
    	 Button_Kembali_Elips = (Button)findViewById(R.id.Button_Kembali_Elips);
    	 Button_Rumus_Elips = (Button)findViewById(R.id.Button_Rumus_Elips);
 
    	 TV_Judul_Elips.setTypeface(TipeHuruf_Elips);
    	 TV_SubJudul_Elips.setTypeface(TipeHuruf_Elips);
    	 TV_Input_Elips_SMy.setTypeface(TipeHuruf_Elips);
    	 TV_Input_Elips_SMn.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_Luas.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_Keliling.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_Panjang.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_Lebar.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_S_Luas.setTypeface(TipeHuruf_Elips);
    	 TV_Output_Elips_S_Keliling.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_SMy.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_SMn.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_Luas.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_Keliling.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_Panjang.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_Lebar.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_S_Luas.setTypeface(TipeHuruf_Elips);
    	 TV_SatuanNilai_Elips_S_Keliling.setTypeface(TipeHuruf_Elips);
    	 ET_Input_Elips_SMy.setTypeface(TipeHuruf_Elips);
    	 ET_Input_Elips_SMn.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_Luas.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_Keliling.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_Panjang.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_Lebar.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_S_Luas.setTypeface(TipeHuruf_Elips);
    	 ET_Output_Elips_S_Keliling.setTypeface(TipeHuruf_Elips);
    	 Button_Hitung_Elips.setTypeface(TipeHuruf_Elips);
    	 Button_Reset_Elips.setTypeface(TipeHuruf_Elips);
    	 Button_Detail_Elips.setTypeface(TipeHuruf_Elips);
    	 Button_Kembali_Elips.setTypeface(TipeHuruf_Elips);
    	 Button_Rumus_Elips.setTypeface(TipeHuruf_Elips);
        
		 //menambahkan event klik untuk perintah di tombol hitung
    	 Button_Hitung_Elips.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_Elips_SMy.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sumbu Mayor [r1]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_Elips_SMy.requestFocus();
					}
					else if(ET_Input_Elips_SMn.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sumbu Minor [r2]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_Elips_SMn.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_Elips_SMy.getText().toString()) <= Double.parseDouble(ET_Input_Elips_SMn.getText().toString())){
						Toast.makeText(getApplication(), "Nilai Sumbu Mayor [r1] Tidak Pernah Sama dan Tidak Lebih Kecil dari Sumbu Minor [r2]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_Elips_SMy.requestFocus();
					}					
					else{	
						double I_SMy_Elips = Double.parseDouble(ET_Input_Elips_SMy.getText().toString());
						double I_SMn_Elips = Double.parseDouble(ET_Input_Elips_SMn.getText().toString());
						double O_LUAS_Elips = 3.14 * I_SMy_Elips * I_SMn_Elips;
						double O_KELILING_Elips = 2 * 3.14 * Math.sqrt(Math.pow(I_SMy_Elips, 2) + Math.pow(I_SMn_Elips, 2)) / 2;
						double O_PANJANG_Elips = 2 * I_SMy_Elips;
						double O_LEBAR_Elips = 2 * I_SMn_Elips;
						double O_SETENGAH_LUAS_Elips = O_LUAS_Elips / 2;
						double O_SETENGAH_KELILING_Elips = O_KELILING_Elips / 2;
						
						ET_Output_Elips_Luas.setText(String.valueOf(O_LUAS_Elips));
						ET_Output_Elips_Keliling.setText(String.valueOf(O_KELILING_Elips));
						ET_Output_Elips_Panjang.setText(String.valueOf(O_PANJANG_Elips));
						ET_Output_Elips_Lebar.setText(String.valueOf(O_LEBAR_Elips));
						ET_Output_Elips_S_Luas.setText(String.valueOf(O_SETENGAH_LUAS_Elips));
						ET_Output_Elips_S_Keliling.setText(String.valueOf(O_SETENGAH_KELILING_Elips));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	 Button_Reset_Elips.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_Elips_SMy.setText("");
				ET_Input_Elips_SMn.setText("");
				ET_Output_Elips_Luas.setText("");
				ET_Output_Elips_Keliling.setText("");
				ET_Output_Elips_Panjang.setText("");
				ET_Output_Elips_Lebar.setText("");
				ET_Output_Elips_S_Luas.setText("");
				ET_Output_Elips_S_Keliling.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_Elips_SMy.requestFocus();
			}
		});
	
    	 Button_Rumus_Elips.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
 				ET_Input_Elips_SMy.setText(" Sumbu Mayor [r1]");
 				ET_Input_Elips_SMn.setText(" Sumbu Minor [r2]");
 				ET_Output_Elips_Luas.setText(" 	phi x SumbuMayor x SumbuMinor   (atau)   3,14 x r1 x r2   (atau)   22/7 x r1 x r2");
 				ET_Output_Elips_Keliling.setText(" 2 x phi x (√(SumbuMayor^2 + SumbuMinor^2)) / 2   (atau)   2 x 3,14 x √(r1^2 + r2^2) / 2");
 				ET_Output_Elips_Panjang.setText(" 2 x SumbuMayor   (atau)   2 x r1");
 				ET_Output_Elips_Lebar.setText(" 2 x SumbuMinor   (atau)   2 x r1");
 				ET_Output_Elips_S_Luas.setText(" (3,14 x r1 x r2) / 2");
 				ET_Output_Elips_S_Keliling.setText(" (2 x 3,14 x √(r1^2 + r2^2 ) / 2) / 2");
 				ET_Input_Elips_SMy.requestFocus();
 			}
 		});
    	 
		//menambahkan event klik untuk perintah di tombol kembali
    	 Button_Kembali_Elips.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	 Button_Detail_Elips.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Elips.this, FormLihatGambarElips.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	 IV_Gambar_Elips.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Elips.this, FormLihatGambarElips.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
