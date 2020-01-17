package Optional_Tasks;

import java.util.Scanner;

public class Loops_05_UniqueCharacters {

	/*
	 write a program that can find the unique characters from the String
			Ex:
			
			str ="AAABBBCCCDEF";
			output: "DEF"
	 */
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		
		String str = "AAABBBCCCDEF";
		String output = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch) == (str.lastIndexOf(ch)))
				output+= ch;
		}
		
		System.out.println(output);
		
		/*
		 i is the index and moves one by one towards checking each character
		 ch is the character at each index 
		 if any characters first and last inddex is the same
		 that is a way to see there is only one of that character
		 unique characters will be printed.x
		 */
		
		
	}
}
