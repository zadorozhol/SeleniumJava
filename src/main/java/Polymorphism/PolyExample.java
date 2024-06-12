package Polymorphism;

import Encapsulation.EncapsulationExample;

public class PolyExample {
	
	//Polymorphism is considered one of the improtant features of OOP
	//Polymorphism allowa us to perform a single action in different ways. In other words, 
	//polymorphism allowa you to define one interface and have multiple implementations
	// The word "poly" means many and "morphs" means forms, so it means many forms

	public static void main(String[] args) {
	 String st1 = PolyTests.multitest ("Java");
	 int ab = PolyTests.multitest(123,234);
	 
	 System.out.println(st1);
	 System.out.println(ab);
	 
		EncapsulationExample e=new EncapsulationExample();
		e.setid(123);
		int ab1=e.getid();
		System.out.println(ab1);
	}

}
