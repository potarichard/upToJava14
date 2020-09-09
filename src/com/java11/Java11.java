package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

//1. new string methods
//2. lambdas with war
//3. read/write String to file
public class Java11 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Java 11");

//1.		
		System.out.println(" ".isBlank()); //true
		System.out.println("smthing".isBlank()); //false
		
		String strng = "JD\nJD\nJD"; 
        System.out.println(strng);
        System.out.println(strng.lines().collect(Collectors.toList()));
        
        String str = " JD "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
        
        String str1 = "=".repeat(5);
        System.out.println(str1); //prints =====
        
        // old but good here
        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
        
        String word = "geekss@for@geekss"; 
        String[] arrOfStr = word.split("@"); 
  
        for (String a : arrOfStr) 
            System.out.println(a);
        
        System.out.println(word.split("@")[0]);		// geeks
        
        
//2.
//        (var s1, s2) -> s1 + s2 			//no skipping allowed
//        (var s1, String y) -> s1 + y 		//no mixing allowed
        
        
//3.	
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD
        
	}

}











