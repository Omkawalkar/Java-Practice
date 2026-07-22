public class sorting_1st {

public static void sortarray(int array[]){
for(int i = 0 ; i< array.length;i++){
    System.out.print(array[i]+" ");
}

}
    public static void main(String[] args) {

int array[]= {5,3,2,1,2,3,5,6,7,5};
for(int i = 0 ; i<array.length-1;i++){

    for(int j = 0 ; j<array.length-i-1;j++){
        if(array[j]>array[j+1]){
            int temp = array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
        }
    }
}
sortarray(array);

    }
   
}
