import java.util.*;

public class question_39_ {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 2");
        int num3 = sc.nextInt();

        int result = gcd(gcd(num1, num2), num3);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}