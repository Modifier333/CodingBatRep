

public class ArrayFront9 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 3, 4};
        System.out.println(m(nums));

    }

    public static boolean m(int[] nums) {
        int a = nums.length - 4;

        if (a >=1) {
            for (int i = 0; i < nums.length - a; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        } else if (a < 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }

            return false;
        }
        return false;
    }
}

