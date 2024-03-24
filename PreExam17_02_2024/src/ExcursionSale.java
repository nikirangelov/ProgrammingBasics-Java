import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seaTrips = Integer.parseInt(scanner.nextLine());
        int mountainTrips = Integer.parseInt(scanner.nextLine());
        int revenue = 0;
        String tripType;
        
        do{
            if(seaTrips == 0 && mountainTrips == 0){
                System.out.println("Good job! Everything is sold.");
                break;
            }
            tripType = scanner.nextLine();
            if(tripType.equals("sea") && seaTrips > 0){
                revenue = revenue + 680;
                seaTrips = seaTrips - 1;
            } else if (tripType.equals("mountain") && mountainTrips > 0) {
                revenue = revenue + 499;
                mountainTrips = mountainTrips - 1;
            }
        }while(!tripType.equals("Stop"));


        System.out.printf("Profit: %d leva.", revenue);
    }
}