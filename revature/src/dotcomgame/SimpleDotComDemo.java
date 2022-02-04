package dotcomgame;

public class SimpleDotComDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dotCom = new SimpleDotCom(); //create dotCom object through SimpleDotCom class
		
		int randomNum = (int) (Math.random()* 5);// creates random number for the firdt cell of the array
		
		int [] locations = {randomNum, randomNum+1, randomNum+2};// creates array list from random number
		
		dotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		while(isAlive == true) {
			String guess  = helper.getUserInput("Enter a number");
			String result = dotCom.checkYourself(guess);
			numOfGuesses++;
			
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took "+ numOfGuesses+ " guesses");
			}
		}
		
		
		
	
		
	
		
		

	}

}
