package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_16_LastTwo {

		/*
		 Ask user to enter a word. If the word has
		 2 or more characters print the word by
		 changing the places of the last two characters.

				Input:
				system
				
				Output:
				systme
		 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		
		String word = input.nextLine();
		
		if(word.length() <= 2) {
			System.out.println(word);
		}
		else {
			System.out.println(word.substring(0, word.length()-2)
								+ word.charAt(word.length()-1)
								+ word.charAt(word.length()-2));
		}
	}
	
}
