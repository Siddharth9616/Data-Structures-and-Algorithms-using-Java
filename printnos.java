public class printnos {

    public static void Nos(int current, int n){
        if(current>n){
            return;
        }
             System.out.print(current +" ");
             Nos(current+1, n);
    }
    public static void main(String[] args) {
        int n=10;
        Nos(1,n);
    }
}
