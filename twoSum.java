public class twoSum {
    public static int[] twoSumSol(int[] nums, int target) {
        int currentTry = 0, i = 0, j = i + 1;
        int[] targetArr = new int[2];

        while (i < nums.length - 1) {

            currentTry = nums[i] + nums[j];

            if (currentTry == target) {
                targetArr[0] = i;
                targetArr[1] = j;
                break;
            }

            if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }

        return targetArr;
    }

    public static void main(String[] args) {
        // the printing of the solution only works for solutions of size 2
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] solution = twoSumSol(nums, target);

        System.out.println("[" + solution[0] + "," + solution[1] + "]");

    }
}
