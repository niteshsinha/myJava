package com.niteshsinha.three;

public class MainClass {

	public static void main(String args[]){
		Thread getTime = new GetTime20();
		
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(10);
		
		getTime.start();
		
		new Thread(getMail).start();
		
		new Thread(getMailAgain).start();
		
		
		
	}
}
