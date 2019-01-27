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

public class Form_Trapesium_SikuSiku_MC_HSB extends Activity {
	TextView TV_Judul_TSKu_MC_HSB;
	TextView TV_SubJudul_TSKu_MC_HSB;
	ImageView IV_Gambar_TSKu_MC_HSB;
	TextView TV_Input_TSKu_Luas_MC_HSB;
	TextView TV_Input_TSKu_T_MC_HSB;
	TextView TV_Input_TSKu_SA_MC_HSB;
	TextView TV_Output_TSKu_SB_MC_HSB;
	TextView TV_SatuanNilai_TSKu_Luas_MC_HSB;
	TextView TV_SatuanNilai_TSKu_T_MC_HSB;
	TextView TV_SatuanNilai_TSKu_SA_MC_HSB;
	TextView TV_SatuanNilai_TSKu_SB_MC_HSB;
	EditText ET_Input_TSKu_Luas_MC_HSB;
	EditText ET_Input_TSKu_T_MC_HSB;
	EditText ET_Input_TSKu_SA_MC_HSB;
	EditText ET_Output_TSKu_SB_MC_HSB;
	Button Button_Hitung_TSKu_MC_HSB;
	Button Button_Reset_TSKu_MC_HSB;
	Button Button_Kembali_TSKu_MC_HSB;
	Button Button_Detail_TSKu_MC_HSB;
	Button Button_Rumus_TSS_MC_HSB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_sikusiku_mc_hsb);

        String CustomHuruf_TSKu_MC_HSB = "AGENCYR.TTF";
        Typeface TipeHuruf_TSKu_MC_HSB = Typeface.createFromAsset(getAssets(), CustomHuruf_TSKu_MC_HSB);

    	TV_Judul_TSKu_MC_HSB = (TextView)findViewById(R.id.TV_Judul_TSKu_MC_HSB);
    	TV_SubJudul_TSKu_MC_HSB = (TextView)findViewById(R.id.TV_SubJudul_TSKu_MC_HSB);
    	IV_Gambar_TSKu_MC_HSB = (ImageView)findViewById(R.id.IV_Gambar_TSKu_MC_HSB);
    	TV_Input_TSKu_Luas_MC_HSB = (TextView)findViewById(R.id.TV_Input_TSKu_Luas_MC_HSB);
    	TV_Input_TSKu_T_MC_HSB = (TextView)findViewById(R.id.TV_Input_TSKu_T_MC_HSB);
    	TV_Input_TSKu_SA_MC_HSB = (TextView)findViewById(R.id.TV_Input_TSKu_SA_MC_HSB);
    	TV_Output_TSKu_SB_MC_HSB = (TextView)findViewById(R.id.TV_Output_TSKu_SB_MC_HSB);
    	TV_SatuanNilai_TSKu_Luas_MC_HSB = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_Luas_MC_HSB);
    	TV_SatuanNilai_TSKu_T_MC_HSB = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_T_MC_HSB);
    	TV_SatuanNilai_TSKu_SA_MC_HSB = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SA_MC_HSB);
    	TV_SatuanNilai_TSKu_SB_MC_HSB = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SB_MC_HSB);
    	ET_Input_TSKu_Luas_MC_HSB = (EditText)findViewById(R.id.ET_Input_TSKu_Luas_MC_HSB);
    	ET_Input_TSKu_T_MC_HSB = (EditText)findViewById(R.id.ET_Input_TSKu_T_MC_HSB);
    	ET_Input_TSKu_SA_MC_HSB = (EditText)findViewById(R.id.ET_Input_TSKu_SA_MC_HSB);
    	ET_Output_TSKu_SB_MC_HSB = (EditText)findViewById(R.id.ET_Output_TSKu_SB_MC_HSB);
    	Button_Hitung_TSKu_MC_HSB = (Button)findViewById(R.id.Button_Hitung_TSKu_MC_HSB);
    	Button_Reset_TSKu_MC_HSB = (Button)findViewById(R.id.Button_Reset_TSKu_MC_HSB);
    	Button_Kembali_TSKu_MC_HSB = (Button)findViewById(R.id.Button_Kembali_TSKu_MC_HSB);
    	Button_Detail_TSKu_MC_HSB = (Button)findViewById(R.id.Button_Detail_TSKu_MC_HSB);
    	Button_Rumus_TSS_MC_HSB = (Button)findViewById(R.id.Button_Rumus_TSS_MC_HSB);
  
    	
       	TV_Judul_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_SubJudul_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_Input_TSKu_Luas_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_Input_TSKu_T_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_Input_TSKu_SA_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_Output_TSKu_SB_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_SatuanNilai_TSKu_Luas_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_SatuanNilai_TSKu_T_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_SatuanNilai_TSKu_SA_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	TV_SatuanNilai_TSKu_SB_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	ET_Input_TSKu_Luas_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	ET_Input_TSKu_T_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	ET_Input_TSKu_SA_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	ET_Output_TSKu_SB_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	Button_Hitung_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	Button_Reset_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	Button_Kembali_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	Button_Detail_TSKu_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
    	Button_Rumus_TSS_MC_HSB.setTypeface(TipeHuruf_TSKu_MC_HSB);
 
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_TSKu_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_TSKu_Luas_MC_HSB.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Luas.", Toast.LENGTH_LONG).show();
						ET_Input_TSKu_Luas_MC_HSB.requestFocus();
					}		
					else if(ET_Input_TSKu_T_MC_HSB.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_T_MC_HSB.requestFocus();
					}
					else if(ET_Input_TSKu_SA_MC_HSB.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Atas [sa]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_SA_MC_HSB.requestFocus();
					}
					else{	
						double I_Luas_TSKu_MC_HSB = Double.parseDouble(ET_Input_TSKu_Luas_MC_HSB.getText().toString());
						double I_T_TSKu_MC_HSB = Double.parseDouble(ET_Input_TSKu_T_MC_HSB.getText().toString());
						double I_SA_TSKu_MC_HSB = Double.parseDouble(ET_Input_TSKu_SA_MC_HSB.getText().toString());
						double O_SB_TSKu_MC_HSB = 2 * I_Luas_TSKu_MC_HSB / I_T_TSKu_MC_HSB - I_SA_TSKu_MC_HSB;
						
						ET_Output_TSKu_SB_MC_HSB.setText(String.valueOf(O_SB_TSKu_MC_HSB));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_TSKu_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_TSKu_Luas_MC_HSB.setText("");
				ET_Input_TSKu_T_MC_HSB.setText("");
				ET_Input_TSKu_SA_MC_HSB.setText("");
				ET_Output_TSKu_SB_MC_HSB.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_TSKu_Luas_MC_HSB.requestFocus();
			}
		});
    	
    	Button_Rumus_TSS_MC_HSB.setOnClickListener(new View.OnClickListener() {
    			@Override
    			public void onClick(View v) {
    				ET_Input_TSKu_Luas_MC_HSB.setText(" Luas");
    				ET_Input_TSKu_T_MC_HSB.setText(" Tinggi [t]");
    				ET_Input_TSKu_SA_MC_HSB.setText(" Sisi Atas [sa]");
    				ET_Output_TSKu_SB_MC_HSB.setText(" (2 x L)/t - sa");
    				ET_Input_TSKu_Luas_MC_HSB.requestFocus();
    			}
    		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_TSKu_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_TSKu_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_HSB.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_TSKu_MC_HSB.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_HSB.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
