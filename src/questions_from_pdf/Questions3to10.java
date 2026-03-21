package questions_from_pdf;

import java.util.Scanner;

public class Questions3to10 {
    // Q3. WAP to input a number and print whether the number is odd or even.
    static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }

    // Q4. WAP to input a number and print whether the number is prime or not.
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

    // Q5. WAP to generate the prime numbers from 1-50.
    static void primeNumbers1to50() {

        for (int num = 2; num <= 50; num++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }

    // Q6. WAP to compute the Simple Interest and Compound Interest.
    static void simpleInterest(double P, double R, double T) {
        double si = (P * R * T) / 100;
        System.out.printf("Simple Interest: %.2f\n", si);
    }

    static void compoundInterest(double P, double R, double T) {
        double amount = P * Math.pow((1 + R / 100), T);
        double ci = amount - P;

        System.out.printf("Compound Interest: %.2f\n", ci);
        System.out.printf("Total Amount: %.2f\n", amount);
    }

    // Q7. WAP to check whether the given number is a perfect number or not.
    static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return (n == sum);
    }

    // Q8. WAP to find the LCM and HCF
    static void findHCF(int a, int b) {

    }

    static void findLCM(int a, int b) {

    }

    // Q9. WAP to find the factorial of a given number.
    static void factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
    }

    // Q10. WAP to find the factors of a given number.


    public static void main(String[] args) {
//         System.out.print("Enter a number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//
//         isPrime(n);
//         oddOrEven(n);
//         primeNumbers1to50();
//        simpleInterest(100, 7.5, 3);
//        compoundInterest(100, 7.5, 3);
//        System.out.println(isPerfect(6));
//        System.out.println(isPerfect(45));
//        factorial(5);
//        factorial(6);
    }
}
