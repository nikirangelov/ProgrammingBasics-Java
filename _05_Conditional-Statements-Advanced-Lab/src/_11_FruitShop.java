import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", quantity * 2.50);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * 1.20);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * 0.85);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * 1.45);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * 2.70);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * 5.50);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * 3.85);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", quantity * 2.70);
                        break;
                    case "apple":
                        System.out.printf("%.2f", quantity * 1.25);
                        break;
                    case "orange":
                        System.out.printf("%.2f", quantity * 0.90);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", quantity * 1.60);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", quantity * 3.00);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", quantity * 5.60);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", quantity * 4.20);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}