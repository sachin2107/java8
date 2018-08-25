package com.streams.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {

	public static void main(String[] args) {
		Stream<Integer> st = Arrays.asList(1,2,3,4,5,23,6).stream();
		
		//Long count = st.count();
		//System.out.println("Count of elements: "+count);
		
		Long count1 = st.collect(Collectors.counting());
		System.out.println("Count of elements using collectors: "+count1);
		
		System.out.println("This is added after add index....");
		System.out.println("This is added in oxy workspace....");
		System.out.println("included only sysout...");
	}
	
}
