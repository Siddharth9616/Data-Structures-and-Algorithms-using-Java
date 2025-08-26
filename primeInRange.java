public class primeInRange extends fun_prime{
    
    public static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeRange(20);
    }
}

