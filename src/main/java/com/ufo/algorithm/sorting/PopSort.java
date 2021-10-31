package com.ufo.algorithm.sorting;

public class PopSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        int len = a.length;
        for (int i=0;i<len-1;i++){
            for (int j = len-1; j > i; j--) {
                if(less(a[j],a[j-1])){exch(a,j,j-1);}
            }
        }
    }
}
