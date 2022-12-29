import java.util.Arrays;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums); // sort the array
        return nums[nums.length/2]; // the middle number will always be the majority number
    }
    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        System.out.println(majorityElement(nums1));

        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums2));

        int[] nums3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,4};
        System.out.println(majorityElement(nums3));

        int[] nums4 = {1};
        System.out.println(majorityElement(nums4));
    }
}
