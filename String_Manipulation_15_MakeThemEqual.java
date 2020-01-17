package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_15_MakeThemEqual {

		/*
		 Ask user to enter two words. If they are
		 equal length, print them together. If one 
		 is longer than the other one, print equal 
		 number of characters from the long one.

			Input:
			book
			pen
			
			Output:
			boopen
		 */
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words: ");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		if(word1.length() == word2.length()) {
			System.out.println(word1 + " " + word2);
		}
		if (word1.length() > word2.length()) {
			System.out.println(word1.substring(word1.length() - word2.length()) + " " + word2);
		}
		if (word1.length() < word2.length()) {
			System.out.println(word1 + " " + word2.substring(word2.length() - word1.length()));
		}
		
		
		
		
	}
	
	
	
}
