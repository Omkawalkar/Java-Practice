import java.util.*;

public class question_11_ {
    // Convert Fahrenheit to Celsius.

    public static float celsius(float x) {

        float Celsius = (x - 32f) * 5 / 9f;

        return Celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        System.out.println(celsius(a));
    }
}
