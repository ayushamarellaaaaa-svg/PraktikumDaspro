import java.util.Scanner;

public class Flowchart2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik = 1500;
        int biayaBulanan;
        int dayaListrik;
        double PPN = 0.1;
        double potongan;
        double totalBiaya;

        System.out.println("Masukkan daya listrik (per KWh)");
        dayaListrik = sc.nextInt();

        tarifListrik = 1500 * dayaListrik;
        biayaBulanan = 50000 + tarifListrik;
        potongan = 0.1 * biayaBulanan;
        totalBiaya = tarifListrik + biayaBulanan;

        System.out.println("Total biaya tarif listrik = "+totalBiaya);

        
    }
}
