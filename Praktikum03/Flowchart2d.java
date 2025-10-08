import java.util.Scanner;

public class Flowchart2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetak;
        int totalBerat;
        int biayaJilid = 20000;
        int halaman;
        int lembar;
        int beratKertas;
        int biayaOngkir;
        int totalBiaya;

        System.out.println("Masukkan jumlah halaman = ");
        halaman = sc.nextInt();

        biayaCetak = halaman * 200;
        lembar = halaman / 2;
        beratKertas = lembar * 3;
        totalBerat = beratKertas + 250 + 300;
        biayaOngkir = totalBerat / 1000 * 15000;
        totalBiaya = biayaCetak + biayaJilid + biayaOngkir;

        System.out.println("Total biaya cetak = "+totalBiaya);
    }
    
}
