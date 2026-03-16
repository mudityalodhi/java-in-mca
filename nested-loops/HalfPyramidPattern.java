import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        System.out.print("Enter n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Half Pyramid Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
