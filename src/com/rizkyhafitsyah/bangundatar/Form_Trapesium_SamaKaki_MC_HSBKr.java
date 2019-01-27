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

public class Form_Trapesium_SamaKaki_MC_HSBKr extends Activity {
	
	TextView TV_Judul_T_SamaKaki_MC_HSBKr;
	TextView TV_SubJudul_T_SamaKaki_MC_HSBKr;
	ImageView IV_Gambar_T_SamaKaki_MC_HSBKr;
	TextView TV_Input_T_SamaKaki_Tinggi_MC_HSBKr;
	TextView TV_Input_T_SamaKaki_SM_MC_HSBKr;
	TextView TV_Output_T_SamaKaki_SBKr_MC_HSBKr;
	TextView TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKr;
	TextView TV_SatuanNilai_T_SamaKaki_SM_MC_HSBKr;
	TextView TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSBKr;
	EditText ET_Input_T_SamaKaki_Tinggi_MC_HSBKr;
	EditText ET_Input_T_SamaKaki_SM_MC_HSBKr;
	EditText ET_Output_T_SamaKaki_SBKr_MC_HSBKr;	
	Button Button_Hitung_T_SamaKaki_MC_HSBKr;
	Button Button_Reset_T_SamaKaki_MC_HSBKr;
	Button Button_Kembali_T_SamaKaki_MC_HSBKr;
	Button Button_Detail_T_SamaKaki_MC_HSBKr;
	Button Button_Rumus_TSK_MC_HBKR;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_samakaki_mc_hsbkr);

        String CustomHuruf_T_SamaKaki_MC_HSBKr = "AGENCYR.TTF";
        Typeface TipeHuruf_T_SamaKaki_MC_HSBKr = Typeface.createFromAsset(getAssets(), CustomHuruf_T_SamaKaki_MC_HSBKr);

        TV_Judul_T_SamaKaki_MC_HSBKr = (TextView)findViewById(R.id.TV_Judul_T_SamaKaki_MC_HSBKr);
        TV_SubJudul_T_SamaKaki_MC_HSBKr = (TextView)findViewById(R.id.TV_SubJudul_T_SamaKaki_MC_HSBKr);
        IV_Gambar_T_SamaKaki_MC_HSBKr = (ImageView)findViewById(R.id.IV_Gambar_T_SamaKaki_MC_HSBKr);
        TV_Input_T_SamaKaki_Tinggi_MC_HSBKr = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_Tinggi_MC_HSBKr);
        TV_Input_T_SamaKaki_SM_MC_HSBKr = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SM_MC_HSBKr);
        TV_Output_T_SamaKaki_SBKr_MC_HSBKr = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SBKr_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_SM_MC_HSBKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SM_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSBKr = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSBKr);
        ET_Input_T_SamaKaki_Tinggi_MC_HSBKr = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_Tinggi_MC_HSBKr);
        ET_Input_T_SamaKaki_SM_MC_HSBKr = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SM_MC_HSBKr);
        ET_Output_T_SamaKaki_SBKr_MC_HSBKr = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SBKr_MC_HSBKr);
        Button_Hitung_T_SamaKaki_MC_HSBKr = (Button)findViewById(R.id.Button_Hitung_T_SamaKaki_MC_HSBKr);
        Button_Reset_T_SamaKaki_MC_HSBKr = (Button)findViewById(R.id.Button_Reset_T_SamaKaki_MC_HSBKr);
        Button_Kembali_T_SamaKaki_MC_HSBKr = (Button)findViewById(R.id.Button_Kembali_T_SamaKaki_MC_HSBKr);
        Button_Detail_T_SamaKaki_MC_HSBKr = (Button)findViewById(R.id.Button_Detail_T_SamaKaki_MC_HSBKr);
        Button_Rumus_TSK_MC_HBKR = (Button)findViewById(R.id.Button_Rumus_TSK_MC_HBKR);

        TV_Judul_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_SubJudul_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_Input_T_SamaKaki_Tinggi_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_Input_T_SamaKaki_SM_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_Output_T_SamaKaki_SBKr_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_SM_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        ET_Input_T_SamaKaki_SM_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        ET_Output_T_SamaKaki_SBKr_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        Button_Hitung_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        Button_Reset_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        Button_Kembali_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        Button_Detail_T_SamaKaki_MC_HSBKr.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
        Button_Rumus_TSK_MC_HBKR.setTypeface(TipeHuruf_T_SamaKaki_MC_HSBKr);
     
		 //menambahkan event klik untuk perintah di tombol hitung
        Button_Hitung_T_SamaKaki_MC_HSBKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.requestFocus();
					}		
					else if(ET_Input_T_SamaKaki_SM_MC_HSBKr.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Miring [sm]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SM_MC_HSBKr.requestFocus();
					}
					else{	
						double I_Tinggi_T_SamaKaki_MC_HSBKr = Double.parseDouble(ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.getText().toString());
						double I_SM_T_SamaKaki_MC_HSBKr = Double.parseDouble(ET_Input_T_SamaKaki_SM_MC_HSBKr.getText().toString());
						double O_SBKr_T_SamaKaki_MC_HSBKr = Math.sqrt(Math.pow(I_SM_T_SamaKaki_MC_HSBKr, 2) - Math.pow(I_Tinggi_T_SamaKaki_MC_HSBKr, 2));
						ET_Output_T_SamaKaki_SBKr_MC_HSBKr.setText(String.valueOf(O_SBKr_T_SamaKaki_MC_HSBKr));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
        Button_Reset_T_SamaKaki_MC_HSBKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.setText("");
				ET_Input_T_SamaKaki_SM_MC_HSBKr.setText("");
				ET_Output_T_SamaKaki_SBKr_MC_HSBKr.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.requestFocus();
			}
		});
        
        Button_Rumus_TSK_MC_HBKR.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.setText(" Tinggi [t]");
				ET_Input_T_SamaKaki_SM_MC_HSBKr.setText(" Sisi MIring [sm]");
				ET_Output_T_SamaKaki_SBKr_MC_HSBKr.setText(" √(sm^2 - t^2)   (Theorema Phytagoras)");
				ET_Input_T_SamaKaki_Tinggi_MC_HSBKr.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
        Button_Kembali_T_SamaKaki_MC_HSBKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
        Button_Detail_T_SamaKaki_MC_HSBKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSBKr.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

        IV_Gambar_T_SamaKaki_MC_HSBKr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSBKr.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
