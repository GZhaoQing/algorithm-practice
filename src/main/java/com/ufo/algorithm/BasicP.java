package com.ufo.algorithm;

public class BasicP {
	public static void main( String[] args )
    {
//		createFibonacci(100);
//        System.out.println(Euclid(1729,171));
        System.out.println(binomial(100,50,0.25));
    }
	//1.1.16
	public static String exR1(int n)
    {
    	
        if(n<=0)return "";
        return exR1(n-3)+n+exR1(n-2)+n;
    }
	
	//print Fibonacci. it will slow down quickly after 38 loops
	public static void createFibonacci(int N)
    {
    	for(int i= 0; i<N ;i++) {
    		System.out.println(i+":"+Fibonacci(i));
    	}
    }
	//1.1.19
	public static int Fibonacci(int N)
    {
    	if(N==0)return 0;
    	if(N==1)return 1;
        return Fibonacci(N-1)+Fibonacci(N-2);
    }
	
	//Euclid
	public static int Euclid(int p,int q) {
		return q==0?p:Euclid(q,p%q);
	}
	
	//1.1.27二项分布
	public static double binomial(int N,int k,double p) {
		if(N==0&&k==0)return 1.0;
		if(N<0||k<0)return 0.0;
		return (1.0-p)*binomial(N-1,k,p)+p*binomial(N-1,k-1,p);
	}
}
