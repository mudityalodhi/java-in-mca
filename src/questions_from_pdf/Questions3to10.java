package questions_from_pdf;

import java.util.Scanner;

public class Questions3to10 {
    // Q3. To input a number and print whether the number is odd or even.
    static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }

    // Q4. To input a number and print whether the number is prime or not.
    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("NOT Prime");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("NOT Prime");
                return;  // divisor found -> stop
            }
        }

        // if loop completed
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        isPrime(n);
        // oddOrEven(n);
    }
}
