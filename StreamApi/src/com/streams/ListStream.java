package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		List<String> al = Arrays.asList("sachin","kiran","dipak","nachiket","Akash","swapi");
		//1
		/*List<String> removeS = al.stream().filter(t -> !t.contains("s")).collect(Collectors.toList());
		System.out.println(al);
		System.out.println(removeS);*/
		
		//2
		List<String> al1 = (List<String>) al.stream().filter(t -> t.contains("ach")).map(t->t+"xx").collect(Collectors.toList());
		System.out.println(al1);
		
		//3
		List<String> al2 = (List<String>) al.stream().map(t->t+"xx").collect(Collectors.toList());
		System.out.println("al2: "+al2);
	} 
}
