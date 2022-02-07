
public class Bottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bottles = 99;
		String word = "bottles";
		
		while (bottles > 0) { 
			if (bottles == 1) {
				word = "bottle";
			}
			
			System.out.println(bottles + " "+  word  + " of beer on the wall");
			System.out.println(bottles +" "+  word  + " of beer" );
			System.out.println("take one down, pass it around");
			bottles--;
			}
			
			if (bottles >0) {
				System.out.println(bottles+ " "+ word + " of beer on the wall");}
			else {System.out.println("no more "+ word+ " of beer on the wall");
			}
		}

}


