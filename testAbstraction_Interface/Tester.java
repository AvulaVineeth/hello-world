package com.ocjp.testAbstraction_Interface;
interface Foldable{
	public void fold() throws Exception;

	public void game();
}
class Paper implements Foldable{
	public void fold() {
		System.out.println("Fold");
	}
	public void game() {
		System.out.println("method in Paper class");
	}
}
public class Tester {

	public static void main(String[] args) {
		Foldable obj1 = new Paper();
		obj1.fold();
		obj1.game();
		Paper obj2 = new Paper();
		obj2.fold();

	}

}
