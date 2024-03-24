import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int museumTickets = Integer.parseInt(scanner.nextLine());

        double all = 1.25 * people * (nights * 20 + transportCards * 1.60 + museumTickets * 6);

        System.out.printf("%.2f", all);

    }
}
