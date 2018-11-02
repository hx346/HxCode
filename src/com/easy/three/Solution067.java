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
public class Solution067 {
	
		 public String addBinary(String a, String b) {
		        // Write your code here
		    //若字符串a的长度小于字符串b的长度，两个字符串交换
		        if(a.length() < b.length()){
		            String temp = a;
		            a =b;
		            b = temp;
		        }
		        int la = a.length()-1;
		        int lb = b.length()-1;
		        int carries = 0;//进位
		        String res = "";//结果值
		        while(lb >= 0){//先依据短字符串的长度依次计算
		            int sum = (int)(a.charAt(la)-'0')+(int)(b.charAt(lb)-'0')+carries;
		            res = String.valueOf(sum%2)+res;
		            carries =sum/2;
		            la--;
		            lb--;
		        }
		          while(la>=0){//再依据长字符串的长度依次计算
		            int sum = (int)(a.charAt(la)-'0')+carries;
		            res = String.valueOf(sum%2)+res;
		            carries =sum/2;
		            la--;
		        }
		        
		        if (carries==1){
		            res ="1"+res;//计算最后的进位
		        }
		        return res;

	}

}
