package Praktikum07;

import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;
        double totalHarga;
        double diskon1 = 0.15;
        double diskon2 = 0.10;
        double diskon;
        String selanjutnya = "";
        String pelanggan;

        do {
            System.out.println("Masukkan jumlah tiket yang dibeli (atau ketik '0' untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! jumlah tiket tidak boleh negatif");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
               diskon = totalHarga * diskon1;
               totalHarga = totalHarga - diskon;
               System.out.println("mendapat diskon 15%");
            } else if (jumlahTiket > 4) {
                diskon = totalHarga * diskon2;
                totalHarga = totalHarga - diskon;
                System.out.println("mendapat diskon 10%");
            } else {
                System.out.println("tidak mendapatkan diskon");
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk pelanggan: Rp " + totalHarga);


        } while (jumlahTiket > 0);

        System.out.println("=== LAPORAN PENJUALAN HARI INI ===");
        System.out.println("Total tiket terjual : " + totalTiket + " tiket");
        System.out.println("Total penjualan   : Rp " + totalPenjualan);
    }
}
