package com.a;

import java.util.Scanner;

/** * @author 作者 E-mail: * 
@date 创建时间:2018年9月28日 上午9:41:00 * 
@version 1.0 *
@parameter * 
@since * 
@return */
public class Solution002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.nextLine();
		char[] array = str.toCharArray();
		String str1 = new String();
		String str2 = new String();
		str1=str.substring(0, str.indexOf("+"));
		str2=str.substring(str.indexOf("+")+1, str.length());
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		for (int i = 0; i < charArray1.length/2; i++) {
			char tmp=charArray1[i];
			charArray1[i]=charArray1[charArray1.length-1];
			charArray1[charArray1.length-1]=tmp;			
		}
		for (int i = 0; i < charArray2.length/2; i++) {
			char tmp=charArray2[i];
			charArray2[i]=charArray2[charArray2.length-1];
			charArray2[charArray2.length-1]=tmp;			
		}
		int num1=Integer.parseInt(String.valueOf(charArray1));
		int num2=Integer.parseInt(String.valueOf(charArray2));
		int sum=num1+num2;
		str=sum+"";
		charArray1 = str.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			System.out.print(charArray1[charArray1.length-i-1]);
			
		}
		
		

	}
}
