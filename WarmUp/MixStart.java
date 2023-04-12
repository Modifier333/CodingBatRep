package Warmup1;

import static Warmup1.DelDel.m;

public class MixStart {
    public static void main(String[] args) {
        String str="piz snacks";
        System.out.println(m(str));
    }
    static boolean m(String str){
        if(str.length()>=3){
            for(int i=0;i<str.length()-2;i++){
                if(str.charAt(i+1)=='i'&&str.charAt(i+2)=='x'){
                    return true;
                }
            }
        }

        return false;
    }
}
