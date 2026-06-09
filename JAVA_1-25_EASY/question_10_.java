import java.util.*;

public class question_10_ {
    public static void main(String[] args) {
        // Convert Celsius to Fahrenheit.
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();

        float fahrenheit = (celcius * 9 / 5f) + 32;

        System.out.println("fahrenheit " + fahrenheit);

    }
}
