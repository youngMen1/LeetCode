package hash相关.q1_两数之和.f2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 一遍hash o(n)
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int data[] = new int[]{2, 7, 11, 15};
        // 请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
        int[] result = twoSum(data,9);
        System.out.println(Arrays.toString(result));
    }
}
