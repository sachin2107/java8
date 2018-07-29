package com.lambdaiteration;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1, "aa");
		hm.put(2, "bb");
		hm.put(3, "cc");
		hm.put(4, "dd");
		hm.put(5, "ee");
		hm.put(6, "ff");
		
		//hm.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("Greater than 5 key value pairs: ");
		hm.forEach((k,v) -> {
								if(k>5)
								{
									System.out.println(k+" : "+v);
								}
								});
		
	}
}
