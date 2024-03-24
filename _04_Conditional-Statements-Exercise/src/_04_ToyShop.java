import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double all = puzzels * 2.60 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        int numberOfToys = puzzels + dolls + bears + minions + trucks;

        if (numberOfToys >= 50){
            all = all * 0.75;
        }

        all = all * 0.90;

        if (all >= tripPrice){
            System.out.printf("Yes! %.2f lv left.", all - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - all);
        }

    }
}
