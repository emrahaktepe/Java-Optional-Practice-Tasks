package Optional_Tasks;

import java.util.Scanner;

public class String_Manipulation_01_WebAddress {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your domain: ");
		
		String domain = input.nextLine();
		
		boolean www = domain.startsWith("www");
		System.out.println("Web adress sarts with www: " + www);
		
		System.out.println(domain.charAt(domain.lastIndexOf(".")));
		
		System.out.println("Domain: " + domain.substring(domain.indexOf(".")+1, domain.lastIndexOf(".")));
		
		String extension = (domain.substring(domain.lastIndexOf(".")+1));
		switch(extension) {
		case "com":
		case "gov":
		case "edu":
		case "net":
		case "org":
			System.out.println("Extension: " + extension);
			break;
		default:
			System.out.println("please enter a valid extension");
		}

		
		
		
		
		
		
		
		
		
	}
	
	
	
}
