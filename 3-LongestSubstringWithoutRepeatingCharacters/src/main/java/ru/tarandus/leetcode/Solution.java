package ru.tarandus.leetcode;

import java.util.HashSet;

public class Solution {
	/**
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	 * 
	 * 
	 * Given a string, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * Examples: 
	 * 
	 * Given "abcabcbb", the answer is "abc", which the length is 3.
	 * 
	 * Given "bbbbb", the answer is "b", with the length of 1.
	 * 
	 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
	 * answer must be a substring, "pwke" is a subsequence and not a substring.
	 */
	public int lengthOfLongestSubstring(String s) {
		int counter = 0;
		HashSet<Character> set = new HashSet<>();
		int lastSubstringStart = 0;

		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				// reset
				i = lastSubstringStart;
				if (counter < set.size()) {
					counter = set.size();
				}
				set.clear();
			} else {
				if (set.isEmpty()) {
					lastSubstringStart = i;
				}
				set.add(s.charAt(i));
			}
		}
		if (counter < set.size()) {
			counter = set.size();
		}

		return counter;
	}
}
