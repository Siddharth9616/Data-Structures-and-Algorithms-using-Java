import java.util.*;
public class loop {
    public static void main(String[] args) {
        // int counter=0;
        // while(counter<100){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Printed Hello World 100 times");

        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Number: ");
        // int range = sc.nextInt();
        // int counter = 1;

        // while(counter <= range){
        //     System.out.println(counter);
        //     counter++;
        // }

        // Sum of natural numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i =1;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is:" +sum);
    }
}
