import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonm2 = Integer.parseInt(scanner.nextLine());
        int paintL = Integer.parseInt(scanner.nextLine());
        int thinnerL = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double all = 0.40 +(nylonm2 + 2) * 1.50 + paintL * 14.50 * 1.10 + thinnerL * 5.00;
        all = all + all * 0.30 * hours;

        System.out.println(all);
    }
}
