/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 29/08/25
 */


import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * <br>
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 * <p>
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 */
public class _01ContainsDuplicate {

    /**
     * Checks if the given array contains any duplicate numbers using a HashSet.
     * @param nums input array of integers
     * @return true if any duplicate exists, otherwise false
     */
    public boolean hasDuplicate_UsingSet(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == nums[mid + 1]) {
                return true;
            }
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        _01ContainsDuplicate test = new _01ContainsDuplicate();
        System.out.println(test.hasDuplicate_UsingSet(new int[]{1, 2, 3, 1}));
        System.out.println(test.hasDuplicate(new int[]{1, 2, 3, 1}));
    }
}
