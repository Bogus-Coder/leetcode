package ru.tarandus.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	@Test
	public void testReverseBits() {
		Solution s = new Solution();

		assertEquals(0, s.reverseBits(0));
		assertEquals(964176192, s.reverseBits(43261596));

	}

}
