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
public class Solution107 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root == null) {
            return list;
        }

        queue.offer(root);

        while(!queue.isEmpty()) {
            int m = queue.size();
            List<Integer> level = new LinkedList<Integer>();

            while(m > 0) {
                TreeNode node = queue.peek();

                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }

                level.add(queue.poll().val);
                m--;
            }
            list.add(level);
        }

        Collections.reverse(list);
        return list;


	}
}
