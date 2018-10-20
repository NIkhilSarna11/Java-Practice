package com.auribises;

class Task{
	void performTask(){
		for(int i=1;i<=10;i++){
			System.out.println("==Task=="+i);
		}
	}
}

class MyTask extends Thread{
	
	MyTask(String name){
		super(name);
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("**MyTask**"+i);
		}
	}
}

class YourTask implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("##YourTask##"+i);
		}
	}
}

class A{
	
}

class B extends A implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			
			System.out.println("##B##"+i);
		}
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		// J1
		System.out.println("--Main Started--");

		
		// J2
		//Task t = new Task();
		//t.performTask();
		MyTask mRef = new MyTask("John");
		
		//Runnable r = new YourTask();
		//Thread thRef = new Thread(r);
		Thread thRef = new Thread(new YourTask());
		//new Thread(new YourTask()).start();
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		thRef.setPriority(Thread.NORM_PRIORITY); // 5
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		mRef.start();
		
		try {
			mRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thRef.start();
		thRef.yield();
		
		// J3
		for(int i=1;i<=10;i++){

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("--MainThread--"+i);
		}
		
		//mRef.setName("Ben");
		thRef.setName("Charlie");
		Thread.currentThread().setName("Harry");
		
		// Names
		System.out.println("MyTask Name: "+mRef.getName());
		System.out.println("YourTask Name: "+thRef.getName());
		System.out.println("Main Name: "+Thread.currentThread().getName());
		
		// Priority
		System.out.println("MyTask Priority: "+mRef.getPriority());
		System.out.println("YourTask Priority: "+thRef.getPriority());
		System.out.println("Main Priority: "+Thread.currentThread().getPriority());
		
		// States of a Thread
		//Thread.State.NEW
		//thRef.getState()
		
		// J4
		System.out.println("--Main Finished--");
	}

}
