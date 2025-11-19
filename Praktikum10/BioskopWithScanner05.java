package Praktikum10;

import java.util.Scanner;

public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris;
        int kolom;
        String nama;
        String next;
        int menu;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== Menu Bioskop === ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.println("Masukkan nama penonton: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.println("Masukkan baris (1-4)");
                    baris = sc.nextInt();
                    System.out.println("Masukkan kolom (1-2)");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                      System.out.println("Nomor baris/kolom tidak tersedia");
                      System.out.println("Silahkan masukkan ulang\n");
                      continue;  
                    }

                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi tersebut sudah terisi oleh: " + penonton[baris-1][kolom-1]);
                        System.out.println("Silahkan pilih kursi lain\n");
                        continue;
                    }

                    penonton[baris-1][kolom-1] = nama;
                    System.out.println("Data penonton berhasil disimpan");
                    break;
                }
            }

            else if (menu == 2) {
                System.out.println("\n=== Daftar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }

                    System.out.println();
                }
            }

            else if (menu == 3) {
                System.out.println("Program selesai");
                break;
            }

            else {
                System.out.println("Menu tidak tersedia");
            }
        }
    }
}
