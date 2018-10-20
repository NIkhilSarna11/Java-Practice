package com.auribises;

class Outer{
	
	void show(){
		System.out.println("Show of Outer");
	}
	
	class Inner{
		void show(){
			System.out.println("Show of Inner");
		}
	}
}


// MyOuter contains Inner
class MyOuter{
	
	Inner i = new Inner();
	
	// Nested Class
	class Inner extends MyOuter{
		
	}
	
	interface Inf{
		
	}
	
	static class StatInner{
		
	}
	
	static interface StatInf{
		
	}
	
	void fun(){
		class LocalClass{
			
		}
	}
	
	static void statFun(){
		class LocalClass{
			
		}
	}
}

interface Inf{
	void hello();
	void show();
}

public class ContainmentDemo {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		System.out.println(out);
		System.out.println(in);
		
		out.show();
		in.show();
		
		Inf i1 = new Inf(){
			public void hello(){
				System.out.println("this is hello");
			}
			
			public void show(){
				System.out.println("this is show");
			}
		};
		
		i1.hello();
		i1.show();
		
		Inf i2 = new Inf() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
