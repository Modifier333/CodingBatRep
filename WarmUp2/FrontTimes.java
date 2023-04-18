package Warmup2;

public class FrontTimes {
    public static void main(String[] args) {
        String str="he";
        int n=5;

        System.out.println(m(str,n));
    }
    static String m(String str,int n){
String s="";

        if(str.length()>=3){
           String s1=str.substring(0,3);
            for(int i=0;i<n;i++){
                s=s+s1;
            }
            return s;
        }
        else{
            while(n>0){
                s=s+str;
                n--;
            }
            return s;
        }


    }
}
