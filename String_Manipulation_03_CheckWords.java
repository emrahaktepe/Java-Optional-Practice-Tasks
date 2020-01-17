package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_03_CheckWords {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Type three words pressing enter after each");
	String oneWord = input.nextLine();
	String twoWord = input.nextLine();
	String threeWord = input.nextLine();
	
	int one = oneWord.length();
	int two = twoWord.length();
	int three = threeWord.length();
	
	
	if(one == two && one == three && two == three) {
		System.out.println("All words are the same length");		
	}
	else if (one != two && one != three && two != three) {
		System.out.println("All words have different lengths");		
	}
	else {
		System.out.println("Some words have same and some words have different lengths");
	}
		
		
		
		
		
		
		
		
		
		
	}
}
