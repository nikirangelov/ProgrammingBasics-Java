import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int c = number % 10;
        number = number / 10;
        int b = number % 10;
        number = number / 10;
        int a = number % 10;


        for(int i = 1; i <= c; i++){
            for(int j = 1; j <= b; j++){
                for(int k = 1; k <= a; k++){
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, (i*j*k));
                }
            }
        }

    }
}