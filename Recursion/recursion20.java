public class recursion20 {
    
    public static void sumnumber(int i,int n ,int sum){
if( i == n){
    sum += i;
    System.out.println(i);
    System.out.println(" sum of all number is "+ sum);
    return ;
}
System.out.println(i);
 
sum +=i ;
sumnumber(i + 1, n, sum);

    }

    public static void main(String[] args) {
        
sumnumber(1, 1000, 0);
      
        
    }
}
