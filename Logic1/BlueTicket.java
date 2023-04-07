public class BlueTicket {
    public static void main(String[] args) {
        int a=9;
        int b=1;
        int c=0;
        System.out.println(m(a,b,c));
    }
    public static int m(int a,int b, int c){

        int ab=a+b;
        int ac=a+c;
        int bc=b+c;

        if(ab==10||ac==10||bc==10){
            return 10;
        }
        else if(ab==15||ac==15||bc==15){
            return 5;
        }
        return 0;

    }
}
