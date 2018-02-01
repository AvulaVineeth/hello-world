package com.ocjp.testAbstraction_Interface;
class Creature {
void grow() {
}
}
class Bird extends Creature {
void fly() {
}
}
class Falcon extends Bird {
void hunt() {
}
}
public class Tester2 {
public static void main(String[] args) {
Creature c1 = new Bird();
Falcon c2 = new Falcon();
Falcon c3=new Bird();
Falcon c4=new Creature();
Bird c5=new Falcon();
Bird c6=new Creature();
}
}

