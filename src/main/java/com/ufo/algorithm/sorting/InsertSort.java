package com.ufo.algorithm.sorting;
/*
* 插入排序
* 适用于预期有序的序列排序，输入的序列逆序越少，排序越快（可以比快排更快）。
* 外循环从左往右，内循环从i向左
* 每次外循环之后，i之前的外序列总是有序的。
* 内循环找到的临时最值，会通过连续交换插入到前半段的有序的部分，效果就像是“插入”到了它的位置。
* */
public class InsertSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        sortOptimized(a);
    }

    public void sort1V(Comparable[] a) {
        int len = a.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

    public void sortOptimized(Comparable[] a){
        int len = a.length;
        for (int i=1;i<len;i++){
            for (int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
}
