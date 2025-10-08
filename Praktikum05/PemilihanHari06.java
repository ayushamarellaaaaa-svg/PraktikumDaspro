import java.util.Scanner;

public class PemilihanHari06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("invalid Number");

        }

        // String dayName, dayType;

        // System.out.println("Input day name: ");
        // dayName = sc.nextLine();

        // switch (dayName.toLowerCase()) {
        //     case "monday":
        //     case "tuesday":
        //     case "wednesday":
        //     case "thursday":
        //     case "friday":
        //         dayType = "weekday";
        //         break;
        //     case "saturday":
        //     case "sunday":
        //         dayType = "weekend";
        //         break;
        //     default:
        //         dayType = "invalid day name";
        // }

        // System.out.println(dayName + " is a " + dayType);
    }
}
