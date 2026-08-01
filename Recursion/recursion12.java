public class recursion12 {

    public static void Productodtwonumber(int n,int m,int a){

        if(n==m){
            System.out.println(n);
            a*= n;
            System.out.println("product of 1 to n number is "+ a);
            return;
        }
        System.out.println(n);
        a*= n;
        Productodtwonumber(n+1,m,a);
    }
    public static void main(String[] args) {
        
        int n = 1;
        int m = 10;
        int a = 1;
        Productodtwonumber(n,m,a);
    }
}
