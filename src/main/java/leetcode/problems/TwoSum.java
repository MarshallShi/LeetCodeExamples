package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    /**
     * Brute one
     * @param inputArray
     * @param target
     * @return
     */
    public int[] getTheTwoSum(int[] inputArray, int target) {

        int len = inputArray.length;
        for (int i=0; i<len; i++) {
            for (int j=i+1; j<len; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] getTheTwoSum2(int[] inputArray, int target) {
        int len = inputArray.length;
        Map temp = new HashMap<Integer, Integer>();
        for (int i=0; i<len; i++) {
            int lookingFor = target - inputArray[i];
            if (temp.containsKey(lookingFor)) {
                return new int[]{i, (int)temp.get(lookingFor)};
            }
            temp.put(inputArray[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,56,7,8,9,33,44,555,67,88,7777,453,5,101,102,103,104,105,109};
        int target = 38;
        TwoSum sum = new TwoSum();

        int[] result = sum.getTheTwoSum(nums, target);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No matching found");
        }


        int[] result2 = sum.getTheTwoSum2(nums, target);
        if (result2 != null) {
            System.out.println(result2[0] + " " + result2[1]);
        } else {
            System.out.println("No matching found");
        }
    }
}
