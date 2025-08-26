class Solution {
    // public static int largest(int[] arr) {
    //     // code here
    //     int larg=arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]> larg ){
    //             larg=arr[i];
    //         }
    //     }
    //     return larg;

    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                start = mid +1;
            }else{
                end= mid+1;
            }
        }
        return -1;
    }
        
    public static void main(String[] agr){
        // int arr[]={1,2,3,4,5,6};
        // int findlargest=largest(arr);
        // System.out.println(findlargest);

        int arr[]= {1,2,3,4,5,6};
        int key= 4;
        int search= binarysearch(arr ,key);
        System.out.print(search);
        
    }
}
