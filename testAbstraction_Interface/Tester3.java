package com.ocjp.testAbstraction_Interface;
class Creature1{
	boolean hasFeather() {
		return false;
	}

	String getName() {
		return "Creature";
	}
}
class Bird1 extends Creature1{
	String getName() {
		return "Bird";
	}
boolean hasFeather() {
	return true;
    }
}
public class Tester3 {

	public static void main(String[] args) {
		Creature1 c1 = new Bird1();
		System.out.println(c1.getName());
		System.out.println(c1.hasFeather());
		Creature1 c2 = new Creature1();
		System.out.println(c2.getName());
		System.out.println(c2.hasFeather());

	}

}
