public class recursion_2nd {

    public static void sumfunction(int i, int n, int sum) {

        if (i == n) {
            System.out.println(i);   // Print 10
            sum += i;
            System.out.println("Sum = " + sum);
            return;
        }

        System.out.println(i);

        sum += i;
        

        sumfunction(i + 1, n, sum);
        
    }

    public static void main(String[] args) {

        sumfunction(1, 10, 0);

    }
}