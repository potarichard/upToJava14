package com.callback;

import java.util.function.Consumer;

public class SimulatedService implements Runnable {

	static class Observable {				// this can be added, and getData returns an Observable instance ...
		
		public void subscribe(Consumer<String> consumer) {
			SimulatedService.callback = consumer;
		}
	}		
	
	String data = "";
	
	private static Consumer<String> callback;
		
	public Observable getData() {
		new Thread(this).start();
		return new Observable();
	}


	
	@Override
	public void run() {
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		this.data = "much of datas";
		SimulatedService.callback.accept(data);
	}
}
