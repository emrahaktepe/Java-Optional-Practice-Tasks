package Optional_Tasks;

import java.text.NumberFormat;

public class Loops_03_LieDetector {

	/*
	 Write a program for the lie detector,
	 program prints "true" if the user is
	 being honest, otherwise prints "false".

		Hints: you might need for loop, while
		loop or even couple more nested loops
	 */
	
	public static void main(String[] args) {
		
		
		
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String result = currency.format(123456.78);
	System.out.println(result);
		
	String result1 = NumberFormat.getPercentInstance().format(0.75);
	System.out.println(result1);
		
		
		int income = 120_000;
		boolean hasHighIncome = income >= 100_000;
		System.out.println(hasHighIncome);
	
	
		int income1 = 90_000;
	String className = (income1 > 100_000) ? "First Class" : "Economy";
	
	
	
	
//	if(income1>100_000) {
//		className = "First Class";
//	}
//	else{
//		className = "Economy";
//	}
	System.out.println(className);
	
	
	
	
	}
	
	
}
