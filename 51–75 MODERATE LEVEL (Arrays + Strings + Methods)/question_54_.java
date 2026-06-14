public class question_54_ {
    public static void main(String[] args) {
        
        int array []= {10,4,56,78,3,2,45,};

        int secoundlargest = array[0];

        for(int i = 0 ; i<array.length;i++){
            if(array[i]>secoundlargest && array[i] != array.length){
                secoundlargest = array[i];
            }
        }
        System.out.println(secoundlargest);
    }
}
