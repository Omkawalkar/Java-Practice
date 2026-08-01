public class recursion11 {

    public static void sumofnumber(int n,int m,int a){

        if(n== m){
            System.out.println(n);
            a+=n;
            System.out.println("sum of the 1 to n "+a);


            return;
        }
        System.out.println(n);
        a+=n;
        sumofnumber(n+1,m,a);
    }
    public static void main(String[] args) {
        
        int n = 1 ;
        int m = 10;
        int a = 0;
        sumofnumber(n, m,a);
    }
}
