package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_09_Substring02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		
		String word = input.nextLine();
		
		if(word.startsWith("xx")) {
		System.out.println(word.substring(2));	
		}
		else if(word.startsWith("x")) {
			System.out.println(word.substring(1));	
			}
		else {
			System.out.println(word);	
			}
	}
}
