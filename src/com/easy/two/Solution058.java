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
public class Solution058 {
	public static int lengthOfLastWord(String s) {
		if(s==null || s.length()==0)
            return 0;
        int len = s.length();
        int count = 0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(s.charAt(i)==' '&& count!=0){
                return count;
            }
        }
        return count;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}

}
