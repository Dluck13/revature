package oopsconcepts;

public class FordFigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive
		int mark;
		mark = 50;
		
		//object creation
		
		FordFigo newCar = new FordFigo();
		
//		newCar.modelNo = 131313;
//		newCar.color =  "red";
//		newCar.carType = "suv";
		
		newCar.setModelNo(131313);
		newCar.setColor("red");
		newCar.setCarType("suv");
		
		System.out.println("Color "+ newCar.getColor());
		System.out.println(newCar.accelerate());
		System.out.println(newCar.applyBrake());
		System.out.println(newCar.lockCar());
		System.out.println(newCar.unlockCar());
		System.out.println("Model # is :"+ newCar.getModelNo());

		

	}

}
