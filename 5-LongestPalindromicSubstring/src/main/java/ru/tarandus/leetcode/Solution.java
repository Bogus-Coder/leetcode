package ru.tarandus.leetcode;

public class Solution {

	/**
	 * https://leetcode.com/problems/longest-palindromic-substring/description/
	 * 
	 * Given a string s, find the longest palindromic substring in s. You may assume
	 * that the maximum length of s is 1000.
	 * 
	 * Example:
	 * 
	 * Input: "babad"
	 * 
	 * Output: "bab"
	 * 
	 * Note: "aba" is also a valid answer. Example:
	 * 
	 * Input: "cbbd"
	 * 
	 * Output: "bb"
	 */
	public String longestPalindrome(String s) {

		// тут конечно вопрос, правильный ли это символ
		// или надо как-то его выбирать
		// но пока пусть будет так
		char divider = '-';
		// abcdcaa
		// a-b-c-d-c-a-a
		// 1010103010121

		StringBuilder sb = new StringBuilder(s.length() * 2);
		for (int i = 0; i < s.length(); i++) {
			sb.append(divider).append(s.charAt(i));
		}
		sb.deleteCharAt(0);

		String ss = sb.toString();
		char[] arr = ss.toCharArray();
		int[] sizes = new int[arr.length];

		int L, R;

		int maxSize = 0;
		int maxIndex = 0;
		final int LENGTH = arr.length - 1;
		for (int i = 0; i <= LENGTH; i++) {
			// init start
			if (arr[i] == divider) {
				sizes[i] = 0;
			} else {
				sizes[i] = 1;
			}
			L = i - 1;
			R = i + 1;
			if (L < 0 || R > LENGTH) {

				if (sizes[i] > maxSize) {
					maxSize = sizes[i];
					maxIndex = i;
				}
				continue;
			}

			// start check
			while (L > -1 && R <= LENGTH && arr[L] == arr[R]) {
				if (arr[L] != divider) {
					sizes[i] += 2;
				}
				--L;
				++R;
			}

			if (sizes[i] > maxSize) {
				maxSize = sizes[i];
				maxIndex = i;
			}
		}

		int startSize = maxIndex - maxSize;
		int endSize = maxIndex + maxSize;
		// fix limits
		startSize = startSize > 0 ? startSize : 0;
		endSize = endSize > sb.length() ? sb.length() : endSize;

		String ret = ss.substring(startSize, endSize).replaceAll(String.valueOf(divider), "");
		return ret;
	}

}
