package Praktikum10;

import java.util.Scanner;

public class Survey05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survey = new int[jumlahResponden][jumlahPertanyaan];

        System.out.println("=== Input Data Survei ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }

            System.out.println();
        }

        System.out.println("=== Rata-Rata Nilai Per Responden ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;

            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survey[i][j];
            }

            double rataRata = total / jumlahPertanyaan;
            System.out.println("Responden " + (i + 1) + ": " + rataRata);
        }

        System.out.println();

        System.out.println("=== Rata-Rata Nilai Per Pertanyaan ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                total += survey[i][j];
            }

            double rataRata = total / jumlahResponden;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }

        System.out.println();

        System.out.println("=== Rata-Rata Keseluruhan ===");
        double totalKeseluruhan = 0;

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        double totalData = jumlahResponden * jumlahPertanyaan;
        double rataKeseluruhan = totalKeseluruhan / totalData;

        System.out.println("Rata-Rata Keseluruhan: " + rataKeseluruhan);
    }
}
