package com.easy.one;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月29日 上午9:34:43 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution021 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode list0;
		list0 = l1.val > l2.val ? l2 : l1;
		list0.next = l1.val > l2.val ? mergeTwoLists(l1, l2.next) : mergeTwoLists(l1.next, l2);
		return list0;

	}

}
