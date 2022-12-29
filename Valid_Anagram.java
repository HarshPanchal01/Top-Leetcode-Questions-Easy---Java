import java.util.Arrays;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { // if both strings are not of same length than they arent the same
            return false;
        }

        char[] arr1 = new char[s.length()]; // create 2 char arrays to hold each string
        char[] arr2 = new char[arr1.length];

        for (int i = 0; i < s.length(); i++) { // put each character into each array
            arr1[i] = s.charAt(i);
            arr2[i] = t.charAt(i);
        }

        Arrays.sort(arr1); // sort the arrays
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) { // if they are the same it means its an anagram
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
