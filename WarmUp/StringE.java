package Warmup1;

public class StringE {

    public static void main(String[] args) {

        String str="Helloeee";
        System.out.println(m(str));
    }
    public static boolean m(String str){
        int c=0; //count
        if(str.contains("e")){

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='e'){
                    c++;
                }
            }
            if(c==1||c==3){
                return true;
            }
        }

        return  false;
    }
}
