import java.util.Scanner;

public class question_35_ {
    public static int countDigits(int n) {

        int count = 0;

        n = Math.abs(n); // handle negative numbers

        if (n == 0)
            return 1; // special case

        while (n > 0) {
            n = n / 10; // remove last digit
            count++; // increase count
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Digits = " + countDigits(number));

    }

}
