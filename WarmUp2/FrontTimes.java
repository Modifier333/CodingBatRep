package WarmUp2;

public class FrontTimes {


    public static void main(String[] args) {
        int n=4;
        String str="ab";
        System.out.println(m(str,n));
    }
    public static String m(String str,int n){
        String s="";
        if(str.length()>=3){
            for (int i=0;i<n;i++){
                s+=str.substring(0,3);

            }
            return s;
        }else{
            for(int i=0;i<n;i++){
                s+=str;
            }
            return s;
        }


    }

}
