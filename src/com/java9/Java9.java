package com.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// modules, ez csak annyi hogy ?
// new http client, irrelevant since sprinboot
//1. Try-With-Resources   check this
//2. generics, FooClass<? extends Integer> fc0 = new FooClass<>(1) { ... anonymous inner class };
//3. Interfaces in the upcoming JVM version can have private methods, which can be used to split lengthy default methods:
//4. JaxB removed, need to install for xml annotations
//5. can create immutable list, stream ugye regota vart
public class Java9 {

	//1.	
//	Java SE 7 example
	void testARM_Before_Java9() throws IOException {
		 BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
		 try (BufferedReader reader2 = reader1) {
		   System.out.println(reader2.readLine());
		 }
	}
	
//	Java 9 example
	void testARM_Java9() throws IOException {
		 BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
		 try (reader1) {
		   System.out.println(reader1.readLine());
		 }
	}
	
	public static void main(String[] args) {
		
		System.out.println("Java 9");

//5.
		List immutableList = List.of("one","two","three");
		// immutableList.add("four");  // exception of adding to immutable list
		System.out.println(immutableList);
		
		List carlist = Stream.of(new Car("Ferrari", 2015, 123), new Car("BMW", 2016, 87))
							.map(car -> car.brand).collect(Collectors.toList());
		carlist.add("Mercedes");		// works , cuz its not immutable, or the stream was immutable ? but it was transformed to a List a normal list
		System.out.println(carlist);
		
		// same but with args
		List<String> carlist_args = Stream.of(new Car("Ferrari", 2015, 123), new Car("BMW", 2016, 87))
				.map(car -> car.brand).collect(Collectors.toList());
		carlist_args.add("Mercedes");		
		System.out.println(carlist_args);		

		
		
		
	}
}






