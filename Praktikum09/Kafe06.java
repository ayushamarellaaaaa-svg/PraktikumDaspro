package Praktikum09;

import java.util.Scanner;

public class Kafe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice"
        };

        int[] daftarHarga = {
                12000,
                15000,
                17000,
                13000,
                10000,
                20000,
                15000
        };

        while (true) {
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar) = ");
            int jumlahPesanan = sc.nextInt();
            sc.nextLine();

            if (jumlahPesanan == 0) {
                System.out.println("Program selesai");
                break;
            }

            System.out.println("Silahkan input menu");
            System.out.println();

            String[] daftarPesanan = new String[jumlahPesanan];
            int[] jumlahItem = new int[jumlahPesanan];

            int totalBayar = 0;

            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan menu " + (i+1) + " = ");
                String menu = sc.nextLine().trim();
                daftarPesanan[i] = menu;

                System.out.print("Masukkan jumlah pesanan = ");
                jumlahItem[i] = sc.nextInt();
                sc.nextLine();
            }

            System.out.println();
            System.out.println("=== Daftar Pesanan Anda ===");

            for (int i = 0; i < jumlahPesanan; i++) {
                String menuDicari = daftarPesanan[i];
                int indexMenu = -1;

                for (int j = 0; j < daftarMenu.length; j++) {
                    if (menuDicari.equalsIgnoreCase(daftarMenu[j])) {
                        indexMenu = j;
                        break;
                    }
                }

                if (indexMenu != -1) {
                    int harga = daftarHarga[indexMenu];
                    int total = harga * jumlahItem[i];
                    totalBayar += total;

                    System.out.println(menuDicari + " x " + jumlahItem[i] + " = Rp " + total);
                } else {
                    System.out.println(menuDicari + " Menu tidak tersedia");
                }
            }

            System.out.println();
            System.out.print("Total yang harus dibayar = Rp " + totalBayar);
            System.out.println();
        }
    }
}
