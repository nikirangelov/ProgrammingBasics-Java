import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());
        double currentDayKm = km;

        for(int i = 0; i < days; i++){
            int percentage = Integer.parseInt(scanner.nextLine());
            currentDayKm = currentDayKm * ((100+percentage)/100.00);
            km = km + currentDayKm;
        }

        if (km >= 1000.00){
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(km - 1000.00));
        }else{
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000.00 - km));
        }

    }
}