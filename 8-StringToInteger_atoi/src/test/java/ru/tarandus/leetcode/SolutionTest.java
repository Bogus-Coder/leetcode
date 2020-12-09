package ru.tarandus.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	@Test
	public void testMyAtoi() {
		Solution s = new Solution();

		assertEquals(2222, s.myAtoi("2222"));
		assertEquals(0, s.myAtoi(""));
		assertEquals(0, s.myAtoi("--1"));
		assertEquals(2, s.myAtoi("2-0"));
		
		assertEquals(-123, s.myAtoi("-123"));
		assertEquals(111, s.myAtoi("+111"));
		assertEquals(-2147483648, s.myAtoi("      -11919730356x"));
		assertEquals(2147483647, s.myAtoi("2147483648"));
		assertEquals(0, s.myAtoi(""));
		assertEquals(0, s.myAtoi(""));
		assertEquals(0, s.myAtoi(""));
		assertEquals(0, s.myAtoi(""));
		assertEquals(0, s.myAtoi(""));

	}

}
