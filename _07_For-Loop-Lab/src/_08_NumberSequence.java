import java.util.Scanner;

public class _08_NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //int smallest = Integer.MAX_VALUE;
        //int biggest = Integer.MIN_VALUE;
        // This initialization can be done instead of putting the biggest and the smallest number in the loop.
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(sc.nextLine());
            if (i == 0){
                min = input;
                max = input;
            }
            if (input > max) {
                max = input;
            } else if (input < min) {
                min = input;
            }
        }
        System.out.printf("Max number: %d%nMin number: %d", max, min);
    }
}
