public class question_29_ {
    public static void OddNumber(int number) {
        for (int i = number; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // Print odd numbers from 1 to 100.

        int n = 1;

        OddNumber(n);
    }
}
