public class spiral {
    public static int printspiral(int arr[][], int n, int m, int k){
        int startrow=0;
        int startcol=0;
        int endrow= n-1;
        int endcol= m-1;
        int count=0;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol; j<=endcol; j++){
                count++;
                if (count==k) return arr[startrow][j];
                
            }
            startrow++;

            for(int i=startrow+1; i<=endrow; i++){
                count++;
                if (count==k) return  arr[i][endcol];
            }
            endcol--;

            for(int j=endcol-1; j>=startcol; j--){
                if(startrow==endrow){
                    break;
                }
                count++;
                if(count==k) return  arr[endrow][j];
            }
            endrow--;
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol== endcol){
                    break;
                }
                count++;
                if(count==k) return arr[i][startcol];
            }
            startcol++;
        }
        return -1;
       
    }
    public static void main(String[] args) {
       
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         int n=4;
        int m=4;
        int k=6;
        System.out.print(printspiral(arr, n, m, k));
        }
}
