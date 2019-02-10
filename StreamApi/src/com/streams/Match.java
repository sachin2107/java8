package com.streams;

import java.util.stream.Stream;

public class Match {

	public static void main(String[] args) {
		Stream<Integer> st = Stream.of(1,2,3,4,5,6,7,8);
		
		Stream<Integer> newSt = Stream.of(1,2,3,4,5,6,7,8);
		newSt.skip(5).forEach(System.out::println);
		
//to match all elements with given predicate
		//System.out.println("All numbers are greater than 0: "+st.allMatch(t -> t>0));

//to match any element matches the given predicate criteria
		//System.out.println("Any number is greater than 8: "+st.anyMatch(t -> t>8));

//nonematch
		System.out.println("No number is less than 10: "+st.noneMatch(t -> t<10));
	}
}
