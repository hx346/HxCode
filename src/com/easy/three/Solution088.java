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
public class Solution088 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int []res = new int[m+n];
	        int i=0,j=0,cnt=0;
	        //遍历两个数组，将较小的值依次赋给res数组
	        while(i<m&&j<n){
	            if(nums1[i]<nums2[j])
	                res[cnt++] = nums1[i++];
	            else
	                res[cnt++] = nums2[j++];
	         }
	         //将未遍历完的数组的剩余元素赋给res数组
	        if(i>=m)
	            while(j<n) res[cnt++] = nums2[j++];    
	        if(j>=n)
	            while(i<m) res[cnt++] = nums1[i++];    
	         //由于要返回的是nums1数组，所以需要将res数组的值赋给nums1 
	        for(i=0;i<res.length;i++){         
	            nums1[i] = res[i];
	        }
}
}
