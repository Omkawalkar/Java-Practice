public class java_11_dec_25 {

    static int logic(int x, int y) {
        int z = 0 ;
        if (x > y) {

            z = (x + y) * 5;
        }

        return z;

    }

    public static void main(String[] args) {
        // 2D-ARRAY

        // int[][] flats = new int[2][3];
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;

        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;

        // for (int i = 0; i < flats.length; i++) {
        // for (int j = 0; j < flats[i].length; j++) {
        // System.out.print(flats[i][j]);
        // System.out.print(" ");
        // }
        // System.out.println(" ");
        // }

        // 4-D array

        // int[][][][] matrix = new int[2][3][4][5];

        // matrix[0][1] = 101;
        // matrix[0][2] = 102;
        // matrix[0][3] = 103;
        // matrix[0][4] = 104;

        // matrix[1][1] = 201;
        // matrix[1][2] = 202;
        // matrix[1][3] = 203;
        // matrix[1][4] = 204;

        // matrix[2][1] = 301;
        // matrix[2][2] = 302;
        // matrix[2][3] = 303;
        // matrix[2][4] = 304;

        // matrix[3][1] = 401;
        // matrix[3][2] = 402;
        // matrix[3][3] = 403;
        // matrix[3][4] = 404;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j]);
        // System.out.print("");
        // for (int k = 0; k < matrix[j].length; k++) {
        // for (int l = 0; l < matrix[k].length; l++) {
        // System.out.println(matrix[k][l]);
        // System.out.print("");
        // }
        // System.out.println(" ");
        // }
        // System.out.println(" ");
        // }
        // System.out.println(" ");
        // }

        // int[][] matrix = new int[2][3];
        // matrix[0][0] = 101;
        // matrix[0][1] = 102;
        // matrix[0][2] = 103;

        // matrix[1][0] = 201;
        // matrix[1][1] = 202;
        // matrix[1][2] = 203;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j]);
        // System.out.print(" ");
        // }
        // System.out.println(" ");
        // }

        int a = 5;
        int b = 4;
        int c;
        c = logic(a, b);
        System.out.println(c);

    }
}
