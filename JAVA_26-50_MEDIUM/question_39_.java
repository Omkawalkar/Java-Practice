import java.util.Scanner;

public class question_39_ {

    public static int Gcd(int a, int b) {
        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;

        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1  ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        int result = Gcd(num1, num2);

        System.out.println(result);

        int lcm = (num1 * num2) / result;

        System.out.println("The LCM of the " + num1 + " and " + num2 + " is " + lcm);

    }

}
