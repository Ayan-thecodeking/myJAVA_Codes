package leetcode;

public class twoSum {
    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        for(int x : sol(nums , target))
            System.out.print(x + " ");
    }

    static int[] sol(int[] nums, int target) {

        for(int i=0 ; i<nums.length ;i++){

            if(nums[i] + nums[i+1]==target)
            {
                return new int[]{i , i + 1};
            }

        }
        return new int[]{-1 , -1};
    }
}

