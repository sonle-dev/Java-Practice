import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(num, i);
        }
        return new int[] {};
    }
}

public class EASY_Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("Kết quả vị trí 2 số có tổng bằng " + target + " là: " + Arrays.toString(result));
    }
}