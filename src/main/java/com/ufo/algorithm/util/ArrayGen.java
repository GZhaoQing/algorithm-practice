package com.ufo.algorithm.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayGen {
    public static List genAlphabet2Num(){
        Map<String,Integer> map = new HashMap<>();
        Random random = new Random(12);
        for(int i=65,j=100;i<91;i++,j-=2){
            map.put(new String(new char[]{(char) i}),random.nextInt(15));
        }
        List<Map.Entry<String,Integer>> list = map.entrySet().stream().collect(Collectors.toList());
        return list;
    }

    public static String[] genAlphabet(){
        String[] a=new String[26];
        for(int i=65,j=0;i<91;i++,j++){
            a[j]=new String(new char[]{(char) i});
        }
        return a;
    }

    public static <T> T[] shuffle(T[] a){
        int len = a.length;
        if(len<=1){
            return a;
        }
        int pos,i=0;
        Random rand = new Random();
        do{
            pos = rand.nextInt(len);
            T tmp=a[pos];
            a[pos]=a[i];
            a[i++]=tmp;
        }while(i<len);
        return a;
    }

    /*public static <T> T[] shuffle(T[] a){
        int len = a.length;
        if(len<=1){
            return a;
        }
        T[] shuffledArray = a.clone();
        int pos=0,i=0;
        Random rand = new Random();
        do{
            pos = rand.nextInt(len);
            shuffledArray[i++]=a[pos];
            a[pos]=a[--len];
        }while(len>0);
        return shuffledArray;
    }*/

    public static Integer[] genNumsRepit(){
        int length = 20;
        Integer[] a=new Integer[20];
        Random rand = new Random();
        for(int i=0;i<length;i++){
            a[i]= rand.nextInt(20);
        }
        return a;
    }

    public static Integer[] genNumsDecreased(int bound){
        int length = bound;
        Integer[] a=new Integer[length];
        for(int i=0;i<length;i++){
            a[i]= length-i;
        }
        return a;
    }

    public static Integer[] genNumsIncreased(int bound){
        int length = bound;
        Integer[] a=new Integer[length];
        for(int i=0;i<length;i++){
            a[i]= i;
        }
        return a;
    }
}
