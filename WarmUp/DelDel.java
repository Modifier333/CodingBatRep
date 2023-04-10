<<<<<<< HEAD


public class DelDel {
    public static void main(String[] args) {
        String str="adehedelllo";

        System.out.println(m(str));
    }
    public static String m(String str){
        if(str.contains("del")&&str.length()>=4){
            String a=str.substring(1,4);

            if(a.equals("del")){
                str=str.replace(a,"");
                return str;
            }
            return str;
        }
        return str;
    }
}
=======


public class DelDel {
    public static void main(String[] args) {
        String str="adehedelllo";

        System.out.println(m(str));
    }
    public static String m(String str){
        if(str.contains("del")&&str.length()>=4){
            String a=str.substring(1,4);

            if(a.equals("del")){
                str=str.replace(a,"");
                return str;
            }
            return str;
        }
        return str;
    }
}
>>>>>>> 77288470b515dd1404fafb5b91a5a6a8425db76f
