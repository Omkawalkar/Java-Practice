import java.util.*;

public class question_26_ {
    public static void prime_number(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " Is Priem Number");
        } else {
            System.out.println(x + " It's Not Priem Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        prime_number(number);
    }
}
