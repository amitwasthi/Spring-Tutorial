package com.infotech;

import java.util.Arrays;

public class Management2 {
	public static void main(String[] args) {
		
		Employee[] empArr = new Employee[4];
		
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr));
		
	}

}
