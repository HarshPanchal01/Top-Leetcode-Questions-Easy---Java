import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class K_Weakest_Row_In_Matrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> numbersMap = new HashMap<>(); // create hashmap to store the index of the inner array and the total value of the elements inside

        int[] arr = new int[mat.length]; // set array to copy indexes
        int[] arr2 = new int[k]; // set another array of size k to output the k weakest/lowest indexes of array
        ArrayList<Integer> sortmap = new ArrayList<>(); // arraylist to sort

        int tempCount = 0; // counter to add values

        for (int i = 0; i < mat.length; i++) {
            numbersMap.put(i, null); // make the key the index of the array and set value to null for now
            for (int j = 0; j < mat[i].length; j++) { // go through inner array
                tempCount += mat[i][j]; // add all values
                numbersMap.put(i, tempCount); // put that total value in the hashmap
            }
            tempCount = 0; // reset count for next array
        }
        
        for (int i = 0; i < mat.length; i++) { // add all values of hashmap to arraylist
             sortmap.add(numbersMap.get(i));
        }

        Collections.sort(sortmap); // sort arraylist

        for (int i = 0; i < sortmap.size(); i++) {
            for (int j = 0; j < sortmap.size(); j++) {
                if (sortmap.get(i) == numbersMap.get(j)) { // find the element that matches in the unsorted hashmap with the sorted list
                    arr[i] = j; // set the array to that index
                    numbersMap.put(j, null); // make that value null to avoid if another key has same value
                    break; // break from inner for loop
                }
            }
        }

        for (int i = 0; i < k; i++) { // iterate k times
            arr2[i] = arr[i]; // put the first k elements into the other array
        }

        return arr2; // return the final array
    }
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},
                       {1,1,1,1,0},
                       {1,0,0,0,0},
                       {1,1,0,0,0},
                       {1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }
}
