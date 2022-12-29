public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int tempCount = 0;
        int currentCount = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                tempCount += accounts[i][j]; // adds all elements of that array
            }
            if (tempCount > currentCount) { // if temp is greater than current
                currentCount = tempCount;
            }
            tempCount = 0; // reset temp value for next array
        }

        return currentCount; // return current 
    }
    public static void main(String[] args) {
        int[][] accounts = { {1,2,3},{3,2,1} };
        System.out.println(maximumWealth(accounts));
    }
}
