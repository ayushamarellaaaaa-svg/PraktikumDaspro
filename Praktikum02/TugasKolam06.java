import java.util.Scanner;

public class TugasKolam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lebar = 50, panjang = 100, jariJari = 1, panjangSisi = 200,
                luasTanah, luasKolamPersegi;

        double luasKolamLingkaran, luasKolam, luasTanahBerumput;

        luasTanah = panjang * lebar;
        luasKolamLingkaran = 3.14 * jariJari * jariJari;
        luasKolamPersegi = panjangSisi * panjangSisi;
        luasKolam = luasKolamLingkaran + luasKolamPersegi;
        luasTanahBerumput = luasTanah - luasKolam;

        System.out.println("Luas tanah: " + luasTanah);
        System.out.println("Luas kolam lingkaran: " + luasKolamLingkaran);
        System.out.println("Luas kolam persegi: " + luasKolamPersegi);
        System.out.println("Luas kolam keseluruhan: " + luasKolam);
        System.out.println("Luas tanah yang ditanami rumput: " + luasTanahBerumput);

    }
}
