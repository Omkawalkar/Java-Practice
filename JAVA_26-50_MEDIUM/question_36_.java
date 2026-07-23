import java.util.Scanner;

public class question_36_ {

    public static boolean isArmstrong(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int digits = 0;
        int sum = 0;

        // Count digits
        int temp = number;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
        }

        // Calculate Armstrong sum
        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}