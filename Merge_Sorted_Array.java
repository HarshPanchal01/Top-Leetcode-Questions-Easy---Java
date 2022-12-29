import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void insertionSort(int[] numbers) { // to sort array
        int size = numbers.length;

        for (int i = 1; i < size; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && current < numbers[j]) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // basically for this problem just copy both arrays into one excluding the zeroes they have then just sort that array and copy it to nums1
        
        int[] merge = new int[nums1.length]; // create array to store the merged arrays

        // various cases that could happen
        if (m == 1 && n == 0) {
            merge[0] = nums1[0];
        }
        else if (m == 0 && n == 1) {
            merge[0] = nums2[0];
        }
        else if (m == 1 && n == 1) {
            merge[0] = nums1[0];
            merge[1] = nums2[0];
        }
        else if (m > 1 && n == 0) {
            for (int i = 0; i < m; i++) {
                merge[i] = nums1[i];
            }
        }
        else if (m > 1 && n == 1) {
            int index = 0;
            for (int i = 0; i < m; i++) {
                merge[index] = nums1[i];
                index++;
            }
            merge[index] = nums2[0];
        }
        else if (n > 1 && m == 0) {
            for (int i = 0; i < n; i++) {
                merge[i] = nums2[i];
            }
        }
        else if (n > 1 && m == 1) {
            int index = 0;
            for (int i = 0; i < n; i++) {
                merge[index] = nums2[i];
                index++;
            }
            merge[index] = nums1[0];
        }
        else if (m > 1 && n > 1) {
            int index = 0;
            for (int i = 0; i < m; i++) {
                merge[index] = nums1[i];
                index++;
            }
            for (int i = 0; i < n; i++) {
                merge[index] = nums2[i];
                index++;
            }
        }
        insertionSort(merge); // sort it
        for (int i = 0; i < merge.length; i++) { // copy it to nums1 array
            nums1[i] = merge[i];
        } 
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m1 = 3; 
        int [] nums2 = {2,5,6};
        int n1 = 3;
        merge(nums1, m1, nums2, n1);

        int[] nums3 = {1}; 
        int m2 = 1; 
        int [] nums4 = {};
        int n2 = 0;
        merge(nums3, m2, nums4, n2);
    }
}
