import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nights = Integer.parseInt(sc.nextLine()) - 1;
        String roomType = sc.nextLine();
        String feedback = sc.nextLine();
        double sum = 0.0;

        if(nights < 10) {
            switch (roomType) {
                case "room for one person":
                    sum = nights * 18;
                    break;
                case "apartment":
                    sum = nights * 25 * 0.70;
                    break;
                case "president apartment":
                    sum = nights * 35 * 0.90;
                    break;
            }
        } else if (nights <= 15) {
            switch (roomType) {
                case "room for one person":
                    sum = nights * 18;
                    break;
                case "apartment":
                    sum = nights * 25 * 0.65;
                    break;
                case "president apartment":
                    sum = nights * 35 * 0.85;
                    break;
            }
        } else {
            switch (roomType) {
                case "room for one person":
                    sum = nights * 18;
                    break;
                case "apartment":
                    sum = nights * 25 * 0.50;
                    break;
                case "president apartment":
                    sum = nights * 35 * 0.80;
                    break;
            }
        }

        if (feedback.equals("positive")) {
            sum = sum * 1.25;
        } else if (feedback.equals("negative")) {
            sum = sum * 0.90;
        }

        System.out.printf("%.2f", sum);
    }
}
