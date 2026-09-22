public class recursion_19 {
    

    public static void printMultipleHello(int n,int y){

        // base condition
        if(y == n ){
            System.out.println(" hello");
            return;
        }

        System.out.println(" hello");

        printMultipleHello(n, y+1);




    }


    public static void main(String[] args) {
        
int n = 5;

printMultipleHello(n, 1);
    }
}
