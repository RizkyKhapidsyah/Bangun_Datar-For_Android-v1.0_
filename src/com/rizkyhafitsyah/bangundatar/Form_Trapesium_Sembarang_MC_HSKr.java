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

public class Form_Trapesium_Sembarang_MC_HSKr extends Activity {
	TextView TV_Judul_T_Sembarang_MC_HSKr;
	TextView TV_SubJudul_T_Sembarang_MC_HSKr;
	ImageView IV_Gambar_T_Sembarang_MC_HSKr;
	TextView TV_Input_T_Sembarang_Tinggi_MC_HSKr;
	TextView TV_Input_T_Sembarang_SBKr_MC_HSKr;
	TextView TV_Output_T_Sembarang_SKr_MC_HSKr;
	TextView TV_SatuanNilai_T_Sembarang_Tinggi_MC_HSKr;
	TextView TV_SatuanNilai_T_Sembarang_SBKr_MC_HSKr;
	TextView TV_SatuanNilai_T_Sembarang_SKr_MC_HSKr;
	EditText ET_Input_T_Sembarang_Tinggi_MC_HSKr;
	EditText ET_Input_T_Sembarang_SBKr_MC_HSKr;
	EditText ET_Output_T_Sembarang_SKr_MC_HSKr;
	Button Button_Hitung_T_Sembarang_MC_HSKr;
	Button Button_Reset_T_Sembarang_MC_HSKr;
	Button Button_Kembali_T_Sembarang_MC_HSKr;
	Button Button_Detail_T_Sembarang_MC_HSKr;
	Button Button_Rumus_TSMb_MC_HSKR;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_sembarang_mc_hskr);

        String CustomHuruf_T_Sembarang_MC_HSKr = "AGENCYR.TTF";
        Typeface TipeHuruf_T_Sembarang_MC_HSKr = Typeface.createFromAsset(getAssets(), CustomHuruf_T_Sembarang_MC_HSKr);

    	 TV_Judul_T_Sembarang_MC_HSKr = (TextView)findViewById(R.id.TV_Judul_T_Sembarang_MC_HSKr);
    	 TV_SubJudul_T_Sembarang_MC_HSKr = (TextView)findViewById(R.id.TV_SubJudul_T_Sembarang_MC_HSKr);
    	 IV_Gambar_T_Sembarang_MC_HSKr = (ImageView)findViewById(R.id.IV_Gambar_T_Sembarang_MC_HSKr);
    	 TV_Input_T_Sembarang_Tinggi_MC_HSKr = (TextView)findViewById(R.id.TV_Input_T_Sembarang_Tinggi_MC_HSKr);
    	 TV_Input_T_Sembarang_SBKr_MC_HSKr = (TextView)findViewById(R.id.TV_Input_T_Sembarang_SBKr_MC_HSKr);
    	 TV_Output_T_Sembarang_SKr_MC_HSKr = (TextView)findViewById(R.id.TV_Output_T_Sembarang_SKr_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_Tinggi_MC_HSKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_Tinggi_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_SBKr_MC_HSKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_SBKr_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_SKr_MC_HSKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_Sembarang_SKr_MC_HSKr);
    	 ET_Input_T_Sembarang_Tinggi_MC_HSKr = (EditText)findViewById(R.id.ET_Input_T_Sembarang_Tinggi_MC_HSKr);
    	 ET_Input_T_Sembarang_SBKr_MC_HSKr = (EditText)findViewById(R.id.ET_Input_T_Sembarang_SBKr_MC_HSKr);
    	 ET_Output_T_Sembarang_SKr_MC_HSKr = (EditText)findViewById(R.id.ET_Output_T_Sembarang_SKr_MC_HSKr);
    	 Button_Hitung_T_Sembarang_MC_HSKr = (Button)findViewById(R.id.Button_Hitung_T_Sembarang_MC_HSKr);
    	 Button_Reset_T_Sembarang_MC_HSKr = (Button)findViewById(R.id.Button_Reset_T_Sembarang_MC_HSKr);
    	 Button_Kembali_T_Sembarang_MC_HSKr = (Button)findViewById(R.id.Button_Kembali_T_Sembarang_MC_HSKr);
    	 Button_Detail_T_Sembarang_MC_HSKr = (Button)findViewById(R.id.Button_Detail_T_Sembarang_MC_HSKr);
    	 Button_Rumus_TSMb_MC_HSKR = (Button)findViewById(R.id.Button_Rumus_TSMb_MC_HSKR);
        
    	 TV_Judul_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_SubJudul_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_Input_T_Sembarang_Tinggi_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_Input_T_Sembarang_SBKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_Output_T_Sembarang_SKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_Tinggi_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_SBKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 TV_SatuanNilai_T_Sembarang_SKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 ET_Input_T_Sembarang_Tinggi_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 ET_Input_T_Sembarang_SBKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 ET_Output_T_Sembarang_SKr_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 Button_Hitung_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 Button_Reset_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 Button_Kembali_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 Button_Detail_T_Sembarang_MC_HSKr.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
    	 Button_Rumus_TSMb_MC_HSKR.setTypeface(TipeHuruf_T_Sembarang_MC_HSKr);
        
		 //menambahkan event klik untuk perintah di tombol hitung
    	 Button_Hitung_T_Sembarang_MC_HSKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_Sembarang_Tinggi_MC_HSKr.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t] Trapesium. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_Sembarang_Tinggi_MC_HSKr.requestFocus();
					}		
					else if(ET_Input_T_Sembarang_SBKr_MC_HSKr.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah Sebelah Kiri [sbkr]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_Sembarang_SBKr_MC_HSKr.requestFocus();
					}
					else{	
						double I_TINGGI_T_Sembarang_MC_HSKr= Double.parseDouble(ET_Input_T_Sembarang_Tinggi_MC_HSKr.getText().toString());
						double I_SBKr_T_Sembarang_MC_HSKr = Double.parseDouble(ET_Input_T_Sembarang_SBKr_MC_HSKr.getText().toString());
						double O_SKr_T_Sembarang_MC_HSKr = Math.sqrt(Math.pow(I_TINGGI_T_Sembarang_MC_HSKr, 2) + Math.pow(I_SBKr_T_Sembarang_MC_HSKr, 2));
						
						ET_Output_T_Sembarang_SKr_MC_HSKr.setText(String.valueOf(O_SKr_T_Sembarang_MC_HSKr));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	 Button_Reset_T_Sembarang_MC_HSKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_Sembarang_Tinggi_MC_HSKr.setText("");
				ET_Input_T_Sembarang_SBKr_MC_HSKr.setText("");
				ET_Output_T_Sembarang_SKr_MC_HSKr.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_Sembarang_Tinggi_MC_HSKr.requestFocus();
			}
		});
    	 
    	 Button_Rumus_TSMb_MC_HSKR.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_Sembarang_Tinggi_MC_HSKr.setText(" Tinggi [t]");
				ET_Input_T_Sembarang_SBKr_MC_HSKr.setText(" Sisi Bawah Kiri [sbkr]");
				ET_Output_T_Sembarang_SKr_MC_HSKr.setText(" √(sbkr^2 + t^2) (Theorema Phytagoras)");				
				ET_Input_T_Sembarang_Tinggi_MC_HSKr.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	 Button_Kembali_T_Sembarang_MC_HSKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	 Button_Detail_T_Sembarang_MC_HSKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_Sembarang_MC_HSKr.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	 IV_Gambar_T_Sembarang_MC_HSKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_Sembarang_MC_HSKr.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
