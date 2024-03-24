import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveMsgs = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int suprises = Integer.parseInt(scanner.nextLine());

        double all = loveMsgs * 0.60 + roses * 7.20 + keychains * 3.60 + caricatures * 18.20 + suprises * 22;
        int numberOfArticles = loveMsgs + roses + keychains + caricatures + suprises;
        if(numberOfArticles >= 25)
            all = all * 0.65;

        all = all * 0.90;

        if(partyCost > all){
            System.out.printf("Not enough money! %.2f lv needed.", (partyCost - all));
        }else{
            System.out.printf("Yes! %.2f lv left.", (all - partyCost));
        }
    }
}