package javabasics;

public class IncrementalDecremental {

	public static void main(String[] args) {
		
		int i=1;
		int j=i++; //post increment, means first assign i value to j and then increments the value of i to i+1. hence i=2, j=1
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("*******************");
		
		int x=2;
		int y=x--; //post decrement
		System.out.println(x);
		System.out.println(y);
		System.out.println("*******************");
		
		int a=1;
		int b=++a;//pre increment, increments the value of a first and assign to b
		System.out.println(a);
		System.out.println(b);
		System.out.println("*******************");
		
		int p=2;
		int q=--p;//pre decrement, decrements that value of p, assign to q, print q and p
		System.out.println(p);
		System.out.println(q);
		System.out.println("*******************");
	}

}
