// import java.util.Scanner;

// public class java_21_dec_practice {

//     static float convert(float n) {

//         float fahrenhite = (n * 9 / 5) + 32;
//         return fahrenhite;
//     }

//     public static void main(String[] args) {

//         Scanner user = new Scanner(System.in);
//         System.out.println("Enter temperature in Celsius: ");
//         float a = user.nextInt();

//         System.out.println("celsius to fahrenhite is " + convert(a));

//     }

// }

// import java.util.Scanner;

// public class java_21_dec_practice {
//     static void iterate(int a) {

//         for (int i = 0; i < a; i++) {
//             System.out.println("3");

//         }

//     }

//     public static void main(String[] args) {
//         Scanner user = new Scanner(System.in);
//         int n = user.nextInt();
//         iterate(n);

//     }
// }

public class java_21_dec_practice {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {

        int factorial = 6;
        System.out.println("factorial is " + factorial(factorial));
    }
}
