public class recursion18 {

    public static void factorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        
        int f1 =  factorial(n -1 );
return n * f1 ;

    }
    public static void main(String[] args) {
        
        int n = 5;


       // n * (n-1)
    }
}
