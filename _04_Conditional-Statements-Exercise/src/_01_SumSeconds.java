import java.util.Scanner;

public class _01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sumSeconds = a + b + c;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds - (minutes * 60); // sumSeconds % 60
        System.out.printf("%d:%02d", minutes, seconds);
    }
}
