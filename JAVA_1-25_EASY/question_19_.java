import java.util.*;

public class question_19_ {
    public static void check(int num) {
        if (num % 5 == 0) {
            System.out.println(" number is divisible by 5");
            
        } else {
            System.out.println("number is not divisible by 5");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        check(number);

    }
}
