import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        System.out.print("Enter R: ");
        double R = input.nextDouble();
        int pointsInCircle = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Enter X" + i + ": ");
            double X = input.nextDouble();
            System.out.print("Enter Y" + i + ": ");
            double Y = input.nextDouble();
            if (X * X + Y * Y <= R * R) {
                pointsInCircle++;
            }
        }
        input.close();
        System.out.println("Number of points within the circle: " + pointsInCircle);

    }
}
