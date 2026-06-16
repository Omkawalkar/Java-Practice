public class question_63_ {

 public static void main(String[] args) {

        int array1[] = {10, 20, 30};
        int array2[] = {40, 50, 60};

        int merged[] = new int[array1.length + array2.length];

        // Copy first array
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }

        // Copy second array
        for (int i = 0; i < array2.length; i++) {
            merged[array1.length + i] = array2[i];
        }

        // Print merged array
        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
    }

}
