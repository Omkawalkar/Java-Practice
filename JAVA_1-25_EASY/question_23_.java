import java.util.*;

public class question_23_ {
    public static int Average(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;

        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Secound Number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        System.out.println("Average Of  Number Is " + Average(a, b, c));
    }
}
