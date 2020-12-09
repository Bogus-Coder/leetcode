package ru.tarandus.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	@Test
	public void testLengthOfLongestSubstring() {
		Solution s = new Solution();
		assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, s.lengthOfLongestSubstring("bbbb"));
		assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
	}

}
