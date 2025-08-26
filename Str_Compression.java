public class Str_Compression {
    public static String compress(String str){
        StringBuilder newstr = new StringBuilder();
        for(int i=0; i<str.length()-1; i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        
        return newstr.toString();
    }
    public static void main(String[] args) {
        String str="aaabbccdeee";
        System.out.print(compress(str));
    }
}
