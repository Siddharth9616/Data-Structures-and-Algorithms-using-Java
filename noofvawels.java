import java.util.Scanner;

public class noofvawels {
    public static void main(String[] args) {
        String str= new Scanner(System.in).next();
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.print("Total number of vawels in word is:" +count);
    }
}
