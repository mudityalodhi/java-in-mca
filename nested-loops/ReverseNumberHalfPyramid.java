import java.util.Scanner;

public class ReverseNumberHalfPyramid {

    public static void main(String[] args) {
        int n;

        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();
    }
}
