package Warmup1;

public class LastDigit {

    public static void main(String[] args) {
        int a=13;
        int b=13;

        System.out.println(m(a,b));
    }
    public static boolean m(int a,int b){
      //  int a1=a%10;
       // int b1=b%10;
        if(a%10==b%10){
            return true;
        }
        return false;
    }
}
