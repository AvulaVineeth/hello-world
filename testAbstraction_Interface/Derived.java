package com.ocjp.testAbstraction_Interface;
class Base{
	protected Base() {
		System.out.println("Base");
	}
}
public class Derived extends Base{
    public Derived() {
    	super();
    	System.out.println("Derived");
    }
	public static void main(String[] args) {
		new Derived();

	}

}
