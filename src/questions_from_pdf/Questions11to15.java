package questions_from_pdf;

public class Questions11to15 {

    // Q11. Generate a Fibonacci series.
    static void fibonacciSeries(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // Q12. To input and check whether the number is a Magic number or not. (Sum of digits of
    // that number should be equal to 1. Example 127 = 1+2+7 = 10 = 1+0 = 1.)
    static boolean isMagicNumber(int n) {

        while (n > 9) { // keep reducing until a single digit
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            n = sum; // update n with new sum
        }

        return (n == 1);
    }

    // Q13. To input and check whether the number is Armstrong number or not. (Sum of the cube of each digit equals the original number. Example 153 = 1^3+5^3+3^3 = 1+125+27 = 153 )
    static boolean isArmstrongNumber(int n) {
        int org = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return (sum == n);
    }

    // Q14. To input and check whether the number is Automorphic or not. (Number which
    // occurs at the end of the square of its own. Example 52 = 25, 252 = 625)
    static boolean isAutomorphicNumber(int n) {
        return true;
    }

    // Q15. To find the area of a square, rectangle, and circle.
    static double areaOfSquare(double s) {
        return s * s;
    }

    static double areaOfRectangle(double l, double b) {
        return l * b;
    }

    static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }


    public static void main(String[] args) {
//        System.out.println("Circle : " + areaOfCircle(2.5) + " unit sq.");
//        System.out.println("Rectangle : " + areaOfRectangle(5, 7) + " unit sq.");
//        System.out.println("Rectangle : " + areaOfSquare(5) + " unit sq.");

//        System.out.println(isArmstrongNumber(6));
//        System.out.println(isArmstrongNumber(153));
//        System.out.println(isArmstrongNumber(343));

        fibonacciSeries(12);
    }
}
