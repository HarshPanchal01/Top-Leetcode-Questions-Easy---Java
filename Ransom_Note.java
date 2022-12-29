import java.util.ArrayList;

public class Ransom_Note {
    public static boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> magazineChars = new ArrayList<>(); // creates an arraylist to hold char array of magazine
        
        for (int i = 0; i < magazine.length(); i++) { // for loop to add char into arraylist
            magazineChars.add(magazine.charAt(i));
        }

        for (int i = 0 ; i < ransomNote.length(); i++) { // for loop to go through ransomNote
            Character c = ransomNote.charAt(i); // set char c to char in ransomNote at i
            if (magazineChars.contains(c)) { // if arraylist contains that char
                magazineChars.remove(c); // remove it so one char doesnt spell two chars in ransomNote
            }
            else { // else if it doesnt contain the required char return false
                return false;
            }
        }

        return true; 
    }
        
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2));
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote3, magazine3));
        String ransomNote4 = "aab";
        String magazine4 = "baa";
        System.out.println(canConstruct(ransomNote4, magazine4));
        String ransomNote5 = "harsh";
        String magazine5 = "xcvbshlklrpha";
        System.out.println(canConstruct(ransomNote5, magazine5));
        String ransomNote6 = "fihjjjjei";
        String magazine6 = "hjibagacbhadfaefdjaeaebgi";
        System.out.println(canConstruct(ransomNote6, magazine6));
    }
}
