public class question_53_ {
    public static void main(String[] args) {

        int array[] = { 10, 20, 30, 40, 50,5 };
        int smallest = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println(smallest);
    }
}
