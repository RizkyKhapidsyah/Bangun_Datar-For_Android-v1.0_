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

public class Form_Trapesium_SamaKaki_MC_HSMD extends Activity {
	
	TextView TV_Judul_T_SamaKaki_MC_HSMD;
	TextView TV_SubJudul_T_SamaKaki_MC_HSMD;
	ImageView IV_Gambar_T_SamaKaki_MC_HSMD;
	TextView TV_Input_T_SamaKaki_SBKn_MC_HSMD;
	TextView TV_Input_T_SamaKaki_Tinggi_MC_HSMD;
	TextView TV_Output_T_SamaKaki_SMD_MC_HSMD;
	TextView TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSMD;
	TextView TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSMD;
	TextView TV_SatuanNilai_T_SamaKaki_SMD_MC_HSMD;
	EditText ET_Input_T_SamaKaki_SBKn_MC_HSMD;
	EditText ET_Input_T_SamaKaki_Tinggi_MC_HSMD;
	EditText ET_Output_T_SamaKaki_SMD_MC_HSMD;	
	Button Button_Hitung_T_SamaKaki_MC_HSMD;
	Button Button_Reset_T_SamaKaki_MC_HSMD;
	Button Button_Kembali_T_SamaKaki_MC_HSMD;
	Button Button_Detail_T_SamaKaki_MC_HSMD;
	Button Button_Rumus_TSK_MC_HSMD;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_samakaki_mc_hsmd);

        String CustomHuruf_T_SamaKaki_MC_HSMD = "AGENCYR.TTF";
        Typeface TipeHuruf_T_SamaKaki_MC_HSMD = Typeface.createFromAsset(getAssets(), CustomHuruf_T_SamaKaki_MC_HSMD);

        TV_Judul_T_SamaKaki_MC_HSMD = (TextView)findViewById(R.id.TV_Judul_T_SamaKaki_MC_HSMD);
        TV_SubJudul_T_SamaKaki_MC_HSMD = (TextView)findViewById(R.id.TV_SubJudul_T_SamaKaki_MC_HSMD);
        IV_Gambar_T_SamaKaki_MC_HSMD = (ImageView)findViewById(R.id.IV_Gambar_T_SamaKaki_MC_HSMD);
        TV_Input_T_SamaKaki_SBKn_MC_HSMD = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SBKn_MC_HSMD);
        TV_Input_T_SamaKaki_Tinggi_MC_HSMD = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_Tinggi_MC_HSMD);
        TV_Output_T_SamaKaki_SMD_MC_HSMD = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SMD_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSMD = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSMD = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_SMD_MC_HSMD = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SMD_MC_HSMD);
        ET_Input_T_SamaKaki_SBKn_MC_HSMD = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SBKn_MC_HSMD);
        ET_Input_T_SamaKaki_Tinggi_MC_HSMD = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_Tinggi_MC_HSMD);
        ET_Output_T_SamaKaki_SMD_MC_HSMD = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SMD_MC_HSMD);
        Button_Hitung_T_SamaKaki_MC_HSMD = (Button)findViewById(R.id.Button_Hitung_T_SamaKaki_MC_HSMD);
        Button_Reset_T_SamaKaki_MC_HSMD = (Button)findViewById(R.id.Button_Reset_T_SamaKaki_MC_HSMD);
        Button_Kembali_T_SamaKaki_MC_HSMD = (Button)findViewById(R.id.Button_Kembali_T_SamaKaki_MC_HSMD);
        Button_Detail_T_SamaKaki_MC_HSMD = (Button)findViewById(R.id.Button_Detail_T_SamaKaki_MC_HSMD);
        Button_Rumus_TSK_MC_HSMD = (Button)findViewById(R.id.Button_Rumus_TSK_MC_HSMD);

        TV_Judul_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_SubJudul_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_Input_T_SamaKaki_SBKn_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_Input_T_SamaKaki_Tinggi_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_Output_T_SamaKaki_SMD_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_SBKn_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_Tinggi_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        TV_SatuanNilai_T_SamaKaki_SMD_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        ET_Input_T_SamaKaki_SBKn_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        ET_Input_T_SamaKaki_Tinggi_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        ET_Output_T_SamaKaki_SMD_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        Button_Hitung_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        Button_Reset_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        Button_Kembali_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        Button_Detail_T_SamaKaki_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
        Button_Rumus_TSK_MC_HSMD.setTypeface(TipeHuruf_T_SamaKaki_MC_HSMD);
    
		 //menambahkan event klik untuk perintah di tombol hitung
        Button_Hitung_T_SamaKaki_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_SamaKaki_SBKn_MC_HSMD.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah Sebelah Kanan [sbkn]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_SamaKaki_SBKn_MC_HSMD.requestFocus();
					}		
					else if(ET_Input_T_SamaKaki_Tinggi_MC_HSMD.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_Tinggi_MC_HSMD.requestFocus();
					}
					else{	
						double I_SBKn_T_SamaKaki_MC_HSMD = Double.parseDouble(ET_Input_T_SamaKaki_SBKn_MC_HSMD.getText().toString());
						double I_TINGGI_T_SamaKaki_MC_HSMD = Double.parseDouble(ET_Input_T_SamaKaki_Tinggi_MC_HSMD.getText().toString());
						double O_SMD_T_SamaKaki_MC_HSMD = Math.sqrt(Math.pow(I_SBKn_T_SamaKaki_MC_HSMD, 2) + Math.pow(I_TINGGI_T_SamaKaki_MC_HSMD, 2));
						ET_Output_T_SamaKaki_SMD_MC_HSMD.setText(String.valueOf(O_SMD_T_SamaKaki_MC_HSMD));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
        Button_Reset_T_SamaKaki_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_SBKn_MC_HSMD.setText("");
				ET_Input_T_SamaKaki_Tinggi_MC_HSMD.setText("");
				ET_Output_T_SamaKaki_SMD_MC_HSMD.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_SamaKaki_SBKn_MC_HSMD.requestFocus();
			}
		});
        
        Button_Rumus_TSK_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_SBKn_MC_HSMD.setText(" Sisi Bawah Kanan [sbkn]");
				ET_Input_T_SamaKaki_Tinggi_MC_HSMD.setText(" Tinggi [t]");
				ET_Output_T_SamaKaki_SMD_MC_HSMD.setText(" √(sbkn^2 + t^2)");
				ET_Input_T_SamaKaki_SBKn_MC_HSMD.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
        Button_Kembali_T_SamaKaki_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
        Button_Detail_T_SamaKaki_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSMD.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

        IV_Gambar_T_SamaKaki_MC_HSMD.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_HSMD.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
