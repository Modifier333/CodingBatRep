package Logic1;

public class NearTen {
    public static void main(String[] args) {
        int num=17;
        System.out.println(m(num));
    }
    static boolean m(int num){
        if(num%10<3||num%10>=8){
            return true;
        }
        return false;
    }
}
