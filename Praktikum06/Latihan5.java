package Praktikum06;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik = 0;
        int biayaBulanan;
        int dayaListrik;
        double pajak = 0;
        double totalBiaya;

        System.out.println("Masukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500)");
        dayaListrik = sc.nextInt();

        if (dayaListrik == 900) {
            tarifListrik = 1300;
        } else if (dayaListrik == 1300 || dayaListrik == 2200) {
            tarifListrik = 1500;
        } else if (dayaListrik == 3500 || dayaListrik == 5500) {
            tarifListrik = 1700;
        } else
            System.out.println("Daya ;istrik tidak tersedia");

        tarifListrik = 1500 * dayaListrik;
        biayaBulanan = 50000 + tarifListrik;
        totalBiaya = tarifListrik + biayaBulanan + pajak;

        System.out.println("Tarif per kwh = Rp " + tarifListrik);
        System.out.println("Biaya bulanan = Rp " + biayaBulanan);
        System.out.println("Total biaya tarif listrik = " + totalBiaya);

    }
}
