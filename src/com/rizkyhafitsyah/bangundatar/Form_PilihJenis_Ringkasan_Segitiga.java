package com.rizkyhafitsyah.bangundatar;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

 
@SuppressWarnings("deprecation")
public class Form_PilihJenis_Ringkasan_Segitiga extends TabActivity {
 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_pilihjenis_ringkasan_segitiga);
 
        TabHost TabRingkasanSegitiga = getTabHost();
        TabHost.TabSpec SpecTabRingkasanSegitiga;
        Intent intent;
         
        intent = new Intent().setClass(this, FormLihatGambarSegitigaSamaKaki.class);//content pada tab yang akan kita buat
        SpecTabRingkasanSegitiga = TabRingkasanSegitiga.newTabSpec("SamaKaki").setIndicator("SamaKaki",null).setContent(intent);//mengeset nama tab dan mengisi content pada menu tab anda.
        TabRingkasanSegitiga.addTab(SpecTabRingkasanSegitiga);//untuk membuat tabbaru disini bisa diatur sesuai keinginan anda
         
        intent = new Intent().setClass(this, FormLihatGambarSegitigaSamaSisi.class);
        SpecTabRingkasanSegitiga = TabRingkasanSegitiga.newTabSpec("SamaSisi").setIndicator("SamaSisi",null).setContent(intent);
        TabRingkasanSegitiga.addTab(SpecTabRingkasanSegitiga);
         
        intent = new Intent().setClass(this, FormLihatGambarSegitigaSembarang.class);
        SpecTabRingkasanSegitiga = TabRingkasanSegitiga.newTabSpec("Sembarang").setIndicator("Sembarang",null).setContent(intent);
        TabRingkasanSegitiga.addTab(SpecTabRingkasanSegitiga);

        intent = new Intent().setClass(this, FormLihatGambarSegitigaSikuSiku.class);
        SpecTabRingkasanSegitiga = TabRingkasanSegitiga.newTabSpec("SikuSiku").setIndicator("SikuSiku",null).setContent(intent);
        TabRingkasanSegitiga.addTab(SpecTabRingkasanSegitiga);
 
    }
}