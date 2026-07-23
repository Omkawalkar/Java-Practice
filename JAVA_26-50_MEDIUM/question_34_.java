import java.util.*;

public class question_34_ {

    public static int countDigit(int n) {

        // Base case
        if (n / 10 == 0)
            return 1;

        // Recursive case
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.print(countDigit(number));
    }
}