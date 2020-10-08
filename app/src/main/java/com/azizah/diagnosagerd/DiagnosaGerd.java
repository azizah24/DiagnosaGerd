package com.azizah.diagnosagerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class DiagnosaGerd extends AppCompatActivity {
    TextView kategori;
    CheckBox dada,batuk,pahit,baunafas,sulitnelan,panasnelan, tenggorok, suaraserak, demam, diare, asma, mual;
    Button deteksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa_gerd);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Diagnosa GERD");
        dada = findViewById(R.id.dada);
        pahit = findViewById(R.id.pahit);
        baunafas = findViewById(R.id.baunafas);
        batuk = findViewById(R.id.batuk);
        sulitnelan = findViewById(R.id.sulitnelan);
        panasnelan = findViewById(R.id.panasnelan);
        kategori = findViewById(R.id.kategori);
        asma = findViewById(R.id.asma);
        suaraserak = findViewById(R.id.suaraserak);
        tenggorok = findViewById(R.id.tenggorok);
        demam = findViewById(R.id.demam);
        diare = findViewById(R.id.diare);
        mual = findViewById(R.id.mual);
        deteksi = findViewById(R.id.deteksi);
        kategori.setText("");

        deteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String penyakit = "Dari Gejala Yang diinputkan\nAnda Termasuk Kategori : ";

                if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "GERD\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

               else if (dada.isChecked()){

                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Gejala GERD Rendah\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Tinggi\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Tinggi\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (dada.isChecked() && pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "GERD\nGejala GERD (gastroesophageal reflux disease) yang utama adalah heartburn atau sensasi panas di dada.\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //pahit

                else if ( pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked() && demam.isChecked() && mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //

                else if ( pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked() && demam.isChecked() && mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && batuk.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //
                else if ( pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked() && demam.isChecked() && mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }


                //

                else if ( pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked() && demam.isChecked() && mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (pahit.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }


                //



                else if (pahit.isChecked() && baunafas.isChecked() && batuk.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";

                }

                else if (pahit.isChecked() && baunafas.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";

                }

                else if (pahit.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";

                }



                // baunafas

                else if (baunafas.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() &&  panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() &&  sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //
                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (baunafas.isChecked() && batuk.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";

                }

                else if (baunafas.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";

                }

                // batuk

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                //

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked() && sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (batuk.isChecked()){
                    penyakit += "Kemungkinan Sakit GERD Tidak ada";
                }


                // sulit nelan

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked() && panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (sulitnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked() && suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (panasnelan.isChecked()){
                    penyakit += "Sakit Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }
                else if (suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (suaraserak.isChecked() && tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (suaraserak.isChecked() && tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (suaraserak.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }


                else if (tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (tenggorok.isChecked() && asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (tenggorok.isChecked() && asma.isChecked() && diare.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (tenggorok.isChecked() && asma.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (tenggorok.isChecked()){
                    penyakit += "Radang Tenggorokan\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (asma.isChecked() && diare.isChecked()
                        && demam.isChecked() && mual.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (asma.isChecked() && diare.isChecked()
                        && demam.isChecked()){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (asma.isChecked() && diare.isChecked()){
                    penyakit += "Asma dan Diare\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (asma.isChecked()){
                    penyakit += "Asma\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (diare.isChecked()
                        && demam.isChecked() && mual.isChecked()) {
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (diare.isChecked() && demam.isChecked()){
                    penyakit += "Diare\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if (diare.isChecked()){
                    penyakit += "Diare\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if ( demam.isChecked() && mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if ( demam.isChecked() ){
                    penyakit += "Demam\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                else if ( mual.isChecked() ){
                    penyakit += "Gejala GERD Rendah\nPeriksakan diri Anda di Fasilitas Kesehatan atau Puskesmas Terdekat untuk melakukan pemeriksaan lebih lanjut.";

                }

                kategori.setText("" +penyakit);

            }
        });

    }
}
