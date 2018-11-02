package com.a;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月28日 上午9:13:20 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution001 {
	public static int[] twoum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (target==nums[i]+nums[j]) {
					
					return new int [] {i,j};
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int nums[] = new int[]{2,7,11,15};
		int target = 9;
		System.out.println(twoum(nums, target)[0]+","+twoum(nums, target)[1]);
		
	}

}
