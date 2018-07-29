package com.lambdaexpression;

public class LambdaExpre1 {

	interface A{
		public void operate(int a, int b);
	}
	public static void main(String[] args) {
		A a1 = (a,b) -> {int j=0; 
						j = a+b;
						System.out.println("Addition 10+20 : "+(a+b));
						};
		a1.operate(10, 20);
		
		A sub = (a,b)->{System.out.println("Subtraction 90-20 : "+(a-b));
			          };
		sub.operate(90, 20);
			   
	}
}
