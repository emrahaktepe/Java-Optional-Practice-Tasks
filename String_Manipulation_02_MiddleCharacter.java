package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_02_MiddleCharacter {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Type one word");
	
	String word = input.nextLine();
	
	if(word.length() % 2 == 0) {
		System.out.println("" + word.charAt(word.length() / 2) + word.charAt(word.length() / 2+1));
		
	}
	else {
		System.out.println(word.charAt(word.length() / 2+1));
	}
	
	
}	
}
