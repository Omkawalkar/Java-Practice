
public class recurssion15 {

    public static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        int fmq = factorial(n - 1);

        // Calculate factorial
        int fm2 = n * fmq;

        return fm2;
    }

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);

        System.out.println("Factorial of " + n + " = " + result);
    }
}
