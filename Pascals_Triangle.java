import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }

        List<Integer> first_row = new ArrayList<>(); // make the first row and add its value then add it to the list
        first_row.add(1);
        list.add(first_row);

        for (int i = 1; i < numRows; i++) { // loop through numRows times with i = 1 since you already added the first row
            List<Integer> prev_row = list.get(i-1); // set a list for the previous row
            List<Integer> curr_row = new ArrayList<>(); // set a list for current row
            curr_row.add(1); // add 1 since, 1 is always at the start and at the end of all rows in the triangle

            for (int j = 1; j < i; j++) { // loop through again
                curr_row.add(prev_row.get(j-1) + prev_row.get(j)); // add all the elements from previous to current
            }

            curr_row.add(1); // add 1 for the end of the list
            list.add(curr_row); // add to the list
        }

        return list; // return the list
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
