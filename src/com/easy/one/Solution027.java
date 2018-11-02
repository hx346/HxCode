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
public class Solution027 {
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int re = 0, tmp = 0;
		int k = nums.length;
		for (int i = 0; i < k; i++) {
			if (nums[i] != val) {
				nums[re] = nums[i];
				re++;
			}
		}

		return re;

	}

}
