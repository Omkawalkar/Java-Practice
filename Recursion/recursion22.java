import java.util.Scanner;

public class recursion22 {

    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        int digit = countDigit(n);
        System.out.println(digit);

    }
}
