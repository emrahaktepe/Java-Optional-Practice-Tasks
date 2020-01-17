package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_12_SameOrNot01 {

		/*
			Ask user to enter a word. Print true 
			if the first and last characters of
			the string are the same characters, 
			print false otherwise.
	
			Input: abba
			Output: true
		 */
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		
		String word = input.nextLine();
		if(word.charAt(0) == word.charAt(word.length()-1)){
		System.out.println("true");
		}
		else {
			System.out.println(false);
		}
	
		

	}
}
