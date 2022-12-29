public class Excel_Sheet_Column_Number {
    public static int titleToNumber(String columnTitle) {
        int num = 0;

        for (char ch: columnTitle.toCharArray()) {
            num *= 26;
            num += ch - 'A' + 1;
        }

        return num;
    }
    public static void main(String[] args) {
        String s1 = "A";
        System.out.println(titleToNumber(s1));

        String s2 = "AB";
        System.out.println(titleToNumber(s2));

        String s3 = "ZY";
        System.out.println(titleToNumber(s3));
    }
}