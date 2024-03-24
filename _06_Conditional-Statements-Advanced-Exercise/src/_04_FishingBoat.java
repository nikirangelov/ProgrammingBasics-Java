import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double all = 0;

        switch (season) {
            case "Spring":
                all = 3000;
                break;
            case "Summer":
            case "Autumn":
                all = 4200;
                break;
            case "Winter":
                all = 2600;
                break;
        }

        if (fisherman <= 6) {
            all *= 0.90;
        } else if (7 <= fisherman && fisherman <= 11) {
            all *= 0.85;
        } else if (12 <= fisherman) {
            all *= 0.75;
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            all *= 0.95;
        }

        if (budget >= all) {
            System.out.printf("Yes! You have %.2f leva left.", (double)budget - all);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", all - (double)budget);
        }
    }
}
