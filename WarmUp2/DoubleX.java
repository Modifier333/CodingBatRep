package Warmup2;

public class DoubleX {
    public static void main(String[] args) {
        String str="xaxxx";
        System.out.println(m(str));
    }
    static boolean m(String str){
        if(str.contains("x")){
            for(int i=0;i<str.length();i++){

                   if(str.charAt(i)=='x'&&str.charAt(i+1)=='x'){
                       return true;
                   }

            }

        }
        return false;
    }
}
