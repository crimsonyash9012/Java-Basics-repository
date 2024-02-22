public class j146_HouseRobber2 {
    public static int sum(int[]nums){
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
        return prev;
    }

    public static void main(String[] args) {
        int []nums = {2,3,2};
        int n = nums.length;

        int []temp1 = new int[n-1];
        int []temp2 = new int[n-1];

        for(int i=0; i<n;i++){
            if(i!=0)temp1[i-1] = nums[i];
            if(i!=n-1) temp2[i] = nums[i];
        }

         System.out.println(Math.max(sum(temp1), sum(temp2)));
    
    }
}
