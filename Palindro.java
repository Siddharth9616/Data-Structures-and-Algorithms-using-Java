import java.util.Scanner;

public class Palindro{
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome= sc.nextInt();

        if(ispalindrome(palindrome)){
            System.out.println("Number : "+ palindrome + "is a plaindrome");
        }
        else{
            System.out.println("Number : "+ palindrome + "is not a plaindrome");
        }

        
    }

    public static boolean ispalindrome(int number){
        int palindrome=number;
        int reverse = 0;
        while (palindrome != 0){
            int reminder = palindrome % 10;
            reverse = reverse * 10 + reminder;
            palindrome = palindrome / 10;
        }
        return  palindrome==reverse;
    }
}