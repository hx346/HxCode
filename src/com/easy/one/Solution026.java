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
public class Solution026 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}
}
