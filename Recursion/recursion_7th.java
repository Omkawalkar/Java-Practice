public class recursion_7th {
    public static void PrintNumber(int n ){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String[] args) {
        


        int n = 10 ;
        PrintNumber(n);
    }
}
