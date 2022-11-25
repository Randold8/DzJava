import java.util.Scanner;
import java.time.LocalDateTime;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your birth year: ");
        int year = scanner.nextInt();
        System.out.println("Print your birth month (1-12): ");
        int month = scanner.nextInt();
        MonthChecker(month);
        System.out.println("Print your birth day (1-31): ");
        int day = scanner.nextInt();
        DayChecker(day,month, year);
        scanner.close();
        LocalDateTime current_date = LocalDateTime.now();
        int current_year = current_date.getYear();
        int current_month = current_date.getMonthValue();
        int current_day = current_date.getDayOfMonth();
        int age_year = current_year - year;
        if (age_year < 0) {
            System.out.println("You are not born yet!");
            System.exit(0);
        }
        int age_month = current_month - month;
        int age_day = current_day - day;
        if (age_month < 0) {
            age_year--;
            age_month = 12 + age_month;
        }
        if (age_day < 0) {
            age_month--;
            age_day = 30 + age_day;
        }
        System.out.println("Your current age is: " + age_year + " years, " + age_month + " months and " + age_day + " days.");

    }
    public static void DayChecker(int day, int month, int year) {
        if (day < 1 || day > 31) {
            IncorrectInput();
        }
        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
            IncorrectInput();
        }
        if(day > 29 && month == 2) {
            IncorrectInput();
        }
        if (day == 29 && month == 2) {
            //check for leap year
            if (year % 4 != 0) {
                IncorrectInput();
            }
            if (year % 100 == 0 && year % 400 != 0) {
                IncorrectInput();
            }
        }
    }
    public static void MonthChecker(int month) {
        if (month < 1 || month > 12) {
            IncorrectInput();
        }
    }
    public static void IncorrectInput() {
        System.out.println("Incorrect input!");
        System.exit(1);
    }
}
