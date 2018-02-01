package com.ocjp.testAbstraction_Interface;
interface Colorable1{}
interface Bouncable extends Colorable1{}
class Super implements Bouncable {}
class Sub extends Super implements Bouncable{}
class Individual{}
public class Tester5 {

	public static void main(String[] args) {
		System.out.println(new Sub() instanceof Super);
		System.out.println(new Sub() instanceof Colorable1);
		System.out.println(new Super() instanceof Sub);
		System.out.println(new Individual() instanceof Super);

	}

}
