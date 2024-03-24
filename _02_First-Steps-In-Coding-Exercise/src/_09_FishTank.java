import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percentageFull = Double.parseDouble(scanner.nextLine());

        double liters = ((a * b * h) / 1000.0) * ((100 - percentageFull)/100.0);

        System.out.println(liters);
    }
}
