public class Single_Number {
    public static int singleNumber(int[] nums) {
        int num = 0;

        if (nums.length == 1) { // if for the case there is only one element
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) { // go through array
            num = nums[i]; // set the number to the current element at index i
            for (int j = 0; j < nums.length; j++) { // go through array to compare
                if (nums[i] == nums[j] && i != j) { // if same element is found and index is not the same then reset num
                    num = 0;
                    break;
                }
            }
            if (num != 0) { // if made it through comparing and num is not reset then it means there was no duplicate and break loop
                break;
            }
        }
        return num; // return the single number
    }
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        System.out.println(singleNumber(nums1));

        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println(singleNumber(nums3));
    }
}
