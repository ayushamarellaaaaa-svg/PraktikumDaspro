package Praktikum13;

import java.util.ArrayList;
import java.util.Scanner;

public class Beasiswa {
    static class Pendaftar {
        String nama;
        String nim;
        double ipk;
        String jenis;
        int penghasilan;

        Pendaftar(String nama, String nim, double ipk, String jenis, int penghasilan) {
            this.nama = nama;
            this.nim = nim;
            this.ipk = ipk;
            this.jenis = jenis;
            this.penghasilan = penghasilan;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pendaftar> list = new ArrayList<>();

    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("\n===Sistem Pendaftaran Beasiswa===");
            System.out.println("1. Tambah Data Pendaftar Beasiswa");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-rata IPK per jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    tambahPendaftar();
                    break;
                case 2:
                    tampilkanSemua();
                    break;
                case 3:
                    cariBerdasarkanJenis();
                    break;
                case 4:
                    hitungRataIPK();
                    break;
                case 5:
                    System.out.println("keluar dari program");
                    break;
                default:
                    System.out.println("menu tidak tersedia");
            }
        } while (menu != 5);
    }

    static void tambahPendaftar() {
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("IPK terakhir: ");
        double ipk = sc.nextDouble();
        System.out.print("Jenis Beasiswa (Reguler / Unggulan / Riset): ");
        String jenis = sc.next();

        if (!(jenis.equalsIgnoreCase("Reguler") ||
                jenis.equalsIgnoreCase("Unggulan") ||
                jenis.equalsIgnoreCase("Riset"))) {
            System.out.println("Jenis beasiswa tidak valid. Pendaftaran dibatalkan!");
            return;
        }

        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        int penghasilan = sc.nextInt();

        if (penghasilan > 2000000) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal");
            return;
        }

        list.add(new Pendaftar(nama, nim, ipk, jenis, penghasilan));
        System.out.println("Pendaftaran berhasil disimpan. total pendaftar: " + list.size());
    }

    static void tampilkanSemua() {
        if (list.isEmpty()) {
            System.out.println("Belum ada pendaftar");
            return;
        }

        System.out.println("\nDaftar Pendaftar Beasiswa");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s %-10s\n", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
        System.out.println("------------------------------------------------------------------------");

        for (Pendaftar p : list) {
            System.out.printf("%-15s %-15s %-10.2f %-10s %-10d\n", p.nama, p.nim, p.ipk, p.jenis, p.penghasilan);
        }
    }

    static void cariBerdasarkanJenis() {
        System.out.print("Masukkan jenis beasiswa yang dicari (Reguler / Unggulan / Riset): ");
        String j = sc.nextLine();

        boolean found = false;
        for (Pendaftar p : list) {
            if (p.jenis.equalsIgnoreCase(j)) {
                if (!found) {
                    System.out.println("\nHasil pencarian: ");
                    found = true;
                }

                System.out.println("\nDaftar Pendaftar Beasiswa");
                System.out.println("-------------------------------------");
                System.out.printf("%-15s %-15s %-10s\n", "Nama", "NIM", "IPK");
                System.out.println("-------------------------------------");

                for (Pendaftar pendaftar : list) {
                    System.out.printf("%-15s %-15s %-10.2f\n", pendaftar.nama, pendaftar.nim, pendaftar.ipk);
                }
            }
        }

        if (!found) {
            System.out.println("Tidak ada pendaftar dengan jenis beasiswa tersebut");
        }
    }

    static void hitungRataIPK() {
        hitung("Reguler");
        hitung("Unggulan");
        hitung("Riset");
    }

    static void hitung(String jenis) {
        double total = 0;
        int count = 0;

        for (Pendaftar p : list) {
            if (p.jenis.equalsIgnoreCase(jenis)) {
                total += p.ipk;
                count++;
            }
        }

        if (count == 0) {
            System.out.println(jenis + " : tidak ada pendaftar");
        } else {
            System.out.printf("%s : rata-rata IPK = %.2f\n", jenis, (total / count));
        }
    }
}
