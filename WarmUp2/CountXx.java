package Warmup2;

public class CountXx {
    public static void main(String[] args) {
        String str="cxountxxsdgxxx";
        System.out.println(m(str));
    }
    static int m(String str){
        int count=0;
        if(str.contains("xx")){
            for(int i=0;i<str.length()-1;i++){

                if(str.charAt(i)=='x'&&str.charAt(i+1)=='x'){
                    count++;
                }
            }
            return count;
        }
        return count;
    }
}
