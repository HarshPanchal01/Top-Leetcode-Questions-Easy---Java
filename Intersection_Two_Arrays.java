import java.util.Arrays;

public class Intersection_Two_Arrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // sort the arrays first
        Arrays.sort(nums2);
        int[] intersection = new int[nums1.length * nums2.length]; // create an array to store their intersections
        int count = 0, i = 0, j = 0; // create variables to increment
        while (i < nums1.length && j < nums2.length) { // while both of the arrays arent looped through
            if (nums1[i] < nums2[j]) { // if one array element is less than next then increment that array
                i++;
            }
            else if (nums1[i] > nums2[j]) { // vice verse of first if statement
                j++;
            }
            else { // otherwise they equal each other so then put that value in intersection array and increment all counters
                intersection[count] = nums1[i];
                count++;
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, count); // return the array from 0 to count so you dont return whole array
    }
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
