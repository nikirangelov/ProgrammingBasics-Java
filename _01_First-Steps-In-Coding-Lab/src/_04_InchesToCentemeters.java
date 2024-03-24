import java.util.Scanner;

public class _04_InchesToCentemeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centemetrs = inches * 2.54;
        System.out.println(centemetrs);
    }
}