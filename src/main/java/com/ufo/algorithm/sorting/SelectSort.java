package com.ufo.algorithm.sorting;

/***
 * 选择排序，最简单的排序方法，易于理解。
 * 外循环从左往右，内循环从左往右。内循环中每次循环寻找最小值，与内栈顶交换，外循环始终有序
 *
 * 选择排序的特点：
 * 运行时间和输入无关，每次最值扫描的结果，也不能为下次扫描产生贡献。
 * 运行时间稳定也可能是缺点：即使输入有序数列，或全部元素相等，选择排序依然需要全扫描；
 * 移动数据最少，只需要N交换。
 */
public class SelectSort extends Sort{
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for(int i=0; i<len; i++){
            int min = i;
            for(int j=min+1; j<len; j++) {
                if (less(a[j], a[min])) {
                    min = j;//改变最小值的下标
                }
            }
            exch(a,i,min);//内循环结束，最小值落入其排序位置
        }
    }
}
