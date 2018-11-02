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
public class Solution035 {
	public int searchInsert(int[] nums, int target) {
		int i=0;
		for (i = 0; i < nums.length; i++) {
			if (target<=nums[i]) {
				break;
			}
		}
		return i;
		

	}
}
