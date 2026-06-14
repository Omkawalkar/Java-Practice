public class question_56_ {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50, 60 };
        int sum = 0;
        int average = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            average = sum / array.length;


        }
System.out.println(average);
        
    
    }
}
