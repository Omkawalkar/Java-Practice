import java.util.Scanner;

public class practice_Function_2 {
    // Q1 ]===== Enter 3 numbers from the user & make a function to print their
    // average.

    // public static int average(int a, int b, int c) {

    // int sum = a + b + c;

    // int average = sum / 3;

    // return average;

    // }

    // Q 2]======= Write a function to print the sum of all odd numbers from 1 to n.

    // public static int sum_of_odd(int n) {
    // int sum = 0;
    // for (int i = 0; i <= n; i += 3) {
    // sum += i;

    // }
    // return sum;
    // }

    // Q3]============ Write a function which takes in 2 numbers and returns the
    // greater of
    // those two.

    // public static void greater_number(int a, int b) {

    // if (a > b) {
    // System.out.println("greater number is " + a);
    // } else if (b > a) {
    // System.out.println("greater number is " + b);

    // }
    // return;
    // }

    // Q4]========== Write a function that takes in the radius as input and returns
    // the circumference of a circle

    public static void circumference(float n) {

        double pi = 3.14;
        double circum = 2 * (pi * n);

        System.out.println("circumfarence of the radius is " + circum);

        return;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1 ]======= Enter 3 numbers from the user & make a function to print their
        // average.

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int average = average(a, b, c);
        // System.out.println("average of these number is " + average);

        // Q2 ]======= Write a function to print the sum of all odd numbers from 1 to n.
        // int n = sc.nextInt();

        // int addation_of_odd_number = sum_of_odd(n);

        // System.out.println("Addation of the odd number is " +
        // addation_of_odd_number);

        // Q3]============ Write a function which takes in 2 numbers and returns the
        // greater of
        // those two.

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // greater_number(a, b);

        // Q4]========== Write a function that takes in the radius as input and returns
        // the circumference of a circle
        System.out.println("enter the radius for finding circumference");
        float n = sc.nextFloat();

        circumference(n);

    }
}
