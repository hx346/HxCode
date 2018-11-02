package com.easy.three;


/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年10月8日 上午9:19:09 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution083 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		ListNode q = p.next;
		while (p != null && q != null) {
			while (q != null && p.val == q.val) {
				// 当p和下一个q相等时，往后移动q
				q = q.next;
			}
			p.next = q;
			p = q;
			if (p != null) {
				q = p.next;
			}

		}
		return head;
	}

}
