
public class practice_set_5 {
    // static void fact(int n) {
    // int fact = 1;
    // if (n == 0 || n == 1) {
    // System.out.println(1);
    // } else {
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;

    // }
    // System.out.println(fact);
    // }

    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter number ");
        // int a = sc.nextInt();

        // fact(a);
        // int a = 8;
        // int sum = 0;
        // for (int i = 0; i <= 10; i++) {
        // int total = a * i;
        // System.out.println(total);
        // sum += total;

        // }
        // System.out.println(sum);

        // int[] marks = { 12, 33, 44, 55, 66 };
        // int sum = 0;

        // for (int i = 0; i < marks.length; i++) {
        // sum += marks[i];

        // }
        // System.out.println(sum);
        // System.out.println(marks.length);

        int[][] a = { { 2, 4 }, { 3, 4 } };
        int[][] b = { { 3, 4 }, { 6, 7 } };

        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];

            }

        }

        System.out.println("sum of matrix");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
