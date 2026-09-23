public class recursion24 {
    
    public static int count(int n ){

if( n == 0 ){
    return 0;
}

return 1+ count(n / 10);


    }


    public static void main(String[] args) {
        

int result = count(123456);
System.out.println(result);


    }
}
