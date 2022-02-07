package generics;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(20,20,20);
		
		BoxGenerics<Float> box2= new BoxGenerics<Float>(20.5f, 20.5f, 20.5f, "blue");
		
		BoxGenerics <Integer> box3 = new BoxGenerics<Integer>(20,20,20, "red" );
		
		System.out.println(box2.getBoxColor());

	}
	
	

}
