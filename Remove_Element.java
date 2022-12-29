public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int count = 0; // to be the index of start of the array after numbers not equal to val
        for (int i = 0; i < nums.length; i++) { // go through array
            if (nums[i] != val) { // if element doesnt equal val
                nums[count] = nums[i]; // move the element to the front
                count++; // increment count to move to the next index after the element that isnt val
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(removeElement(nums1, val1));
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
    }
}
