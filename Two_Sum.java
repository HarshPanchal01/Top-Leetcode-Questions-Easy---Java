import java.util.Arrays;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2]; // because always two numbers will add to target

        for (int i = 0; i < nums.length; i++) { // go through each element and add with each element except itself to see if you get target answer
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) { // if you do get the target
                    solution[0] = i; // sets values of solution array to the index of the two numbers that got the target sum
                    solution[1] = j;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        int[] nums2 = {3,2,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        int[] nums3 = {3,3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }
}
