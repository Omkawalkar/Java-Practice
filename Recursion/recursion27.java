public class recursion27 {
    
    public static int minnumber(int n){
if(n == 0 ){
    return 9;
}

int digit =  n % 10;
int min = minnumber(n/10);

return Math.min(digit, min);


    }
    public static void main(String[] args) {
        

int minNumber = minnumber(345);
System.out.println(minNumber);


    }
}
