import java.util.*;

public class Array_6_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();

        }

        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");

        }

        boolean isAscending = true;

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }

        }

        if (isAscending) {
            System.out.println(" the given array is sorted");
        } else {
            System.out.println(" given array is not sorted");
        }

    }

}
