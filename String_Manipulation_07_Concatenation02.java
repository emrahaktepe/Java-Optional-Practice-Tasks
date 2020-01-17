package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_07_Concatenation02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type two words");
		
		String one = input.nextLine();
		String two = input.nextLine();
		
		char one1 = one.charAt(one.length()-1);
		char two2 = two.charAt(0);
		
		if(one1 == two2) {
			System.out.println(one + two.substring(1));
		}
		else{
			System.out.println(one.concat(two));
		}
	
}
}