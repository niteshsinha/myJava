package com.niteshsinha.four;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String args[]){
		
		addThreadsToPool();
	}
	
	public static void addThreadsToPool(){
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calender"), 10, 10, TimeUnit.SECONDS);
		
		
		System.out.println("Number of Threads: "+ Thread.activeCount());
		
		Thread[] listOfthreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfthreads);
		
		for(Thread i : listOfthreads){
			System.out.println(i.getName());
		}
		
		for(Thread i : listOfthreads){
			System.out.println(i.getPriority());
		}
		
		//threadName.setPriority(1)
		
		eventPool.shutdown();
		
		try{
			Thread.sleep(20000);
		} catch(InterruptedException e){}
	}
}
