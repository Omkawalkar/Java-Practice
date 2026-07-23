public class java_16_dec_2025 {

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;

        }
        return result;

    }

    public static void main(String[] args) {

        // ( VAR ARG'S ) VARIABLE AND ARGUMENT'S

        System.out.println("sum of 4,5, and 6" + sum(4, 5, 6));
        System.out.println("sum of 4,5,7 and 6" + sum(4, 5, 7, 6));
        System.out.println("sum of 4,5,7,8 and 6" + sum(4, 5, 7, 8, 6));
        System.out.println("sum of 4,5,7,8,9 and 6" + sum(4, 5, 7, 8, 9, 6));

    }
}
