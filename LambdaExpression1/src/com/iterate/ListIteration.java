package com.iterate;

import java.util.Arrays;
import java.util.List;

public class ListIteration {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9);
		al.forEach(t -> System.out.println(t));
	}
}
