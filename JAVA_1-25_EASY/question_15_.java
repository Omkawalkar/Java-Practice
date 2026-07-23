import java.util.*;

public class question_15_ {

    public static void EvenOrOdd(int n) {
        // check number is even or odd
        if (n % 2 == 0) {
            System.out.println(" number is even ");
        } else {
            System.out.println("Number is Odd");
        }

    }

    public static void main(String[] args) {
        // Find area of a triangle.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        EvenOrOdd(number);
    }
}