package Warmup2;

public class StringTmes {
    public static void main(String[] args) {
        int n=5;
        String str="Hi";
        System.out.println(m(str,n));
    }
    static String m(String str,int n){
        String s="";

        while(n>0){

            s=s+str;
            n--;
        }
        return s;

    }
}
