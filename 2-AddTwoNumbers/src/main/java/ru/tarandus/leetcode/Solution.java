package ru.tarandus.leetcode;

public class Solution {

	/**
	 * https://leetcode.com/problems/add-two-numbers/description/
	 * 
	 * You are given two non-empty linked lists representing two non-negative
	 * integers. The digits are stored in reverse order and each of their nodes
	 * contain a single digit. Add the two numbers and return it as a linked list.
	 * 
	 * You may assume the two numbers do not contain any leading zero, except the
	 * number 0 itself.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
	 * 
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int add = 0;
		while (l1 != null || l2 != null || add != 0) {

			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + add;
			add = sum / 10;

			ListNode cur = new ListNode(sum % 10);

			prev.next = cur;
			prev = cur;

			l1 = (l1 == null) ? null : l1.next;
			l2 = (l2 == null) ? null : l2.next;
		}
		return head.next;
	}
}
