public class Diagonal_Difference {
    public static int diagonalDifference(int[][] arr) {
        int left_right = 0;
        int right_left = 0;
        int difference = 0;
        int i = 0;
        for (int j = arr[0].length - 1; j >= 0; j--) {
            left_right += arr[i][i];
            right_left += arr[i][j];
            i++;
        }
        difference = left_right - right_left;
        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }
    public static void main(String[] args) {
        int[][] arr = { {20, 15, 7},
                        {8, 7, 19},
                        {7, 13, 47} };
        System.out.println(diagonalDifference(arr));

        int[][] arr2 = { {3, 0, 0},
                        {11, 2, 4},
                        {4, 5, 6}};
        System.out.println(diagonalDifference(arr2));
    }
}
