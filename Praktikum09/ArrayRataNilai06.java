package Praktikum09;

import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        // double totalLulus = 0;
        // double totalTidakLulus = 0;
        // int countLulus = 0;
        // int countTidakLulus = 0;
        

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);

        // for (int i = 0; i < nilaiMhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        //     nilaiMhs[i] = sc.nextInt();

        //     if (nilaiMhs[i] > 70) {
        //         totalLulus += nilaiMhs[i];
        //         countLulus++;
        //     } else {
        //         totalTidakLulus += nilaiMhs[i];
        //         countTidakLulus++;
        //     }
        // } 

        // if (countLulus > 0) {
        //     System.out.println("Rata-rata nilai lulus = " + totalLulus / countLulus);
        // } 

        // if (countTidakLulus > 0) {
        //     System.out.println("Rata-rata nilai tidak lulus = " + totalTidakLulus / countTidakLulus);
        // }
    }
    
}
