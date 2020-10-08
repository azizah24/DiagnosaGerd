package com.azizah.diagnosagerd;

import java.util.ArrayList;
import java.util.Arrays;

public class Dataapaitu {

    private static ArrayList<String> getNama(){
        String[]  dataName = {
                "Apa itu GERD?",
                "Apa sih refluks asam lambung?",
                "Makanan yang memicu GERD",
                "Siapa saja yang bisa terkena GERD?"
        };
        return new ArrayList<>(Arrays.asList(dataName));
    }

    private static ArrayList<String> getPenjelasan(){
        String[] dataDeskripsi= {

                "Gastroesophageal reflux disease (GERD) adalah gangguan pencernaan yang ditandai oleh refluks asam lambung berulang dalam jangka panjang.",
                "Refluks asam lambung adalah kondisi yang terjadi ketika cairan asam di lambung bocor dan mengalir naik balik ke kerongkongan (esofagus).",
                "Makanan berminyak, seperti kentang goreng atau makanan cepat saji\nMakanan manis, seperti cokelat, permen, atau kue bergula.",
                "GERD dapat menyerang siapa saja. Namun, orang yang mengalami kelebihan berat badan (obesitas) dan wanita hamil lebih berisiko terkena penyakit GERD."
        };
        return new ArrayList<>(Arrays.asList(dataDeskripsi));
    }
    private static ArrayList<Integer> getFoto(){
        Integer[] imgPhoto ={
                R.drawable.apalg,
                R.drawable.refl,
                R.drawable.mknan,
                R.drawable.pipol,
        };
        return new ArrayList<>(Arrays.asList(imgPhoto));
    }


    public static ArrayList<Apa> getListData(){
        ArrayList<Apa> data = new ArrayList<>();
        for (int i = 0; i<=3; i++){
            Apa dta = new Apa();

            dta.setNama(Dataapaitu.getNama().get(i));
            dta.setPenjelasan(Dataapaitu.getPenjelasan().get(i));
            dta.setFoto(Dataapaitu.getFoto().get(i));


            data.add(dta);
        }
        return data;
    }
}
