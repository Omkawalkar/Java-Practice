public class question_62_ {
    public static void main(String[] args) {

        int array1[] = { 10, 20, 30, 40, 50, 60 };
        for (int i = 0; i < array1.length; i++) {
            System.out.println("array 1 is " + array1[i]);
        }
        System.out.println();
        int array2[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];

            System.out.println("array 2 is " + array2[i]);

        }

    }
}
