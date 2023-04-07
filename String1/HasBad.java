

public class HasBad {
    public static void main(String[] args) {
String str="cvbnbadxx";

        System.out.println(m(str));
    }
    public static  boolean m(String str) {
        if(str.length()>=3){
            String f= str.substring(0,3);
            if(f.equals("bad")){
                return true;
            }

            if(str.length()>=4){
                String f1=str.substring(1,4);

                if(f1.equals("bad")){

                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return false;
    }
}
