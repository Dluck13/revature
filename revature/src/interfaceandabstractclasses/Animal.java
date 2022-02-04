package interfaceandabstractclasses;

//if class has one abstract method the whole class turns abstract
//we can't create an object from an abstract class
// abstract classes are incomplete and meant to be inherited
abstract public class Animal {
	
	void breathe() {
		System.out.println("Animal breathes");
	}
	
	// abstract methods don't have a body, they are declared not defined
	abstract void mobility();
}
