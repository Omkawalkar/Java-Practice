public class question_60_ {
    public static void main(String[] args) {

        int array[] = { 2, 20, 3, 30, 4, 40, 5, 50 };

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] < array[j]) {
                    int temp = array[i];

                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }
        for(int i = 0 ; i<array.length;i++){
            System.out.print(array[i] + " ");
        }

    }
}
