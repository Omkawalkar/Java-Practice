import java.util.*;

public class Array_1_ {
    public static void main(String[] args) {
        // getting input from user
        Scanner sc = new Scanner(System.in);
        // initializing variable
        System.out.println("Enter Number For Definr Array Size ");
        int size = sc.nextInt();
        // define an array
        int number[] = new int[size];
        // getting input from user to define values of user's
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        // this for loop is for printing output
        for (int i = 0; i < size; i++) {
            System.out.println("Number Is" + i);
            System.out.println(number[i]);

        }

    }

}
