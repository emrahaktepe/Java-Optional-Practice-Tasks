package Optional_Tasks;

import java.util.Scanner;
	
public class String_Manipulation_05_DuplicateIt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words: ");
		
		String firstWord = input.nextLine();
		String secondWord = input.nextLine();
		
		System.out.println((firstWord.concat(secondWord)) + (secondWord.concat(firstWord)));
	
		
	}

}
