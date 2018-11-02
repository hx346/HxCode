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
public class Solution069 {

//	public int mySqrt(int x) {
//		long re = x;
//		while (re*re>x) {
//			re=(re+x/re)/2;
//		}
//		return (int)re;
//
//	}
	public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;
        /*二分查找*/
        while (left != right) {
            int tmp = (left+right)/2;
            if(tmp <= x/tmp){
                left = tmp+1;
            }else {
                right = tmp;
            }
        }
        return left-1;
    }
}
