import java.util.Scanner;

public class _02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine();

        if (dayPart.equals("Morning")) {
            if (10 <= degrees && degrees <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "Sweatshirt", "Sneakers");
            } else if (18 < degrees && degrees <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "Shirt", "Moccasins");
            } else if (degrees >= 25) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "T-Shirt", "Sandals");
            }
        } else if (dayPart.equals("Afternoon")) {
            if (10 <= degrees && degrees <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "Shirt", "Moccasins");
            } else if (18 < degrees && degrees <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "T-Shirt", "Sandals");
            } else if (degrees >= 25) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "Swim Suit", "Barefoot");
            }
        } else if (dayPart.equals("Evening")) {
            if (10 < degrees) {
                System.out.printf("It's %d degrees, get your %s and %s.",
                        degrees, "Shirt", "Moccasins");
            }
        }
    }
}
