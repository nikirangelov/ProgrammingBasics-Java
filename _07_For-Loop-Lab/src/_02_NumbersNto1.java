import java.util.Scanner;

public class _02_NumbersNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (; n >=1; n--){
            System.out.println(n);
        }
    }
}
