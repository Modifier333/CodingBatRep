package Logic1;

public class GreenTicket {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        System.out.println(m(a,b,c));
    }
    public static int m(int a,int b,int c){
        if(a==b&&a==c){
            return 20;
        }else if(a==b||c==a||c==b){
            return 10;
        }

        return 0;
    }
}
