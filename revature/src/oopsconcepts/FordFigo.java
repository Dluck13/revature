package oopsconcepts;

public class FordFigo {//declare instance variables
	int modelNo;
	private String color;
	private String carType;
	private String carName;
	
	public int getModelNo() {
		return modelNo;
	}
	
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	
	public String getCarType() {
		return carType;
	}
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName; 
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String Color) {
		this.color = Color; 
	}
	
	
	
	String unlockCar() {//local variables
		int temp =50;
		return  "Unlocked";
	}
	String lockCar() {
		return  "locked";
	}
	String accelerate() {
		return "accelerate";
	}
	String applyBrake() {
		return "brake";
	}

	
}

