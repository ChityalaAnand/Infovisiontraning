package com.day16;

interface A {
	void show();
}

/*class B implements A{
	@Override
	public void show() {
		System.out.println("Show");
	}
}*/
// above is the implementing show method by creating subclass in order develop easy using anonymus class refer below code

public class Calculator{
	public static void main(String[] args) {
		A obj;
		obj = () -> System.out.println("Show");
		obj.show();
	}
}