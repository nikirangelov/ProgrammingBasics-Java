import java.util.Scanner;

public class _04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        int hours = pagesInBook / (numberOfDays * pagesPerHour);
        System.out.println(hours);

    }
}
