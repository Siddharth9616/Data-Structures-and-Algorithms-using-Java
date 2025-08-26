
import java.util.Scanner;

public class metric {
    public static void main(String[] args) {
        int towdmatrix[][]= new int [3][3];
        int n = towdmatrix.length , m= towdmatrix[0].length;

        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                towdmatrix[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(towdmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
