import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        double all = 0.00;
        days = days - 1;

        if(typeRoom.equals("room for one person")){
                all = days * 18.00;
        } else if (typeRoom.equals("apartment")) {
            if(days < 10){
                all = days * 25.00 * 0.70;
            } else if (days >= 10 && days <= 15) {
                all = days * 25.00 * 0.65;
            } else if (days > 15) {
                all = days * 25.00 * 0.50;
            }
        } else if (typeRoom.equals( "president apartment")) {
            if(days < 10){
                all = days * 35.00 * 0.90;
            } else if (days >= 10 && days <= 15) {
                all = days * 35.00 * 0.85;
            } else if (days > 15) {
                all = days * 35.00 * 0.80;
            }
        }

        if(feedback.equals("positive")){
            all = all * 1.25;
        } else if (feedback.equals("negative")) {
            all = all * 0.90;
        }

        System.out.printf("%.2f", all);

    }
}