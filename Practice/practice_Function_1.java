import java.util.*;

public class practice_Function_1 {
    // make a function to add two number
    /*
     * public static int addTwoNumber(int a, int b) {
     * int sum = a + b;
     * System.out.println("sum of two number is " + sum);
     * return sum;
     * }
     */

    // public static int multiTwoNumber(int a, int b) {

    // int multi = a * b;

    // return multi;

    // }
    public static void factorial(int n) {

        if (n < 0) {
            System.out.println("Invalid number ");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int multi = multiTwoNumber(a, b);
        // System.out.println(" multiplication of " + a + " and " + b + " is " + multi);
        // int sum = addTwoNumber(a, b);
        // System.out.println(addTwoNumber(a, b));

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        factorial(n);
    }
}
