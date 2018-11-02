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
public class Solution066 {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
        for(int i = n-1; i >= 0; i --) {
            // 非9加1
            if(digits[i] < 9) {
                // 如果是前一位需要进位的话那么前一位置为0,就在后一位(也就是此时的当前位+1)
                digits[i]++;
                // 直接把改变之后的数组返回(因为当前位不是9就不需要进位了,前面该进的位都已经进了所以直接把数组返回就行了)
                return digits;
            }
            // 缝9进0
            digits[i] = 0;
        }
        // 全部为9,则需要数组扩充1位
        /**
         * 如果位数全部都是9的话,那么遍历原来=数组上的所有的数,都是让数组上的所有的数变成0
         * 也就是说明上面的if代码里面的内柔都是没有走的,就需要进行数组扩容
         */
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
        }

	public static void main(String[] args) {
		System.out.println(plusOne(new int[] { 9,8,7,6,5,4,3,2,1,9 }));
	}

}
