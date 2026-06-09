import java.util.*;

public class question_21_ {
    public static int SimpleIntrest(int a, int i, int y) {

        int intreast = (a * i * y) / 100;

        return intreast;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Amount");
        int amount = sc.nextInt();
        System.out.println("Enter Your Intrest Rate");
        int intrest = sc.nextInt();
        System.out.println("Enter Your Year");
        int year = sc.nextInt();

        System.out.println("your amount is " + amount);
        System.out.println("your intreast is " + SimpleIntrest(amount, intrest, year));

        int total = SimpleIntrest(amount, intrest, year) + amount;

        System.out.println("final " + total);

    }
}
