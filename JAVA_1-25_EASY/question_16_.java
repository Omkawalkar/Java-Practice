import java.util.*;

public class question_16_ {
    public static void PositiveZeroNegative(int a) {
        if (a > 0) {
            System.out.println("Given Number Is Positive");
        } else if (a == 0) {
            System.out.println(" Number Is Zero");
        } else if (a < 0) {
            System.out.println("Given Number Is negative");
        }

    }
// check number Positive Zero Negative
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        PositiveZeroNegative(number);

    }
}
