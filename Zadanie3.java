import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter n: ");
        int n = input.nextInt();
        input.close();
        if (n < -14 || n > 14) {
            System.out.println("n has to be within (-15;15)");
            System.exit(1);
        }
        double result = 1;
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                result *= x;
            }
            result = 1 / result;
        } else {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        }
        double result2 = 1;
        int i = 0;
        if (n < 0) {
            while (i > n) {
                result2 *= x;
                i--;
            }
            result2 = 1 / result2;
        } else {
            while (i < n) {
                result2 *= x;
                i++;
            }
        }
        System.out.println("Result using for loop: " + result);
        System.out.println("Result using while loop: " + result2);
    }
}
