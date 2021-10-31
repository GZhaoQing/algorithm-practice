package com.ufo.algorithm.sorting;

import com.ufo.algorithm.draw.Base;
import edu.princeton.cs.algs4.StdDraw;

public class ShellSort extends Sort {
    @Override
    public void sort(Comparable[] a) {
        StdDraw.setCanvasSize(600,200);
        Base.showArray((Integer[])a);
        int L=a.length;
        int h=1;
        int pace=3;
        while (h<L/3){
            h=h*3+1;
        }
        while (h>=1){
            for (int i = h; i < L; i++) {
                for (int j = i; j >=h && less(a[j],a[j-h]); j-=h) {
                    exch(a,j,j-h);
                    Base.showArray((Integer[])a,j,j-h);
                }
            }
            h=h/3;
        }
    }
}
