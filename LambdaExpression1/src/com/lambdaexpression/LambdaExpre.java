package com.lambdaexpression;

interface A
{
	public void m1();
}
public class LambdaExpre {
	
	public static void main(String[] args) {
		A a = () -> System.out.println("this is m1 implementation..");
		A a1 = () -> {for(int i=0;i<5;i++)
					 	System.out.println("i: "+i);
						int j=10;
						while(j<15) {
							j++;
							System.out.println("j: "+j);
						}
					 };
		a.m1();
		a1.m1();
	}
}
