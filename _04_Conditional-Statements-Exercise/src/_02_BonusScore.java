import java.util.Scanner;

public class _02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if(points <= 100){
            bonusPoints = 5;
        } else if(100 < points && points <= 1000) {
            bonusPoints = points * 0.20;
        } else if (1000 < points) {
            bonusPoints = points * 0.10;
        }

        if (points % 2 == 0){
            bonusPoints = bonusPoints + 1;
        }

        if ((points % 5 == 0) && ((points / 5) % 2 == 1)) {
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
