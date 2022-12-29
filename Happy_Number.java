public class Happy_Number {
    public static boolean isHappy(int n) {
        String num = Integer.toString(n); // convert int to string
        if (num.length() == 1 && n != 1 && n != 7) { // if there is only one digit and it doesnt equal 1 or 7
            return false;
        }
        int total = 0; // create total and set to zero
        for (int i = 0; i < num.length(); i++) { // loop through int string
            total += Math.pow(Integer.valueOf(num.charAt(i)) - '0', 2); // add each digit squared
        }
        if (total == 1) { // if the total is one then number is happy
            return true;
        }
        return isHappy(total); // recursively loop
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
