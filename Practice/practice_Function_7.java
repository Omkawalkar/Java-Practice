import java.util.*;

public class practice_Function_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1");
        int n = sc.nextInt();

        System.out.println("Enter 2");
        int m = sc.nextInt();

        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * m;

        }
        System.out.println(" the " + n + " power of " + m + " is " + result);



        
    }
}
