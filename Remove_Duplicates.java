public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 1; // start at 1 because the first number is always unique
        for (int i = 0; i < nums.length - 1; i++) { // go through array but with length - 1 so it doesnt go out of bounds
            if (nums[i] != nums[i+1]) { // if adjacent numbers dont equal each other
                nums[count++] = nums[i + 1]; // change index by 1 and let that equal the adjacent number since they are not equal 
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        System.out.println(removeDuplicates(nums1));
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }
}