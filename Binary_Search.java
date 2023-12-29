import java.util.*;

public class Binary_Search {
    public static int search(int[] nums, int target) { // binary search only works for sorted arrays
        if (nums.length == 0) { // if empty array
            return -1;
        }

        int left = 0; // set variable for left side
        int right = nums.length - 1; // set variable for right end to be the end of array

        while (left <= right) { // as long as left is not equal or greater than right side meaning there is values between them
            int middle = (left + right) / 2; // get middle of the range by cutting in half

            if (target < nums[middle]) { // if the target is less than the middle then make the right end one less than the middle cutting by half again
                right = middle - 1;
            }
            else if (target > nums[middle]) { // if the target is greater than the middle then make the left end one more than the middle cutting by half again
                left = middle + 1;
            }
            else { // the only other possibility is that the target matches the middle value in which case return it
                return middle;
            }
        }

        return -1; // if not found
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));
    }
}
