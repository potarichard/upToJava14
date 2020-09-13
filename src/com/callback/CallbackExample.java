package com.callback;

public class CallbackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		make a getItem().subscribe(() -> sysout);  egy ilyen implementalasa javaban
//		getitem indit egy uj threadet simalate wait, and then callback the interfacem which can be implemented
//		in the subscribe method  egy consumer megy bele, bevesz valamit es void
	
		
//		Download dld = new Download(data -> System.out.println(data));
//		new Thread(dld).start();
		
//		RegularCallback rcb = new RegularCallback();		
//		rcb.generateKey(data -> System.out.println(data));
		
		SimulatedService service = new SimulatedService();		
		service.getData().subscribe(data -> System.out.println(data));
	}

}
