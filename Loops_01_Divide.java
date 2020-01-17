package Optional_Tasks;

import java.util.Scanner;

public class Loops_01_Divide {

	// Write a program that can divide two numbers 
	// DO NOT use division, multiplication, or module operators.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Emter two numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		int dividend = Math.max(num1, num2);
		int divider = Math.min(num1, num2);
	
//		int dividend = (num1>num2) ? num1: num2;
//		int divider = (num1<num2) ? num1 : num2;
		int count = 0;
		
		for(int i = divider; i <= dividend; i+= divider) {
			count++;
		}
		System.out.println(count);

		
		
		
	}
}
