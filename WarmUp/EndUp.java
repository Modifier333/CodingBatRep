package Warmup1;

public class EndUp {


    public static void main(String[] args) {
        String str="Hello world";

        System.out.println(m(str));
    }
    public static String m(String str){
        if(str.length()>3){
            String s1=str.substring(0,str.length()-3);
            String s2=str.substring(str.length()-3);
            return s1+s2.toUpperCase();
        }
        return str.toUpperCase();

    }
}
