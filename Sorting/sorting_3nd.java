public class sorting_3nd {
    public static void main(String[] args) {
        

        int array[]={8,7,3,2,1};
// insertion sort
        for(int i = 1; i<array.length;i++){

            int current = array[i];
            int j = i -1;
            while(j>=0 && array[j]>current){
                //keep swaping
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        for(int i = 0 ; i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
