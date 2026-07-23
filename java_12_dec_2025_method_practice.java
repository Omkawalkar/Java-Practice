import java.util.Scanner;

public class java_12_dec_2025_method_practice {
    static int logic(int p, int q) { // ------------method 1
        int r;
        if (p > q) {
            r = p + q;

        } else {
            r = (p + q) * 5;
        }
        return r;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner user = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = user.nextInt();
        System.out.println("enter the value of b");
        int b = user.nextInt();
        int c;

        // java_12_dec_2025_method_practice obj = new
        // java_12_dec_2025_method_practice(); ----- method 2
        // c = obj.logic(a, b);

        c = logic(a, b);
        System.out.println("nice " + c);

    }
}
