package Praktikum06;

import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetak;
        int totalBerat;
        int biayaJilid = 20000;
        int halaman;
        int lembar;
        int beratKertas;
        int biayaOngkir;
        int totalBiaya;
        int biayaCover = 0;
        int beratCover = 0;
        String jenisCover;

        System.out.println("Masukkan jumlah halaman = ");
        halaman = sc.nextInt();

        System.out.println("Masukkan jenis cover (hard/soft) = ");
        jenisCover = sc.next();

        if (jenisCover.equalsIgnoreCase("hard")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equalsIgnoreCase("soft")) {
            biayaCover = 10000;
            beratCover = 100;
        } else
            System.out.println("Jenis cover tidak ditemukan");

        biayaCetak = halaman * 200;
        lembar = halaman / 2;
        beratKertas = lembar * 3;
        totalBerat = beratKertas + beratCover + 300;
        biayaJilid = biayaCover;
        biayaOngkir = totalBerat / 1000 * 15000;
        totalBiaya = biayaCetak + biayaJilid + biayaOngkir;

        System.out.println("Total biaya cetak = " + totalBiaya);
    }
}
