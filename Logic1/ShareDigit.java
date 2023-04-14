package Logic1;

public class ShareDigit {
    public static void main(String[] args) {
        int a=18;
        int b=21;
        System.out.println(m(a,b));

    }
    public static boolean m(int a,int b){
        int a1=a/10;
        int a2=a%10;
        int b1=b/10;
        int b2=b%10;

        if((a1==b1||a1==b2)||(a2==b1||a2==b2)){
    return true;
        }
        return false;
    }
}
