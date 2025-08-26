
import java.util.Scanner;

public class facttorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter any postive integer: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial: "+ fact);
    }
}
