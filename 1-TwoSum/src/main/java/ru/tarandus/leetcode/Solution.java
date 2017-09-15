package ru.tarandus.leetcode;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Solution {

	/**
	 * https://leetcode.com/problems/two-sum/description/
	 * 
	 *  Given an array of
	 * integers, return indices of the two numbers such that they add up to a
	 * specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example: Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */
	public int[] twoSum(int[] nums, int target) {
		int ret[] = new int[] { -1, -1 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int tmpSum = nums[i] + nums[j];
				if (tmpSum - target == 0) {
					ret[0] = i;
					ret[1] = j;
					return ret;
				}
			}
		}
		return ret;
	}
}
