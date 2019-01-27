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

public class Form_Trapesium_SikuSiku_MC_Semua extends Activity {
	TextView TV_Judul_TSKu_MC_Semua;
	TextView TV_SubJudul_TSKu_MC_Semua;
	ImageView IV_Gambar_TSKu_MC_Semua;
	TextView TV_Input_TSKu_SA_MC_Semua;
	TextView TV_Input_TSKu_SB_MC_Semua;
	TextView TV_Input_TSKu_SM_MC_Semua;
	TextView TV_Input_TSKu_T_MC_Semua;
	TextView TV_Output_TSKu_Luas_MC_Semua;
	TextView TV_Output_TSKu_Keliling_MC_Semua;
	TextView TV_SatuanNilai_TSKu_SA_MC_Semua;
	TextView TV_SatuanNilai_TSKu_SB_MC_Semua;
	TextView TV_SatuanNilai_TSKu_SM_MC_Semua;
	TextView TV_SatuanNilai_TSKu_T_MC_Semua;
	TextView TV_SatuanNilai_TSKu_Luas_MC_Semua;
	TextView TV_SatuanNilai_TSKu_Keliling_MC_Semua;
	EditText ET_Input_TSKu_SA_MC_Semua;
	EditText ET_Input_TSKu_SB_MC_Semua;
	EditText ET_Input_TSKu_SM_MC_Semua;
	EditText ET_Input_TSKu_T_MC_Semua;
	EditText ET_Output_TSKu_Luas_MC_Semua;
	EditText ET_Output_TSKu_Keliling_MC_Semua;
	Button Button_Hitung_TSKu_MC_Semua;
	Button Button_Reset_TSKu_MC_Semua;
	Button Button_Kembali_TSKu_MC_Semua;
	Button Button_Detail_TSKu_MC_Semua;
	Button Button_Rumus_TSS_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_sikusiku_mc_semua);

        String CustomHuruf_TSKu_MC_Semua = "AGENCYR.TTF";
        Typeface TipeHuruf_TSKu_MC_Semua = Typeface.createFromAsset(getAssets(), CustomHuruf_TSKu_MC_Semua);

    	TV_Judul_TSKu_MC_Semua = (TextView)findViewById(R.id.TV_Judul_TSKu_MC_Semua);
    	TV_SubJudul_TSKu_MC_Semua = (TextView)findViewById(R.id.TV_SubJudul_TSKu_MC_Semua);
    	IV_Gambar_TSKu_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_TSKu_MC_Semua);
    	TV_Input_TSKu_SA_MC_Semua = (TextView)findViewById(R.id.TV_Input_TSKu_SA_MC_Semua);
    	TV_Input_TSKu_SB_MC_Semua = (TextView)findViewById(R.id.TV_Input_TSKu_SB_MC_Semua);
    	TV_Input_TSKu_SM_MC_Semua = (TextView)findViewById(R.id.TV_Input_TSKu_SM_MC_Semua);
    	TV_Input_TSKu_T_MC_Semua = (TextView)findViewById(R.id.TV_Input_TSKu_T_MC_Semua);
    	TV_Output_TSKu_Luas_MC_Semua = (TextView)findViewById(R.id.TV_Output_TSKu_Luas_MC_Semua);
    	TV_Output_TSKu_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_Output_TSKu_Keliling_MC_Semua);
    	TV_SatuanNilai_TSKu_SA_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SA_MC_Semua);
    	TV_SatuanNilai_TSKu_SB_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SB_MC_Semua);
    	TV_SatuanNilai_TSKu_SM_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_SM_MC_Semua);
    	TV_SatuanNilai_TSKu_T_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_T_MC_Semua);
    	TV_SatuanNilai_TSKu_Luas_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_Luas_MC_Semua);
    	TV_SatuanNilai_TSKu_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_TSKu_Keliling_MC_Semua);
    	ET_Input_TSKu_SA_MC_Semua = (EditText)findViewById(R.id.ET_Input_TSKu_SA_MC_Semua);
    	ET_Input_TSKu_SB_MC_Semua = (EditText)findViewById(R.id.ET_Input_TSKu_SB_MC_Semua);
    	ET_Input_TSKu_SM_MC_Semua = (EditText)findViewById(R.id.ET_Input_TSKu_SM_MC_Semua);
    	ET_Input_TSKu_T_MC_Semua = (EditText)findViewById(R.id.ET_Input_TSKu_T_MC_Semua);
    	ET_Output_TSKu_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_TSKu_Luas_MC_Semua);
    	ET_Output_TSKu_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_TSKu_Keliling_MC_Semua);
    	Button_Hitung_TSKu_MC_Semua = (Button)findViewById(R.id.Button_Hitung_TSKu_MC_Semua);
    	Button_Reset_TSKu_MC_Semua = (Button)findViewById(R.id.Button_Reset_TSKu_MC_Semua);
    	Button_Kembali_TSKu_MC_Semua = (Button)findViewById(R.id.Button_Kembali_TSKu_MC_Semua);
    	Button_Detail_TSKu_MC_Semua = (Button)findViewById(R.id.Button_Detail_TSKu_MC_Semua);
    	Button_Rumus_TSS_MC_Semua = (Button)findViewById(R.id.Button_Rumus_TSS_MC_Semua);

    	TV_Judul_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SubJudul_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Input_TSKu_SA_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Input_TSKu_SB_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Input_TSKu_SM_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Input_TSKu_T_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Output_TSKu_Luas_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_Output_TSKu_Keliling_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_SA_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_SB_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_SM_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_T_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_Luas_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	TV_SatuanNilai_TSKu_Keliling_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Input_TSKu_SA_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Input_TSKu_SB_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Input_TSKu_SM_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Input_TSKu_T_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Output_TSKu_Luas_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	ET_Output_TSKu_Keliling_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	Button_Hitung_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	Button_Reset_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	Button_Kembali_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	Button_Detail_TSKu_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
    	Button_Rumus_TSS_MC_Semua.setTypeface(TipeHuruf_TSKu_MC_Semua);
      
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_TSKu_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_TSKu_SA_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Atas [sa]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_TSKu_SA_MC_Semua.requestFocus();
					}		
					else if(ET_Input_TSKu_SB_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah [sb]!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_SB_MC_Semua.requestFocus();
					}
					else if(ET_Input_TSKu_SM_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Miring [sm]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_SM_MC_Semua.requestFocus();
					}
					else if(ET_Input_TSKu_T_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_TSKu_T_MC_Semua.requestFocus();
					}
					else{	
						double I_SA_TSKu_MC_Semua = Double.parseDouble(ET_Input_TSKu_SA_MC_Semua.getText().toString());
						double I_SB_TSKu_MC_Semua = Double.parseDouble(ET_Input_TSKu_SB_MC_Semua.getText().toString());
						double I_SM_TSKu_MC_Semua = Double.parseDouble(ET_Input_TSKu_SM_MC_Semua.getText().toString());
						double I_T_TSKu_MC_Semua = Double.parseDouble(ET_Input_TSKu_T_MC_Semua.getText().toString());
						double O_LUAS_TSKu_MC_Semua = (I_SA_TSKu_MC_Semua + I_SB_TSKu_MC_Semua) * I_T_TSKu_MC_Semua / 2;
						double O_KELILING_TSKu_MC_Semua = I_T_TSKu_MC_Semua + I_SA_TSKu_MC_Semua + I_SM_TSKu_MC_Semua + I_SB_TSKu_MC_Semua;
						
						ET_Output_TSKu_Luas_MC_Semua.setText(String.valueOf(O_LUAS_TSKu_MC_Semua));
						ET_Output_TSKu_Keliling_MC_Semua.setText(String.valueOf(O_KELILING_TSKu_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_TSKu_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_TSKu_SA_MC_Semua.setText("");
				ET_Input_TSKu_SB_MC_Semua.setText("");
				ET_Input_TSKu_SM_MC_Semua.setText("");
				ET_Input_TSKu_T_MC_Semua.setText("");
				ET_Output_TSKu_Luas_MC_Semua.setText("");
				ET_Output_TSKu_Keliling_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_TSKu_SA_MC_Semua.requestFocus();
			}
		});
    	
    	Button_Rumus_TSS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_TSKu_SA_MC_Semua.setText(" Sisi Atas [sa]");
				ET_Input_TSKu_SB_MC_Semua.setText(" Sisi Bawah [sb]");
				ET_Input_TSKu_SM_MC_Semua.setText(" Sisi Miring [sm]");
				ET_Input_TSKu_T_MC_Semua.setText(" Tinggi [t]");
				ET_Output_TSKu_Luas_MC_Semua.setText(" 	(Jumlah Rusuk Sejajar x Tinggi)/2   (atau)   ((sa + sb) x t)/2");
				ET_Output_TSKu_Keliling_MC_Semua.setText(" Jumlahkan Semua Rusuknya   (atau)   sa + sm + sb + t");
				ET_Input_TSKu_SA_MC_Semua.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_TSKu_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_TSKu_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_Semua.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

    	IV_Gambar_TSKu_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SikuSiku_MC_Semua.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
