package ru.tarandus.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testAddTwoNumbers() {
		Solution s = new Solution();
		ListNode node = new ListNode(2);
		node.next = new ListNode(4);
		node = node.next;
		node.next = new ListNode(3);

		ListNode node2 = new ListNode(5);
		node2.next = new ListNode(6);
		node2 = node2.next;
		node2.next = new ListNode(4);

		ListNode res = new ListNode(7);
		res.next = new ListNode(0);
		res = res.next;
		res.next = new ListNode(8);

		assertEquals(res, s.addTwoNumbers(node, node2));
	}

}
