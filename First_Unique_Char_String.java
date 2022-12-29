import java.util.ArrayList;

public class First_Unique_Char_String {
    public static int firstUniqChar(String s) {
        ArrayList<Character> set = new ArrayList<>(); // create two arraylists
        ArrayList<Character> set2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) { // loop through string
            if (set.contains(s.charAt(i)) == false) { // if first list doesnt contain char then add to it
                set.add(s.charAt(i));
            }
            else { // otherwise add to second list to store duplicates
                set2.add(s.charAt(i));
            }
        }
        for (int i = 0; i < set.size(); i++) { // loop through first list
            if (set2.contains(set.get(i)) == false) { // the first char from first list not in second list is the first unique character
                return s.indexOf(set.get(i)); // return the index of that char from string
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
