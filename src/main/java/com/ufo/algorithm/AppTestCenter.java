package com.ufo.algorithm;

import com.ufo.algorithm.sorting.*;
import com.ufo.algorithm.util.ArrayGen;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Hello world!
 * 在这里运行所有的算法！
 */
public class AppTestCenter 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        testSort(new ShellSort());
    }

    public static void compareTimeOfReverse(){
        System.out.println(timeOfReverseSort(new SelectSort())+"s");
        System.out.println(timeOfReverseSort(new ShellSort())+"s");
    }

    public static void testSort(Sort sort){
//        String[] a = (String[]) ListGen.shuffle(ListGen.genAlphabet());
        Integer[] a = ArrayGen.shuffle(ArrayGen.genNumsIncreased(50));
        sort.show(a);
        sort.sort(a);
        sort.show(a);
        assert sort.isSorted(a);
    }
    public static double timeOfReverseSort(Sort sort){
        Integer[] a = null;
        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < 1000; i++) {
            a = ArrayGen.genNumsDecreased(1000);
            sort.sort(a);
        }
        return timer.elapsedTime();
    }
}
