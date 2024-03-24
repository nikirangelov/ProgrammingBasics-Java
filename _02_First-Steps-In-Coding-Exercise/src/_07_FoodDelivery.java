import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegiMenus = Integer.parseInt(scanner.nextLine());

        double all = 2.50 + 1.20 * (checkenMenus * 10.35 + fishMenus * 12.40 + vegiMenus * 8.15);

        System.out.println(all);
    }
}
