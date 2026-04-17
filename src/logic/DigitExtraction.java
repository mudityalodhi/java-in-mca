package logic;

import java.util.HashSet;

public class DigitExtraction {

    // 1. Sum of Digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }

    // 2. Reverse a Number
    public static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n /= 10;
        }

        return rev;
    }

    // 3. Count Digits
    public static int countDigits(int n) {

        if (n == 0) {
            return 1;
        }

        n = Math.abs(n);
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // 4. Check Palindrome Number
    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    // 5. Magic Number (123=>1+2+3=10=1)
    public static boolean isMagicNumber(int n) {
        while (n > 9) {

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    // 7. Happy Number
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(125));
        System.out.println(isHappy(127));
    }
}
