import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (!((100 <= number && number <= 200) || number == 0)) {
            System.out.println("invalid");
        }
    }
}
