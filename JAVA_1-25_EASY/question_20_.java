import java.util.*;

public class question_20_ {

    public static void check(int num) {
        if (num % 3 == 0) {
            System.out.println(" number is divisible by 3");

        } else if (num % 7 == 0) {
            System.out.println("number is divisible by 7");
        }

        else {
            System.out.println("number is not divisible by 3 or 7");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        check(number);

    }
}
