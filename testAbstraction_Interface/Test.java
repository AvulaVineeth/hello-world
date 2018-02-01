package com.ocjp.testAbstraction_Interface;
public class A{
	private void printName() {
		System.out.println("Value-A");
	}
}
public class B extends A{
	private void printName() {
		System.out.println("Name-B");

	}
}
public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.printName();

	}

}
