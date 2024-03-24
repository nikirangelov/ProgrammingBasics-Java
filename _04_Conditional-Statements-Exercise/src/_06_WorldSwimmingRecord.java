import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double recordMeters = Double.parseDouble(scanner.nextLine());
        double secondsFor1m = Double.parseDouble(scanner.nextLine());

        double time = (recordMeters * secondsFor1m) +
                Math.floor(recordMeters / 15.0) * 12.5;

        if(time < recordSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - recordSeconds);
        }
    }
}
