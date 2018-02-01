package com.ocjp.testAbstraction_Interface;

public class Tester6 {
int x = 12;
static Tester6 reset(Tester6 obj) {
	obj = null;
	return obj;
}
	public static void main(String[] args) {
		Tester6 o1 = new Tester6();
		o1 = reset(o1);
		System.out.println(o1.x);

	}

}
