package com.easy.one;
/** * @author 作者 E-mail: * 
@date 创建时间:2018年9月29日 上午9:34:43 * 
@version 1.0 *
@parameter * 
@since * 
@return */
public class  Solution013 {
    public int romanToInt(String s) {
		char[] ch = s.toCharArray();
int sum = 0;
for (int i = 0; i < ch.length; i++) {
	switch (ch[i]) {
	case 'I':
		sum += 1;
		break;
	case 'V':
		sum += 5;
		if(i-1>=0&&ch[i-1]=='I') {
			sum=sum-2;
		}
		break;
	case 'X':
		sum += 10;
		if(i-1>=0&&ch[i-1]=='I') {
			sum=sum-2;
		}
		break;
	case 'L':
		sum += 50;
		if(i-1>=0&&ch[i-1]=='X') {
			sum=sum-20;
		}
		break;
	case 'C':
		sum += 100;
		if(i-1>=0&&ch[i-1]=='X') {
			sum=sum-20;
		}
		break;
	case 'D':
		sum += 500;
		if(i-1>=0&&ch[i-1]=='C') {
			sum=sum-200;
		}
		break;
	case 'M':
		sum += 1000;
		if(i-1>=0&&ch[i-1]=='C') {
			sum=sum-200;
		}
		break;
	default:
		break;
	}
}
return sum;
}
}

