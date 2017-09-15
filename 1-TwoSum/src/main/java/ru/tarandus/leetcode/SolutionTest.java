package ru.tarandus.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testTwoSum() {
		Solution s = new Solution();

		assertArrayEquals(new int[] { 1, 2 }, s.twoSum(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 44, 47 },
				s.twoSum(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 },
						15));
		assertArrayEquals(new int[] { 0, 1 }, s.twoSum(new int[] { 0, 0, 3, 4 }, 0));

	}

}
