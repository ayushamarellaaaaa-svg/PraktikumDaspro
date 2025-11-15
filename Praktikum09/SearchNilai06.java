package Praktikum09;

import java.util.Scanner;

public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput = ");
        int nilai = sc.nextInt();

        int[] nilaiCari = new int[nilai];

        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke - " + (i + 1) + " = ");
            nilaiCari[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari = ");
        int key = sc.nextInt();

        int hasil = 1;

        for (int i = 0; i < nilaiCari.length; i++) {
            if (key == nilaiCari[i]) {
                hasil = i;
                break;
            }
        }

        System.out.println();

        if (hasil != 1) {
            System.out.println("Nilai " + key + " ditemukan, merupakan nilai mahasiswa ke - " + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
