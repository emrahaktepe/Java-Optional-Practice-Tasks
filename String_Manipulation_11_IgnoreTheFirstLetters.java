package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_11_IgnoreTheFirstLetters {

			/*
			 Ask user to enter two words. Print first word
			 without its first character then print the 
			 second word without its first character.
		
			Input:
			apple
			banana
			
			Output: ppleanana
			 */
			
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words: ");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		System.out.println(word1.substring(1) + word2.substring(1));
	}
}
