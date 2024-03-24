import java.util.Scanner;

public class _08_OnTimefortheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examHour = Integer.parseInt(sc.nextLine());
        int examMinutes = Integer.parseInt(sc.nextLine());
        int arrivalHour = Integer.parseInt(sc.nextLine());
        int arrivalMinutes = Integer.parseInt(sc.nextLine());

        int differenceMinutes = 0;

        differenceMinutes = (examHour * 60 + examMinutes) - (arrivalHour * 60 + arrivalMinutes);

        if (differenceMinutes < 0) {
            differenceMinutes = Math.abs(differenceMinutes);
            System.out.println("Late");
            if (differenceMinutes < 60) {
                System.out.printf("%d minutes after the start", differenceMinutes);
            } else {
                System.out.printf("%d:%02d hours after the start", (differenceMinutes / 60), (differenceMinutes % 60));
            }
        } else if (differenceMinutes >= 0 && differenceMinutes <= 30) {
            System.out.println("On time");
            if (differenceMinutes > 0) {
                System.out.printf("%d minutes before the start", differenceMinutes);
            }
        } else {
            System.out.println("Early");
            if (differenceMinutes < 60) {
                System.out.printf("%d minutes before the start", differenceMinutes);
            } else {
                System.out.printf("%d:%02d hours before the start", (differenceMinutes / 60), (differenceMinutes % 60));
            }
        }
    }
}
