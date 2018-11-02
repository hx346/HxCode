package com.easy.two;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月29日 下午3:56:16 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution053 {
	// 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

    /**
     * 定义状态：
     * dp[i] ： 表示以 nums[i] 结尾的连续子数组的最大和
     * <p>
     * 状态转移方程：
     * dp[i] = max{num[i],dp[i-1] + num[i]}
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        // 最后这一步，是求一个全局的最优值
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, -3, -1 }));
	}

}
