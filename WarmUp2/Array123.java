

public class Array123 {
    public static void main(String[] args) {
        int[] nums={1, 1, 2, 1, 2, 3};


        System.out.println(m(nums));
    }
    public static boolean m(int[] nums){

if(nums.length>2) {

    for (int i = 0; i < nums.length-2; i++) {
        
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {

            return true;
        }
    }
}
        return false;
    }
}
