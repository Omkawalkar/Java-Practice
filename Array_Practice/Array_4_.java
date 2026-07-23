import java.util.*;

public class Array_4_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // user input for array size
        System.out.println("ennter size of an array");
        int size = sc.nextInt();

        int number[] = new int[size];

        // getting input values for array
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        // showing output

        // for (int i = 0; i < size; i++) {
        // System.out.print(number[i]);

        // }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }

        }
        System.out.println("the largge value is " + max);
        System.out.println("the small value is " + min);

    }
}
