package com.ufo.algorithm.sorting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class QuickSort {
    public static void main(String[] args){
        QuickSort qs = new QuickSort();

        qs.showSort();
    }

    private void showSort() {
        Map<String,Integer> map = new HashMap<>();
        Random random = new Random(12);
        for(int i=65,j=100;i<91;i++,j-=2){
            map.put(new String(new char[]{(char) i}),random.nextInt(15));
        }
        List<Map.Entry<String,Integer>> list = map.entrySet().stream().collect(Collectors.toList());
//        System.out.println(list);
        quick_sort(list,0,list.size()-1);
//        System.out.println(list);
    }

    public void quick_sort(List<Map.Entry<String, Integer>> s, int l, int r)
    {
        if (l < r)
        {
            int i = l, j = r, p;
            // 从右向左找第一个小于x的数
            p=partition2(s,i,j);
            quick_sort(s, i, p - 1); // 递归调用
            quick_sort(s, p + 1, j);
        }
    }

    public int partition(List<Map.Entry<String, Integer>> s, int l, int r) {
        int i = l+1, j = r;


        return j;
    }

    public int partition2(List<Map.Entry<String, Integer>> s, int l, int r) {
        int i = l+1, j = r;
        Map.Entry<String, Integer> pivot_v = s.get(l);
        Map.Entry<String, Integer> tmp;
        while (true) {
            while (i<=r && s.get(i).getValue() < pivot_v.getValue()) {
                i++;
            }
            // 从左向右找第一个大于等于x的数
            while (j>=l+1 && s.get(j).getValue() > pivot_v.getValue()) {
                j--;
            }
            if (i > j) {
                break;
            }
            tmp = s.get(i);
            s.set(i, s.get(j));
            s.set(j, tmp);
            i++;
            j--;
        }
        s.set(l, s.get(j));
        s.set(j, pivot_v);

        return j;
    }

    public int partition3(List<Map.Entry<String, Integer>> s, int l, int r) {
        int i = l+1, j = r;


        return j;
    }
}
