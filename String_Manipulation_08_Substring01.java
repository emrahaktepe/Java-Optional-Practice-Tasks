package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_08_Substring01 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		
		String word = input.nextLine();
		
		if (word.startsWith("x") || word.startsWith("X")) {
		System.out.println(word.substring(1));
		}
		else {
			System.out.println(word);
		}
		
		
		
		
		
		
	}

}
