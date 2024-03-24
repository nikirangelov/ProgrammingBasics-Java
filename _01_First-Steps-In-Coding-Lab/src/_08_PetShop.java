import java.util.Scanner;

public class _08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogPackets = Integer.parseInt(scanner.nextLine());
        int catPackets = Integer.parseInt(scanner.nextLine());
        double all = dogPackets * 2.50 + catPackets * 4.00;
        System.out.printf("%.2f lv.", all);
    }
}