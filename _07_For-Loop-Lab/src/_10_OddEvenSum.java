import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += Integer.parseInt(sc.nextLine());
            } else {
                sumOdd += Integer.parseInt(sc.nextLine());
            }
        }

        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
