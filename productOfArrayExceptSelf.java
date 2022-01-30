public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i - 1] * nums[i];
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (j == nums.length - 1) {
                postfix[j] = nums[j];
            } else {
                postfix[j] = postfix[j + 1] * nums[j];
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (k == 0) {
                answer[k] = postfix[k + 1];
            } else if (k == nums.length - 1) {
                answer[k] = prefix[k - 1];
            } else {
                answer[k] = prefix[k - 1] * postfix[k + 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4 };

        int[] output = productExceptSelf(input);

        System.out.printf("[%d, %d, %d, %d]\n", output[0], output[1], output[2], output[3]);
    }
}
