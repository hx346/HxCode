package com.easy.three;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年10月8日 上午9:19:09 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution108 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }


    private TreeNode build(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }

        int m  = (l + r) >>> 1;
        TreeNode root = new TreeNode(nums[m]);

        root.left = build(nums, l, m - 1);
        root.right = build(nums, m + 1, r);

        return root;
    }
}
