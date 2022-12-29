public class Reduce_To_Zero {
    public static int numberOfSteps(int num) {
        int count = 0; // counter for number of steps
        while (num != 0) { // while number isnt zero
            if (num % 2 == 0) { // if number is divisible by 2 
                num = num/2;
                count++;
            }
            else { // otherwise subtract 1 from the number
                num--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 14;
        System.out.println(numberOfSteps(n1));
        int n2 = 8;
        System.out.println(numberOfSteps(n2));
        int n3 = 123;
        System.out.println(numberOfSteps(n3));
    }
}
