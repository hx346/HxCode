package com.a;

import java.util.HashSet;
import java.util.Set;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月28日 上午11:03:45 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution003 {
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        int ans = 0;
	        for (int i = 0; i < n; i++)
	            for (int j = i + 1; j <= n; j++)
	                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
	        return ans;
	    }

	    public static boolean allUnique(String s, int start, int end) {
	        Set<Character> set = new HashSet<>();
	        for (int i = start; i < end; i++) {
	            Character ch = s.charAt(i);
	            if (set.contains(ch)) return false;
	            set.add(ch);
	        }
	        return true;
	    }
	public static void main(String[] args) {
		String string="aslpdalocdff";
		System.out.println(lengthOfLongestSubstring(string));
				
	}

}
