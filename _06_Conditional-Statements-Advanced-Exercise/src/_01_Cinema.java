import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double all = rows * columns;
        if (movieType.equals("Premiere")) {
            all *= 12.0;
        } else if (movieType.equals("Normal")) {
            all *= 7.50;
        } else if (movieType.equals("Discount")) {
            all *= 5.00;
        }
        System.out.printf("%.2f leva", all);
    }
}
