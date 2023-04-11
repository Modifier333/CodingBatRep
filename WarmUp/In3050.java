package Warmup1;

public class In3050 {
    public static void main(String[] args) {
        int a=41;
        int b=50;
        System.out.println(m(a,b));
    }
    public static boolean m(int a,int b){
        if(((a>=30&&a<=40)&&(b>=30&&b<=40))||((a>=40&&a<=50)&&(b>=40&&b<=50))){
            return true;
        }

        return false;
    }
}
