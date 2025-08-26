public class fun_prime {
    public static boolean isPrime(int n){
        if(n==2){

        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return  false;
            }
           
        } 

        return true;
    }

    public static void main(String[] args) {
        // int n= 7;
        System.out.println(isPrime(8));
    }
}

