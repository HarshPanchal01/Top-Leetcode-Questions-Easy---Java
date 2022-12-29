public class Climbing_Stairs {
    public static int climbStairs(int n) {
        // realize that this problem follows the equation an = an-1 – an-2 with a1 = 1 and a2 = 2, so then a3 = a2 + a1 = 1 + 2 = 3 .... for all n  
        int n_one = 2;
        int n_two = 1;
        int total_ways = 0; // total ways it could be climbed

        if (n == 0 || n == 1 || n == 2) { // base case if n is 0,1,2
            return n;
        }

        for (int i = 2; i < n; i++) { // for loop to go from 2 to n times
            total_ways = n_one + n_two; // do the equation
            n_two = n_one; // set two steps before for next one to be one step before currently
            n_one = total_ways; // set one step before to be total ways currently
        }

        return total_ways; // return the total
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }
}
