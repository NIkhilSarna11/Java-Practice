package com.auribises;

class Message{
	
	String message;
	
	Message(){
		message = "NA";
	}
	
	void writeMessage(){
		message = "Be Exceptional !!";
		System.out.println("--Message Written--");
	}
	
	void readMessage(){
		System.out.println("Message is: "+message);
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized(mRef){
			
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized(mRef){
			mRef.writeMessage();
			//mRef.notify();
			mRef.notifyAll();
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message();
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		
	}

}
