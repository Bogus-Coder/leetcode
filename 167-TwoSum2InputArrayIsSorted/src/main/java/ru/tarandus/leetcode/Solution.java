package ru.tarandus.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	/**
	 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
	 * 
	 * Given an array of integers that is already sorted in ascending order, find
	 * two numbers such that they add up to a specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that they
	 * add up to the target, where index1 must be less than index2. Please note that
	 * your returned answers (both index1 and index2) are not zero-based.
	 * 
	 * You may assume that each input would have exactly one solution and you may
	 * not use the same element twice.
	 * 
	 * Input: numbers={2, 7, 11, 15}, target=9 
	 * Output: index1=1, index2=2
	 * 
	 * 
	 */

	public int[] twoSum(int[] numbers, int target) {
        int ret[] = new int[] { -1, -1 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement) + 1, i + 1 };
	        }
	        map.put(numbers[i], i);
		}
		return ret;
    }
}
