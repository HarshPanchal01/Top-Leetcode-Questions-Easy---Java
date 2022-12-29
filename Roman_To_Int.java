import java.util.*;

public class Roman_To_Int {

    public static int romanToInt(String roman) {
        Map<Character,Integer> numbersMap = new HashMap<>(); // creating and putting values of roman numerals in hashmap
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);  
        numbersMap.put('D',500);  
        numbersMap.put('M',1000);  
        
        int result=0;

        for(int i=0;i<roman.length();i++)
        {
            char ch = roman.charAt(i); // Current Roman Character
            
            //Case 1
            if(i>0 && numbersMap.get(ch) > numbersMap.get(roman.charAt(i-1)))
            {
              result += numbersMap.get(ch) - 2*numbersMap.get(roman.charAt(i-1));
            }

            // Case 2: just add the corresponding number to result.
            else {
              result += numbersMap.get(ch);
            }
        } 
        return result;
    }
    public static void main(String[] args) {
        String s = "III";
        String s1 = "LVIII";
        String s2 = "MCMXCIV";

        System.out.println(romanToInt(s));
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
    }
    
}
