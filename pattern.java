public class pattern {
    public static void hollow_rectangle(int totRow, int totCol){
        // outer loop
        for(int i=1; i<=totRow; i++){
            //inner loop
            for(int j=1; j<=totCol; j++){
                // cells - (i,j)
                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invrted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    public static void inversed_half_Pyramid_withnum(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_traingle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 ==0){   //even
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void PalindromicPatternwithnum(int n){
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //decending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_rectangle(5, 4);
        // invrted_rotated_half_pyramid(50);
        // inversed_half_Pyramid_withnum(5);
        // Floyds_triangle(5);
        // zero_one_traingle(5);
        // butterfly(4);
        PalindromicPatternwithnum(5);
    }
}
