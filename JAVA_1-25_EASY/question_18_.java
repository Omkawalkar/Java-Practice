import java.util.*;

public class question_18_ {
    public static void numberIsGreaterOrNot(int first, int secound, int third) {
        int largest;

        if (first >= secound && secound >= third) {
            largest = first;
        } else if (secound >= third && secound >= first) {
            largest = secound;

        } else {
            largest = third;
        }

        System.out.println("the largest number is " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Number 3");
        int c = sc.nextInt();
        numberIsGreaterOrNot(a, b, c);
    }
}