public class sorting_5th {


public static void bubblesort(int arr[] ,int n){

for(int i = 0; i<n-1;i++){
    
    for(int j = 0 ; j<n-i-1;j++    ){
        if(arr[j]>arr[j+1]){
            int temp = arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
    }
}




}


public static void printarray(int arr[],int size){
    
    for(int i = 0 ; i<size;i++){
        System.out.print(arr[i]+" ");
        
    }
}



    public static void main(String[] args) {
        



int arr[]={66,44,55,33,77,99,22,11,};
int n = arr.length;


// sort array
bubblesort(arr, n);
//print array
printarray(arr, n);


    }
}
