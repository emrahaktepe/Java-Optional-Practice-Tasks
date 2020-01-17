package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_17_ThreeTimes {

		/*
		 Ask user to enter a word. If the word has
		 2 or more characters print the first 2
		 characters of the word three times 
		 
		 	Input:
			apple

			Output:
			apapap
		 */
	
	
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		
		String word = input.nextLine();
	
		if(word.length() <= 2) {
			System.out.println(word);
		}
		else {
			System.out.println(word.substring(0, 2).repeat(3));
		}
		
}
}