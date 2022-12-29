import java.util.Arrays;

public class Reverse_String {
    public static void reverseString(char[] s) {
        char[] c = new char[s.length];
        int n = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            c[n] = s[i];
            n++;
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }
}