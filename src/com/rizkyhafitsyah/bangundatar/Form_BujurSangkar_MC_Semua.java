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

public class Form_BujurSangkar_MC_Semua extends Activity {
	TextView TV_Judul_BS_MC_Semua;
	TextView TV_SubJudul_BS_MC_Semua;
	ImageView IV_Gambar_BS_MC_Semua;
	TextView TV_Input_BS_S_MC_Semua;
	TextView TV_Output_BS_Luas_MC_Semua;
	TextView TV_Output_BS_Keliling_MC_Semua;
	TextView TV_Output_BS_D_MC_Semua;
	TextView TV_SatuanNilai_BS_S_MC_Semua;
	TextView TV_SatuanNilai_BS_Luas_MC_Semua;
	TextView TV_SatuanNilai_BS_Keliling_MC_Semua;
	TextView TV_SatuanNilai_BS_D_MC_Semua;
	EditText ET_Input_BS_S_MC_Semua;
	EditText ET_Output_BS_Luas_MC_Semua;
	EditText ET_Output_BS_Keliling_MC_Semua;
	EditText ET_Output_BS_D_MC_Semua;
	Button Button_Hitung_BS_MC_Semua;
	Button Button_Reset_BS_MC_Semua;
	Button Button_Detail_BS_MC_Semua;
	Button Button_Kembali_BS_MC_Semua;
	Button Button_Rumus_BS_MC_Semua;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_bujursangkar_mc_semua);

        String CustomHuruf_BS_MC_Semua = "AGENCYR.TTF";
        Typeface TipeHuruf_BS_MC_Semua = Typeface.createFromAsset(getAssets(), CustomHuruf_BS_MC_Semua);

    	TV_Judul_BS_MC_Semua = (TextView)findViewById(R.id.TV_Judul_BS_MC_Semua);
    	TV_SubJudul_BS_MC_Semua = (TextView)findViewById(R.id.TV_SubJudul_BS_MC_Semua);
    	IV_Gambar_BS_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_BS_MC_Semua);
    	TV_Input_BS_S_MC_Semua = (TextView)findViewById(R.id.TV_Input_BS_S_MC_Semua);
    	TV_Output_BS_Luas_MC_Semua = (TextView)findViewById(R.id.TV_Output_BS_Luas_MC_Semua);
    	TV_Output_BS_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_Output_BS_Keliling_MC_Semua);
    	TV_Output_BS_D_MC_Semua = (TextView)findViewById(R.id.TV_Output_BS_D_MC_Semua);
    	TV_SatuanNilai_BS_S_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_BS_S_MC_Semua);
    	TV_SatuanNilai_BS_Luas_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_BS_Luas_MC_Semua);
    	TV_SatuanNilai_BS_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_BS_Keliling_MC_Semua);
    	TV_SatuanNilai_BS_D_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_BS_D_MC_Semua);
    	ET_Input_BS_S_MC_Semua = (EditText)findViewById(R.id.ET_Input_BS_S_MC_Semua);
    	ET_Output_BS_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_BS_Luas_MC_Semua);
    	ET_Output_BS_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_BS_Keliling_MC_Semua);
    	ET_Output_BS_D_MC_Semua = (EditText)findViewById(R.id.ET_Output_BS_D_MC_Semua);
    	Button_Hitung_BS_MC_Semua = (Button)findViewById(R.id.Button_Hitung_BS_MC_Semua);
    	Button_Reset_BS_MC_Semua = (Button)findViewById(R.id.Button_Reset_BS_MC_Semua);
    	Button_Detail_BS_MC_Semua = (Button)findViewById(R.id.Button_Detail_BS_MC_Semua);
    	Button_Kembali_BS_MC_Semua = (Button)findViewById(R.id.Button_Kembali_BS_MC_Semua);
    	Button_Rumus_BS_MC_Semua = (Button)findViewById(R.id.Button_Rumus_BS_MC_Semua);
    	

       	TV_Judul_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_SubJudul_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_Input_BS_S_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_Output_BS_Luas_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_Output_BS_Keliling_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_Output_BS_D_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_SatuanNilai_BS_S_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_SatuanNilai_BS_Luas_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_SatuanNilai_BS_Keliling_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	TV_SatuanNilai_BS_D_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	ET_Input_BS_S_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	ET_Output_BS_Luas_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	ET_Output_BS_Keliling_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	ET_Output_BS_D_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	Button_Hitung_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	Button_Reset_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	Button_Detail_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	Button_Kembali_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	Button_Rumus_BS_MC_Semua.setTypeface(TipeHuruf_BS_MC_Semua);
    	
      	
		 //menambahkan event klik untuk perintah di tombol hitung
    	Button_Hitung_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_BS_S_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi [s]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_BS_S_MC_Semua.requestFocus();
					}		
					else{	
						double I_SISI_BS_MC_Semua = Double.parseDouble(ET_Input_BS_S_MC_Semua.getText().toString());
						double O_LUAS_BS_MC_Semua = I_SISI_BS_MC_Semua * I_SISI_BS_MC_Semua;
						double O_KELILING_BS_MC_Semua = 4 * I_SISI_BS_MC_Semua;
						double O_DIAGONAL_BS_MC_Semua = Math.sqrt(2 * Math.pow(I_SISI_BS_MC_Semua, 2));
						
						ET_Output_BS_Luas_MC_Semua.setText(String.valueOf(O_LUAS_BS_MC_Semua));
						ET_Output_BS_Keliling_MC_Semua.setText(String.valueOf(O_KELILING_BS_MC_Semua));
						ET_Output_BS_D_MC_Semua.setText(String.valueOf(O_DIAGONAL_BS_MC_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
    	Button_Reset_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BS_S_MC_Semua.setText("");
				ET_Output_BS_Luas_MC_Semua.setText("");
				ET_Output_BS_Keliling_MC_Semua.setText("");
				ET_Output_BS_D_MC_Semua.setText("");

				ET_Input_BS_S_MC_Semua.setTextSize(12);
				ET_Output_BS_Luas_MC_Semua.setTextSize(12);
				ET_Output_BS_Keliling_MC_Semua.setTextSize(12);
				ET_Output_BS_D_MC_Semua.setTextSize(12);
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_BS_S_MC_Semua.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
    	Button_Kembali_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
    	Button_Detail_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BujurSangkar_MC_Semua.this, FormLihatGambarBS.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});
    	

    	IV_Gambar_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_BujurSangkar_MC_Semua.this, FormLihatGambarBS.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});	
    	
    	Button_Rumus_BS_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_BS_S_MC_Semua.setText("Nilai Sisi[s]");
				ET_Output_BS_Luas_MC_Semua.setText(" s x s");
				ET_Output_BS_Keliling_MC_Semua.setText(" 4 x s");
				ET_Output_BS_D_MC_Semua.setText(" s√2");
				
				ET_Input_BS_S_MC_Semua.setTextSize(17);
				ET_Output_BS_Luas_MC_Semua.setTextSize(17);
				ET_Output_BS_Keliling_MC_Semua.setTextSize(17);
				ET_Output_BS_D_MC_Semua.setTextSize(17);
				
				ET_Input_BS_S_MC_Semua.requestFocus();
			}
		});    	
	}
}
