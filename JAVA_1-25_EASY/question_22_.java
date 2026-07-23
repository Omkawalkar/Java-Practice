import java.util.*;

public class question_22_ {
    public static void PerimeterOfRectangle(int length, int width) {

        int perimeter = 2 * (length + width);
        System.out.println(" perimeter of a rectangle " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculate perimeter of a rectangle.
        System.out.println("Enter The Length");
        int l = sc.nextInt();
        System.out.println("Enter The Width");
        int w = sc.nextInt();
        PerimeterOfRectangle(l, w);
    }
}
