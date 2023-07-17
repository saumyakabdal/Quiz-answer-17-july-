import java.util.HashSet;

public class ZeroSumSubarray {
    public static boolean hasZeroSumSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;

            // If the current sum is 0 or if it already exists in the set, a subarray with sum 0 exists.
            if (sum == 0 || set.contains(sum)) {
                return true;
            }

            // Add the current sum to the set.
            set.add(sum);
        }
 // No subarray with sum 0 found.
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        boolean hasZeroSum = hasZeroSumSubarray(nums);
        System.out.println(hasZeroSum);
    }
}
