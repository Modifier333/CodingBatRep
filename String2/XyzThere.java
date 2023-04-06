

public class XyzThere {
    public static void main(String[] args) {
        String str = "abc.xyzxyz";

        System.out.println(m(str));

    }


    public static boolean m(String str) {
        boolean flag = true;
        if (str.contains("xyz")) {
            String s = "xyz";
            String temp = "";
            if (str.contains(".xyz")) {

                temp = str.replace(".xyz", "");
                flag = false;
            }
            if (temp.contains(s)) {
                flag = true;

            }


        } else {
            flag = false;
        }

        return flag;
    }
}




