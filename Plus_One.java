import java.util.Arrays;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) { // traverse backwards through the loop cause you add to the right most number
            if (digits[i] < 9) { // if the number is less than 9
                digits[i]++; // add one
                return digits; // return the array
            }
            digits[i] = 0; // otherwise it is a nine so set it to zero and the loop works again
        }
        int[] result = new int[digits.length + 1]; // in the case that the array contained only 9s reset array length by one since you need one more number eg 99 + 1 = 100
        result[0] = 1; // set first value to 1
        return result; // return array
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}