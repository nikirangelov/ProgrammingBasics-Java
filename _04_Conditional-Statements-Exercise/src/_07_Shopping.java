import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double all = videoCards * 250.0 +
                (processors * (0.35 * videoCards * 250.0))+
                (ramMemory * (0.10 * videoCards * 250.0));

        if (videoCards > processors) {
            all = all * 0.85;
        }

        if (all <= budget){
            System.out.printf("You have %.2f leva left!", (budget - all));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", (all - budget));
        }
    }
}
