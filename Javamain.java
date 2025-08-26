import  java.util.*;
public  class Javamain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    //   String input= sc.next();
    //   System.out.println(input);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a*b;
    // System.out.println(sum);

    // float rad= sc.nextFloat();
    // float area= 3.14f * rad * rad;
    // System.out.println(area);

//  float a = 12.15f;
//  int b = (int)a;
//  System.out.println(b);

// int num= sc.nextInt();
// if (num % 2 == 0) {
//   System.out.println("EVEN");
// }
// else{
//   System.out.println("ODD");
// }


int income = sc.nextInt();

int tax;

if(income < 500000){
 tax = 0;
}
else if(income >= 500000 && income < 1000000){
  tax = (int) (income * 0.2);
}
else {
  tax = (int) (income * 0.3);
}
System.out.println("Your tax is" +" "+ tax);

    }
}