package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_10_MakeSandwich {

	
	/*
	 Ask user to enter two words. If the first word has
	 even number of characters, print the first half of
	 the first word, then print the second word and the
	 second half of the first word.

		Input:
		banana
		apple
		
		Output:
		banappleana
	 */
	

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words");
		
		String wordOne = input.nextLine();
		String wordTwo = input.nextLine();
		
		if ((wordOne.length())%2==0) {
			System.out.println(wordOne.substring(0, (wordOne.length()/2))
					+ wordTwo + (wordOne.substring(wordOne.length()/2)));	
		}
		else {
			System.out.println(wordOne + "  " + wordTwo);
		}
	
	
	
	
	
	
	
	
	}
	
}
