public class recursion16 {

    public static void evenNumber(int n) {

        if (n == 15) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        evenNumber(n+3);

    }

    public static void main(String[] args) {

        int n = 0;
 evenNumber(n);
    }
}
