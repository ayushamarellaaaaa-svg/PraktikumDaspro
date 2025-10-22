package Praktikum06;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiaya;
        String bahanBakar;
        int hargaPerKm = 0;
        double diskon;

        System.out.println("Masukkan lama sewa mobil (per hari) = ");
        lamaSewa = sc.nextInt();

        if (lamaSewa > 30) {
            System.out.println("Lama sewa maksimal 30 hari");
        } else {

            System.out.println("Masukkan jarak tempuh (per KM) = ");
            jarakTempuh = sc.nextInt();

            System.out.println("Masukkan jenis bahan bakar (pertalite/pertamax) = ");
            bahanBakar = sc.next();

            if (bahanBakar.equalsIgnoreCase("pertalite")) {
                hargaPerKm = 1000;
            } else if (bahanBakar.equalsIgnoreCase("pertamax")) {
                hargaPerKm = 1300;
            } else {
                System.out.println("Jenis bahan bakar tidak ada");
            }

            biayaSewa = 300000 * lamaSewa;
            biayaSupir = 200000 * lamaSewa;
            biayaBahanBakar = hargaPerKm * jarakTempuh;
            totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;

            if (totalBiaya >= 2000000) {
            diskon = 0.05 * totalBiaya;
            totalBiaya = totalBiaya - (int) diskon;
        } 

            System.out.println("Total biaya sewa mobil = " + totalBiaya);

        }
    }
}
