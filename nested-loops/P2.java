import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Hollow Square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // first row, last row, first col, last col
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
