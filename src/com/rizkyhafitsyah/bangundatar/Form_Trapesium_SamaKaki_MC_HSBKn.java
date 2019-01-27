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

public class Form_Trapesium_SamaKaki_MC_HSBKn extends Activity {
	
	TextView TV_Judul_T_SamaKaki_MC_HSBKn;
	TextView TV_SubJudul_T_SamaKaki_MC_HSBKn;
	ImageView IV_Gambar_T_SamaKaki_MC_HSBKn;
	TextView TV_Input_T_SamaKaki_Tinggi_MC_HSBKn;
	TextView TV_Input_T_SamaKaki_SMD_MC_HSBKn;
	TextView TV_Output_T_SamaKaki_SBKn_MC_HSBKn;
	TextView TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKn;
	TextView TV_SatuanNilai_T_SamaKaki_SMD_MC_HSBKn;
	TextView TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSBKn;
	EditText ET_Input_T_SamaKaki_Tinggi_MC_HSBKn;
	EditText ET_Input_T_SamaKaki_SMD_MC_HSBKn;
	EditText ET_Output_T_SamaKaki_SBKn_MC_HSBKn;	
	Button Button_Hitung_T_SamaKaki_MC_HSBKn;
	Button Button_Reset_T_SamaKaki_MC_HSBKn;
	Button Button_Kembali_T_SamaKaki_MC_HSBKn;
	Button Button_Detail_T_SamaKaki_MC_HSBKn;
	Button Button_Rumus_TSK_MC_HBKN;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_samakaki_mc_hsbkn);

        String CustomHuruf_T_SamaKaki_MC_HSBKn = "AGENCYR.TTF";
        Typeface TipeHuruf_T_SamaKaki_MC_HSBKn = Typeface.createFromAsset(getAssets(), CustomHuruf_T_SamaKaki_MC_HSBKn);

    	 TV_Judul_T_SamaKaki_MC_HSBKn = (TextView)findViewById(R.id.TV_Judul_T_SamaKaki_MC_HSBKn);
    	 TV_SubJudul_T_SamaKaki_MC_HSBKn = (TextView)findViewById(R.id.TV_SubJudul_T_SamaKaki_MC_HSBKn);
    	 IV_Gambar_T_SamaKaki_MC_HSBKn = (ImageView)findViewById(R.id.IV_Gambar_T_SamaKaki_MC_HSBKn);
    	 TV_Input_T_SamaKaki_Tinggi_MC_HSBKn = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_Tinggi_MC_HSBKn);
    	 TV_Input_T_SamaKaki_SMD_MC_HSBKn = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SMD_MC_HSBKn);
    	 TV_Output_T_SamaKaki_SBKn_MC_HSBKn = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SBKn_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKn = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_SMD_MC_HSBKn = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SMD_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSBKn = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSBKn);
    	 ET_Input_T_SamaKaki_Tinggi_MC_HSBKn = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_Tinggi_MC_HSBKn);
    	 ET_Input_T_SamaKaki_SMD_MC_HSBKn = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SMD_MC_HSBKn);
    	 ET_Output_T_SamaKaki_SBKn_MC_HSBKn = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SBKn_MC_HSBKn);
    	 Button_Hitung_T_SamaKaki_MC_HSBKn = (Button)findViewById(R.id.Button_Hitung_T_SamaKaki_MC_HSBKn);
    	 Button_Reset_T_SamaKaki_MC_HSBKn = (Button)findViewById(R.id.Button_Reset_T_SamaKaki_MC_HSBKn);
    	 Button_Kembali_T_SamaKaki_MC_HSBKn = (Button)findViewById(R.id.Button_Kembali_T_SamaKaki_MC_HSBKn);
    	 Button_Detail_T_SamaKaki_MC_HSBKn = (Button)findViewById(R.id.Button_Detail_T_SamaKaki_MC_HSBKn);
    	 Button_Rumus_TSK_MC_HBKN = (Button)findViewById(R.id.Button_Rumus_TSK_MC_HBKN);
    
    	 TV_Judul_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_SubJudul_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_Input_T_SamaKaki_Tinggi_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_Input_T_SamaKaki_SMD_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_Output_T_SamaKaki_SBKn_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_SMD_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 ET_Input_T_SamaKaki_SMD_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 ET_Output_T_SamaKaki_SBKn_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 Button_Hitung_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 Button_Reset_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 Button_Kembali_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 Button_Detail_T_SamaKaki_MC_HSBKn.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
    	 Button_Rumus_TSK_MC_HBKN.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKn);
      	 
		 //menambahkan event klik untuk perintah di tombol hitung
    	 Button_Hitung_T_SamaKaki_MC_HSBKn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.requestFocus();
					}		
					else if(ET_Input_T_SamaKaki_SMD_MC_HSBKn.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Miring Bagian Dalam [smd]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SMD_MC_HSBKn.requestFocus();
					}
					else{	
						double I_Tinggi_T_SamaKaki_MC_HSBKn = Double.parseDouble(ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.getText().toString());
						double I_SMD_T_SamaKaki_MC_HSBKn = Double.parseDouble(ET_Input_T_SamaKaki_SMD_MC_HSBKn.getText().toString());
						double O_SBKn_T_SamaKaki_MC_HSBKn = Math.sqrt(Math.pow(I_SMD_T_SamaKaki_MC_HSBKn, 2) - Math.pow(I_Tinggi_T_SamaKaki_MC_HSBKn, 2));
						ET_Output_T_SamaKaki_SBKn_MC_HSBKn.setText(String.valueOf(O_SBKn_T_SamaKaki_MC_HSBKn));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	 Button_Reset_T_SamaKaki_MC_HSBKn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.setText("");
				ET_Input_T_SamaKaki_SMD_MC_HSBKn.setText("");
				ET_Output_T_SamaKaki_SBKn_MC_HSBKn.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.requestFocus();
			}
		});
    	 
    	 Button_Rumus_TSK_MC_HBKN.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.setText(" Tinggi [t]");
				ET_Input_T_SamaKaki_SMD_MC_HSBKn.setText(" Sisi Miring Dalam [smd]");
				ET_Output_T_SamaKaki_SBKn_MC_HSBKn.setText(" √(smd^2 - t^2)   (Theorema Phytagoras)");
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKn.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	 Button_Kembali_T_SamaKaki_MC_HSBKn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	 Button_Detail_T_SamaKaki_MC_HSBKn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSBKn.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	 IV_Gambar_T_SamaKaki_MC_HSBKn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSBKn.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
