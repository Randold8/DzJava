import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        byte month = scanner.nextByte();
        MonthChecker(month);
        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        scanner.close();
        DayChecker(day,month);
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        }

    }
    public static void DayChecker(int day, byte month) {
        if (day < 1 || day > 31) {
            IncorrectInput();
        }
        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            IncorrectInput();
        }
        if (day == 30 && month == 2) {
            IncorrectInput();
        }
    }
    public static void MonthChecker(byte month) {
        if (month < 1 || month > 12) {
            IncorrectInput();
        }
    }
    public static void IncorrectInput() {
        System.out.println("Incorrect input!");
        System.exit(1);
    }
}
