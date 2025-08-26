public class array {
    // public static void reverse(int number[]){
    //     int first=0, last=number.length-1;

    //     while(first<last){
    //         int temp= number[last];
    //         number[last]= number[first];
    //         number[first]=temp;

    //         first ++;
    //         last --;
    //     }

    // }
    // public static void PrintPairs(int number[]){
    //     for(int i=0; i<number.length; i++){
    //         int curr = number[i];
    //         for(int j=i+1; j<number.length; j++){
    //             System.out.print("("+ curr + ","+number[j]+")");
    //         }
    //         System.out.println();
    //     }

    // }

    // public static void printSubarray(int number[]){
    //     for(int i=0; i<number.length; i++){
    //         int start=i;
    //         for(int j=1; j<number.length; j++){
    //             int end = j;
    //             for(int k=start; k<=end; k++){
    //                 System.out.print(number[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void kadanes(int number[]){
    //    int  cs= number[0];
    //    int ms= number[0];
    //    for(int i=1; i<number.length; i++){
    //     cs= Math.max(number[i], cs+number[i]);
    //     ms= Math.max(cs, ms);
    //    }
    //    System.out.println(ms);
    // }



    // Trap rain water problem

    public static int traprainwater(int number[]) {
        int n= number.length;

        //left max
        int leftmax[] = new int[n];
        leftmax[0]= number[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(number[i], leftmax[i-1]);
        }

        // right max
        int rightmax[] = new int[n];
        rightmax[n-1] = number[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]= Math.max(number[i], rightmax[i+1]);

        }

        int trapwater=0;
        for(int i=0; i<n; i++){
            int Waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += Waterlevel - number[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        // int number[]={2,4,6,8,10};
        // // PrintPairs(number);
        //  printSubarray(number);

        int number[]={4,2,0,6,3,2,5};
        System.out.println(traprainwater(number));


}
}
