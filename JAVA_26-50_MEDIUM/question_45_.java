public class question_45_ {
    public static void main(String[] args) {

        // print the pattern
        /* 
         *
         **
         ***
         ****
         ***** */

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}