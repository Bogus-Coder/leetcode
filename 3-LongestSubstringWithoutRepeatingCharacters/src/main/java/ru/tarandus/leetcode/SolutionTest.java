package ru.tarandus.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testLengthOfLongestSubstring() {
		Solution s = new Solution();
		assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, s.lengthOfLongestSubstring("bbbb"));
		assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
	}

}
