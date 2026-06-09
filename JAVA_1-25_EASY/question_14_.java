import java.util.*;

public class question_14_ {
    public static float AreaOfTriangle(float height, float base) {

        float a = (height * base) / 2;
        return a;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println(AreaOfTriangle(h, b));
    }
}
