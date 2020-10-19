package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author wangning040@ke.com
 * @date 2020-10-19 09:22
 */
public class TwoSum {

    // 双循环
    public static int[] twoSum1(int[] nums, int target) {

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    // 使用 HashMap
    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size = nums.length;
        for (int i = 0; i < size; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            // 边判断 边构建
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        // System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));

    }
}
