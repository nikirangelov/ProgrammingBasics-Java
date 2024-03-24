import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeLeft = breakDuration - breakDuration * 0.25  - breakDuration * 0.125;

        if (timeLeft >= movieDuration){
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", movie, (int)Math.ceil(timeLeft - movieDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %s more minutes.", movie, (int)Math.ceil(movieDuration - timeLeft));
        }
    }
}
