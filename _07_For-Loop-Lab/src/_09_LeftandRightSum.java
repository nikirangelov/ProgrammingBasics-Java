import java.util.Scanner;

public class _09_LeftandRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2 * Integer.parseInt(sc.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i  < n; i++) {
            if (i < n / 2) {
                sumLeft += Integer.parseInt(sc.nextLine());
            } else {
                sumRight += Integer.parseInt(sc.nextLine());
            }
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}