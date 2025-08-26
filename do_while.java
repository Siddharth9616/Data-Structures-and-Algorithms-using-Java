
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        // int counter= 1;
        // do { 
        //     System.out.println("Hello World");
        //     counter++;
        // } while (counter <=10);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        do{
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
