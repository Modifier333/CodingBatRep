
import java.sql.SQLOutput;

public class LoneTeen {
    public static void main(String[] args) {
        int a=13;
        int b=20;
        System.out.println(m(a,b));

    }
    public static boolean m(int a,int b){

        if((a>=13&&a<=19)&&(b>=13&&b<=19)){
            return false;
        }else if((a>=13&&a<=19)||(b>=13&&b<=19)){
            return true;
        }


        return false;
    }
}
