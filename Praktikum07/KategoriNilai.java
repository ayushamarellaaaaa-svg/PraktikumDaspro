package Praktikum07;

import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            double nilai;

            while (true) {
                System.out.println("Masukkan nilai mahasiswa ke - " + i + ": ");
                nilai = sc.nextDouble();

                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid!");
                } else {
                    break;
                }
            }

            String kategori;
            if (nilai > 80 && nilai <= 100) {
                kategori = "A";
            } else if (nilai > 73 && nilai <= 80) {
                kategori = "B+";
            } else if (nilai > 65 && nilai <= 73) {
                kategori = "B";
            } else if (nilai > 60 && nilai <= 65) {
                kategori = "C+";
            } else if (nilai > 50 && nilai <= 60) {
                kategori = "C";
            } else if (nilai >39 && nilai <= 50) {
                kategori = "D";
            } else {
                kategori = "E";
            }

            System.out.println("Nilai akhir mahasiswa ke - " + i + " = " + nilai + " Kategori: " + kategori);
        }
    }
}
