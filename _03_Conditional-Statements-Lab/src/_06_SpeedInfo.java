import java.util.Scanner;

public class _06_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed <= 10.0){
            System.out.println("slow");
        } else if (10 < speed && speed <= 50){
            System.out.println("average");
        } else if (50 < speed && speed <= 150){
            System.out.println("fast");
        } else if (150 < speed && speed <= 1000){
            System.out.println("ultra fast" );
        } else if (1000 < speed){
            System.out.println("extremely fast");
        }
    }
}
