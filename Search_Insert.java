import java.util.ArrayList;
import java.util.Collections;

public class Search_Insert {
    public static int searchInsert(int[] nums, int target) {
        ArrayList<Integer> number = new ArrayList<>(); // create arraylist
        for (int i = 0; i < nums.length; i++) { // for loop to add elements to arraylist
            number.add(nums[i]);
        }
        Collections.sort(number); // sort list
        if(number.contains(target)) { // if target is in list return index
            return number.indexOf(target); 
        }
        number.add(target); // otherwise add target
        Collections.sort(number); // sort list again
        return number.indexOf(target); // return index of where target would be
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target1 = 5;
        int target2= 2;
        int target3 = 7;
        System.out.println(searchInsert(nums, target1));
        System.out.println(searchInsert(nums, target2));
        System.out.println(searchInsert(nums, target3));
    }
}
