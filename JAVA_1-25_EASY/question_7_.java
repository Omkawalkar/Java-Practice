public class question_7_ {
    public static void main(String[] args) {
        // Swap two numbers without using a third variable.

        int a = 10;
        int b = 20;
        System.out.println("a is " + a + " b is " + b);

        a = a + b; // it become 30
        b = a - b;// it become 20
        a = a - b;// it become 10
        System.out.println("a is " + a + " b is " + b);

    }
}
