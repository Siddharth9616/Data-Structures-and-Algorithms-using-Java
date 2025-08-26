public class minmax {

    public static void minmaxarray(int arr[]){
        int max= arr[0];
        int min= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print(min +","+ max);
    }

    public static void main(String[] arg){
        int arr[]= {3,2,1,56,10000,167};
        minmaxarray(arr);

    }
}
