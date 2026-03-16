/* 
Write a program that takes electricity units consumed by a user as input and calculates the total bill based on the following slab rates:
•	0–100 units → ₹5.60 per unit
•	101–200 units → ₹6.23 per unit
•	201–300 units → ₹7.20 per unit
•	Above 300 units → ₹9.80 per unit

A fixed surcharge of ₹0.42 and a meter charge of ₹105.00 should also be added to the final bill. If units entered are negative, display an error message.
*/

import java.io.*;

class Q2 {
    public static void main(String[] args) throws IOException {
        double units, totalBill = 0;
        double surcharge = 0.42;
        double meterCharge = 105.00;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter total units: ");
        units = Double.parseDouble(br.readLine());

        if (units < 0) {
            System.out.println("Units should be greater than 0");
            return;
        }

        if (units <= 100) {
            totalBill = units * 5.60;

        } else if (units <= 200) {
            totalBill = (100 * 5.60) + ((units - 100) * 6.23);

        } else if (units <= 300) {
            totalBill = (100 * 5.60) + (100 * 6.23) + ((units - 200) * 7.20);

        } else {
            totalBill = (100 * 5.60) + (100 * 6.23) + (100 * 7.20) + ((units - 300) * 9.80);
        }

        totalBill += surcharge + meterCharge;
        System.out.println("Total Bill: Rs." + totalBill);
    }
}