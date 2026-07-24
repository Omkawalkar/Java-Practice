public class recursion_3rd {

public static void printnumber(int n ,int m){

    if(n == m){
System.out.println(n);
        return;
    }
    System.out.println(n);
    printnumber(n+1,m);

}



    public static void main(String[] args) {
        
        int n = 1;
        int m = 5;
        printnumber(n,m);

    }
}
