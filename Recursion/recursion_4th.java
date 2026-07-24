public class recursion_4th {

    public static void PrintSumOfNumber(int a, int b, int sum) {

        if (a == b) {
            System.out.println(a);
            sum += a;
            System.out.println("sum is " + sum);
            return;
        }
        sum += a;
        System.out.println(a);
        PrintSumOfNumber(a + 1, b, sum);
    }

    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        int sum = 0;

        PrintSumOfNumber(a, b, sum);
    }
}
