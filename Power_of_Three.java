public class Power_of_Three {
    public static boolean isPowerOfThree(int n) {
        double num = n; // copy into double
        if (n <= 0) { // if its 0 or less it cant be power of 3
            return false;
        }
        while (num != 1) { // if it is a power of 3 then if you keep dividing by 3 you will end up with 1
            if ((num % 1) == 0) { // if its still a whole number divide by 3
                num = num / 3;
            }
            else { // if it becomes a fraction then its not a power
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isPowerOfThree(n));
    }    
}
