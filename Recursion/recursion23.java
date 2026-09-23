
public class recursion23 {

    public static int reverseNumber(int n , int rev ){

        // Base condition
        if(n == 0){
            return rev;
        }

        int digit = n % 10 ;

        rev = rev * 10 + digit ;

        return reverseNumber(n/10, rev);

    }


public static void main(String[] args) {
    

    int result = reverseNumber(12345, 0);

    System.out.println(result);



}

   }

