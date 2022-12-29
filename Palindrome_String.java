import java.util.ArrayList;
import java.util.Collections;

public class Palindrome_String {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) { // for the case there is only one or no letters
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", ""); // replace all non-alphanumeric values
        s = s.toLowerCase(); // make everything lowercase
        ArrayList<Character> ch = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) { // add to char arraylist
            ch.add(s.charAt(i));
        }

        char[] reverse = new char[ch.size()]; // make new char array to hold reverse of arraylist
        Collections.reverse(ch); // reverse arraylist

        for (int i = 0; i < ch.size(); i++) { // copy to char array
            reverse[i] = ch.get(i);
        }

        String str = String.valueOf(reverse); // turn char array to string

        if (str.equals(s)) { // if the strings match return true
            return true;
        }

        return false; // otherwise false
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = " ";
        System.out.println(isPalindrome(s3));
    }
}