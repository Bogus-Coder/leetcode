package ru.tarandus.leetcode;

public class Solution {
	/**
	 * https://leetcode.com/problems/reverse-integer/description/
	 * 
	 *  Reverse digits of
	 * an integer.
	 * 
	 * Example1: x = 123, return 321 Example2: x = -123, return -321
	 * 
	 * click to show spoilers. Have you thought about this? Here are some good
	 * questions to ask before coding. Bonus points for you if you have already
	 * thought through this!
	 * 
	 * If the integer's last digit is 0, what should the output be? ie, cases such
	 * as 10, 100.
	 * 
	 * Did you notice that the reversed integer might overflow? Assume the input is
	 * a 32-bit integer, then the reverse of 1000000003 overflows. How should you
	 * handle such cases?
	 * 
	 * For the purpose of this problem, assume that your function returns 0 when the
	 * reversed integer overflows. Note: The input is assumed to be a 32-bit signed
	 * integer. Your function should return 0 when the reversed integer overflows.
	 * 
	 */

	public int reverse(int x) {
		if (x == Integer.MIN_VALUE) {
			return 0;
		}

		int minus = x > 0 ? 1 : -1;
		Long l = Long.valueOf(x);
		l *= minus;

		String s = String.valueOf(l);
		StringBuilder sb = new StringBuilder(s);
		l = Long.valueOf(sb.reverse().toString());

		if (l > Integer.MAX_VALUE) {
			return 0;
		}
		return l.intValue() * minus;
	}
}
