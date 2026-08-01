public class recursion9th {

    public static void printoddnumber(int n , int m){
        if(n > m){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printoddnumber(n+2, m);
    }
    public static void main(String[] args) {
        
        int n = 1;
        int m = 10 ;

        printoddnumber(n, m);
    }
}
