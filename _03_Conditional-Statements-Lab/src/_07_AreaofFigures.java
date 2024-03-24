import java.util.Scanner;

public class _07_AreaofFigures {
    static void printResult(double area){
        System.out.printf("%.3f", area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = 0.0;
        String type = scanner.nextLine();
        if (type.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
            printResult(area);
        } else if (type.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
            printResult(area);
        } else if (type.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.pow(r, 2) * Math.PI;
            printResult(area);
        } else if (type.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (a * h) / 2.0;
            printResult(area);
        }
    }
}
