import java.util.Scanner;

public class TugasGaji06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok = 3000000, jumlahAnak, tunjanganAnak;
        double persentasePotongan = 0.05, potonganGajiPokok, gajiBersih;

        System.out.println("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();

        tunjanganAnak = 150000*jumlahAnak;
        potonganGajiPokok = gajiPokok*persentasePotongan;
        gajiBersih = gajiPokok + tunjanganAnak - potonganGajiPokok;

        System.out.println("Total gaji bersih: "+gajiBersih);
    }
}
