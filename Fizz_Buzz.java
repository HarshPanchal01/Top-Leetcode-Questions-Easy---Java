import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        
        for (int i = 1; i <= n; i++) { // for to go through all numbers from 1 to the number given
            if (i % 3 == 0 && i % 5 != 0) { // if number is divisble by 3 then add "fizz"
                answer.add("Fizz");
            }
            else if (i % 5 == 0 && i % 3 != 0) { // if number is divisble by 5 then add "buzz"
                answer.add("Buzz");
            }
            else if (i % 3 == 0 && i % 5 == 0) { // if number is divisble by both 3 and 5 add "fizzbuzz"
                answer.add("FizzBuzz");
            }
            else { // otherwise add number as string in the string array
                answer.add(Integer.toString(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;
        int n2 = 5;
        int n3 = 15;
        System.out.println(fizzBuzz(n));
        System.out.println(fizzBuzz(n2));
        System.out.println(fizzBuzz(n3));
    }
}
