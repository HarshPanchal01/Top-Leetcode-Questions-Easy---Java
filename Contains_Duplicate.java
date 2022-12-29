import java.util.HashSet;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // create hashset
        for (int i = 0; i < nums.length; i++) { // loop through array
            if (set.contains(nums[i])) { // if set contains element then its a duplicate
                return true;
            }
            set.add(nums[i]); // otherwise add to set
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
