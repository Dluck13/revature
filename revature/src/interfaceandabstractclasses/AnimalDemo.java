package interfaceandabstractclasses;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); does not work since the class is abstract
		
		Snake snake = new Snake();
		snake.breathe();
		snake.mobility();
		snake.sound();
		
		System.out.println("-------------------------");
		
		Dog dog = new Dog();
		dog.breathe();
		dog.mobility();
		dog.sound();

	}

}
