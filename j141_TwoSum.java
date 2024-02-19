public class j141_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // int target = 4; 
        // int [] nums = {11, 9, 10, 1, 3, 4, 7, 2};
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int [] {};
    }

    public static void main(String[] args) {
        int []nums = {2,7,11,15}; 
        int target = 9;
        int[]arr = twoSum(nums,target);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
