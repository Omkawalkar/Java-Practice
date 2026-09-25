public class question_65_ {
    


    public static void main(String[] args) {
        
        //Reverse a string.

        String str = " hello";
        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);

        }

        System.out.println("orignal:"+str);
        System.out.println("Reverse: "+ reverse);
    }
}
