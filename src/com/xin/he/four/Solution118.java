package com.xin.he.four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * * @author 作者 E-mail: *
 * 
 * @date 创建时间:2018年10月31日 上午10:01:41 *
 * @version 1.0 *
 * @parameter *
 * @since *
 * @return
 */
public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return res;
        if(numRows==1){
        	ArrayList<Integer> list=new ArrayList<>();
        	list.add(1);
        	res.add(list);
        	return res;
        }
        //第一行的list
        ArrayList<Integer> listone=new ArrayList<>();
    	listone.add(1);
    	res.add(listone);
    	//2-n行的list
        for(int i=2;i<=numRows;i++){
        	int temp=0;
        	int temp2=0;
        	ArrayList<Integer> list=new ArrayList<>();
        	Iterator<Integer> iter=res.get(res.size()-1).iterator();
        	list.add(1);
        	if(iter.hasNext()){
        		temp=iter.next();
        	}
        	while(iter.hasNext()){
        		temp2=iter.next();
        		list.add(temp2+temp);
        		temp=temp2;
        	}
        	list.add(1);	
        	res.add(list);
        }
        return res;
        }
}