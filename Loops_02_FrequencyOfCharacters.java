package Optional_Tasks;

public class Loops_02_FrequencyOfCharacters {

	/*
	 Write a program that can find the frequency of characters in String
			Ex:
			
			str ="AAABBCDDDDEE";
			output:  A3B2C1D4E2
	 */
	
	
	
	public static void main(String[] args) {
		
		String str = "AAABBCDDDDEE";
		
		int aCount = 0;
		
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == 'A')
			aCount += i;
		
		
		System.out.println("Yours word has " + aCount + " A(s) in it");
	}
}
