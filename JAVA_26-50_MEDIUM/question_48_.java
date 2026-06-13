public class question_48_ {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            /// print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
// star pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move next line
             System.out.println();
        }
       
        
    }
}
