import java.util.*;

public class practice_Function_5 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for continue");
        int input = sc.nextInt();
        if (input == 1) {

            while (input == 1) {
                System.out.println("Enter your number");
                int n = sc.nextInt();
                if (n > 0) {
                    positive++;
                } else if (n < 0) {
                    negative++;
                } else {
                    zero++;
                }
                System.out.println("enter 1 for continue or zero for stop ");
                input = sc.nextInt();
            }
            System.out.println("positive -: " + positive);
            System.out.println("negative -: " + negative);
            System.out.println("zero -: " + zero);

        } else if (input == 0) {
            System.out.println("you enter the zero it will be stop");
        } else {
            System.out.println("invalid ");

        }

    }
}
