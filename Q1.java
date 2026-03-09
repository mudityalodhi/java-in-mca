import java.io.*;

class Q1 {
    public static void main(String[] args) throws IOException {
        int age;
        char gender;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter age : ");
        age = Integer.parseInt(br.readLine());

        if (age >= 18) {

            System.out.print("enter gender : ");
            gender = br.readLine().charAt(0);

            if (gender == 'f' || gender == 'F') {
                System.out.println("You're eligible for voting!");
            } else if (gender == 'm' || gender == 'M') {
                if (age >= 21) {
                    System.out.println("You're eligible for voting!");
                } else {
                    System.out.println("You're not eligible for voting.");
                }
            } else {
                System.out.println("Invalid gender entered.");
            }
            
        } else {
            System.out.println("Sorry, you have to wait.");
        }
    }
}
