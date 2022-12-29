public class Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        String str = s.trim(); // trim white spaces at the start of the first word if they exist
        int count = 0; // to count length
        System.out.println(str);
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) { // go through string thats trimmed of extra white spaces
            if (str.charAt(i) == ' ') { // if there is a space length reset to 0
                count = 0;
            }
            else { // otherwise length++ and it wont reset for the last word
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "day ";
        System.out.println(lengthOfLastWord(str1));
        String str2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str2));
        String str3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(str3));
    }
}
