public class recursion17 {

    public static void number(int y ,int x,int n){
        
        if(y == x ){
            System.out.println(n);
            return;
        }

System.out.println(n);
number(y+1,x, n);

    }
    public static void main(String[] args) {
        int y = 0;
        int x = 5;
        int n = 10;
        number(y,x, n);
    }
}
