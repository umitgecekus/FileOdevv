package com.umit;

import java.io.*;
import java.util.ArrayList;

public class FileIslemleri {
    private ArrayList<String> ogrenciListesi;

    public FileIslemleri() throws IOException {
        ogrenciListesi = new ArrayList<>();
        dosyadanVeriOku();
    }

    private void dosyadanVeriOku() throws IOException {
        BufferedReader bufferedReader = null;

            bufferedReader = new BufferedReader(new FileReader(DosyaSabitleri.isimListesiPath));
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                ogrenciListesi.add(satir);
            }
    }

    public void secileceklerDosyasinaYazdirmaIslemi() throws IOException {

        BufferedWriter bufferedWriter = null;

            bufferedWriter = new BufferedWriter(new FileWriter(DosyaSabitleri.secileceklerListesiPath));
            for (String ogrenci : ogrenciListesi) {
                bufferedWriter.write(ogrenci + "\n");
            }
                bufferedWriter.close();

        }
    }



