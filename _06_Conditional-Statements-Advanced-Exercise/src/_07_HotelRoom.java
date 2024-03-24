import java.util.Scanner;

public class _07_HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());

        double appartmentPrice = 0.0;
        double studioPrice = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = nights * 50 * (nights > 14 ? 0.70 : (nights > 7 ? 0.95 : 1.00));
            appartmentPrice = nights * 65;
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = nights * 75.20 * (nights > 14 ? 0.80 : 1.00);
            appartmentPrice = nights * 68.70;
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = nights * 76;
            appartmentPrice = nights * 77;
        }

        if (nights > 14) {
            appartmentPrice *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", appartmentPrice, studioPrice);
    }
}
