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

public class Form_BujurSangkar_MC_HS extends Activity {
	TextView TV_Judul_BS_MC_HS;
	TextView TV_SubJudul_BS_MC_HS;
	ImageView IV_Gambar_BS_MC_HS;
	TextView TV_Input_BS_L_MC_HS;
	TextView TV_Output_BS_Sisi_MC_HS;
	TextView TV_SatuanNilai_BS_L_MC_HS;
	TextView TV_SatuanNilai_BS_Sisi_MC_HS;
	EditText ET_Input_BS_L_MC_HS;
	EditText ET_Output_BS_Sisi_MC_HS;
	Button Button_Hitung_BS_MC_HS;
	Button Button_Reset_BS_MC_HS;
	Button Button_Detail_BS_MC_HS;
	Button Button_Kembali_BS_MC_HS;
	Button Button_Rumus_BS_MC_HS;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_bujursangkar_mc_hs);

        String CustomHuruf_BS_MC_HS = "AGENCYR.TTF";
        Typeface TipeHuruf_BS_MC_HS = Typeface.createFromAsset(getAssets(), CustomHuruf_BS_MC_HS);

    	TV_Judul_BS_MC_HS = (TextView)findViewById(R.id.TV_Judul_BS_MC_HS);
    	TV_SubJudul_BS_MC_HS = (TextView)findViewById(R.id.TV_SubJudul_BS_MC_HS);
    	IV_Gambar_BS_MC_HS = (ImageView)findViewById(R.id.IV_Gambar_BS_MC_HS);
    	TV_Input_BS_L_MC_HS = (TextView)findViewById(R.id.TV_Input_BS_L_MC_HS);
    	TV_Output_BS_Sisi_MC_HS = (TextView)findViewById(R.id.TV_Output_BS_Sisi_MC_HS);
    	TV_SatuanNilai_BS_L_MC_HS = (TextView)findViewById(R.id.TV_SatuanNilai_BS_L_MC_HS);
    	TV_SatuanNilai_BS_Sisi_MC_HS = (TextView)findViewById(R.id.TV_SatuanNilai_BS_Sisi_MC_HS);
    	ET_Input_BS_L_MC_HS = (EditText)findViewById(R.id.ET_Input_BS_L_MC_HS);
    	ET_Output_BS_Sisi_MC_HS = (EditText)findViewById(R.id.ET_Output_BS_Sisi_MC_HS);
    	Button_Hitung_BS_MC_HS = (Button)findViewById(R.id.Button_Hitung_BS_MC_HS);
    	Button_Reset_BS_MC_HS = (Button)findViewById(R.id.Button_Reset_BS_MC_HS);
    	Button_Detail_BS_MC_HS = (Button)findViewById(R.id.Button_Detail_BS_MC_HS);
    	Button_Kembali_BS_MC_HS = (Button)findViewById(R.id.Button_Kembali_BS_MC_HS);
    	Button_Rumus_BS_MC_HS = (Button)findViewById(R.id.Button_Rumus_BS_MC_HS);

    	TV_Judul_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	TV_SubJudul_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	TV_Input_BS_L_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	TV_Output_BS_Sisi_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	TV_SatuanNilai_BS_L_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	TV_SatuanNilai_BS_Sisi_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	ET_Input_BS_L_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	ET_Output_BS_Sisi_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	Button_Hitung_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	Button_Reset_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	Button_Detail_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	Button_Kembali_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	Button_Rumus_BS_MC_HS.setTypeface(TipeHuruf_BS_MC_HS);
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_BS_L_MC_HS.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Luas Bujur Sangkar. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_BS_L_MC_HS.requestFocus();
					}		
					else{	
						double I_LUAS_BS_MC_HS = Double.parseDouble(ET_Input_BS_L_MC_HS.getText().toString());
						double O_SISI_BS_MC_HS = Math.sqrt(I_LUAS_BS_MC_HS);
						
						ET_Output_BS_Sisi_MC_HS.setText(String.valueOf(O_SISI_BS_MC_HS));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BS_L_MC_HS.setText("");
				ET_Output_BS_Sisi_MC_HS.setText("");
				ET_Input_BS_L_MC_HS.setTextSize(12);
				ET_Output_BS_Sisi_MC_HS.setTextSize(12);				
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_BS_L_MC_HS.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BujurSangkar_MC_HS.this, FormLihatGambarBS.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
    	

    	IV_Gambar_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BujurSangkar_MC_HS.this, FormLihatGambarBS.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	Button_Rumus_BS_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BS_L_MC_HS.setText("Nilai Luas");
				ET_Output_BS_Sisi_MC_HS.setText(" √L atau 'Akar Dari Luas'");
				ET_Input_BS_L_MC_HS.setTextSize(17);
				ET_Output_BS_Sisi_MC_HS.setTextSize(17);
				ET_Input_BS_L_MC_HS.requestFocus();
			}
		});
    	
	}
}
