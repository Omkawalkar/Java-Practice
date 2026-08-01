public class recursion8th {

public static void printEvenNumber(int n,int m){
if(n==m){
    System.out.println(n);
    return;

}

System.out.println(n);
printEvenNumber(n+2,m);
    
}




    public static void main(String[] args) {
        
        int n = 0 ;
        int m = 10;
        printEvenNumber(n, m);
    }
}
