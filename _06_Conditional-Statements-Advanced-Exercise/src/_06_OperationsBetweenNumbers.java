import java.util.Scanner;

public class _06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);

        if (operator == '+') {
            System.out.printf("%d + %d = %d - %s", a, b, (a+b), ((a+b) % 2 == 0 ? "even" : "odd"));
        } else if (operator == '-') {
            System.out.printf("%d - %d = %d - %s", a, b, (a-b), ((a-b) % 2 == 0 ? "even" : "odd"));
        } else if (operator == '*') {
            System.out.printf("%d * %d = %d - %s", a, b, (a*b), ((a*b) % 2 == 0 ? "even" : "odd"));
        } else if (operator == '/') {
            System.out.printf("%s", b == 0 ?
                    String.format("Cannot divide %d by zero", a):
                    String.format("%d / %d = %.2f", a, b, (a*1.00/b)));
        } else if (operator == '%') {
            System.out.printf("%s", b == 0 ?
                    String.format("Cannot divide %d by zero", b):
                    String.format("%d %% %d = %d", a, b, (a%b)));
        }
    }
}
