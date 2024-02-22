public class j145_HouseRobber {
    public static void main(String[] args) {
        int []nums = {1,2,3,1};
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for(int i=1; i<n; i++){
            int take = nums[i];
            if(i>1) take+=prev2;

            int notTake=0+prev;
            int curr = Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
