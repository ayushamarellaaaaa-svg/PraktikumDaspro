package Praktikum08;

import java.util.Scanner;

public class JumlahKuadrat06 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Nilai n = ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            for (int k = 1; k <= i; k++) {
                kuadrat += i;
            }

            total += kuadrat;
            System.out.println("i = " + i + " -> Jumlah kuadrat = " + kuadrat);
        }

        System.out.println("Jumlah kuadrat 1 sampai " + n + " = " + total);
    }
}
