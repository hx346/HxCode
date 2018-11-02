package com.easy.one;

import java.util.Stack;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年9月29日 上午9:34:43 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution020 {
	public static boolean isValid(String s) {
		if (s.isEmpty())
			return true;
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	

	public static void main(String[] args) {
		String string = "()[]{}";
		System.out.println(isValid(string));

	}
}
