package com.java12;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2. compare files
//3. number formatting, irrelevant...
//4. teeing collector
//5. some new String functions
public class Java12 {


	
//2.
    public static long mismatch(Path path, Path path2) throws IOException {
    	return 0;
    }
    
	public static void main(String[] args) {
		
		System.out.println("Java 12");

		
		
//3.	ez se nagyon mukodik itt, lehet summingDouble, counting nekem kell megirni ?
//        double mean = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.teeing(
//	                        summingDouble(i -> i),
//	                        counting(),
//	                        (sum, n) -> sum / n));
//
//        	System.out.println(mean);
        
	}

}











