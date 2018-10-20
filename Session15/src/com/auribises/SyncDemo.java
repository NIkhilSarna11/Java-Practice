package com.auribises;

class Table{
	
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		
	}
}

class MyThread extends Thread{
	
	Table tRef;
	
	MyThread(Table t){
		tRef = t;
		//System.out.println(tRef);
	}
	
	public void run() {
		synchronized (tRef) {
			tRef.printTable(5);
			tRef.fun();
		}
	}
}

class YourThread extends Thread{
	
	Table tRef;
	
	YourThread(Table t){
		tRef = t;
		//System.out.println(tRef);
	}
	
	public void run() {
		synchronized (tRef) {
			tRef.printTable(7);
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		System.out.println("--Main Started--");
		Table t = new Table();
		//System.out.println(t); // 7852e922
		//t.printTable(5);
		
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		mRef.start();
		yRef.start();
		
		System.out.println("--Main Finished--");
	}

}
