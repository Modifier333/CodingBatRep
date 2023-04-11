package Warmup1;

public class StartOz {
    public static void main(String[] args) {
        String str="o";
        System.out.println(m(str));

    }
    static  String m(String str){
        if(str.equals("o")){
            return str;
        }
        if(str.length()>1){
            for (int i=0;i<2;i++){
                if(str.charAt(i)=='o'&&str.charAt(i+1)=='z'){
                    return "oz";
                }else if(str.charAt(i)=='o'){
                    return "o";

                }
                else if (str.charAt(i+1)=='z'){
                    return "z";

                }
                return "";
            }
        }
        return "";
    }

}
