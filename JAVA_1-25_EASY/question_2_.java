import java.util.*;

public class question_2_ {

    public static void main(String[] args) {
        // Print your name, age, and city in different lines using user input

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your city");
        String city = sc.next();

        System.out.println("This Is your Entered Detail's\n");
        System.out.println("\n your name is :" + name + "\n your age is :" + age + "\n your city is :" + city);

    }

}
