import java.util.*;

public class Pos_or_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your number to chech it's Positive or Negative: ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Number is Positive");
        }
        
        else{
              System.out.println("Number is negative");
        }
    }
    
}
