import java.util.*;

public class Array_2_ {
    public static void main(String args[]) {

        // Traversal searching
        Scanner sc = new Scanner(System.in);
        // Getting input from user and store in array
        System.out.println("Enter Number");
        int size = sc.nextInt();
        int number[] = new int[size];

        // getting number from user and store in array
        System.out.println("Enter the values of an array'a that can store in array");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }
        System.out.println("this is an array number's");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");

        }

        System.out.print("\nEnter the number what you want to search\n ");
        int num = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (num == number[i]) {
                System.out.println(num + " is on index no " + i);
            }

        }

    }
}
