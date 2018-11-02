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
public class Solution070 {
	public int climbStairs(int n) {
//本质是sum[i] = sum[i - 2] + sum[i - 1]
		if (n == 1)
			return 1;
		int sum[] = new int[n + 1];
		sum[0] = 0;
		sum[1] = 1;
		sum[2] = 2;
		for (int i = 3; i <= n; i++) {
			sum[i] = sum[i - 2] + sum[i - 1];
		}
		return sum[n];

	}
}
