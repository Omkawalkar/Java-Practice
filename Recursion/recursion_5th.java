public class recursion_5th {

    public static int factorial(int n ){
        if(n ==0 || n==1){
            return 1;
        }

        int factorial_num = factorial(n-1);
        int facto = n * factorial_num;

        
        return facto;

    }



    public static void main(String[] args) {
        

        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);

    }
}
