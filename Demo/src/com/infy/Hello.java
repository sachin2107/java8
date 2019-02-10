package com.infy;

public class Hello {

	public static void main(String[] args) {
		System.out.println("First line of program");
		boolean copied = true , doesNotExist = false;
		if(copied)
		{
			System.out.println("I am in copy branch...");
		}else
		{
			System.out.println("I am in master branch...");
		}
	}
}
