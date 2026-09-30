
import java.util.Scanner;
public class Question2 {
    public static void compair(String A, String B){
        if(A.compareTo(B)<0){
            System.out.println(" no");
        }
        else if(A.compareTo(B)==1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }

    public static void uppercase(String A , String B){

  A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
  B = Character.toUpperCase(B.charAt(0)) + B.substring(1);

System.out.println(A +" "+ B);

    }
 public static void main(String[] args) {
    

Scanner sc = new Scanner(System.in);
System.out.println("Enter first string ");
String A = sc.next();
String B = sc.next();

System.out.println("the first string was "+ A +" and secounnd string was "+B);

System.out.println(A.length()+B.length());
compair(A, B);
uppercase(A, B);


 }
    









}
