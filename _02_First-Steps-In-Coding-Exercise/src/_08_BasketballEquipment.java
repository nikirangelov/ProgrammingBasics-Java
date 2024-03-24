import java.util.Scanner;

public class _08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyFee = Integer.parseInt(scanner.nextLine());

        double expenses = yearlyFee +
                          yearlyFee * 0.60 +
                          yearlyFee * 0.60 * 0.80 +
                          yearlyFee * 0.60 * 0.80 * 0.25 +
                          yearlyFee * 0.60 * 0.80 * 0.25 * 0.20;

        System.out.println(expenses);
    }
}
