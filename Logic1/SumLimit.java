package Logic1;

public class SumLimit {
    public static void main(String[] args) {
        int a=12;
        int b=34;

        System.out.println(m(a,b));
    }
    public static int m(int a,int b){
        int c=a+b;
        String cstr=String.valueOf(c);
        String astr=String.valueOf(a);
        if(cstr.length()>astr.length()){
            return a;
        }

        return a+b;

    }

}
