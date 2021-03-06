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

public class Form_Trapesium_SikuSiku_MC_HSA extends Activity {
	TextView TV_Judul_TSKu_MC_HSA;
	TextView TV_SubJudul_TSKu_MC_HSA;
	ImageView IV_Gambar_TSKu_MC_HSA;
	TextView TV_Input_TSKu_Luas_MC_HSA;
	TextView TV_Input_TSKu_T_MC_HSA;
	TextView TV_Input_TSKu_SB_MC_HSA;
	TextView TV_Output_TSKu_SA_MC_HSA;
	TextView TV_SatuanNilai_TSKu_Luas_MC_HSA;
	TextView TV_SatuanNilai_TSKu_T_MC_HSA;
	TextView TV_SatuanNilai_TSKu_SB_MC_HSA;
	TextView TV_SatuanNilai_TSKu_SA_MC_HSA;
	EditText ET_Input_TSKu_Luas_MC_HSA;
	EditText ET_Input_TSKu_T_MC_HSA;
	EditText ET_Input_TSKu_SB_MC_HSA;
	EditText ET_Output_TSKu_SA_MC_HSA;
	Button Button_Hitung_TSKu_MC_HSA;
	Button Button_Reset_TSKu_MC_HSA;
	Button Button_Kembali_TSKu_MC_HSA;
	Button Button_Detail_TSKu_MC_HSA;
	Button Button_Rumus_TSS_MC_HSA;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_sikusiku_mc_hsa);

        String CustomHuruf_TSKu_MC_HSA = "AGENCYR.TTF";
        Typeface TipeHuruf_TSKu_MC_HSA = Typeface.createFromAsset(getAssets(), CustomHuruf_TSKu_MC_HSA);

    	TV_Judul_TSKu_MC_HSA = (TextView)findViewById(R.id.TV_Judul_TSKu_MC_HSA);
    	TV_SubJudul_TSKu_MC_HSA = (TextView)findViewById(R.id.TV_SubJudul_TSKu_MC_HSA);
    	IV_Gambar_TSKu_MC_HSA = (ImageView)findViewById(R.id.IV_Gambar_TSKu_MC_HSA);
    	TV_Input_TSKu_Luas_MC_HSA = (TextView)findViewById(R.id.TV_Input_TSKu_Luas_MC_HSA);
    	TV_Input_TSKu_T_MC_HSA = (TextView)findViewById(R.id.TV_Input_TSKu_T_MC_HSA);
    	TV_Input_TSKu_SB_MC_HSA = (TextView)findViewById(R.id.TV_Input_TSKu_SB_MC_HSA);
    	TV_Output_TSKu_SA_MC_HSA = (TextView)findViewById(R.id.TV_Output_TSKu_SA_MC_HSA);
    	TV_SatuanNilai_TSKu_Luas_MC_HSA = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_Luas_MC_HSA);
    	TV_SatuanNilai_TSKu_T_MC_HSA = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_T_MC_HSA);
    	TV_SatuanNilai_TSKu_SB_MC_HSA = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SB_MC_HSA);
    	TV_SatuanNilai_TSKu_SA_MC_HSA = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SA_MC_HSA);
    	ET_Input_TSKu_Luas_MC_HSA = (EditText)findViewById(R.id.ET_Input_TSKu_Luas_MC_HSA);
    	ET_Input_TSKu_T_MC_HSA = (EditText)findViewById(R.id.ET_Input_TSKu_T_MC_HSA);
    	ET_Input_TSKu_SB_MC_HSA = (EditText)findViewById(R.id.ET_Input_TSKu_SB_MC_HSA);
    	ET_Output_TSKu_SA_MC_HSA = (EditText)findViewById(R.id.ET_Output_TSKu_SA_MC_HSA);
    	Button_Hitung_TSKu_MC_HSA = (Button)findViewById(R.id.Button_Hitung_TSKu_MC_HSA);
    	Button_Reset_TSKu_MC_HSA = (Button)findViewById(R.id.Button_Reset_TSKu_MC_HSA);
    	Button_Kembali_TSKu_MC_HSA = (Button)findViewById(R.id.Button_Kembali_TSKu_MC_HSA);
    	Button_Detail_TSKu_MC_HSA = (Button)findViewById(R.id.Button_Detail_TSKu_MC_HSA);
    	Button_Rumus_TSS_MC_HSA = (Button)findViewById(R.id.Button_Rumus_TSS_MC_HSA);

    	TV_Judul_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_SubJudul_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_Input_TSKu_Luas_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_Input_TSKu_T_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_Input_TSKu_SB_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_Output_TSKu_SA_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_SatuanNilai_TSKu_Luas_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_SatuanNilai_TSKu_T_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_SatuanNilai_TSKu_SB_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	TV_SatuanNilai_TSKu_SA_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	ET_Input_TSKu_Luas_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	ET_Input_TSKu_T_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	ET_Input_TSKu_SB_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	ET_Output_TSKu_SA_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	Button_Hitung_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	Button_Reset_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	Button_Kembali_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	Button_Detail_TSKu_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
    	Button_Rumus_TSS_MC_HSA.setTypeface(TipeHuruf_TSKu_MC_HSA);
        
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_TSKu_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_TSKu_Luas_MC_HSA.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Luas.", Toast.LENGTH_LONG).show();
						ET_Input_TSKu_Luas_MC_HSA.requestFocus();
					}		
					else if(ET_Input_TSKu_T_MC_HSA.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_T_MC_HSA.requestFocus();
					}
					else if(ET_Input_TSKu_SB_MC_HSA.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah [sb]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_SB_MC_HSA.requestFocus();
					}
					else{	
						double I_Luas_TSKu_MC_HSA = Double.parseDouble(ET_Input_TSKu_Luas_MC_HSA.getText().toString());
						double I_T_TSKu_MC_HSA = Double.parseDouble(ET_Input_TSKu_T_MC_HSA.getText().toString());
						double I_SB_TSKu_MC_HSA = Double.parseDouble(ET_Input_TSKu_SB_MC_HSA.getText().toString());
						double O_SA_TSKu_MC_HSA = 2 * I_Luas_TSKu_MC_HSA / I_T_TSKu_MC_HSA - I_SB_TSKu_MC_HSA;
						
						ET_Output_TSKu_SA_MC_HSA.setText(String.valueOf(O_SA_TSKu_MC_HSA));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_TSKu_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_TSKu_Luas_MC_HSA.setText("");
				ET_Input_TSKu_T_MC_HSA.setText("");
				ET_Input_TSKu_SB_MC_HSA.setText("");
				ET_Output_TSKu_SA_MC_HSA.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_TSKu_Luas_MC_HSA.requestFocus();
			}
		});

    	Button_Rumus_TSS_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_TSKu_Luas_MC_HSA.setText(" Luas");
				ET_Input_TSKu_T_MC_HSA.setText(" Tinggi [t]");
				ET_Input_TSKu_SB_MC_HSA.setText(" Sisi Bawah [sb]");
				ET_Output_TSKu_SA_MC_HSA.setText(" (2 x L)/t - sb");				
				ET_Input_TSKu_Luas_MC_HSA.requestFocus();
			}
		});
    	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_TSKu_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_TSKu_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_HSA.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_TSKu_MC_HSA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_HSA.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
