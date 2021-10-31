package com.ufo.algorithm.sorting;

public abstract class Sort {
    public abstract void sort(Comparable[] a);

    protected boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    protected void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void show(Comparable[] a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]);
            if(i<a.length-1){System.out.print(", ");}
        }
        System.out.println();
    }
    public boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String className = this.getClass().toString();
        return className.substring(className.lastIndexOf(".")+1,className.length());
    }
}
