import java.util.ArrayList;
import java.util.Collections;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        ArrayList<Character> ch1 = new ArrayList<>();
        String str1 = Integer.toString(x); // convert int to string

        for (int i = 0; i < str1.length(); i++) { // add all chars of string
            ch1.add(str1.charAt(i));
        }

        char[] ch2 = new char[ch1.size()];
        Collections.reverse(ch1); // reverse order the array

        for (int i = 0; i < ch1.size(); i++) { // add from arraylist to char array
            ch2[i] = ch1.get(i);
        }

        String str2 = String.valueOf(ch2); // convert char array to another string

        if (str1.equals(str2)) { // compare strings
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 121, n2 = -121, n3 = 10;
        System.out.println(isPalindrome(n1));
        System.out.println(isPalindrome(n2));
        System.out.println(isPalindrome(n3));
    }
}
