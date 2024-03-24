import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        if (flowerType.equals("Roses")) {
            sum = numberOfFlowers * 5;
            if (numberOfFlowers > 80) {
                sum = sum * 0.90;
            }
        } else if (flowerType.equals("Dahlias")) {
            sum = numberOfFlowers * 3.80;
            if (numberOfFlowers > 90) {
                sum = sum * 0.85;
            }
        } else if (flowerType.equals("Tulips")) {
            sum = numberOfFlowers * 2.80;
            if (numberOfFlowers > 80) {
                sum = sum * 0.85;
            }
        } else if (flowerType.equals("Narcissus")) {
            sum = numberOfFlowers * 3;
            if (numberOfFlowers < 120) {
                sum = sum * 1.15;
            }
        } else if (flowerType.equals("Gladiolus")) {
            sum = numberOfFlowers * 2.50;
            if (numberOfFlowers < 80) {
                sum = sum * 1.20;
            }
        }

        if (sum <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    numberOfFlowers, flowerType, budget - sum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    sum - budget);
        }
    }
}
