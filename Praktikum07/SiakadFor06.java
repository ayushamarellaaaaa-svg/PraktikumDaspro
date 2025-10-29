package Praktikum07;

import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke - " + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus = lulus + 1;
            } else {
                tidakLulus = tidakLulus + 1;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}
