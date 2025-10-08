import java.util.Scanner;

public class Flowchart2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaPublikasi = 300000;
        int dekorasi = 500000;
        int konsumsiPanitiaJuri = 500000;
        int hadiah = 4000000;
        int biayaOperasional = 500000;
        int biayaKonsumsiPeserta;
        int honorariumJuri;
        int jumlahPeserta;
        int jumlahTeam;
        int biayaPendaftaran;
        int totalAnggaran;
        double sponsorship;
        double danaPolinema;
        double sisaBiaya;

        System.out.println("Masukkan jumlah team = ");
        jumlahTeam = sc.nextInt();

        jumlahPeserta = 3 * jumlahTeam;
        biayaKonsumsiPeserta = 3 * 25000 * jumlahTeam;
        honorariumJuri = 75000 * jumlahTeam;
        totalAnggaran = biayaPublikasi + dekorasi + konsumsiPanitiaJuri + hadiah + biayaOperasional + biayaKonsumsiPeserta + honorariumJuri;
        danaPolinema = 0.6 * totalAnggaran;
        sisaBiaya = totalAnggaran - danaPolinema;
        biayaPendaftaran = 50000 * jumlahTeam;
        sponsorship = sisaBiaya - biayaPendaftaran;

        System.out.println("Jumlah peserta = "+jumlahPeserta);
        System.out.println("Biaya konsumsi peserta = "+biayaKonsumsiPeserta);
        System.out.println("Honorarium juri = "+honorariumJuri);
        System.out.println("Sisa biaya = "+sisaBiaya);
        System.out.println("Total biaya pendaftaran = "+biayaPendaftaran);
        System.out.println("Dana Polinema = "+danaPolinema);
        System.out.println("Dana sponsorship = "+sponsorship);
        System.out.println("Total anggaran = "+totalAnggaran);


    }
}
