import java.util.*;

public class Array_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string length");
        int size = sc.nextInt();

        String names[] = new String[size];
        // take input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();

        }
        // output

        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");

        }

    }
}
