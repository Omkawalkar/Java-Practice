import java.util.Scanner;

public class recursion21 {

    public static void power(int i, int n, int p, int power) {
        if (i == p) {
            System.out.println("power os the number " + n + "^" + p + " is the " + power);
            return;
        }

        power = power * n;
        power(i + 1, n, p, power);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println(" power of number ");
        int p = sc.nextInt();

        power(0, n, p, 1);

    }
}
