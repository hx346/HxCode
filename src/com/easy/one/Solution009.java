package com.easy.one;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月28日 下午4:04:44 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution009 {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;

	}
}
