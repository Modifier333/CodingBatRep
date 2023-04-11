package Warmup1;

public class Close10 {
    public static void main(String[] args) {
        int a=13;
        int b=7;

        System.out.println(m(a,b));
    }
    public static int m(int a,int b){
        if(Math.abs(10-a)<Math.abs(10-b)){
            return a;
        }else if(Math.abs(10-a)==Math.abs(10-b)){
            return 0;
        }else{
            return b;
        }





    }
}
