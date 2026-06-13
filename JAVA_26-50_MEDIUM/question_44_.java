import java.util.Scanner;

public class question_44_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number 1");
        int num1 = sc.nextInt();
        System.out.println(" Enter number 2");
        int num2 = sc.nextInt();

        System.out.println(" 1)add\n 2)sub\n 3)div\n 4)multi ");
        int userValue = sc.nextInt();

        switch (userValue) {
            case 1:
                System.out.println("Addation of the number is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of number is "+ (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of umber is " + (num1 * num2));
            case 4:
                System.out.println("aDivision of number is " + (num1 / num2));

            default:
                System.out.println("Enter valid number");
                break;
        }

    }
}
