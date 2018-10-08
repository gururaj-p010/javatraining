package com.assignment.test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("=================Array List==============================");
		
		List<String> arrList = new ArrayList<>();
		Instant st1 = Instant.now();
		for(int i = 0; i<10000 ; i++){
			arrList.add("Emp_" + i);
		}
		/*arrList.forEach(System.out::println);
		System.out.println("==Removing 500 records===");*/
		for(int j=0;j<500;j++){
			arrList.remove(j);
		}
		/*arrList.forEach(System.out::println);
		System.out.println("===Adding 1500 records===");*/
		for(int k =0; k<1500; k++){
			arrList.add("Emp_"+k);
		}
		//arrList.forEach(System.out::println);
		Instant ed1 = Instant.now();
		System.out.println("Duration = " + Duration.between(st1, ed1));
		
		System.out.println("=================Linked list==============================");
		
		Instant st = Instant.now();
		List<String> names;
		names = new LinkedList<>();
		for(int i=0 ; i <10000 ; i++){
			names.add("Employee_" +i);
		}
		/*names.forEach(System.out::println);
		
		System.out.println("===Removing 500 records===");*/
		for( int j=0; j <500 ; j++){
			names.remove(j);
		}
		/*names.forEach(System.out::println);
		
		System.out.println("====Adding 1500 records==");*/
		for(int k =0; k<1500 ; k++){
			names.add("Employee_" + k);
		}
		//names.forEach(System.out::println);
		Instant ed = Instant.now();
			
		System.out.println("Duration = " + Duration.between(st, ed));
		
		
		

	}

}
