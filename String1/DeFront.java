public class DeFront {
    public static void main(String[] args) {
        String str = "dbhello";
        System.out.println(m(str));


    }

    public static String m(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == 'a') {
                if (str.charAt(1) == 'b') {
                    return str;
                  
                } else {
                    return "a"+str.substring(2);
                  
                }
            }
            if (str.charAt(1) == 'b') {
                return "b"+str.substring(2);
                
            } else {
                  return str.substring(2);
             
            }
        }
return str;
    }

}
