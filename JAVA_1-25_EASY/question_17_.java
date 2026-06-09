import java.util.*;

public class question_17_ {
    public static void numberIsGreaterOrNot(int first, int secound) {
        if (first > secound) {
            System.out.println("First Number Is Greater than Secound");
        } else if (first < secound) {
            System.out.println("Secound Number Is Greater Than First");
        } else if (first == secound) {
            System.out.println(" Both Number Is Equal");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        numberIsGreaterOrNot(a, b);
    }
}
