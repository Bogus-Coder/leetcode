package ru.tarandus.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testTwoSum() {
		Solution s = new Solution();

		assertArrayEquals(new int[] { 1, 2 }, s.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 1, 3 }, s.twoSum(new int[] { 2, 3, 4 }, 6));
		assertArrayEquals(new int[] { 2, 3 }, s.twoSum(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 46, 47 },
				s.twoSum(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 },
						15));
		assertArrayEquals(new int[] { 1, 2 }, s.twoSum(new int[] { 0, 0, 3, 4 }, 0));

	}

}
