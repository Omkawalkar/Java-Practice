public class bubble_Sort {

    public static void main(String[] args) {

        int array[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }
System.out.println(array[i]);
        }
        
    }
}
