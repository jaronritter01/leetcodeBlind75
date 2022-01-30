public class bestTimetoBuyAndSellStock {
    public static int maxProfit(int prices[]) {
        int maxProfit = 0;

        int left = 0, right = 1;

        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                left = right;
            }

            right++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int max = maxProfit(prices);

        System.out.println(max);
    }
}
