package com.hascode.tutorial;

public class MyClass1 {

	private MyClass2 myClass2;

	public MyClass2 getMyClass2() {
		return myClass2;
	}

	public void setMyClass2(MyClass2 myClass2) {
		this.myClass2 = myClass2;
	}

	public int add(int a, int b) {
		return myClass2.add(a, b);
	}
	
	public int subtract(int a, int b) {
		return myClass2.subtract(a, b);
	}	
	
}
