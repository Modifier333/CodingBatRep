

public class Has271 {
    public static void main(String[] args) {
        int nums[]={2, 7, -1};

        System.out.println(m(nums));
    }
    public static boolean m(int[] nums){
        if(nums.length>=3){

            for(int i=0;i<nums.length-2;i++){

                if(nums[i+1]==nums[i]+5){

                    if(nums[i+2]==nums[i]-1||nums[i+2]==nums[i]-2||nums[i+2]==nums[i]+1||nums[i+2]==nums[i]-3){


                        return true;
                    }

                }
            }
        }

return false;
    }
}
