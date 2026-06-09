// import java.util.*;

// public class question_31_ {
//     public static void Factorial(int number) {
//         int i = 1;
//         int factorial = 1;

//         while (i <= number) {
//             // System.out.println(i);
//             factorial *= i;
//             i++;

//         }

//         System.out.println("Factorial of the " + number + " is " + factorial);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Factorial(n);
//     }
// }

import java.math.BigInteger;
import java.util.Scanner;

public class question_31_ {

    public static BigInteger factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));
    }
}