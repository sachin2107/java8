package com.streams.match;

import java.util.Arrays;
import java.util.List;

public class TestAllMatch {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
			      new Employee("Harry Major", 25),
			      new Employee("Ethan Hardy", 65),
			      new Employee("Nancy Smith", 22),
			      new Employee("Deborah Sprightly", 29));
		
		boolean allEmpAbove21 = employeeList.stream().allMatch(e -> e.getAge()>21);
		System.out.println("All employee above 21 age? : "+allEmpAbove21);
	}
}
