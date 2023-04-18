package Logic1;

public class TeaParty {
    public static void main(String[] args) {
        int t=20;//tea
        int c=6; //candy

        System.out.println(m(t,c));
    }
    static int m(int t,int c){
        if(t>=5&&c>=5){
            if((t==5||t<2*c)&&(c==5||c<2*t)){
                return 1;
            }
            if(t>=2*c||c>=2*t){
                return 2;
            }
            return 0;
        }
        return 0;
    }
}
