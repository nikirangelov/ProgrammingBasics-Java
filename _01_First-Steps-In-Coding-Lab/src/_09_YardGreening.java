import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km2 = Double.parseDouble(scanner.nextLine());
        double price = 7.61 * km2;
        double priceAfterDiscount = price * 0.82;
        double discount = price * 0.18;
        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", priceAfterDiscount, discount);

    }
}
