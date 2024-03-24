import java.util.Scanner;

public class _06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if (-100 <=number && number <= 100 && number != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
