package Warmup1;

public class Max1020 {
    public static void main(String[] args) {
        int a=10;

        int b=23;

        System.out.println(m(a,b));

    }
    public static int m(int a, int b){
        int max=a;
        if(max>b){
            max=a;
        }
        else {
            max=b;
        }
       if((a<=20&&a>=10)&&(b<=20&&b>=10)){
          return max;
       }
       else if((a<=20&&a>=10)||(b<=20&&b>=10)){
           if(a<=20&&a>=10){
               max=a;
           }else{
               max=b;
           }
          return max;
       }
return 0;
    }
}
