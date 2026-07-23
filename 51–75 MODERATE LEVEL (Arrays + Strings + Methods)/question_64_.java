public class question_64_ {
    public static void main(String[] args) {

        int array[] = { 1, 20, 30, 4, 15, };

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i +1 ; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

      System.out.println(array[i]);
             
        }

              System.out.println("Secound largest number of array is  "+array[array.length - 2]);


    }
}
