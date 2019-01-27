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

public class Form_Trapesium_SamaKaki_MC_HSM extends Activity {
	
	TextView TV_Judul_T_SamaKaki_MC_HSM;
	TextView TV_SubJudul_T_SamaKaki_MC_HSM;
	ImageView IV_Gambar_T_SamaKaki_MC_HSM;
	TextView TV_Input_T_SamaKaki_Tinggi_MC_HSM;
	TextView TV_Input_T_SamaKaki_SBKr_MC_HSM;
	TextView TV_Output_T_SamaKaki_SM_MC_HSM;
	TextView TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSM;
	TextView TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSM;
	TextView TV_SatuanNilai_T_SamaKaki_SM_MC_HSM;
	EditText ET_Input_T_SamaKaki_Tinggi_MC_HSM;
	EditText ET_Input_T_SamaKaki_SBKr_MC_HSM;
	EditText ET_Output_T_SamaKaki_SM_MC_HSM;	
	Button Button_Hitung_T_SamaKaki_MC_HSM;
	Button Button_Reset_T_SamaKaki_MC_HSM;
	Button Button_Kembali_T_SamaKaki_MC_HSM;
	Button Button_Detail_T_SamaKaki_MC_HSM;
	Button Button_Rumus_TSK_MC_HSM;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_samakaki_mc_hsm);

        String CustomHuruf_T_SamaKaki_MC_HSM = "AGENCYR.TTF";
        Typeface TipeHuruf_T_SamaKaki_MC_HSM = Typeface.createFromAsset(getAssets(), CustomHuruf_T_SamaKaki_MC_HSM);

        TV_Judul_T_SamaKaki_MC_HSM = (TextView)findViewById(R.id.TV_Judul_T_SamaKaki_MC_HSM);
        TV_SubJudul_T_SamaKaki_MC_HSM = (TextView)findViewById(R.id.TV_SubJudul_T_SamaKaki_MC_HSM);
        IV_Gambar_T_SamaKaki_MC_HSM = (ImageView)findViewById(R.id.IV_Gambar_T_SamaKaki_MC_HSM);
        TV_Input_T_SamaKaki_Tinggi_MC_HSM = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_Tinggi_MC_HSM);
        TV_Input_T_SamaKaki_SBKr_MC_HSM = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SBKr_MC_HSM);
        TV_Output_T_SamaKaki_SM_MC_HSM = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SM_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSM = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSM = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_SM_MC_HSM = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SM_MC_HSM);
        ET_Input_T_SamaKaki_Tinggi_MC_HSM = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_Tinggi_MC_HSM);
        ET_Input_T_SamaKaki_SBKr_MC_HSM = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SBKr_MC_HSM);
        ET_Output_T_SamaKaki_SM_MC_HSM = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SM_MC_HSM);
        Button_Hitung_T_SamaKaki_MC_HSM = (Button)findViewById(R.id.Button_Hitung_T_SamaKaki_MC_HSM);
        Button_Reset_T_SamaKaki_MC_HSM = (Button)findViewById(R.id.Button_Reset_T_SamaKaki_MC_HSM);
        Button_Kembali_T_SamaKaki_MC_HSM = (Button)findViewById(R.id.Button_Kembali_T_SamaKaki_MC_HSM);
        Button_Detail_T_SamaKaki_MC_HSM = (Button)findViewById(R.id.Button_Detail_T_SamaKaki_MC_HSM);
        Button_Rumus_TSK_MC_HSM = (Button)findViewById(R.id.Button_Rumus_TSK_MC_HSM);

        TV_Judul_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_SubJudul_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_Input_T_SamaKaki_Tinggi_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_Input_T_SamaKaki_SBKr_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_Output_T_SamaKaki_SM_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_SBKr_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        TV_SatuanNilai_T_SamaKaki_SM_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        ET_Input_T_SamaKaki_Tinggi_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        ET_Input_T_SamaKaki_SBKr_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        ET_Output_T_SamaKaki_SM_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        Button_Hitung_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        Button_Reset_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        Button_Kembali_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        Button_Detail_T_SamaKaki_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        Button_Rumus_TSK_MC_HSM.setTypeface(TipeHuruf_T_SamaKaki_MC_HSM);
        
		 //menambahkan event klik untuk perintah di tombol hitung
        Button_Hitung_T_SamaKaki_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_SamaKaki_Tinggi_MC_HSM.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_SamaKaki_Tinggi_MC_HSM.requestFocus();
					}		
					else if(ET_Input_T_SamaKaki_SBKr_MC_HSM.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah Sebelah Kiri [sbkr]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SBKr_MC_HSM.requestFocus();
					}
					else{	
						double I_TINGGI_T_SamaKaki_MC_HSM = Double.parseDouble(ET_Input_T_SamaKaki_Tinggi_MC_HSM.getText().toString());
						double I_SBKr_T_SamaKaki_MC_HSM = Double.parseDouble(ET_Input_T_SamaKaki_SBKr_MC_HSM.getText().toString());
						double O_SM_T_SamaKaki_MC_HSM = Math.sqrt(Math.pow(I_TINGGI_T_SamaKaki_MC_HSM, 2) + Math.pow(I_SBKr_T_SamaKaki_MC_HSM, 2));
						ET_Output_T_SamaKaki_SM_MC_HSM.setText(String.valueOf(O_SM_T_SamaKaki_MC_HSM));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
        Button_Reset_T_SamaKaki_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSM.setText("");
				ET_Input_T_SamaKaki_SBKr_MC_HSM.setText("");
				ET_Output_T_SamaKaki_SM_MC_HSM.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_SamaKaki_Tinggi_MC_HSM.requestFocus();
			}
		});
        
        Button_Rumus_TSK_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_Tinggi_MC_HSM.setText(" Tinggi [t]");
				ET_Input_T_SamaKaki_SBKr_MC_HSM.setText(" Sisi Bawah Kiri [sbkr]");
				ET_Output_T_SamaKaki_SM_MC_HSM.setText(" √(sbkr^2 + t^2)");
				ET_Input_T_SamaKaki_Tinggi_MC_HSM.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
        Button_Kembali_T_SamaKaki_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
        Button_Detail_T_SamaKaki_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSM.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

        IV_Gambar_T_SamaKaki_MC_HSM.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSM.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
