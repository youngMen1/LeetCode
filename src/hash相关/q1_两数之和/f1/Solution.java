package hash相关.q1_两数之和.f1;

import java.util.Arrays;

/**
 * 暴力法 o(n^2)
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(Arrays.toString(result));
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int data[] = new int[]{2, 7, 11, 15};
        System.out.println(twoSum(data,9));
    }
}
