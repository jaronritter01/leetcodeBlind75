import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate {
    public static boolean containsDuplicateSol(int[] nums) {
        // this is a cheap solution that leverages the defintion of a set
        // I could not get any of my other solutions to this to run in an acceptable time
        HashSet<Integer> integerHashSet = new HashSet<>();

        Arrays.stream(nums).forEach(integerHashSet::add);
        return nums.length != integerHashSet.size();

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };

        boolean answer = containsDuplicateSol(nums);

        System.out.println(answer);
    }
}
