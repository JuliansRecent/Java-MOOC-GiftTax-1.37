
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prompt the user for the value of the gift
        System.out.println("Value of the gift?");
        // Store the value in a variable
        int value = Integer.valueOf(scan.nextLine());
        // Initialize the taxBalance variable
        double taxBalance;
        // Conditionally render a response of how much tax they will have to pay
        if (value > 1000000) {
            taxBalance = 142100 + (value - 1000000) * 0.17;
            System.out.println("Tax: " + taxBalance);
        } else if (value > 200000) {
            taxBalance = 22100 + (value - 200000) * 0.15;
            System.out.println("Tax: " + taxBalance);
        } else if (value > 55000) {
            taxBalance = 4700 + (value - 55000) * 0.12;
            System.out.println("Tax: " + taxBalance);
        } else if (value > 25000) {
            taxBalance = 1700 + (value - 25000) * 0.10;
            System.out.println("Tax: " + taxBalance);
        } else if (value > 5000) {
            taxBalance = 100 + (value - 5000) * 0.08;
            System.out.println("Tax: " + taxBalance);
        } else {
            System.out.println("No tax!");
        }
    }
}
