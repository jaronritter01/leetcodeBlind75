public class maximumSubarray {
    // comments do slow the runtime down
    public static int maxSubArray(int[] nums) {
        // init the current max with the first element in the array
        int maxSub = nums[0];
        // set the running sum of the current contigious block to be 0
        int curSum = 0;

        // loop thru every element in the array
        for (int i = 0; i < nums.length; i++) {
            // if the current running sum is negative it is not beneficial to add it to the remainer of the elements
            // as it cannot possible increase the max sum
            if (curSum < 0) {
                // set the sum to 0 (reset)
                curSum = 0;
            }
            // add the current index to the running sum to start checking the rest of the array
            curSum += nums[i];

            // if the running sum is greater than the known max, update the max and continue
            if (curSum > maxSub) {
                maxSub = curSum;
            }
        }

        // return the max 
        return maxSub;
    }

    public static void main(String[] args) {
        int[] input = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int sum = maxSubArray(input);

        System.out.println(sum);
    }
}
