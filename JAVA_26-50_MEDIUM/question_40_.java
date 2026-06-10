import java.util.Scanner;

public class question_40_ {
    public static int HCF(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }

        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        int result = HCF(num1, num2);

        System.out.println(" HCF Of " + num1 + " And " + num2 + " Is " + result);

    }

}
