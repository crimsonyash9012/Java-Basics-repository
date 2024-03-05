import java.util.HashSet;

public class j154_containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int e: nums){
            set.add(e);
        }        
        if(set.size()==nums.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
