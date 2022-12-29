import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> ch = new Stack<>(); // use stack to solve this problem
        char[] c = s.toCharArray(); // convert string to char array
        for (int i = 0; i < s.length(); i++) { // go through string
            if (c[i] == '(') { // if it is the opening bracket
                ch.push(')'); // push the closing bracket of that type of bracket
            }
            else if (c[i] == '{') {
                ch.push('}');
            }
            else if (c[i] == '[') {
                ch.push(']');
            }
            else if (ch.isEmpty() || ch.pop() != c[i]) { // when you hit closing bracket if the pop from the stack doesnt equal this its invalid or if stack is empty from the start
                return false;
            }
        }
        return ch.isEmpty(); // return true if stack is empty after that
    }
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1));
        String s2 = "()[]{}";
        System.out.println(isValid(s2));
        String s3 = "(]";
        System.out.println(isValid(s3));
    }
}
