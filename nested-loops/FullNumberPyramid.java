import java.util.Scanner;

public class FullNumberPyramid {
    public static void main(String[] args) {
        System.out.print("enter n : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
/*
        1
       121
      12321
     1234321
 */