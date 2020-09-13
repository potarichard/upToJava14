package com.callback;

import java.util.function.Consumer;

public class Download implements Runnable{

	String data = "no data";
	Consumer<String> callback;
	
	public Download(Consumer<String> callback) {
		this.callback = callback;
	}
	
	@Override
	public void run() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		this.data = "much of datas";
		this.callback.accept(data);
	}
	
	
}
