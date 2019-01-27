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

public class Form_Trapesium_SamaKaki_MC_Semua extends Activity {
	TextView TV_Judul_T_SamaKaki_MC_Semua;
	TextView TV_SubJudul_T_SamaKaki_MC_Semua;
	TextView TV_Input_T_SamaKaki_SA_MC_Semua;
	TextView TV_Input_T_SamaKaki_SB_MC_Semua;
	TextView TV_Input_T_SamaKaki_SM_MC_Semua;
	TextView TV_Input_T_SamaKaki_T_MC_Semua;
	TextView TV_Output_T_SamaKaki_Luas_MC_Semua;
	TextView TV_Output_T_SamaKaki_Keliling_MC_Semua;
	TextView TV_Output_T_SamaKaki_SMD_MC_Semua;
	TextView TV_Output_T_SamaKaki_SBKr_MC_Semua;
	TextView TV_Output_T_SamaKaki_SBKn_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SA_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SB_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SM_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_T_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_Luas_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_Keliling_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SMD_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SBKr_MC_Semua;
	TextView TV_SatuanNilai_T_SamaKaki_SBKn_MC_Semua;
	ImageView IV_Gambar_T_SamaKaki_MC_Semua;
	EditText ET_Input_T_SamaKaki_SA_MC_Semua;
	EditText ET_Input_T_SamaKaki_SB_MC_Semua;
	EditText ET_Input_T_SamaKaki_SM_MC_Semua;
	EditText ET_Input_T_SamaKaki_T_MC_Semua;
	EditText ET_Output_T_SamaKaki_Luas_MC_Semua;
	EditText ET_Output_T_SamaKaki_Keliling_MC_Semua;
	EditText ET_Output_T_SamaKaki_SMD_MC_Semua;
	EditText ET_Output_T_SamaKaki_SBKr_MC_Semua;
	EditText ET_Output_T_SamaKaki_SBKn_MC_Semua;
	Button Button_Hitung_T_SamaKaki_MC_Semua;
	Button Button_Reset_T_SamaKaki_MC_Semua;
	Button Button_Detail_T_SamaKaki_MC_Semua;
	Button Button_Kembali_T_SamaKaki_MC_Semua;
	Button Button_Rumus_TSK_MC_Semua;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_trapesium_samakaki_mc_semua);

        String CustomHuruf_T_SamaKaki_MC_Semua = "AGENCYR.TTF";
        Typeface TipeHuruf_T_SamaKaki_MC_Semua = Typeface.createFromAsset(getAssets(), CustomHuruf_T_SamaKaki_MC_Semua);

		 TV_Judul_T_SamaKaki_MC_Semua = (TextView)findViewById(R.id.TV_Judul_T_SamaKaki_MC_Semua);
		 TV_SubJudul_T_SamaKaki_MC_Semua = (TextView)findViewById(R.id.TV_SubJudul_T_SamaKaki_MC_Semua);
		 TV_Input_T_SamaKaki_SA_MC_Semua = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SA_MC_Semua);
		 TV_Input_T_SamaKaki_SB_MC_Semua = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SB_MC_Semua);
		 TV_Input_T_SamaKaki_SM_MC_Semua = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_SM_MC_Semua);
		 TV_Input_T_SamaKaki_T_MC_Semua = (TextView)findViewById(R.id.TV_Input_T_SamaKaki_T_MC_Semua);
		 TV_Output_T_SamaKaki_Luas_MC_Semua = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_Luas_MC_Semua);
		 TV_Output_T_SamaKaki_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_Keliling_MC_Semua);
		 TV_Output_T_SamaKaki_SMD_MC_Semua = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SMD_MC_Semua);
		 TV_Output_T_SamaKaki_SBKr_MC_Semua = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SBKr_MC_Semua);
		 TV_Output_T_SamaKaki_SBKn_MC_Semua = (TextView)findViewById(R.id.TV_Output_T_SamaKaki_SBKn_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SA_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SA_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SB_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SB_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SM_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SM_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_T_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_T_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_Luas_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Luas_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_Keliling_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_Keliling_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SMD_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SMD_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SBKr_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKr_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SBKn_MC_Semua = (TextView)findViewById(R.id.TV_SatuanNilai_T_SamaKaki_SBKn_MC_Semua);
		 IV_Gambar_T_SamaKaki_MC_Semua = (ImageView)findViewById(R.id.IV_Gambar_T_SamaKaki_MC_Semua);
		 ET_Input_T_SamaKaki_SA_MC_Semua = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SA_MC_Semua);
		 ET_Input_T_SamaKaki_SB_MC_Semua = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SB_MC_Semua);
		 ET_Input_T_SamaKaki_SM_MC_Semua = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_SM_MC_Semua);
		 ET_Input_T_SamaKaki_T_MC_Semua = (EditText)findViewById(R.id.ET_Input_T_SamaKaki_T_MC_Semua);
		 ET_Output_T_SamaKaki_Luas_MC_Semua = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_Luas_MC_Semua);
		 ET_Output_T_SamaKaki_Keliling_MC_Semua = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_Keliling_MC_Semua);
		 ET_Output_T_SamaKaki_SMD_MC_Semua = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SMD_MC_Semua);
		 ET_Output_T_SamaKaki_SBKr_MC_Semua = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SBKr_MC_Semua);
		 ET_Output_T_SamaKaki_SBKn_MC_Semua = (EditText)findViewById(R.id.ET_Output_T_SamaKaki_SBKn_MC_Semua);
		 Button_Hitung_T_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Hitung_T_SamaKaki_MC_Semua);
		 Button_Reset_T_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Reset_T_SamaKaki_MC_Semua);
		 Button_Detail_T_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Detail_T_SamaKaki_MC_Semua);
		 Button_Kembali_T_SamaKaki_MC_Semua = (Button)findViewById(R.id.Button_Kembali_T_SamaKaki_MC_Semua);
		 Button_Rumus_TSK_MC_Semua = (Button)findViewById(R.id.Button_Rumus_TSK_MC_Semua);
		
		 TV_Judul_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SubJudul_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Input_T_SamaKaki_SA_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Input_T_SamaKaki_SB_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Input_T_SamaKaki_SM_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Input_T_SamaKaki_T_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Output_T_SamaKaki_Luas_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Output_T_SamaKaki_Keliling_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Output_T_SamaKaki_SMD_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Output_T_SamaKaki_SBKr_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_Output_T_SamaKaki_SBKn_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SA_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SB_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SM_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_T_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_Luas_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_Keliling_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SMD_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SBKr_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 TV_SatuanNilai_T_SamaKaki_SBKn_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Input_T_SamaKaki_SA_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Input_T_SamaKaki_SB_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Input_T_SamaKaki_SM_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Input_T_SamaKaki_T_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Output_T_SamaKaki_Luas_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Output_T_SamaKaki_Keliling_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Output_T_SamaKaki_SMD_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Output_T_SamaKaki_SBKr_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 ET_Output_T_SamaKaki_SBKn_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 Button_Hitung_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 Button_Reset_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 Button_Detail_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 Button_Kembali_T_SamaKaki_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);
		 Button_Rumus_TSK_MC_Semua.setTypeface(TipeHuruf_T_SamaKaki_MC_Semua);

		 //menambahkan event klik untuk perintah di tombol hitung
		 Button_Hitung_T_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(ET_Input_T_SamaKaki_SA_MC_Semua.length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Atas [sa]. Lihat Gambar!", Toast.LENGTH_LONG).show();
						ET_Input_T_SamaKaki_SA_MC_Semua.requestFocus();
					}		
					else if(ET_Input_T_SamaKaki_SB_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Bawah [sb]!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SB_MC_Semua.requestFocus();
					}
					else if(ET_Input_T_SamaKaki_SM_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Sisi Miring [sm]!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SM_MC_Semua.requestFocus();
					}
					else if(ET_Input_T_SamaKaki_T_MC_Semua.getText().toString().length()==0){
						Toast.makeText(getApplication(), "Silahkan Isi Nilai dari Tinggi [t]!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_T_MC_Semua.requestFocus();
					}		
					else if(Double.parseDouble(ET_Input_T_SamaKaki_SA_MC_Semua.getText().toString()) >= Double.parseDouble(ET_Input_T_SamaKaki_SB_MC_Semua.getText().toString())){ //Jika Nilai Sisi Atas [sa] lebih besar atau sama dengan nilai Sisi Bawah [sb] maka  
						Toast.makeText(getApplication(), "Nilai Sisi Atas [sa] tidak pernah lebih besar/tidak sama dengan nilai Sisi Bawah [sb] untuk Trapesium Sama Kaki. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_SA_MC_Semua.requestFocus();
					}
					else if(Double.parseDouble(ET_Input_T_SamaKaki_T_MC_Semua.getText().toString()) >= Double.parseDouble(ET_Input_T_SamaKaki_SM_MC_Semua.getText().toString())){ //Jika Nilai Tinggi [t] lebih besar atau sama dengan nilai Sisi Miring [sm] maka  
						Toast.makeText(getApplication(), "Nilai Tinggi [t] tidak pernah lebih besar/tidak sama dengan nilai Sisi Miring [sm] untuk Trapesium Sama Kaki. Lihat Gambar!", Toast.LENGTH_LONG).show();				
						ET_Input_T_SamaKaki_T_MC_Semua.requestFocus();
					}					
					else{	
						double I_SA_T_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_T_SamaKaki_SA_MC_Semua.getText().toString());
						double I_SB_T_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_T_SamaKaki_SB_MC_Semua.getText().toString());
						double I_SM_T_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_T_SamaKaki_SM_MC_Semua.getText().toString());
						double I_T_T_SamaKaki_MC_Semua = Double.parseDouble(ET_Input_T_SamaKaki_T_MC_Semua.getText().toString());
						double O_LUAS_T_SamaKaki_MC_Semua = I_SA_T_SamaKaki_MC_Semua + I_SB_T_SamaKaki_MC_Semua * I_T_T_SamaKaki_MC_Semua / 2;
						double O_KELILING_T_SamaKaki_MC_Semua = I_SA_T_SamaKaki_MC_Semua + I_SM_T_SamaKaki_MC_Semua + I_SB_T_SamaKaki_MC_Semua + I_SM_T_SamaKaki_MC_Semua;
						double O_SMD_T_SamaKaki_MC_Semua =  Math.sqrt(Math.pow(I_SB_T_SamaKaki_MC_Semua, 2) + Math.pow(I_SM_T_SamaKaki_MC_Semua, 2));
						double O_SBKr_T_SamaKaki_MC_Semua = Math.sqrt(Math.pow(I_SM_T_SamaKaki_MC_Semua, 2) - Math.pow(I_T_T_SamaKaki_MC_Semua, 2));
						double O_SBkn_T_SamaKaki_Semua = Math.sqrt(Math.pow(O_SMD_T_SamaKaki_MC_Semua, 2) - Math.pow(I_T_T_SamaKaki_MC_Semua, 2));
						ET_Output_T_SamaKaki_Luas_MC_Semua.setText(String.valueOf(O_LUAS_T_SamaKaki_MC_Semua));
						ET_Output_T_SamaKaki_Keliling_MC_Semua.setText(String.valueOf(O_KELILING_T_SamaKaki_MC_Semua));
						ET_Output_T_SamaKaki_SMD_MC_Semua.setText(String.valueOf(O_SMD_T_SamaKaki_MC_Semua));
						ET_Output_T_SamaKaki_SBKr_MC_Semua.setText(String.valueOf(O_SBKr_T_SamaKaki_MC_Semua));
						ET_Output_T_SamaKaki_SBKn_MC_Semua.setText(String.valueOf(O_SBkn_T_SamaKaki_Semua));
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//menambahkan event klik untuk perintah di tombol reset
		 Button_Reset_T_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_SA_MC_Semua.setText("");
				ET_Input_T_SamaKaki_SB_MC_Semua.setText("");
				ET_Input_T_SamaKaki_SM_MC_Semua.setText("");
				ET_Input_T_SamaKaki_T_MC_Semua.setText("");
				ET_Output_T_SamaKaki_Luas_MC_Semua.setText("");
				ET_Output_T_SamaKaki_Keliling_MC_Semua.setText("");
				ET_Output_T_SamaKaki_SMD_MC_Semua.setText("");
				ET_Output_T_SamaKaki_SBKr_MC_Semua.setText("");
				ET_Output_T_SamaKaki_SBKn_MC_Semua.setText("");
				Toast.makeText(getApplication(), "Input dan Output Dikosongkan", Toast.LENGTH_LONG).show();
				ET_Input_T_SamaKaki_SA_MC_Semua.requestFocus();
			}
		});
		 
		 Button_Rumus_TSK_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ET_Input_T_SamaKaki_SA_MC_Semua.setText(" Sisi Atas [sa]");
				ET_Input_T_SamaKaki_SB_MC_Semua.setText(" Sisi Bawah [sb]");
				ET_Input_T_SamaKaki_SM_MC_Semua.setText(" Sisi Miring [sm]");
				ET_Input_T_SamaKaki_T_MC_Semua.setText(" Tinggi [t]");
				ET_Output_T_SamaKaki_Luas_MC_Semua.setText(" (Jumlah Rusuk Sejajar x Tinggi)/2   (atau)   ((sa + sb) x t)/2");
				ET_Output_T_SamaKaki_Keliling_MC_Semua.setText(" Jumlahkan Semua Rusuknya   (atau)   sb + sm + sm + sa");
				ET_Output_T_SamaKaki_SMD_MC_Semua.setText(" √(sbkn^2 + t^2 )  (Theorema Phytagoras)");
				ET_Output_T_SamaKaki_SBKr_MC_Semua.setText(" √(sm^2 - t^2 )   (Theorema Phytagoras)");
				ET_Output_T_SamaKaki_SBKn_MC_Semua.setText(" √(smd^2 - t^2 )   (Theorema Phytagoras)");
				ET_Input_T_SamaKaki_SA_MC_Semua.requestFocus();
			}
		});
	
		//menambahkan event klik untuk perintah di tombol kembali
		 Button_Kembali_T_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		//menambahkan event klik untuk perintah di tombol lihat gambar
		 Button_Detail_T_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_Semua.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});

		 IV_Gambar_T_SamaKaki_MC_Semua.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent PanggilFormLihatGambarBD = new Intent(Form_Trapesium_SamaKaki_MC_Semua.this, FormLihatGambarTrapesium.class);
				startActivity(PanggilFormLihatGambarBD);
			}
		});		
	}
}
