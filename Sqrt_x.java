public class Sqrt_x {
    public static int mySqrt(int x) {
        long r = x; // set x to another variable long which holds 64 bit values that will always hold whole number so you can round down for non perfect sqrt
        while (r*r > x) { // while r^2 is greater than x
            r = (r + x/r) / 2; // keep decreasing the value of r by this
        }
        return (int)r; // return r
    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}