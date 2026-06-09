
import java.util.Scanner;

public class question_25_ {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input number of days from user
        System.out.print("Enter days: ");
        int totalDays = in.nextInt();

        // Calculate years using integer division
        int years = totalDays / 365;

        // Calculate remaining days using the modulo operator
        int remainingDays = totalDays % 365;

        // Print the result
        System.out.println(totalDays + " days is equal to:");
        System.out.println("Years: " + years);
        System.out.println("Remaining Days: " + remainingDays);

        in.close(); // Close the scanner
    }
}
