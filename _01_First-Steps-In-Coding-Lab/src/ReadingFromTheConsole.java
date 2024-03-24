import java.util.Scanner;

public class ReadingFromTheConsole {
    public static void main(String[] args) {


        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print(name);

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number);
         */
        /*
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println(area);

         */

        /*
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double num = Double.parseDouble(input);
        System.out.println(num);

         */
        /*
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);

         */
        /*
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

         */
        /*
        String firstName = "Maria";
        String lastName = "Ivanova";
        int age = 19;
        String str = firstName + " " + lastName + " @ " + age;
        System.out.println(str);

         */
        /*
        double a = 1.5;
        double b = 2.5;
        String sum = "The sum is: " + a + b;
        System.out.println(sum);

         */
        /*
        int a = 5;
        int b = 7;
        int result = a + b;
        System.out.println(result);

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = a - b;
        System.out.println(result);

         */
        /*
        int a = 5;
        int b = 6;
        int result = a * b;
        System.out.println(result);

         */
        /*
        int a = 25;
        int i = a / 4;
        double d = a / 4.0;
        System.out.println(i);
        System.out.println(d);
        int error = a / 0;
        */
        /*
        double a = 15;
        System.out.println(a / 2.0);
        System.out.println(a / 0.0);
        System.out.println(0.0 / 0.0);

         */
        /*
        int a = 7;
        int b = 2;
        int product = a % b;
        System.out.println(product);

         */
        /*
        int odd = 3 % 2;
        int even = 4 % 2;
        int error = 3 % 0;
        System.out.println(odd);
        System.out.println(even);
        System.out.println(error);

         */
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-age old person from %s.%n", firstName, lastName, age, town);

    }
}
