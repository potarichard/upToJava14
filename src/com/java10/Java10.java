package com.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//1. Local-Variable Type Inference
//2. updated GC
//3. List copy
//4. OrelseThrow
public class Java10 {

	public static void main(String[] args) {
		
		System.out.println("Java 10");
		
//1.	can use var keywor now
		var numbers = List.of(1, 2, 3, 4, 5); // inferred value ArrayList<String>
		// Index of Enhanced For Loop
		for (var number : numbers) {
			System.out.println(number);
		}
		// Local variable declared in a loop
		for (var i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
//3.	
		List<String> actors = new ArrayList<>();
		actors.add("Jack Nicholson");
		actors.add("Marlon Brando");
		System.out.println(actors); // prints [Jack Nicholson, Marlon Brando]
		// New API added - Creates an UnModifiable List from a List.
		List<String> copyOfActors = List.copyOf(actors);		
		// copyOfActors.add("megegy");		// cant do it cuz immutable		
		System.out.println(copyOfActors); // prints [Jack Nicholson, Marlon Brando]

//4.	or else throe
		String str = "";
		Optional<String> name = Optional.ofNullable(str);
		// New API added - is preferred option then get() method
		name.orElseThrow(); // same as name.get()  

		// New API added - Collectors.toUnmodifiableList
		List<String> collect = actors.stream().collect(Collectors.toUnmodifiableList());
		// collect.add("Tom Hanks"); // Will generate an
		// UnsupportedOperationException
	}
}
