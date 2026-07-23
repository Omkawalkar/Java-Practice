import java.util.Scanner;

public class java_17_dec_2025 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;

        } else {
            return n * factorial(n - 1);

        }

    }

    public static void main(String[] args) {
        // ============================= FACTORIAL =============================

        @SuppressWarnings("resource")
        Scanner user = new Scanner(System.in);
        System.out.println("enter your number");
        int n = user.nextInt();
        System.out.println("value of factorial is " + factorial(n));

    }
}
