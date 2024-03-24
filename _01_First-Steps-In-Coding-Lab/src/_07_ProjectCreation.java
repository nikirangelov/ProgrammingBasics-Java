import java.util.Scanner;

public class _07_ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, (numberOfProjects * 3), numberOfProjects);
    }
}
