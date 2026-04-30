import java.util.Scanner;

public class Main {

    public static int findDays(int year) {
        if ((year % 400 == 0) ||
                (year % 4 == 0) &&
                        (year % 100 != 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {

        int sumPoints = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней:");
            int daysInput = scanner.nextInt();

            if (daysInput == findDays(year)) {
                sumPoints++;
            } else {
                System.out.println("Неправильно! В этом году " + findDays(year) + " дней!");
                break;
            }
        }
        System.out.println("Набрано очков: " + sumPoints);
    }
}