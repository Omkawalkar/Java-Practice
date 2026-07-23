public class practice_4_ {

    public static void main(String[] args) {

        // =========================================== PRINT THE PATTERN
        // ===========================================================

        /*
         * => pattern no 1
         **********
         **********
         **********
         **********
         */

        /*
         * int n = 4; //----------------------------> RUN
         * int m = 10;
         *
         * for (int i = 1; i <= n; i++) {
         *
         * for (int j = 1; j <= m; j++) {
         * System.out.print("*");
         *
         * }
         *
         * System.out.println();
         *
         * }
         */
        // =====================================vPATTERN NO 2
        // ==================================================

        //
        // ******
        // * *
        // * *
        // ******
        /*
         * 
         * 
         * 
         * int n = 4;
         * int m = 5;
         * 
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = 1; j <= m; j++) {
         * if (i == 1 || j == 1 || i == n || j == m) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * }
         * 
         * 
         */

        // ==================================PATTERN NO 3
        // =================================

        /*
        *
        **
        ***
        ****
        */

        /*
         * int n = 4;
         * 
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // ==================================PATTERN NO 4
        // =================================

        /*
        ****
        ***
        **
        *
        
        */

        /*
         * int n = 5;
         * 
         * for (int i = 1; i <= n; i++) {
         * 
         * for (int j = i; j <=n - 1; j++) {
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * 
         * }
         */

        // ==================================PATTERN NO 5
        // =================================

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j < n - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // int n = 4;

        // for (int i = n; i >= 1; i--) {

        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");

        // }

        // for (int j = 0; j <= n - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = n; i >= 1; i--) {

        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");

        // }
        // for (int j = 0; j <= n - i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
