import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double all = (pens * 5.80 + markers * 7.20 + liters * 1.20) * ((100 - discount)/ 100.0);
        System.out.println(all);
    }
}
