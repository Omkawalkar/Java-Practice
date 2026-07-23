import java.util.*;

public class question_37_ {

    public static void main(String[] args) {

        System.out.println("Enter Number ");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            for (int i = 0; i <= 10; i++) {
                System.out.println(number * i);
            }
        }

    }

}
