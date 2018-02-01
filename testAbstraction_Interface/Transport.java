package com.ocjp.testAbstraction_Interface;
abstract class AirPlane {
abstract void fly();
void land() {
System.out.print("Landing..");
}
}
class AirJet extends AirPlane {
AirJet() {
super();
System.out.println("constructor");
}
void fly() {
System.out.print("Flying..");
}
void land() {
	super.land();
}
}
public class Transport {

	public static void main(String[] args) {
		AirJet a = new AirJet();
        a.fly();
        a.land();

	}

}
