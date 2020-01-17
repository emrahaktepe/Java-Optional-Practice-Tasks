package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_13_SameOrNot02 {

			/*
			 Ask user to enter two words. Print true
			 if the first two characters of the first word
			 and last two characters of the second word
			 are same characters, print false otherwise.
		
				Input:
				banana
				abba
				
				Output:
				true
			 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words: ");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
	if (word1.charAt(0) == word2.charAt(word2.length()-2) 
			&& word1.charAt(1) == word2.charAt(word2.length()-1)) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
			//	System.out.println("Enter 2 words:");
			//	String s6 = read.next();
			//	String s7 =read.next();
			//	String firstTwoCh = s6.substring(0, 2);
			//	String lastTwoCh = s7.substring(s7.length()-2, s7.length());
			//	
			//	if( firstTwoCh.equals(lastTwoCh) ) {
			//		System.out.println(true);
			//		
			//     }
			//	
			//	else {
			//		System.out.println("false");
			//	
			//    }
	
	
	}
	
}
