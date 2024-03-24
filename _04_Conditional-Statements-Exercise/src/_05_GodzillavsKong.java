import java.util.Scanner;

public class _05_GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extraActors = Integer.parseInt(scanner.nextLine());
        double pricePerClothing = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double allClothing = extraActors * pricePerClothing;
        if(extraActors > 150){
            allClothing = allClothing * 0.90;
        }
        double all = decor + allClothing;
        if (all > budget){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", (all - budget));
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", (budget - all));
        }
    }
}
