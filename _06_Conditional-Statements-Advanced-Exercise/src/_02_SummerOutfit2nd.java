import java.util.Scanner;

public class _02_SummerOutfit2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine();
        String outerwear = "";
        String shoes = "";
        if (dayPart.equals("Morning")) {
            if (10 <= degrees && degrees <= 18) {
                outerwear = "Sweatshirt";
                shoes = "Sneakers";
            } else if (18 < degrees && degrees <= 24) {
                outerwear = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outerwear = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (dayPart.equals("Afternoon")) {
            if (10 <= degrees && degrees <= 18) {
                outerwear = "Shirt";
                shoes = "Moccasins";
            } else if (18 < degrees && degrees <= 24) {
                outerwear = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outerwear = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (dayPart.equals("Evening")) {
            if (10 < degrees) {
                outerwear = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",
                degrees, outerwear, shoes);
    }
}
