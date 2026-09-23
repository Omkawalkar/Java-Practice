
import java.util.Scanner;
public class recursion25 {

public static int reverse(int n , int rev){
    if( n == 0){
        return rev;
    }

    int digit = n %10;
    rev = rev * 10 + digit;
    return reverse(n /10, rev);
}

public static void palendrome(int reverse,int n){

    if(n == reverse){
        System.out.println("given number "+ n + "is palendrome");
    }
    else{
        System.out.println("given number "+ n +" is not palendrome");
    }

    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Check Number Is Palendrome Or Not");
System.out.println("Enter number");
int n = sc.nextInt();


int reverse = reverse(n, 0);
System.out.println("reverse number is "+reverse);


palendrome(reverse, n);





    }
}