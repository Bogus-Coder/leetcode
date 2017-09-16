package ru.tarandus.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testMinSteps() {
		Solution s = new Solution();

		assertEquals(3, s.minSteps(3));
		assertEquals(2, s.minSteps(2));
		assertEquals(13, s.minSteps(96));
	}

}
