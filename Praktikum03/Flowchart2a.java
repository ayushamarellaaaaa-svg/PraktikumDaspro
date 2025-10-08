import java.util.Scanner;

public class Flowchart2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaSewa = 300000;
        int biayaSupir = 200000;
        int biayaBahanBakar = 1000;
        int lamaSewa;
        int jarakTempuh;
        int totalBiaya;

        System.out.println("Masukkan lama sewa mobil (per hari) = ");
        lamaSewa = sc.nextInt();

        System.out.println("Masukkan jarak tempuh (per KM) = ");
        jarakTempuh = sc.nextInt();

        biayaSewa = 300000 * lamaSewa;
        biayaSupir = 200000 * lamaSewa;
        biayaBahanBakar = 1000 * jarakTempuh;
        totalBiaya = biayaSewa + biayaSupir + biayaBahanBakar;

        System.out.println("Total biaya sewa mobil = "+totalBiaya);
    }
}