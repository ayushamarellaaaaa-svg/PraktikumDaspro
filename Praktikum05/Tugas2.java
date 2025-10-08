import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        int max, min;

        System.out.println("Masukkan bilangan A: ");
        A = sc.nextInt();
        System.out.println("Masukkan bilangan B: ");
        B = sc.nextInt();
        System.out.println("Masukkan bilangan C: ");
        C = sc.nextInt();

        if (A > B) {
            if (A > C) {
                max = A;
            } else {
                max = C;
            }
        } else {
            if (B > C) {
                max = B;
            } else {
                max = C;
            }
        }

        if (A < B) {
            if (A < C){
                min = A;
            } else {
                min = C;
            }
        } else {
            if (B < C) {
                min = B;
            } else {
                min = C;
            }
        }

        System.out.println("Nilai maksimum adalah: " + max);
        System.out.println("Nilai minimum adalah: " + min);
    }
}
