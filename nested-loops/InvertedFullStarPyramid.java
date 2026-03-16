import java.util.Scanner;

public class InvertedFullStarPyramid {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            //spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}


//     *******
//      *****
//       ***
//        *

