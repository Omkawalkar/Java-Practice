public class sorting_7th {

    //insertion sort
    public static void insertion(int arr[]){


        for(int i = 1 ;i<arr.length;i++ ){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key;

        }
        
    }

    public static void printarray(int arr[]){
            for(int i = 0 ; i<arr.length;i++){
                System.out.print(arr[i]+" ");
                
            }
        }
    public static void main(String[] args) {
        



        int arr[]={66,55,44,33,22,33,55,66,77,88,99};

        insertion(arr);
        printarray(arr);
    }
}
