// Source - https://codereview.stackexchange.com/q
// Posted by Strange Alchemist, modified by community. See post 'Timeline' for change history
// Retrieved 2026-01-25, License - CC BY-SA 4.0

public class Main {
    public static void main(String[] args) {
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");
        // }
        // if (i > 1) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");
        // }
        // if (i > 1) {
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }
        // for (int i = n; i >= 1; i--) {
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");
        // }
        // if (i > 1)
        // System.out.print("*");
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");
        // }
        // if (i > 1)
        // System.out.print("*");
        // System.out.println(" ");
        // }

        // for (int i = 1; i <= n; i++) {
        // // first star
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");

        // }
        // if (i > 1)
        // System.out.print("*");
        // for (int j = 0; j < 2 * (n - i); j++) {
        // System.out.print(" ");

        // }
        // System.out.print("*");
        // for (int j = 1; j <= i - 2; j++) {
        // System.out.print(" ");

        // }
        // if (i > 1)
        // System.out.print("*");
        // System.out.println();
        // }
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print first star
            System.out.print("*");
            // printing one sided hollow pyramid Spaces
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");

            }
            // printing one sided hollow pyramid Stars
            if (i > 1) {
                System.out.print("*");
            }

            // printing spaces between stars

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // first star printing secound star pyramid of right side

            System.out.print("*");

            // Secound star printing secound star pyramid of right side

            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");

            }

            if (i > 1) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
        // secound for loop i loop

        for (int i = n; i >= 1; i--) {

            // print first star
            System.out.print("*");
            // printing one sided hollow pyramid Spaces
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");

            }
            // printing one sided hollow pyramid Stars
            if (i > 1) {
                System.out.print("*");
            }

            // printing spaces between stars

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // first star printing secound star pyramid of right side

            System.out.print("*");

            // Secound star printing secound star pyramid of right side

            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");

            }

            if (i > 1) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }

}
