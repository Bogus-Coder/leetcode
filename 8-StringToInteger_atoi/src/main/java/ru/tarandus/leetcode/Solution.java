package ru.tarandus.leetcode;

public class Solution {
	/**
	 * https://leetcode.com/problems/string-to-integer-atoi/description/
	 * 
	 * Implement atoi to convert a string to an integer.
	 * 
	 * Hint: Carefully consider all possible input cases. If you want a challenge,
	 * please do not see below and ask yourself what are the possible input cases.
	 * 
	 * Notes: It is intended for this problem to be specified vaguely (ie, no given
	 * input specs). You are responsible to gather all the input requirements up
	 * front.
	 * 
	 * Update (2015-02-10): The signature of the C++ function had been updated. If
	 * you still see your function signature accepts a const char * argument, please
	 * click the reload button to reset your code definition.
	 * 
	 */

	public int myAtoi(String str) {
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}

		int minus = 0;
		char ch = str.charAt(0);
		// handle - and +
		boolean skipFirst = false;
		if ('-' == ch) {
			minus = -1;
			skipFirst=true;
		} else if('+' == ch){
			minus = 1;
			skipFirst=true;
		}else {
			minus = 1;
		}
		// clean input
		StringBuilder sb = new StringBuilder();
		for (int i = skipFirst ? 1 : 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				sb.append(c);
			} else {
				break;
			}
		}

		// in case of overflow return max\min values
		// 2147483647
		// -2147483648
		if (sb.length() > 10) {
			if(minus > 0) {
				return Integer.MAX_VALUE;
			}else {
				return Integer.MIN_VALUE;
			}
		}
		
		long res = 0;
		long mul = 1;
		// start atoi
		for (int i = sb.length() - 1; i >= 0; i--) {
			int digit = sb.charAt(i) - '0';
			res += digit * mul;
			mul *= 10;
		}
		
		//check overflow for long/int
		res *= minus;
		if (res > Integer.MAX_VALUE) {
			return  Integer.MAX_VALUE;
		}

		if (res < Integer.MIN_VALUE) {
			return  Integer.MIN_VALUE;
		}

		return (int) (res);
	}
}
