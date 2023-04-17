package Warmup1;

public class EveryNth {

    public static void main(String[] args) {
        String str="Hello";
        int n=3;
        System.out.println(m(str,n));
    }
    public static String m(String str, int n){
       String s="";
       for(int i=0;i<str.length();i+=n){
           char c=str.charAt(i);
           s+=c;
       }
        return s;

    }
}
