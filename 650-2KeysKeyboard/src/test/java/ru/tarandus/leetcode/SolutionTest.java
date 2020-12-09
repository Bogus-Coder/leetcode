package ru.tarandus.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	@Test
	public void testMinSteps() {
		Solution s = new Solution();

		assertEquals(3, s.minSteps(3));
		assertEquals(2, s.minSteps(2));
		assertEquals(13, s.minSteps(96));
	}

}
