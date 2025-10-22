import java.util.Scanner;

public class Flowchart2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik = 0;
        int biayaBulanan;
        int dayaListrik;
        double pajak = 0;
        double totalBiaya;

        System.out.println("Masukkan daya listrik (per kwh))");
        dayaListrik = sc.nextInt();


        tarifListrik = 1500 * dayaListrik;
        biayaBulanan = 50000 + tarifListrik;
        totalBiaya = tarifListrik + biayaBulanan + pajak;

        System.out.println("Total biaya tarif listrik = "+totalBiaya);

        
    }
}
