
import java.util.Scanner;
public class recursion26 {
    
public static int Maxdight(int n ){
   if(n == 0){
    return 0 ;
   }

// store last digit
   int digit = n % 10;
// remove last digit
   int max = Maxdight(n /10 );

   //compait digit

   return Math.max(digit, max);

}   

    public static void main(String[] args) {
        

int Max_digit = Maxdight(12345965);
System.out.println("max digit is "+Max_digit);



    }
}
