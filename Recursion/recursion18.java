public class recursion18 {
    

    public static int factorial(int n ){
        if( n == 0 || n == 1){
            return 1 ;
        }

int fact = factorial(n - 1 );

int cal = n * fact;

return cal ;

    }




    public static void main(String[] args) {
        

        int n = 5 ;

        int fact = factorial(n);
        System.out.println(fact);

    }
}
