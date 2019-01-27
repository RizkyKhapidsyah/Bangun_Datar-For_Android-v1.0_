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

public class Form_SegiLima_MC_HS extends Activity {
	TextView TV_Judul_SL_MC_HS;
	TextView TV_SubJudul_SL_MC_HS;
	ImageView IV_Gambar_SL_MC_HS;
	TextView TV_Input_SL_D_MC_HS;
	TextView TV_Input_SL_T_MC_HS;
	TextView TV_Output_SL_S_MC_HS;
	TextView TV_SatuanNilai_SL_D_MC_HS;
	TextView TV_SatuanNilai_SL_T_MC_HS;
	TextView TV_SatuanNilai_SL_S_MC_HS;
	EditText ET_Input_SL_D_MC_HS;
	EditText ET_Input_SL_T_MC_HS;
	EditText ET_Output_SL_S_MC_HS;
	Button Button_Hitung_SL_MC_HS;
	Button Button_Reset_SL_MC_HS;
	Button Button_Detail_SL_MC_HS;
	Button Button_Kembali_SL_MC_HS;
	Button Button_Rumus_Segilima_MC_HS;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_segilima_mc_hs);

        String CustomHuruf_SL_MC_HS = "AGENCYR.TTF";
        Typeface TipeHuruf_SE_MC_HS = Typeface.createFromAsset(getAssets(), CustomHuruf_SL_MC_HS);

    	TV_Judul_SL_MC_HS = (TextView)findViewById(R.id.TV_Judul_SL_MC_HS);
    	TV_SubJudul_SL_MC_HS = (TextView)findViewById(R.id.TV_SubJudul_SL_MC_HS);
    	IV_Gambar_SL_MC_HS = (ImageView)findViewById(R.id.IV_Gambar_SL_MC_HS);
    	TV_Input_SL_D_MC_HS = (TextView)findViewById(R.id.TV_Input_SL_D_MC_HS);
    	TV_Input_SL_T_MC_HS = (TextView)findViewById(R.id.TV_Input_SL_T_MC_HS);
    	TV_Output_SL_S_MC_HS = (TextView)findViewById(R.id.TV_Output_SL_S_MC_HS);
    	TV_SatuanNilai_SL_D_MC_HS = (TextView)findViewById(R.id.TV_SatuanNilai_SL_D_MC_HS);
    	TV_SatuanNilai_SL_T_MC_HS = (TextView)findViewById(R.id.TV_SatuanNilai_SL_T_MC_HS);
    	TV_SatuanNilai_SL_S_MC_HS = (TextView)findViewById(R.id.TV_SatuanNilai_SL_S_MC_HS);
    	ET_Input_SL_D_MC_HS = (EditText)findViewById(R.id.ET_Input_SL_D_MC_HS);
    	ET_Input_SL_T_MC_HS = (EditText)findViewById(R.id.ET_Input_SL_T_MC_HS);
    	ET_Output_SL_S_MC_HS = (EditText)findViewById(R.id.ET_Output_SL_S_MC_HS);
    	Button_Hitung_SL_MC_HS = (Button)findViewById(R.id.Button_Hitung_SL_MC_HS);
    	Button_Reset_SL_MC_HS = (Button)findViewById(R.id.Button_Reset_SL_MC_HS);
    	Button_Detail_SL_MC_HS = (Button)findViewById(R.id.Button_Detail_SL_MC_HS);
    	Button_Kembali_SL_MC_HS = (Button)findViewById(R.id.Button_Kembali_SL_MC_HS);
    	Button_Rumus_Segilima_MC_HS = (Button)findViewById(R.id.Button_Rumus_Segilima_MC_HS);
  
    	TV_Judul_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_SubJudul_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_Input_SL_D_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_Input_SL_T_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_Output_SL_S_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_SatuanNilai_SL_D_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_SatuanNilai_SL_T_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	TV_SatuanNilai_SL_S_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	ET_Input_SL_D_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	ET_Input_SL_T_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	ET_Output_SL_S_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	Button_Hitung_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	Button_Reset_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	Button_Detail_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	Button_Kembali_SL_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	Button_Rumus_Segilima_MC_HS.setTypeface(TipeHuruf_SE_MC_HS);
    	
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_SL_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_SL_D_MC_HS.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Diagonal [d] SegiLima. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_SL_D_MC_HS.requestFocus();
					}
					else if(ET_Input_SL_T_MC_HS.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t] SegiLima. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_SL_T_MC_HS.requestFocus();
					}
					else{	
						double I_D_SL_MC_HS = Double.parseDouble(ET_Input_SL_D_MC_HS.getText().toString());
						double I_T_SL_MC_HS = Double.parseDouble(ET_Input_SL_T_MC_HS.getText().toString());
						double O_SISI_SL_MC_HS = (Math.sqrt(Math.pow(I_D_SL_MC_HS, 2) - Math.pow(I_T_SL_MC_HS, 2))) * 2;
						
						ET_Output_SL_S_MC_HS.setText(String.valueOf(O_SISI_SL_MC_HS));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_SL_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_SL_D_MC_HS.setText("");
				ET_Input_SL_T_MC_HS.setText("");
				ET_Output_SL_S_MC_HS.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_SL_D_MC_HS.requestFocus();
			}
		});
    	
    	Button_Rumus_Segilima_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_SL_D_MC_HS.setText(" Diagonal [d]");
				ET_Input_SL_T_MC_HS.setText(" Tinggi [t]");
				ET_Output_SL_S_MC_HS.setText(" √((d^2 - t^2)) x 2");
				ET_Input_SL_D_MC_HS.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_SL_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_SL_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_SegiLima_MC_HS.this, FormLihatGambarSegiLima.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_SL_MC_HS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_SegiLima_MC_HS.this, FormLihatGambarSegiLima.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
