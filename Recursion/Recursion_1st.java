import java.util.Scanner;
public class Recursion_1st {
    public static void Recursion(int n,int e){

        if(n==e){
System.out.println(n);
            return;
        }
        System.out.println(n);
        Recursion(n+1, e);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
        int e = sc.nextInt();
        int n =1 ;

Recursion(n, e);


    }
}
