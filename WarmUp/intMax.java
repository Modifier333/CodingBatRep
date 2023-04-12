package Warmup1;

public class IntMax {
    public static void main(String[] args) {
        int a=125;
        int b=340;
        int c=100;

        System.out.println(m(a,b,c));

    }
    public static int m(int a,int b,int c){
        int max=a;

        if(max<b){
            max=b;
        }
       if(max<c){
            max=c;
        }
        return max;



    }
}
