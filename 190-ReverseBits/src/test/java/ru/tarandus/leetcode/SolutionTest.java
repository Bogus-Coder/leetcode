package ru.tarandus.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testReverse() {
		Solution s = new Solution();

		assertEquals(0, s.reverseBits(0));
		assertEquals(964176192, s.reverseBits(43261596));

	}

}
