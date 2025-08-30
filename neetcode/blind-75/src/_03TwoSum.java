/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 30/08/25
 */

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
 * <p>
 * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
 * <p>
 * Return the answer with the smaller index first.
 * <br>
 * Input:
 * nums = [3,4,5,6], target = 7
 *<br>
 * Output: [0,1]
 * Input: nums = [4,5,6], target = 10
 *<br>
 * Output: [0,2]
 */
public class _03TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        _03TwoSum twoSum = new _03TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 13)));
    }
}
