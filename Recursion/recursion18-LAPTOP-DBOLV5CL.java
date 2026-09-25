public class recursion18 {

    // int function
    // public static int factorial(int n ){
    // if( n == 0 || n == 1){
    // return 1 ;
    // }

    // int fact = factorial(n - 1 );

    // int cal = n * fact;

    // return cal ;

    // }

    // void function

    public static void recursion(int n, int fact) {

        if (n == 0 | n == 1) {
            System.out.println(" factorial is " + fact);
            return;
        }

        fact = fact * n;
        recursion(n - 1, fact);

    }

    public static void main(String[] args) {

        int n = 5;
        recursion(n, 1);
        // int fact = factorial(n);
        // System.out.println(fact);

    }
}
