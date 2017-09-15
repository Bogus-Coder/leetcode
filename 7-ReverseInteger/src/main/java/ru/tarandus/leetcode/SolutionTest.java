package ru.tarandus.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testReverse() {
		Solution s = new Solution();

		assertEquals(0, s.reverse(0));
		assertEquals(0, s.reverse(1000000003));
		assertEquals(123, s.reverse(321));
		assertEquals(0, s.reverse(Integer.MIN_VALUE));
		assertEquals(0, s.reverse(Integer.MAX_VALUE));
		assertEquals(12314, s.reverse(41321));

	}

}
