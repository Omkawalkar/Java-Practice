public class java_20_dec_practice {
    static void pattern(int a) {

        for (int i = 0; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print("*");
        }
        System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int n = 4;
        pattern(n);

    }
}
