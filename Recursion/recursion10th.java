public class recursion10th {

    public static void printoddnumber(int n,int m){
if(m<n){
   
    return;
}
        System.out.println(m);
        printoddnumber(n, m-2);
    }
    public static void main(String[] args) {
        
        int n = 1;
        int m = 11 ;
        printoddnumber(n, m);
    }
}
