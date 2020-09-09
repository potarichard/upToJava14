package com.java14;

//1. switch statements now standard
//2. Pattern Matching for instanceof (Preview)
//3. Helpful NullPointerExceptions (JVm feature)
//4. POJO class -> record
public class Java14 {

	public static void main(String[] args) {
		
		System.out.println("Java14");
		
//1.		
		String day = "M";
		
		String result = switch (day) {
	        case "M", "W", "F" -> "MWF";
	        case "T", "TH", "S" -> "TTS";
	        default -> {
	            if(day.isEmpty())
	                yield "Please insert a valid day.";
	            else
	                yield "Looks like a Sunday.";
	        }
	    };
	    
	    System.out.println(result);
		
	    
//4.
	    Author author = new Author(1, "Bela", "Tester");	    
	    System.out.println(author);
	}

}
