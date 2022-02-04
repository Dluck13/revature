package interfaceandabstractclasses;

public class Snake extends Animal {
	@Override
	void mobility() {
		System.out.println("snake slithers");
	}
	
	void sound() {
		System.out.println("hiss");
	}

}
