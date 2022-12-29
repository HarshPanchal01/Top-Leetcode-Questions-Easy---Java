import java.util.Arrays;

public class Missing_Number {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums); // sort the array
        int count = nums.length - 1; // set variable to be length of array
        for (int i = 0; i < nums.length; i++) { // loop through array
            if (i == count && i == nums[i]) { // if i is at the last element and i is equal to the element at that index then the next number in the range is missing
                return i+1;
            }
            if (nums[i] != i) { // if element doesnt equal i than i is missing number
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,3};
        System.out.println(missingNumber(nums));
    }
}