public class java_19_dec_2025 {

    static void even(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum = sum += i;

            System.out.println(i);
            System.out.println(sum);

        }

    }

    public static void main(String[] args) {
        int a = 20;
        even(a);

    }
}
