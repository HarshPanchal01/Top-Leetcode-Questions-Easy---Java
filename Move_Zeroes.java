import java.util.Arrays;

public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int collectZeroes = 0; // create variable to collect zeroes as you traverse through array
        for (int i = 0; i < nums.length; i++) { // loop through array
            if (nums[i] == 0) { // if its zero increment zero variable
                collectZeroes++;
            }
            else if (collectZeroes > 0) { // if there is already a zero and element at i is not 0, swap them and do this for all collected zeroes
                int temp = nums[i];
                nums[i] = 0;
                nums[i-collectZeroes] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }
}
