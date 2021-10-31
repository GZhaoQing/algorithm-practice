package com.ufo.algorithm.draw;

import com.ufo.algorithm.util.ArrayGen;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Base {
	public static void main(String[] args) {
		showArray(ArrayGen.genNumsIncreased(100));
	}
	
	public static void funRaise() {
		int N = 100;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(0,N*N);
		StdDraw.setPenRadius(.01);
		for(int i=1;i<=N;i++) {
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}
	
	public static void randomArray() {
		int N = 50;
		double[] a = new double[N];
		for(int i = 0; i < N; i++) {
			a[i]=StdRandom.uniform();
		}
		for(int i = 0; i < N; i++) {		
			double x = 1.0*i/N;
			double y = a[i]/2.0;
			double rw = 0.5/N;
			double rh = a[i]/2.0;
			System.out.println(x+":"+y+":"+rw+":"+rh);
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}

	public static void filledRectangle(int length, int v, int index){
		filledRectangle(length, v, index, 0.2);
	}

	public static void filledRectangle(int length, int v, int index, double w_rate){
		double x = 1.0*index/length;
		double y = 1.0*v/length;
		double rw = w_rate/length;
		double rh = y;
		StdDraw.filledRectangle(x, y, rw, rh);
	}

	public static void showArray(Integer[] a){
		int length = a.length;
		StdDraw.pause(50);
		StdDraw.setXscale(-.01,1);
		StdDraw.setYscale(-.01,2);
		StdDraw.setPenColor(StdDraw.GRAY);
		for(int i=0; i<length; i++){
			filledRectangle(length,a[i],i);
//			System.out.println(x+":"+y+":"+rw+":"+rh);
		}
//		System.out.println("rate:"+rate);
	}
	public static void showArray(Integer[] a, int index, int index2){
		int length = a.length;
		StdDraw.pause(50);
		StdDraw.setPenColor(StdDraw.WHITE);
		filledRectangle(length,length,index,0.25);
		filledRectangle(length,length,index2,0.25);
		StdDraw.setPenColor(StdDraw.RED);
		filledRectangle(length,a[index],index);
		filledRectangle(length,a[index2],index2);
		StdDraw.pause(50);
		StdDraw.setPenColor(StdDraw.GRAY);
		filledRectangle(length,a[index],index);
		filledRectangle(length,a[index2],index2);
	}
}
