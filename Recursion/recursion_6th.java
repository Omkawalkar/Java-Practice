public class recursion_6th {


    public static void PrintNumber(int n ){

    if(n==10){

        System.out.println(n);
        return ;
    }
System.out.println(n);
        PrintNumber(n+1);
        

    }
    
    public static void main(String[] args) {
        //Print numbers from 1 to N.
int n = 1;

PrintNumber(n);


    }
}
