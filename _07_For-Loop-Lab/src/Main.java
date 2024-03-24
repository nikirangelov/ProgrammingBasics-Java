//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(!(5 == 5) && (4 + 1 == 5));
        System.out.println(!(3 == 3) || (3 == 5));
        System.out.println(!(3 > 5) || (1 == 1));

        int number = 101;
        if (number >= 1) {
            System.out.println("Larger than 1");
        }
        if (number <= 101) {
            System.out.println("Less than 101");
            System.out.println("Equal to 101");
        }

        String role = "Administrator";
        String password = "SoftUni";
        if(role.equals("SoftUni")) {
            if(password.equals("SoftUni")) {
                System.out.println("Welcome!");
            }
        }


    }
}