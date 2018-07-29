package com.lambdaiteration;

import java.util.Arrays;
import java.util.List;

public class ArraylistIteration {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8);
		//al.forEach(System.out::println);
		
		//al.forEach(t -> System.out.println(t));
		
		System.out.println("Greater than 5 numbers in arraylist: ");
		al.forEach(t -> {	if (t >5)
								System.out.println(t);
						});
	}
}
