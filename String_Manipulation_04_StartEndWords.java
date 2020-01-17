package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_04_StartEndWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a 5 character long word");
		String firstWord = input.nextLine();
		
		System.out.println("Type another 5 character long word");
		String secondWord = input.nextLine();
		
		if(firstWord.length() == 5 && secondWord.length() == 5) {
			// Since we are using char the fifth character would be 
			// number 4 because it starts from 0
			// same for the second word, first letter would be number 0
			if(firstWord.charAt(4) == secondWord.charAt(0)) {
				System.out.println("Fizz");
			}
			else {
				System.out.println("Buzz! Didn't match");
			}
		}
		else {
			System.out.println("Both words need to be 5 character long.");
		}
		
				
	
		
		
		
		
		
		
	}
}
