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
public class Solution014 {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		int len = strs[0].length();
		int lens = strs.length;
		for (int i = 1; i < lens; i++) {
			if (len > strs[i].length()) {
				len = strs[i].length();
			}
		}
		String string = "";
		for (int i = 0; i < len+1; i++) {
			int num = 0;// 计数
			if (len == 1) {
				i++;
			}
			String st1 = strs[0].substring(0, i);
			for (int j = 0; j < lens; j++) {
				String st2 = strs[j].substring(0, i);
				if (st1.equals(st2)) {
					num++;
				}
			}
			if (num == lens) {
				string = strs[0].substring(0, i);

			} else {
				break;
			}

		}
		if (strs.length == 1) {
			return strs[0];
		}

		return string;

	}

	public static void main(String[] args) {
		String[] strings = { "ff", "ff", "ff" };
		System.out.println(longestCommonPrefix(strings));

	}
}
