public class Best_Time_Stock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) { // if there is only one element
            return 0;
        }
        int profit = 0; // holds value for profit
        int currMin = prices[0]; // set the first value of array to min
        for (int i = 0; i < prices.length; i++) { // go through array
            if (prices[i] > currMin) { // if some element is greater than current min
                profit = Math.max(profit, prices[i] - currMin); // profit is the greater number between its current self and the profit between the current element and cur min
            }
            else { // otherwise set curr min to element, if curr min is greater than element
                currMin = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {1,0,5,3,6,4};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }
}
