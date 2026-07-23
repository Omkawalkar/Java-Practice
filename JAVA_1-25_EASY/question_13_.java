import java.util.*;

public class question_13_ {
    public static float AreaOfTiangle(float length, float width) {

        float tri = length * width;
        return tri;

    }

    public static void main(String srgs[]) {
        // Find area of a rectangle.
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        System.out.println(AreaOfTiangle(l, w));
    }
}
