package dotcomgame;

public class SimpleDotCom {
	
	//instance variables
	int[] locationCells; 
	int numOfHits = 0;
	
	//declare methods 
	public void setLocationCells(int[] locs) {
	locationCells = locs;}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
			
		}
		if (numOfHits== locationCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
			return result;
	}

}
