package com.ocjp.testAbstraction_Interface;
interface Colorable {}
class Vehicle {}
class Car extends Vehicle implements Colorable {}
public class Tester4 {
public static void main(String[] args) {
Vehicle a = new Car();
Colorable i = (Colorable) a;
Vehicle b = new Vehicle();
Colorable j = (Colorable) b;
}
}