package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_14_Seriously {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		
		String word = input.nextLine();
		
		if (word.endsWith("ly")) {
			System.out.println("Really!");
		}
		else {
			System.out.println("Nevermind");
		}
		
		
		
		
	}
	
}
