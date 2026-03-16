/* Write a program that takes initial velocity (u), time (t), and acceleration (a) as integer inputs from the user. Calculate the displacement (s) using the equation of motion:
s = ut + ½at²
Display the result as a decimal value. */

import java.io.*;

class Q3 {
    public static void main(String[] args) throws IOException {

        double s;
        int u, t, a;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter u: ");
        u = Integer.parseInt(br.readLine());

        System.out.print("Enter t: ");
        t = Integer.parseInt(br.readLine());

        System.out.print("Enter a: ");
        a = Integer.parseInt(br.readLine());

        s = (u * t) + (0.5 * a * t * t);

        System.out.println("s = " + s);
    }
}