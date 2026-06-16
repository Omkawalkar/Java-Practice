public class question_61_ {
    public static void main(String[] args) {

        int array[] = { 10, 20, 30, 40 };

        int x = 20;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {

                System.out.println(x + " found at index " + i);
            }

        }

    }

}
