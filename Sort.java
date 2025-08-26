
import java.lang.reflect.Array;

public class Sort {
    public static int selectionsort(int arr[]){
        int min=arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=temp;
       }
    

    }

    public static void main(String[] args) {
        int arr[]={5,3,32,2,5};
        InsertionSort(arr);

    }
}
