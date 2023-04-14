package Logic1;

public class FizzString2 {
    public static void main(String[] args) {
        int n=15;
        System.out.println(m(n));
    }
    public static String m(int n){
        if(n%3==0&&n%5==0){
            return "FizzBuzz!";
        } else if(n%3==0){
            return "Fizz!";
        }else if(n%5==0){
            return "Buzz!";
        }

        return String.valueOf(n)+"!";
    }
}
