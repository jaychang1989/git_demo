package com.test;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello world");
		int num = java.lang.Integer.MAX_VALUE;
		short short_max = Short.MAX_VALUE;
		byte btye_max = Byte.MAX_VALUE;
		
		System.out.println("num = " + num);
		System.out.println("num = " + short_max);
		System.out.println("num = " + btye_max);
		
		int array_1[];
		array_1 = new int[10];
		
		System.out.println("length = " + array_1.length);
		
		int a[] = new int[3];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		System.out.println("length = " + a.length);
		
		int b[] = {9,8,7,6,5,4,3};
		
		//Êý×é¿½±´º¯Êý
		System.arraycopy(a, 0, b, 0, 3);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		//ÅÅÐò
		Arrays.sort(b);
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		star();
		
		System.out.println("I Like Java!");
		
		star();
		
		//int sum_init;
		//double sum_double;
		
		System.out.println("sum_int = " + add(3,5));
		
		System.out.println("sum_int = " + add(3,4,5));
		
		System.out.println("sum_double = " + add(3.1,4.1));
		
		System.out.println("sum_double = " + add(3.1,4.1,5.1));
		
		System.exit(0);
	}
	
	public static void star() {
		int num = 19;
		for(int i = 0; i < num; i++)
			System.out.print("*");	
		
		System.out.println();
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static double add(double x, double y, double z) {
		return x + y + z;
	}
	
}
