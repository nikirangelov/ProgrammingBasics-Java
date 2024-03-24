import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedAmount = Double.parseDouble(scanner.nextLine());
        int depositPeriodMonths = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        depositedAmount = depositedAmount + depositPeriodMonths * ((depositedAmount * (interest / 100.0))/12.0);
        System.out.println(depositedAmount);
    }
}
