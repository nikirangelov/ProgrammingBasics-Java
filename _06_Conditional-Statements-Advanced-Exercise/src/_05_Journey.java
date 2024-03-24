import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")){
                System.out.printf("Camp - %.2f", budget * 0.30);
            } else if (season.equals("winter")) {
                System.out.printf("Hotel - %.2f", budget * 0.70);
            }
        } else if (budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")){
                System.out.printf("Camp - %.2f", budget * 0.40);
            } else if (season.equals("winter")) {
                System.out.printf("Hotel - %.2f", budget * 0.80);
            }
        } else if (budget > 1000) {
            System.out.printf("Somewhere in Europe%nHotel - %.2f", budget * 0.90);
        }
        
    }
}