import java.util.Scanner;

public class _02_BonusScore_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if(points <= 100){
            bonusPoints = 5;
        } else if (1000 < points) {
            bonusPoints = points * 0.10;
        } else {
            bonusPoints = points * 0.20;
        }

        if (points % 2 == 0){
            bonusPoints = bonusPoints + 1;
        }

        if (points % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
