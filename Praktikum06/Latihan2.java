package Praktikum06;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiaya;
        double diskon;

        System.out.println("Masukkan lama sewa mobil (per hari) = ");
        lamaSewa = sc.nextInt();

        System.out.println("Masukkan jarak tempuh (per KM) = ");
        jarakTempuh = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;

        if (totalBiaya >= 200000) {
            diskon = 0.05 * totalBiaya;
            totalBiaya = totalBiaya - (int) diskon;
        } 

        System.out.println("Total biaya sewa mobil = " + totalBiaya);
    }
}
