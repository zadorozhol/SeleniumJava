package Encapsulation;

public class EncapsulationExample {
	
	//Encapsulation in java refers to integrating data (variables) and code (methods) into a single unit.
	//In encapsulation, a class's variables are hidden from other classes and can only be accessed
	//by the methods of the class in which they are found.
	
	//Getter and Setter private variables, methods etc can be called in different classes and packages
	
	
	//global variable 
	private int id;
//Getter - getting value
	public int getid() {
		return id;
	}
	
	//assign value - setter
	public void setid(int i) {
		this.id=i;
	}
}
