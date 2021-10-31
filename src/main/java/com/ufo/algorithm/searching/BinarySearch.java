package com.ufo.algorithm.searching;

import java.util.Arrays;

/**
 * [算法4第一章]
 * 二分查找
 * 设定前提：仅针对数组，数组要求有序
 * @author UFO
 *
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a = new int[100];
		for(int i=0;i<100;i++) {
			a[i]=(int) (Math.random()*100);
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(doSearch(15,a));

	}
	
	static Integer doSearch(int key, int[] a) {
		int l_bound=0;
		int r_bound=a.length-1;//最后一个元素的索引. 不减1还会导致中点偏右
		System.out.println("L"+a.length);
		while(l_bound<=r_bound) {
			int mid = l_bound+(r_bound-l_bound)/2; //=(r+l)/2, 为防止相加溢出上限不要化简
			System.out.println("mid"+mid);
			if(key<a[mid]) {
				r_bound=mid-1;//扣掉搜索过的区域
			}else if(key>a[mid]){
				l_bound=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	public int[] rank(int[] a) {
		Arrays.sort(a);
		return a;
	}
}
