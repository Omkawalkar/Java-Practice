public class sorting_6th {
    // selection sort

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {

        int arr[] = { 55, 66, 33, 44, 11, 22, 77, 99, 88, };

        selectionsort(arr);
        printarray(arr);

    }
}
