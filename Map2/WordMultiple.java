
import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {
    String[] strings={ "a", "b", "c", "b"};

        System.out.println(m1(strings));
    }
    public static Map m1(String[] strings){
        Map m=new HashMap();
        for(int i=0;i<strings.length;i++){
            int c=0;
            for(int j=i;j<strings.length;j++){
                if(strings[i]==strings[j]){
                    c++;
                }
            }
            if(!m.containsKey(strings[i])){
                if(c>=2){
                    m.put(strings[i],true);
                }else{
                    m.put(strings[i],false);
                }
            }

        }

return m;
    }

}
