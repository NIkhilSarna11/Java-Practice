package com.auribises;

class Point{
	
	int x;
	int y;
	
	Point(){
		x = 10;
		y = 20;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("this is: "+this);
	}
	
	/*public String toString() {
		return "Point is: "+x+" - "+y;
	}*/
	
}

class A{
	A(){
		this(10,20);
		System.out.println("A Constructor");
	}
	A(int x){
		System.out.println("A Constructor: "+x);
	}
	A(int x, int y){
		this(10);
		System.out.println("A Constructor: "+x+" - "+y);
	}

}

class B extends A{
	B(){
		System.out.println("B Constructor");
	}
	
	B(int x){
		System.out.println("B Constructor: "+x);
	}
}

class C extends B{
	C(){
		super(10);
		//super();
		//super.purchaseBike();
		System.out.println("C Constructor");
	}
}

public class ThisVsSuper {

	public static void main(String[] args) {
		
		C cRef = new C();
		
		/*Point p1 = new Point();
		Point p2 = new Point(100,200);
		System.out.println(p1);
		System.out.println(p2);*/
	}

}
