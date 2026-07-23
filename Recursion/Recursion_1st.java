public class Recursion_1st{

    public static void recursion(int n){
        if(n == 10){
 System.out.println(n);
            return ;
        
        }
           
        System.out.println(n);

        recursion(n+1);


    }
    public static void main(String[] args) {
        int n = 1 ;

        recursion(n);



    }
}