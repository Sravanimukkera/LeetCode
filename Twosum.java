import java.util.HashMap;
import java.util.Map;

class Twosum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int t = target - nums[i];
            if (dict.containsKey(t)) {
                return new int[] { dict.get(t), i };
            } else {
                dict.put(nums[i], i);
            }
        }

        return new int[] {}; // or throw an exception if no solution is found
    }
}

      