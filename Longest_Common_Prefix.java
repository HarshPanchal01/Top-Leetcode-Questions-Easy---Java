public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) { // if string array has no strings
            return "";
        } 
        String prefix = strs[0]; // set a variable to be the first string in the array
        for (int i = 1; i < strs.length; i++) { // go through string array except for the first string in the array
            while (strs[i].indexOf(prefix) != 0) { // while it doesnt start with prefix
                //System.out.println(prefix);
                prefix = prefix.substring(0, prefix.length() - 1); // cut prefix letter by letter starting from the end
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));
    }
}