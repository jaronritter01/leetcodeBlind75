public class maximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int temp = max; // store the max because before updating min your max will already be updated

            // for each iteration
            // find the max between the max of the current max and the current index and the current min and the current index
            // and the current index alone
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            // find the min between the min of the previous max * the index and the current min * the index and the current index
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            // if the new max is greater than the answer then set the answer to the new max
            if (max > ans) {
                ans = max;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] input = { 2, 3, -2, 4 };

        int answer = maxProduct(input);

        System.out.println(answer);
    }
}
