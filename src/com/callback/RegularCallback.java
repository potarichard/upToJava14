package com.callback;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.function.Consumer;

public class RegularCallback {
		
	public void generateKey(Consumer<String> consumer) {
		
		String generatedString = "no key";
		
		try {
			Thread.sleep(1000);
			
			byte[] array = new byte[7];
		    new Random().nextBytes(array);
		    generatedString = new String(array, Charset.forName("UTF-8"));
		    
		} catch (InterruptedException e) {e.printStackTrace();}
				
		consumer.accept(generatedString);
	}
	
}
