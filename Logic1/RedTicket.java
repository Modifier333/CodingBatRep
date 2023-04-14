package Logic1;

public class RedTicket {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        int c=5;

        System.out.println(m(a,b,c));
    }
    public static int m(int a,int b,int c){
        if(a==b&&a==c&&a==2)
            return 10;
        else if(a==b&&a==c)
            return 5;
        else if(a!=b&&a!=c)
            return 1;

        return 0;
    }
}
